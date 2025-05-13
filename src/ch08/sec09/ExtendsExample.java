package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImpl i = new InterfaceCImpl();

        InterfaceA a = i;
        a.methodA();
        System.out.println();

        InterfaceB b = i;
        b.methodB();
        System.out.println();

        InterfaceC c = i;
        c.methodA();
        c.methodB();
        c.methodC();
    }
}
