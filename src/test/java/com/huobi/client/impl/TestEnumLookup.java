package com.huobi.client.impl;

import com.huobi.client.impl.utils.EnumLookup;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class TestEnumLookup {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testToString() {
        assertEquals("a", MockEnum.A.toString());
    }

    @Test
    public void testFromString() {
        assertEquals(MockEnum.A, MockEnum.lookup("a"));
    }

    @Test
    public void testError() {
//    thrown.expect(HuobiApiException.class);
//    thrown.expectMessage("Cannot found test in Enum");
//    MockEnum.lookup("test");
    }

    enum MockEnum {
        A("a"),
        B("b");
        private static final EnumLookup<MockEnum> lookup = new EnumLookup<>(MockEnum.class);
        private final String code;

        MockEnum(String code) {
            this.code = code;
        }

        public static MockEnum lookup(String name) {
            return lookup.lookup(name);
        }

        @Override
        public String toString() {
            return code;
        }
    }
}
