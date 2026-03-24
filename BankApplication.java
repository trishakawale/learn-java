class BankApplication {

    static void process() throws Exception {
        throw new Exception("Error");
    }

    public static void main(String[] args) {
        try {
            process();
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}
