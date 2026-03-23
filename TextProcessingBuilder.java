class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println(sb);

        // StringBuilder is faster (not thread-safe)
        // StringBuffer is slower (thread-safe)
    }
}
