package tests;

import io.restassured.response.Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static specifications.RequestSpecifications.sendRequestSpec;
import static specifications.ResponseSpecifications.statusCheck;
import static specifications.ResponseSpecifications.userCheckSpec;

@Disabled("Первая версия тестов. Устарели")
@DisplayName("Первая версия тестов. Устарели")
public class Tests extends BaseForTests {

    @Test
    @DisplayName("Получение информации о пользователе")
    public void checkUserTest() {
        Response response = given()
                .spec(sendRequestSpec())
                .get("1/members/me");

        response.then().assertThat()
                .spec(statusCheck())
                .spec(userCheckSpec("Chebunin Andrei", "CA", "b1ackster"))
                .log().body();
    }

    @Test
    @DisplayName("Получение информации о досках")
    public void checkBoardsTest() {
        Response response = given()
                .spec(sendRequestSpec())
                .param("boards", "open")
                .get("/1/members/me");

        response.then().assertThat()
                .spec(statusCheck())
                .log().body();
    }

    @Test
    @DisplayName("Создание доски")
    public void createBoard() {
        Response response = given()
                .spec(sendRequestSpec())
                .param("name", "autotest")
                .post("/1/boards");

        response.then().assertThat()
                .spec(statusCheck())
                .log().body();
    }

    @Test
    @DisplayName("Получение доски")
    public void getBoard() {
        Response response = given()
                .spec(sendRequestSpec())
                .get("/1/boards/671fb3f22e14f7dfb176fc64");

        response.then().assertThat()
                .spec(statusCheck())
                .log().body();
    }

    @Disabled("Удаление досок лучше делать только вручную")
    @Test
    @DisplayName("Удалить все доски (вообще все)")
    public void deleteAllBoards() {
        Response response = given()
                .spec(sendRequestSpec())
                .get("1/members/me");
        List<String> listBoardsIds = response.getBody().path("idBoards");
        for (String boardId : listBoardsIds) {
            given().spec(sendRequestSpec()).delete("/1/boards/" + boardId);
        }
    }
}
