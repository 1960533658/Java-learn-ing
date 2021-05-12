# 08-continue和数组

## continue
> 跳过本次循环，立即进入下面的循环。本次循环中continue之后的代码不会执行
```java
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

```

## 数组
> 数组是可以存储多个变量（容器）的容器
> 数组存入的变量的值的类型必须一致
> 数组是引用类型
> 语法：
```text
数据类型[] 数组名 = new 数据类型[元素的长度]
```
> 代码示例
```java
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

```
## null
> **null**是所有的数据类型都可以接收的值
