package If_else_if_statement;

public class Demo3 {
    public static void main(String[] args) {
        int a = 36;
        if(a%5 == 0) {
            System.out.println("是五的倍数");
        }else if (a%10 == 0) {
            System.out.println("是十的倍数");
        }else if (a%9 == 0) {
            System.out.println("是9的倍数");
        }
    }
}
