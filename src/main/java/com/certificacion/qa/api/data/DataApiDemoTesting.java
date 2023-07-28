package com.certificacion.qa.api.data;

public enum DataApiDemoTesting {
    STANDARD_DATA_API(
            "admin",
            "admin"
    );

    private final String username;
    private final String password;


    DataApiDemoTesting(
            String username,
            String password
    ) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
