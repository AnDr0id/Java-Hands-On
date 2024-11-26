package com.JosephSumsion.L04HandsOn;
class DoubleMeExample {
    static int doubleMe(int val) {
        int doubledVal = val * 2;
        System.out.println("Input: " + val);
        System.out.println("Doubled: " + doubledVal);
        return doubledVal;
    }

    static int quadrupleMe(int val) {
        int doubledOnce = doubleMe(val);
        int quadrupledVal = doubleMe(doubledOnce);
        System.out.println("Input: " + val);
        System.out.println("Quadrupled: " + quadrupledVal);
        return quadrupledVal;
    }

    static int doubleMeTimes(int val, int count) {
        int result = val;
        for (int i = 0; i < count; i++) {
            result = doubleMe(result);
        }
        System.out.println("Input: " + val);
        System.out.println("Doubled " + count + " times: " + result);
        return result;
    }

    static void main(String[] args) {
        int number = 5;
        doubleMe(number);
        quadrupleMe(number);
        doubleMeTimes(number, 3);
    }
}