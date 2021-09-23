package org.mule.extension.jsonlogger.internal.singleton;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperSingleton {

    // JSON Object Mapper
    private final ObjectMapper om = new ObjectMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL);

    public ObjectMapper getObjectMapper() {
        return this.om;
    }
}
