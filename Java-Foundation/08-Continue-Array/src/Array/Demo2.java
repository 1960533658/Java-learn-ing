package Array;

public class Demo2 {
    public static void main(String[] args) {
        // 标准型（仅知道数组长度，不知道存储数据的具体数据
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);// 0000000000
        }
        System.out.println(" ");
        System.out.println("-------------------------");
        // 完整型 数组的长度3分别是11，22，33(再次进行赋值的时候就会使用
        int[] arr2 = new int[]{11, 22, 33};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);//112233
        }
        System.out.println(" ");
        System.out.println("-------------------------");
        arr2 = new int[]{44,55,66};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);// 445566
        }
        System.out.println(" ");
        System.out.println("-------------------------");
        // 简单赋值型 知道要存储的长度和数据类型、以及具体的数据
        int[] arr3 = {1,2,3};
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]); // 123
        }
    }
}
