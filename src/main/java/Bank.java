public class Bank {
    public double saveDeposit (double amount, int years, double rate){
        if (amount < 0 || years < 0 || rate < 0) {
            throw new RuntimeException();
        }

        for (int i = 0; i < years; i++) {
            amount *=rate;
        }
        return  amount;
    }
}
