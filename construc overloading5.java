class Book {
    String title;
    double price;

    Book() {
        title = "Not Available";
        price = 0;
    }

    Book(String t) {
        title = t;
        price = 100;
    }

    Book(String t, double p) {
        title = t;
        price = p;
    }

    void display() {
        System.out.println(title + " " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java");
        Book b3 = new Book("Python", 450);

        b1.display();
        b2.display();
        b3.display();
    }
}
