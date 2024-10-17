package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FirstTryTests {

    private static Properties properties;

    public static final String API_PARAMS_PATH = "src/test/resources/api-params.properties";

    public static String getProperty(String key) {
        if (properties == null) {
            properties = new Properties();
            try {
                properties.load(new FileReader(API_PARAMS_PATH));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties.getProperty(key);
    }

    @Test
    public void firstTest() {
        Response response = RestAssured
                .given()
                .log().all()
                .param("key", getProperty("key"))
                .param("token", getProperty("token"))
                .get("https://api.trello.com/1/members/me?boards=open");
        System.out.println("\n\n\n");
        response.then().log().all();
    }
}
