package Calc;

public class Demo2 {
    public static void main(String[] args) {
        // 定义一个数字为10 进行+9 -1 *2 /9
        int num = 10;
        num +=9;
        System.out.println(num); // 19
        num -= 1;
        System.out.println(num); // 18
        num *= 2;
        System.out.println(num); // 36
        num /= 9;
        System.out.println(num); // 4

        // 字符串的拼接
        String str = "康春龙";
        String str2 = "真帅";
        System.out.println(str + str2);
        System.out.println(str + str2 + "不是吗???");
    }
}
