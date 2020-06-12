package com.priyakshi.array.primenumber;

import com.priyakshi.controlstatement.challenge.primenumber.PrimeNumberCalculator;

public class PrimeNumbersFinder {
    public Integer[] getAllPrimeNumbers(Integer[] intArray) {
        Integer[] primeNumbers = new Integer[intArray.length];
        int primeNumberCounter = 0;
        PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();
        for (int i = 0; i < intArray.length; i++) {
            boolean isPrime = primeNumberCalculator.isPrimeNumber(intArray[i]);
            if (isPrime) {
                primeNumbers[primeNumberCounter] = intArray[i];
                primeNumberCounter++;
            }
        }
        for (int i = primeNumberCounter; i < primeNumbers.length; i++) {
            primeNumbers[i] = -1;
        }
        return primeNumbers;
    }
}
