public class main {
    public static void main(String[] args) {

        int account = 100; // количество рублей на счету клиента до пополнения
        int deposit = 1500; // сумма зачисления

        int currentACC; // количество рублей на счету после пополнения
        int bonusRu; // количество бонусных рублей

        if (deposit > 1000) {
            bonusRu = deposit / 100;
            currentACC = account + deposit + bonusRu;
        } else {
            bonusRu = 0;
            currentACC = account + deposit;
        }


        System.out.println(currentACC + " He рублей на счету");
        System.out.println(bonusRu + " Бонусных рублей начислено");

    }
}
