package com.khoipham.tool;

import com.khoipham.tool.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {

        testFactoryalGivenRightArgument0RunsWell();
        testFactoryalGivenRightArgument1RunsWell();
        testFactoryalGivenRightArgument2RunsWell();
    }

    // TEST THỬ HÀM VỪA GÕ
    // CẦN CÓ TEST CASE
    // TEST CASE #1: CHECK/VERIFY THE GETFACTORIAL() METHOD WITH N = 0
    //CALL GETFACTORIAL(N = 0)
    //EXPECTED RESULT: HOPE TO SEE 1 AS THE RESULT OF 0!
    // STATUS: ĐOÁN XEM



    public static void testFactoryalGivenRightArgument0RunsWell(){
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println("0! expected: " + expected + " actual: " + actual) ;
    }

    // TEST CASE #2: CHECK/VERIFY THE GETFACTORIAL() METHOD WITH N = 1
    //CALL GETFACTORIAL(N = 1)
    //EXPECTED RESULT: HOPE TO SEE 1 AS THE RESULT OF 1!
    // STATUS: ĐOÁN XEM



    public static void testFactoryalGivenRightArgument1RunsWell(){
        int n = 1;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println("1! expected: " + expected + " actual: " + actual) ;
    }
    

    public static void testFactoryalGivenRightArgument2RunsWell(){
        int n = 1;
        System.out.println("2! expected: 2" +  " actual: " + MathUtility.getFactorial(2)) ;
        System.out.println("3! expected: 6" +  " actual: " + MathUtility.getFactorial(3)) ;
        System.out.println("4! expected: 24" +  " actual: " + MathUtility.getFactorial(4)) ;
        System.out.println("5! expected: 120" +  " actual: " + MathUtility.getFactorial(5)) ;
    }

    // TDD -  TEST DRIVEN DEVELOPMENT
    // VIET CODE CHINH VA VIET TEST CASE SONG SONG
    // CU VIET DC CODE NAO THI CO TEST CASE CHO NO
    // TEST CASE DUNG DE TEST HAM ( KHONG NHAM VOI TEST APP =  TEST MAN HINH UI VA NHAP LIEU ), CHI DANH CHO DAN DEV( DAN QA/AC)
    // NHO TDD, TDD DONG GOP 1 PHAN GIUP TA VA TU DONG QUA TRINH BUILD, CHECK BUG, DONG GOI CODE NẾU CODE ỔN, DEPLOY LÊN STAGING SERVER ( SERVER ĐỂ TEST APP )    // CODE --> CHECK VAPF CPDE (UNIT TEST, TDD)
    //          ỔN THÌ ĐÓNG GÓI CODE
    //          ĐƯA CODE LÊN SERVER
    // QUY TRÌNH NÀY LÀ CI/CD

    // CV CÓ 1 MỤC
    // TECHNICAL SKILL
    // JUnit
    // TD
    // CI/CD
    // Maven
}