package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlaidUserResponse {

    protected String accessToken;
    
    @JsonProperty("access_token")
    public String getAccessToken() {
        return accessToken;
    }
    
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    
}
