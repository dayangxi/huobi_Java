package com.huobi.client.impl.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class EnumLookup<T extends Enum<T>> {


    private final Map<String, T> map = new HashMap<>();
    private final String enumName;
    Logger logger = LoggerFactory.getLogger(EnumLookup.class);

    public EnumLookup(Class<T> clazz) {
        enumName = clazz.getName();
        for (T item : EnumSet.allOf(clazz)) {
            map.put(item.toString(), item);
        }
    }

    public T lookup(String name) {
        if (!map.containsKey(name)) {
            logger.error("[Enum] Cannot found " + name + " in Enum " + enumName);
            return null;
        }
        return map.get(name);
    }
}
