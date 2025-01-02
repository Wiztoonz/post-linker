package com.schedlo.postlinker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.schedlo.postlinker.constants.MediaType;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString
@Builder(setterPrefix = "with")
public class MediaDto {

    @JsonProperty("is_deleted")
    private final Boolean isDeleted;
    @JsonProperty("id")
    private final Long id;
    @JsonProperty("media_type")
    private final MediaType mediaType;
    @JsonProperty("media_url")
    private final String mediaUrl;
    @JsonProperty("width")
    private final Integer width;
    @JsonProperty("height")
    private final Integer height;
    @JsonProperty("duration")
    private final BigDecimal duration;
    @JsonProperty("date_created")
    private final String dateCreated;
    @JsonProperty("date_updated")
    private final String dateUpdated;

}
