package com.JosephSumsion.L04HandsOn;
class DoubleMeMethods {
    static int doubleMe(int val) {
        int doubledVal = val * 2;
        System.out.println("Input value: " + val);
        System.out.println("Doubled value: " + doubledVal);
        return doubledVal;
    }

    static int quadrupleMe(int val) {
        int doubledVal = doubleMe(val);
        int quadrupledVal = doubleMe(doubledVal);
        System.out.println("Input value: " + val);
        System.out.println("Quadrupled value: " + quadrupledVal);
        return quadrupledVal;
    }

    static int doubleMeTimes(int val, int count) {
        int result = val << count;
        System.out.println("Input value: " + val);
        System.out.println("Result after doubling " + count + " times: " + result);
        return result;
    }

    public static void main(String[] args) {
        int number = 5;

        doubleMe(number);
        quadrupleMe(number);
        doubleMeTimes(number, 3);
    }
}