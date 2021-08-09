package cn.itheima.test01;


public class TestString {
    public static void main(String[] args) {
        String string = new String();//this.value = "".value;
        Class aClass = string.getClass();
        System.out.println(aClass);
        String name = aClass.getName();
        System.out.println(name);
        System.out.println(string);
        String zhangsan = new String("zhangsan");
        System.out.println(zhangsan);
        Object o = new Object();

    }
}
