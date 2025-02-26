package org.example;

public class SumCalculator {
    public int sum(int n){
        if (n <= 0){
            throw new IllegalArgumentException();
        }
        if (n >= 65536){
            throw new ArithmeticException("Результат не поміститься в діапазон Integer");
        }
        int result = 0;
        for (int i = 1; i <= n; i++){
            result += i;
        }
        return result;
    }
}



