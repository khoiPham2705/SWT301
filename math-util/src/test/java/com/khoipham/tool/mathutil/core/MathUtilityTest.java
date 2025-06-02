package com.khoipham.tool.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test // mang ý nghĩa biến cái hàm sát dưới thành hàm main thì mới chạy lệnh test được

    //test case 1: verified factorial() with N = 0
    void testFactoryalGivenRightArgument0RunsWell() {
        int n = 0;
        long expected = 1; // hy vọng n = 0, tức là 0! sẽ có giá trị là 1
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected,actual); // so sánh xem thực tế có nh kì vọng không?? nếu không thì ra màu đỏ

    }

    @Test
    //test case 2,3,4: verified factorial() with N = 0
    void testFactoryalGivenRightArgument1RunsWell() {

        long expected ;

        assertEquals(expected = 2,MathUtility.getFactorial(2));
        assertEquals(expected = 6,MathUtility.getFactorial(3));
        assertEquals(expected = 24,MathUtility.getFactorial(4));
        assertEquals(expected = 120,MathUtility.getFactorial(5));

    }
}