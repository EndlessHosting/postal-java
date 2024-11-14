package ca.mgamble.postal.api.utils;

import ca.mgamble.postal.api.message.Header;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.util.List;

public class HeaderSerializer implements JsonSerializer<List<Header>> {
    @Override
    public JsonElement serialize(List<Header> src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jsonObject = new JsonObject();
        for (Header header : src) {
            jsonObject.addProperty(header.getKey(), header.getValue());
        }
        return jsonObject;
    }
}

