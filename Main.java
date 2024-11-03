public class Main {//此处定义了一个类，具体以后会说到
	private boolean manbaOut = true;
    //这是一个私有成员变量，
    //只对这个类可见，用"private"修饰符修饰
    public boolean man = true;
    //这是一个实例成员变量，
    //对所有类可见，用"public"修饰符修饰
    public static boolean MAN = true;
    //这是一个静态成员变量，对所有类可见，
    //无需创建实例即可访问，静态变量用"static"修饰符修饰
    public static final double PI = 3.1415926;
    //这是一个静态常量，对所有类可见，无需创建实例即可访问，
    //常量变量一旦赋值后，不能被重新赋值，常量用"final"修饰符修饰
    public static enum classCadre{
        MONITOR,DEPUTY_MONITOR;
    }
    //这是一个枚举类，枚举类是一个特殊的类，一般表示一组常量语法为：
    //修饰符 enum 枚举名{枚举成员1, 枚举成员2, 枚举成员3...;}
    public static void main(String[] args) {
    //此处定义了一个静态成员方法，返回值为空，名为"main"，它是Java程序的入口
        System.out.println("Man, What can I say? Manba out!");
        //System.out.println这个方法用于在控制台输出内容
    }
}
/*
    上述代码如果用python实现就是：
    print("Man, What can I say? Manba out!")
    语法详解：
    1.在Java中，所有语句的后面都得加分号
    2.Java是大小写敏感的语言（虽然好像大部分语言都是大小写敏感），
    所以Java跟java是不同的
    3.命名规范：
    (0)所有变量名字应该是能够表示这个变量的用途的
    (1)局部变量、成员变量和方法参数使用小写字母开头的驼峰命名法
    （每个单词的首字母大写，单词的首字母都采用大写形式），例：
    boolean manbaOut;
    private boolean manbaOut;
    private String whatCanISay(boolean manbaOut){
        ...
    }
    (2)静态变量既可以使用小写字母开头的驼峰命名法，
    也可以使用大写蛇形命名法（全大写字母，单词之间用下划线分隔），例：
    public static final boolean MAN = true;
    (3)常量使用大写蛇形命名法，例
    public static final double PI = 3.1415926;
    (4)类名使用大写字母开头的驼峰命名法，例：
    public class SeeYouAgain{
        ...
    }
*/