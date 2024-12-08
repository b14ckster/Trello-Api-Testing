package specifications;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import tests.BaseForTests;

import java.nio.charset.StandardCharsets;

import static io.restassured.http.ContentType.URLENC;

public class RequestSpecifications extends BaseForTests {

    /**
     * Отправка запроса
     */
    public static RequestSpecification sendRequestSpec() {
        System.out.println("Отправлен запрос:");
        return new RequestSpecBuilder()
                .setAccept(ContentType.ANY)
                .setContentType(URLENC.withCharset(StandardCharsets.UTF_8))
                .setBaseUri(BASE_URL)
                .addParam(KEY, getProperty(KEY, API_PARAMS_PATH))
                .addParam(TOKEN, getProperty(TOKEN, API_PARAMS_PATH))
                //.log(LogDetail.PARAMS)
                .build();
    }

}
