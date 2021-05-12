package Continue;

public class Demo1 {
    public static void main(String[] args) {
        // 打印1-100
        for (int i = 0; i < 100; i++) {
            if (i%2==0) continue;
            System.out.println(i);

        }
    }
}
