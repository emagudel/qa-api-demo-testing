package com.certificacion.qa.api.request;

import java.util.Random;

public class Template {

    public static String getRequestMemberPost(){
        return "{\n" +
                "    \"name\": \"Eric\",\n" +
                "    \"gender\": \"Male\"\n" +
                "}";
    }

    private static char randomChar() {
        Random r = new Random();
        return (char)(r.nextInt(26) + 'A');
    }
}
