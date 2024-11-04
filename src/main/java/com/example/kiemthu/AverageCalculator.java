package com.example.kiemthu;

public class AverageCalculator {
    public int average(int[] values, int minimum, int maximum) {
        int inputNumber = 0;
        int validNumber = 0;
        int sumValues = 0;

       
        while (values[inputNumber] != -999 && inputNumber < 100) {
           
            inputNumber++;

            
            if (values[inputNumber] > minimum && values[inputNumber] <= maximum) {
                validNumber++;
                sumValues += values[inputNumber];
            }
        }

        
        if (validNumber > 0) {
            return sumValues / validNumber; 
        } else {
            return -999;
        }
    }

    public static void main(String[] args) {
        AverageCalculator calculator = new AverageCalculator();
        int[] values = {10, 20, 30, 40, -999};
        int minimum = 10;
        int maximum = 30;

        int result = calculator.average(values, minimum, maximum);
        System.out.println("Giá trị trung bình là: " + result);
    }
}
