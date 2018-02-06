package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] masyvas = {4, 8, 6, 7, 2, 1, 5, 3, 9};
        //int [] masyvas = {8, 6, 7, 2, 1, 5, 3, 9};
        rikiavimasDidejimo(masyvas);
        spausdinimas(masyvas);
    }
    public static void rikiavimasDidejimo(int [] masyvas){
        int tmp, min = masyvas[0];

        for (int i = 0; i < masyvas.length - 1; i++){
            for (int j = i + 1; j < masyvas.length; j++){
                if(masyvas[i] > masyvas[j]){
                    //
                    tmp = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = tmp;
                }
            }

        }
    }
    public static void spausdinimas (int [] masyvas){
        for (int i = 0; i < masyvas.length; i++){
            System.out.print(masyvas[i]+ " ");
        }

    }
}


