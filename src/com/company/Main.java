package com.company;

public class Main {

    public static void main(String[] args) {
	int [] array = {2,5,10,6,8,4};
	int min = array [0];
	for (int i = 0; i < array.length; i ++){
	    if (array [i] < min){
	        min = array [i];
        }
    }
    System.out.println(min);
    }
}
