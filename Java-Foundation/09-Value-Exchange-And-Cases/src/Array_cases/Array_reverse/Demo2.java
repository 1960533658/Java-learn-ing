package Array_cases.Array_reverse;

public class Demo2 {
    public static void main(String[] args) {
        /**
         * 已知一个数组
         * {11,22,33,44,55,66}
         * 要求，将数组中的元素进行反转保存
         * 最终数组的保存顺序为
         * {66,55,44,33,22,11}
         * 要求不能创建新数组，从始至终就一个数组
         */

        int[] arr = {11,22,33,44,55,66};
        for (int i = 0; i < arr.length/2; i++) {
            // 数组反转公式 i的相对应位置 = arr.length-1-i
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);// 6,55,44,33,22,11
        }
    }
}
