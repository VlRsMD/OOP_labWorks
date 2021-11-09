package lab5;

public class objects {
    public static void main(String[] args) {
        A one = new A();
        one.a = "first";
        X x1 = one.x;
        String name1 = x1.name;
        x1.name = "x_one";

        B two = new B();
        two.b = "second";

        C three = new C();
        three.c = "third";

        D four = new D();
        four.d = "fourth";
        X x2 = one.x;
        String name2 = x2.name;
        x2.name = "x_two";

        E five = new E();
        five.e = "fifth";

        F six = new F();
        six.f = "sixth";

        G seven = new G();
        seven.g = "seventh";

        H eight = new H();
        eight.h = "eighth";
        X x3 = one.x;
        String name3 = x3.name;
        x3.name = "x_three";

        I nine = new I();
        nine.i = "ninth";

        J ten = new J();
        ten.j = "tenth";
        X x4 = one.x;
        String name4 = x4.name;
        x4.name = "x_four";

        System.out.println("First class contains: " + one.a);
        System.out.println("Second class contains: " + two.a + ", " + two.b);
        System.out.println("Third class contains: " + three.a + ", " + three.b + ", " + three.c);
        System.out.println("Fourth class contains: " + four.a + ", " + four.b + ", " + four.c + ", " + four.d);
        System.out.println("Fifth class contains: " + five.a + ", " + five.b + ", " + five.c + ", " + five.d + ", " + five.e);
        System.out.println("Sixth class contains: " + six.a + ", " + six.b + ", " + six.c + ", " + six.d + ", " + six.e + ", " + six.f);
        System.out.println("Seventh class contains: " + seven.a + ", " + seven.b + ", " + seven.c + ", " + seven.d + ", " + seven.e + ", " + seven.f + ", " + seven.g);
        System.out.println("Eighth class contains: " + eight.a + ", " + eight.b + ", " + eight.c + ", " + eight.d + ", " + eight.e + ", " + eight.f + ", " + eight.g + ", " + eight.h);
        System.out.println("Ninth class contains: " + nine.a + ", " + nine.b + ", " + nine.c + ", " + nine.d + ", " + nine.e + ", " + nine.f + ", " + nine.g + ", " + nine.h + ", " + nine.i);
        System.out.println("Tenth class contains: " + ten.a + ", " + ten.b + ", " + ten.c + ", " + ten.d + ", " + ten.e + ", " + ten.f + ", " + ten.g + ", " + ten.h + ", " + ten.i + ", " + ten.j);
    }
}
