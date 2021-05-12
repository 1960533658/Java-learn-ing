package Array_cases.Array_Sort;

public class Demo3 {
    /**
     * 已知一个数组
     * int[] arr = {99,44,55,11};
     * 要求，将数组中的元素进行从小到大的排序：
     * 最终变为：
     * {11,44,55,99}
     */
    public static void main(String[] args) {
        int[] arr = {99,44,55,11};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] arr2 = {99, 44, 55, 11};
        for (int i = 0; i < arr2.length-1; i++) {
            for (int j = i+1; j < arr2.length; j++) {
                // 如果i的值大于j的值就互换位置
                if(arr2[i] > arr2[j]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
