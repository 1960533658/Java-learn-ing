package Demo1;

public class Demo1 {
    public static void main(String[] args) {
        // 计算机内存中,用来反复存\取的区域叫做变量
        int aa = 10;
        System.out.println(aa);

        int a ;
        // 先定义后赋值
        a = 20;
        a = 30;
        System.out.println(a); // 输出结果为30
        // 先定义多个再赋值
        int b,c,d,e,f;
        b = 10;
        c = 20;
        d = 30;
        e = 40;
        f = 50;
        System.out.println(b);// 10
        System.out.println(c);// 20
        System.out.println(d);// 30
        System.out.println(e);// 40
        System.out.println(f);// 50

        // 定义多个并且同时赋值
        int g = 10, h = 20, i = 30, j = 40;

//        int k;
//        System.out.println(k); // Error java: 可能未初始化变量k
    }
}


