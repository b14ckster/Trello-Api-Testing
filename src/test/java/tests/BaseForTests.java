package tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * Базовый класс для тестов
 */
public abstract class BaseForTests {

    /**
     * Поля для подключения к Trello
     */
    public static final String API_PARAMS_PATH = "src/test/resources/api-params.properties";
    public static final String KEY = "key";
    public static final String TOKEN = "token";
    public static final String BASE_URL = "https://api.trello.com/";

    private static Properties properties;

    /**
     * Собственный метод для чтения данных из .properties
     * @param key - ключ, по которому нужно прочитать значние
     * @param path - путь до файла .properties
     * @return найденное значение
     */
    public static String getProperty(String key, String path) {
        if (properties == null) {
            properties = new Properties();
            try {
                properties.load(new FileReader(path));
            } catch (IOException e) {
                e.printStackTrace();
                fail("не удалось найти нужное значение из файла .properties!");
            }
        }
        return properties.getProperty(key);
    }

    /**
     * Метод для конвертации объекта в String.
     * @return String, который хранит json в читаемом виде
     */
    public static String prettyJsonString(Object toJsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper
                    .writerWithDefaultPrettyPrinter()
                    .writeValueAsString(toJsonString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            fail("Не удалось ковернтировать в String!");
        }
        return null;
    }
}
