package com.example.sakila.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Rating {
    G,
    PG,
    PG_13,
    R,
    NC_17;

    @JsonCreator
    public static Rating fromString(String key) {
        return Rating.valueOf(key.replace("-", "_"));
    }

    @JsonValue
    public String toValue() {
        return this.name().replace("_", "-");
    }
}
