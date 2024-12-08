package tests;

import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static specifications.RequestSpecifications.sendRequestSpec;

@DisplayName("Тесты, связанные со взаимодействием с Members (Участниками)")
public class MemberTests {

    @Test
    @DisplayName("получение информации об участнике")
    public void getMemberTest(){
        Response response = given()
                .spec(sendRequestSpec())
                .get("1/members/me");
    }
}
