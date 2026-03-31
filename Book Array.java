class Book {
    String title, author;
    float price;

    Book(String t, String a, float p) {
        title = t; author = a; price = p;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }
}
