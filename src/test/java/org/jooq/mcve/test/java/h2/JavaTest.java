package org.jooq.mcve.test.java.h2;

import java.util.HashSet;
import java.util.List;
import org.jooq.Field;
import org.junit.Test;

import static org.jooq.mcve.java.h2.Tables.TEST;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JavaTest {
    @Test
    public void mcveTest() {
        Field<?> cd1 = TEST.field("CD");
        Field<Integer> cd2 = TEST.field("CD", Integer.class);
        assertEquals(List.of(cd1), List.of(cd2));
        assertEquals(List.of(cd2), List.of(cd1));
        assertEquals(cd1.hashCode(), cd2.hashCode());
        assertTrue(new HashSet<>(List.of(cd1)).contains(cd2));
        assertTrue(new HashSet<>(List.of(cd2)).contains(cd1));
    }
}
