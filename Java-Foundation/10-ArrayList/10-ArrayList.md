# ArrayList

## 声明定义ArrayList
> 快捷键
```text
new ArrayList<数据类型>() +  Ctrl+Alt+V 即可快速生成
```
**数组与arraylist的区别**
```text
数组必须提前赋值、规定长度
ArrayList 底层是数组，动态数组
```

> 所属包：java.util.ArrayList
> 语法：
```text
类名<集合内元素类型> 变量 = new ArrayList<集合内元素类型>()
```
> 注意
- 类型不能用基本数据类型，使用基本数据类型对应的引用数据类型写法
- 首字母大写：byte、short、long、float、double、boolean
- 例如：double ----> Double
- 特殊类型：int--->Integer
     char--->Character

```java
package ArrayList;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        //创建一个保存String的集合
        ArrayList<String> list1 = new ArrayList<>();
        //快捷创建写法   ctrl+alt+v   快捷生成变量名
        ArrayList<String> list2 = new ArrayList<>();

        //long ---->  Long
        ArrayList<Long> list3 = new ArrayList<>();
        //int  ---->  Integer
        ArrayList<Integer> list4 = new ArrayList<>();

        //double ---> Double
        ArrayList<Double> list5 = new ArrayList<>();
        //char   --->Character
        ArrayList<Character> list6 = new ArrayList<>();

    }
}
```
## ArrayList的方法

| 名称 | 作用 |
| :---: | :---: |
| add() | 向集合末尾添加元素 |
| get(index) | 获取指定索引的值 |
| CollectionsAll.addAll(集合名，值,值,值) | 一次添加多个值 |

```java
package ArrayList_Method;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        Collections.addAll(list, 33, 44, 55);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // 11 22 33, 44, 55
        }
    }
}

```