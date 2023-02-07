package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dao {
    @JsonProperty("url")
    private String url;
    @JsonProperty("cookie")
    private String cookie;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public Dao(String url, String cookie) {
        this.url = url;
        this.cookie = cookie;
    }
}
