
package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "self",
    "isWatching",
    "watchCount"
})
public class Watches {

    @JsonProperty("self")
    private String self;
    @JsonProperty("isWatching")
    private Boolean isWatching;
    @JsonProperty("watchCount")
    private Integer watchCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("isWatching")
    public Boolean getIsWatching() {
        return isWatching;
    }

    @JsonProperty("isWatching")
    public void setIsWatching(Boolean isWatching) {
        this.isWatching = isWatching;
    }

    @JsonProperty("watchCount")
    public Integer getWatchCount() {
        return watchCount;
    }

    @JsonProperty("watchCount")
    public void setWatchCount(Integer watchCount) {
        this.watchCount = watchCount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
