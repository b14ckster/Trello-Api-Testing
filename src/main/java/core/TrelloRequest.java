package core;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import lombok.Builder;
import lombok.Data;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Data
@Builder
public class TrelloRequest {

    private static final String API_PARAMS_PATH = "src/test/resources/api-params.properties";
    private static final String KEY = "key";
    private static final String TOKEN = "token";
    private static final String BASE_URL = "https://api.trello.com/";

    private static Properties properties;

    private static String getProperty(String key, String path) {
        if (properties == null) {
            properties = new Properties();
            try {
                properties.load(new FileReader(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties.getProperty(key);
    }

    Map<String, Object> parameters;
    Method httpMethod;
    String path;
    String contentType;

    public static RequestSpecification connectToTrello() {
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setAccept(ContentType.JSON)
                .addParam(KEY, getProperty(KEY, API_PARAMS_PATH))
                .addParam(TOKEN, getProperty(TOKEN, API_PARAMS_PATH))
                .build();
    }

    public static class TrelloRequestBuilder {

        Map<String, Object> parameters = new HashMap<>();

        public TrelloRequestBuilder parameter(String parameterName, String parameter) {
            parameters.put(parameterName, parameter);
            return this;
        }

        public TrelloRequestBuilder parameters(Map<String, Object> parameters) {
            this.parameters.putAll(parameters);
            return this;
        }
    }
}
