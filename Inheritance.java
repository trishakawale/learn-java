class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
