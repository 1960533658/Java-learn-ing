package Loop_Keyword;

public class Demo4 {
    public static void main(String[] args) {
        // 打印1-100
        for (int i = 0; i < 100; i++) {
            System.out.println(i);// 0,1,2,3
            if (i == 3) {
                break;
            }
        }
    }
}
