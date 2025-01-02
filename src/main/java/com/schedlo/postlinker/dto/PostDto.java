package com.schedlo.postlinker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@Builder(setterPrefix = "with")
public class PostDto {

    @JsonProperty("is_deleted")
    private final Boolean isDeleted;
    @JsonProperty("id")
    private final Long id;
    @JsonProperty("message")
    private final String message;
    @JsonProperty("media")
    private final List<MediaDto> media;
    @JsonProperty("user")
    private final UserDto user;
    @JsonProperty("date_created")
    private final String dateCreated;
    @JsonProperty("date_updated")
    private final String dateUpdated;

}
