package com.company;

public class Main {

    public static void main(String[] args) {


        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
		int sum = 0;
		try {
			sum = SumThread.sum(arr);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum: " + sum);
    }


}

