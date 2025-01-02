package com.schedlo.postlinker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder(setterPrefix = "with")
public class UserDto {

    @JsonProperty("is_deleted")
    private final Boolean isDeleted;
    @JsonProperty("id")
    private final Long id;
    @JsonProperty("email")
    private final String email;
    @JsonProperty("date_created")
    private final String dateCreated;
    @JsonProperty("date_updated")
    private final String dateUpdated;

}
