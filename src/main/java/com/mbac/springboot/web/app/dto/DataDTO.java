package com.mbac.springboot.web.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DataDTO {
    public class Data {
        @JsonProperty("coin")
        public List<CoinDTO> getCoin() {
            return this.coins;
        }

        public void setCoin(List<CoinDTO> coins) {
            this.coins = coins;
        }

        List<CoinDTO> coins;
    }
}