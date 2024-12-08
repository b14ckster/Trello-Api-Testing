package enums;

public enum ResponseEnum {

    FULL_NAME("fullName"),
    INITIALS("initials"),
    USER_NAME("username");

    final String parameterName;

    ResponseEnum(String parameterName) {
        this.parameterName = parameterName;
    }

    public String toString() {
        return this.parameterName;
    }
}
