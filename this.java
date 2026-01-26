class Student {
    int rollNo;
    String name;

    // Parameterized Constructor
    Student(int rollNo, String name) {
        // 'this' refers to current class object
        this.rollNo = rollNo;
        this.name = name;
    }

    // Method to display details
    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student(101, "Trisha");
        s1.display();
    }
}

