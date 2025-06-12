package com.khoipham.tool.mathutil.core;

public class MathUtility {
    //CLASS NÀY CHỨA CÁC HÀM STATIC, LÀ NHỮNG HÀM TIỆN ÍCH DÙNG CHUNG CHO MỌI NƠI

    // ĐÂY LÀ HÀM MÔ PHỎNG THƯ VIỆN TOÁN HỌC MATH. CỦA JDK
    // HÀM NÀY TÍNH N!
    // N! = 1*2*3*...*N
    //KHÔNG CÓ GIAI THỪA SỐ ÂM
    //0! = 1
    // 20! VỪA ĐỦ KIỂU LONG, TỨC LÀ 21! VƯỢT KIỂU LONG
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20){
//            throw new IllegalArgumentException("n must be between 0 and 20");
//            // bạn đưa invalid data, tớ ném ra ngoại lệ, hàm không được chạy thành công, không value trả về
//        }
//
//        if (n == 0) return 1; // sống sót tới dãy n = 1, ... , 19
//
//
//        long result = 1;
//        for(int i = 1 ; i <= n ; i++) result *= i;
//        return result;
//    }

    public static long getFactorial(int n){

        if(n < 0 || n > 20){
            throw new IllegalArgumentException("n must be between 0 and 20");
            // bạn đưa invalid data, tớ ném ra ngoại lệ, hàm không được chạy thành công, không value trả về
        }

        if(n == 0){
            return 1;
        }
        else{
            return n*getFactorial(n-1);
        }
        // ĐEM LÊN SERVER RA MÀU XANH
            // 1. CODE TỐI ƯU NGON VÌ PASS TEST CASE
            // 2. TEST CÁI TỪNG THU RẤT MẤT CÔNG NAY CÓ SCRIPT TEST TỰ ĐỘNG
            // RECURSION TESTING KIỂM THỬ HOI QUY


        //Đệ quy - recursion - gọi lại chính mình với quy mô nhỏ hơn
    }
}
