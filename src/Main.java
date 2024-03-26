import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        String[] bankNames = {
                "ПриватБанк",
                "Ощадбанк",
                "Альфа-Банк",
                "Райффайзен Банк Аваль",
                "Укрсиббанк",
                "Південний",
                "Креді Агріколь",
                "Укргазбанк",
                "ПУМБ",
                "Сбербанк",
                "Ідея Банк",
                "Мегабанк",
                "OTP Bank",
                "ПроКредит Банк"
        };

          Bank[] banks = new Bank[bankNames.length];

        for (int i = 0; i < bankNames.length; i++) {
            double exchangeRate = 37 + random.nextDouble() * (42 - 37);
            banks[i] = new Bank(bankNames[i], exchangeRate);
        }

        System.out.println("Усі банки міста:");
        for (Bank bank : banks) {
            System.out.println(bank);
        }

        double maxCurr = Double.MIN_VALUE;
        for (Bank bank : banks) {
            if (bank.getExchangeCurr() > maxCurr) {
                maxCurr = bank.getExchangeCurr();
            }
        }

        System.out.println("\nНайвигідніші банки для обміну:");
        for (Bank bank : banks) {
            if (bank.getExchangeCurr() == maxCurr) {
                System.out.println(bank);
            }
        }
    }

    }

