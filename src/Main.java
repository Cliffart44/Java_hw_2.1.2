public class Main {
    public static void main(String[] args) {
        int threshold = 1000;
        int accounts_refill;
        accounts_refill = 1550;
        int current_balance_kpks;
        current_balance_kpks = 116_23;

        int bonus;
        if(accounts_refill > threshold) {
            bonus = accounts_refill / 100;
        } else {
            bonus = 0;
        }
        
        int total_balance_kpks;
        total_balance_kpks = current_balance_kpks + accounts_refill * 100 + bonus * 100;

        System.out.println(total_balance_kpks);
    }
}
