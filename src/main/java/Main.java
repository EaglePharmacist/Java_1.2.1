public class Main {
    public static void main(String[] args) {

        int clientMoney = 100;
        int plus = 1100;
        int sum = clientMoney + plus;
        int bonus = plus / 100;
        int moneyPlusBonus = clientMoney + plus + bonus;

        if (plus > 1000){
            System.out.println("Итоговая сумма бонуса составила: " + bonus);
            System.out.println("Итоговый баланс счёта составил: " + moneyPlusBonus);
        } else {
            System.out.println("Итоговая сумма бонуса составила: 0 руб.");
            System.out.println("Итоговый баланс счёта составил: " + sum);
        }
    }
}