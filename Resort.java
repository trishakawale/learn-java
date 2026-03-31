import java.util.*;

class Resort {
    int Rno, Days;
    String Name;
    float Charges;

    float Compute() {
        float amt = Days * Charges;
        if (amt > 11000)
            amt = amt * 1.02f;
        return amt;
    }

    void Getinfo() {
        Scanner sc = new Scanner(System.in);
        Rno = sc.nextInt();
        Name = sc.next();
        Charges = sc.nextFloat();
        Days = sc.nextInt();
    }

    void DispInfo() {
        System.out.println(Rno + " " + Name + " " + Charges + " " + Days + " " + Compute());
    }
}
