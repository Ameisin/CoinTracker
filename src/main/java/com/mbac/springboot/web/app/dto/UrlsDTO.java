package com.mbac.springboot.web.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UrlsDTO {
    @JsonProperty("website")
    public List<String> getWebsite() {
        return this.website;
    }

    public void setWebsite(List<String> website) {
        this.website = website;
    }

    List<String> website;

    @JsonProperty("technical_doc")
    public List<String> getTechnical_doc() {
        return this.technical_doc;
    }

    public void setTechnical_doc(List<String> technical_doc) {
        this.technical_doc = technical_doc;
    }

    List<String> technical_doc;

    @JsonProperty("twitter")
    public List<Object> getTwitter() {
        return this.twitter;
    }

    public void setTwitter(List<Object> twitter) {
        this.twitter = twitter;
    }

    List<Object> twitter;

    @JsonProperty("reddit")
    public List<String> getReddit() {
        return this.reddit;
    }

    public void setReddit(List<String> reddit) {
        this.reddit = reddit;
    }

    List<String> reddit;

    @JsonProperty("message_board")
    public List<String> getMessage_board() {
        return this.message_board;
    }

    public void setMessage_board(List<String> message_board) {
        this.message_board = message_board;
    }

    List<String> message_board;

    @JsonProperty("announcement")
    public List<Object> getAnnouncement() {
        return this.announcement;
    }

    public void setAnnouncement(List<Object> announcement) {
        this.announcement = announcement;
    }

    List<Object> announcement;

    @JsonProperty("chat")
    public List<Object> getChat() {
        return this.chat;
    }

    public void setChat(List<Object> chat) {
        this.chat = chat;
    }

    List<Object> chat;

    @JsonProperty("explorer")
    public List<String> getExplorer() {
        return this.explorer;
    }

    public void setExplorer(List<String> explorer) {
        this.explorer = explorer;
    }

    List<String> explorer;

    @JsonProperty("source_code")
    public List<String> getSource_code() {
        return this.source_code;
    }

    public void setSource_code(List<String> source_code) {
        this.source_code = source_code;
    }

    List<String> source_code;
}