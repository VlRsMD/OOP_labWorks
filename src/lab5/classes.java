package lab5;

    class A {
        protected String a;
        protected X x;
    }
    class B extends A {
        protected String b;
    }
    class C extends B {
        protected String c;
    }
    class D extends C {
        protected String d;
        protected X x;
    }
    class E extends D {
        protected String e;
    }
    class F extends E {
        protected String f;
    }
    class G extends F {
        protected String g;
    }
    class H extends G {
        protected String h;
        protected X x;
    }
    class I extends H {
        protected String i;
    }
    class J extends I {
        protected String j;
        protected X x;
    }

    class X {
        public String name;
    }

