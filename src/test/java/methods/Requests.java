package methods;

import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static specifications.RequestSpecifications.sendRequestSpec;

public class Requests {

    public void getMember() {
        Response response = given()
                .spec(sendRequestSpec())
                .get("1/members/me");

        List<Map<String, String>> responseContent;

    }
}
