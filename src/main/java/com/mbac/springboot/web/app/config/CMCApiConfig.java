package com.mbac.springboot.web.app.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class CMCApiConfig {

    private static final String API_KEY = "e7855b94-78a8-4bb3-998f-30cd0ab87a89";

    private static final String SERVER_URL = "https://pro-api.coinmarketcap.com";

    public static String getApiKey() {
        return API_KEY;
    }

    public static String getServerUrl() {
        return SERVER_URL;
    }

}