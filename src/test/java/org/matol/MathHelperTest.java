package org.matol;

import org.junit.Assert;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

/**
 * @author Juraj Ondruska (juraj.ondr@gmail.com)
 * @since 1.0.0
 */
public class MathHelperTest {

    @Test
    public void testPlusNegative() {
        MathHelper testInstance = new MathHelper();

        Assert.assertThrows(NullPointerException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                testInstance.plus(null, 10);
            }
        });
    }

    @Test
    public void test() {
        MathHelper testInstance = new MathHelper();

        Assert.assertEquals(4, testInstance.plus(2, 2).intValue());
    }
}