package core.inheritance;

public class B extends A{
    public void method1(){
        System.out.println("Class B method 1");
    }

    public void method2(){
        System.out.println("Class B method 2");
    }

    public void method3(){
        System.out.println("Class B method 3");
    }

    public static void main(String[] args){
        A a = new A();
        a.method1();
        a.method2();
        a.method3();

        A ab = new B();
        ab.method1();
        ab.method2();
        ab.method3();

        B b  = new B();
        b.method1();
        b.method2();
        b.method3();
    }
}
