package com.khoipham.tool.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    // TÁCH DATA RA KHỎI CÂU LỆNH TEST
    // DỰNG 1 MẢNG 2 CHIỀU: INPUT, EXPECTED
    // SAU ĐÓ NGỒI VÀO, FILL VÀO CÂU LỆNH SO SÁNH
    // DATA NÀY SẼ LÀ NGUỒN DỮ LIỆU ĐỂ HÀM SO SÁNH GỌI NHIỀU LẦN, NHƯ THẾ, DO NHIỀU DATA
    //--> NGUỒN NÀY LÀ STATIC ĐỂ TÌM KIẾM NHANH CHÓNG

    public static Object[][] initTestData(){
        return new Object[][]{
                                {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,120},
                                {6,720}

        };
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunWells(int n, long expected){
        assertEquals(expected,MathUtility.getFactorial(n));
    }
}