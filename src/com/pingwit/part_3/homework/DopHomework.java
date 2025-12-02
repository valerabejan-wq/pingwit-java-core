package com.pingwit.part_3.HomeWork;

public class DopHomework {
    static void main(String[] args) {
        int bitcoins = 5;

        int cryptoId = 1;

        double ethereumRate = 15;
        double dogecoinRate = 50000;
        double solanaRate = 300;

        switch (cryptoId) {
            case 1 -> System.out.println("Сумма в ETH: " + bitcoins * ethereumRate);
            case 2 -> System.out.println("Сумма в DOGE: " + bitcoins * dogecoinRate);
            case 3 -> System.out.println("Сумма в SOL: " + bitcoins * solanaRate);
            default -> System.out.println("Обмен на данную криптовалюту невозможен.");
        }
    }
}
