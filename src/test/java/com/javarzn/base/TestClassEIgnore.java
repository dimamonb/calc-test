package com.javarzn.base;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
@Ignore
public class TestClassEIgnore {
    @Ignore("Test is ignored as a demonstration")
    @Test
    public void testSame() {
        assertThat(1, is(1));
    }

    @Test
    public void testSame2() {
        assertThat(1, is(1));
    }
}
