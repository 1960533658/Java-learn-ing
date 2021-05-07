# idea的基本使用

## idea软件基本界面讲解

> 调出工具条和按钮组
![image-20210506205317975](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210506205317975.png)



> 工程界面展示
![image-20210506205536854](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210506205536854.png)

## 创建项目（Package）



- 右键项目根目录选择new
- 点击module
![image-20210506205728448](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210506205728448.png)



- 选择Java，点击Next
![image-20210506210025893](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210506210025893.png)




- 在第一行输入项目名或者在第二行输入项目名，点击Finish即可创建项目
![image-20210506210225102](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210506210225102.png)

### 创建包
> 在scr文件目录下才能创建包



- 右键src文件
- 鼠标悬停于new
- 鼠标点击于Package选项
![image-20210506211215013](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210506211215013.png)



- 输入包名
- 点击 ok
![image-20210506211526474](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210506211526474.png)

### 创建class文件


- 右键包
- 鼠标悬停于new
- 鼠标点击Java Class
![image-20210506211737828](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210506211737828.png)



- 输入class类名
- 点击ok
![image-20210506212202233](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210506212202233.png)



- 确认添加
![image-20210506212231649](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210506212231649.png)


### 项目创建目录分析
> Java项目创建只有两个东西
> > src目录文件
> > > 用于存放项目代码文件
> > 项目名称和.iml  作用未知


## 基本代码演示-Hello World

```java
package  Demo;
public class Demo1 {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
```

## 注释
> 被注释的内容不会对代码造成任何影响,只用于代码的维护与提示
```java
// 单行注释
/**
多行注释
*/

```

## 控制台输出

```java
package Demo;
public class Demo1 {
    public static void main(String[] args) {
        // 方式1 换行输出
        System.out.println("hello");
        // 方式2 同一行输出
        System.out.print("wo");
        System.out.print("rld");
    }
}
```

## 快捷键
```java
// sout

public class Demo1 {
    public static void main(String[] args){
    //快捷方式-输出 sout
    System.out.println("");// 换行输出,同一行输出没有快捷键
    // 快捷输出打印 Ctrl + Shift + F10
    }
}
```