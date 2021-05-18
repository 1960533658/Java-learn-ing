package Method_Call;

public class circle {
    // 定义方法的语法
    /**
     * pubcli static 返回值的数据类型 方法名(形参) {
     *      方法体
     *      return值
     * }
     *
     */
    public static void main(String[] args) {
        show();
        System.out.println(getSum(1,2));
    }
    public static void show() {
        System.out.println("展示圆的面积");
    }

    public static Number getSum(int num1,int num2) {
        return num1 + num2;
    }

}
