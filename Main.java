public class Main {
    public static void main(String[] args) {
        int threshold = 1000;
        int accounts_refill;
        int bonus;
        accounts_refill = 1100;
        if(accounts_refill > threshold) {
            bonus = accounts_refill / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
    }
}
