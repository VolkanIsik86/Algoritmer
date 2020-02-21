package CcccomboBreaker;

import java.util.Scanner;

public class CccomboBreaker {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int length = scan.nextInt();

        String[] input = new String[length];
        for (int i = 0; i < length ; i++) {
            input[i] = scan.next();
        }
        scan.close();
        combo(input);
    }

    public static void combo(String[] input){
        //String[] tempInput = input.split(" ");
        String[] tempInput = input;
        for (int i = 0; i <tempInput.length ; i++) {

            if(comboBreaker(tempInput,i)){
                System.out.println("F");;
                i = i + 3;
            }
            else {
                System.out.println(answer(tempInput,i));
            }
        }


    }

    public static boolean comboBreaker(String[] input , int i){


        if (i>input.length-4){
            return false;
        }
        else{
            char[] elements = {input[i].charAt(0),input[i+1].charAt(0),input[i+2].charAt(0),input[i+3].charAt(0)};
            for (int j = 1; j < elements.length ; j++) {
                if(elements[0]==elements[j])
                    return false;
            }
            for (int j = 2; j <elements.length ; j++) {
                if(elements[1]==elements[j])
                    return false;
            }
            if (elements[2]==elements[3])
                return false;
        }
        return true;
    }

    public static String answer(String[] input , int i){
        if (input[i].equals("C"))
            return "M";
        if (input[i].equals("L"))
            return "E";
        if (input[i].equals("R"))
            return "C";
        if (input[i].equals("S"))
            return "S";
        return null;
    }
}
