public class Euro extends Currency implements Purse {
    double amount;

    public void setAmount(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public double convertToRub(double sum) {
        double result = 0;
        result = sum * 62.73;
        return result;
    }

    public double convertToCent(double sum){
        double cent = sum * 100;
        return cent;
    }

    @Override
    public void Sum(double sumDollar, double sumEuro, double sumPound){
        System.out.println(sumDollar + sumEuro + sumPound);
    }
    @Override
    void printSum_Rub(double result) {
        System.out.printf("Перевод в рубли: %.2f руб. \n", result);
    }

    void printCent(double cent) {
        System.out.printf("Перевод в центы: %.2f центов. \n", cent);
    }

    @Override
    public void printCash() {
        System.out.printf("\nЕевро в кошельке: %.2f €\n", amount);
    }
}
