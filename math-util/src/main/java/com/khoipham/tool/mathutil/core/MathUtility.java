package com.khoipham.tool.mathutil.core;

public class MathUtility {
    //CLASS NÀY CHỨA CÁC HÀM STATIC, LÀ NHỮNG HÀM TIỆN ÍCH DÙNG CHUNG CHO MỌI NƠI

    // ĐÂY LÀ HÀM MÔ PHỎNG THƯ VIỆN TOÁN HỌC MATH. CỦA JDK
    // HÀM NÀY TÍNH N!
    // N! = 1*2*3*...*N
    //KHÔNG CÓ GIAI THỪA SỐ ÂM
    //0! = 1
    // 20! VỪA ĐỦ KIỂU LONG, TỨC LÀ 21! VƯỢT KIỂU LONG
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw new IllegalStateException("n must be between 0 and 20");
            // bạn đưa invalid data, tớ ném ra ngoại lệ, hàm không được chạy thành công, không value trả về
        }

        if (n == 0) return 1; // sống sót tới dãy n = 1, ... , 19


        long result = 1;
        for(int i = 1 ; i <= n ; i++) result *= i;
        return result;
    }
}
