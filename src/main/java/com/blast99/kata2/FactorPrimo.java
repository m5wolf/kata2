package com.blast99.kata2;

import java.util.ArrayList;

public class FactorPrimo {

    public boolean esPrimo(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public ArrayList<Integer> listaDeNumPrimos(int number) {

        ArrayList<Integer> listaPrimos = new ArrayList<>();

        return listaPrimos;

    }
}
