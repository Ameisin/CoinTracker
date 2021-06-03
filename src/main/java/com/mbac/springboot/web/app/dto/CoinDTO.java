package com.mbac.springboot.web.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class CoinDTO {
    @JsonProperty("urls")
    public UrlsDTO getUrls() {
        return this.urls;
    }

    public void setUrls(UrlsDTO urls) {
        this.urls = urls;
    }

    UrlsDTO urls;

    @JsonProperty("logo")
    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    String logo;

    @JsonProperty("id")
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    String symbol;

    @JsonProperty("slug")
    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    String slug;

    @JsonProperty("description")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String description;

    @JsonProperty("date_added")
    public Date getDate_added() {
        return this.date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }

    Date date_added;

    @JsonProperty("tags")
    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    List<String> tags;

    @JsonProperty("platform")
    public Object getPlatform() {
        return this.platform;
    }

    public void setPlatform(Object platform) {
        this.platform = platform;
    }

    Object platform;

    @JsonProperty("category")
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    String category;
}