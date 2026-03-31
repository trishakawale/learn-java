class Staff {
    void work() {
        System.out.println("Staff working");
    }
}

class Doctor extends Staff {
    void work() {
        System.out.println("Treat patients");
    }
}

class Nurse extends Staff {
    void work() {
        System.out.println("Assist doctor");
    }
}
