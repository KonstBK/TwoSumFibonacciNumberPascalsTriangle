package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PascalsTriangleTest {

    @Test
    public void checkPascalsTriangle1Row(){
        String expectedResult = "[[1]]";
        Assert.assertEquals(expectedResult, Arrays.toString(PascalsTriangle.generate(1).toArray()));
    }

    @Test
    public void chekPascalsTriangle5Row(){
        String expectedResult = "[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]";
        Assert.assertEquals(expectedResult, Arrays.toString(PascalsTriangle.generate(5).toArray()));
    }
}