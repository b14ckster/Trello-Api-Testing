package specifications;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpStatus;

import static enums.ResponseEnum.*;
import static org.hamcrest.Matchers.equalTo;

public class ResponseSpecifications {

    /**
     * Проверка HTTP-статуса и логирование ответа
     */
    public static ResponseSpecification statusCheck() {
        System.out.println("\nПолучен ответ:");
        return new ResponseSpecBuilder()
                .expectStatusCode(HttpStatus.SC_OK)
                .build();
    }

    /**
     * Проверка сведений о пользователе
     */
    public static ResponseSpecification userCheckSpec(String fullName,
                                                      String initials,
                                                      String username) {
        return new ResponseSpecBuilder()
                .expectBody(FULL_NAME.toString(), equalTo(fullName))
                .expectBody(INITIALS.toString(), equalTo(initials))
                .expectBody(USER_NAME.toString(), equalTo(username))
                .build();
    }
}
