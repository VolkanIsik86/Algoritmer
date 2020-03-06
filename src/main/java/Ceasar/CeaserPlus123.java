package Ceasar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CeaserPlus123 {
    static LinkedList<Character> alphabetArr;
    public static void main(String[] args) {
        alphabetArr = new LinkedList<Character>();
        for (int i = 65; i < 91 ; i++) {
            alphabetArr.add((char)i);
        }

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        List<String> arr = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            arr.add(scan.next());
        }
        sipher(arr);

        scan.close();


    }

    public static void sipher(List<String> arr) {
        int offset = 0;
        int alphabet = 26;
        int changeTo = 0;


        List<String> temp = new ArrayList<String>();

        for (int i = 0; i <arr.size() ; i++) {
           if(arr.get(i).charAt(0)=='^') {

               if (temp.size()>0) {
                   if (((temp.get(temp.size() - 1).charAt(0) > 47) && (temp.get(temp.size() - 1).charAt(0) < 58))) {
                       offset = Integer.parseInt(temp.get(temp.size() - 1));
                       changeTo = (changeTo + offset) % alphabet;
                   }
                   temp.remove(temp.size() - 1);
               }

           }
            if(arr.get(i).charAt(0)!='^' )
           temp.add(changeElement(arr.get(i),changeTo));

            }
        //Output

        if(temp.size()==0)
            System.out.println("");

        if(temp.size()>0) {
            System.out.print(temp.get(0));
            for (int i = 1; i < temp.size(); i++) {

                System.out.print(" " + temp.get(i));

            }
        }
    }




    public static String changeElement(String element , int offset){
        int alphabet = 26;
        int placeInAlphabet = alphabetArr.indexOf(element.charAt(0));
        int returnValue = offset+placeInAlphabet;


       if ((element.charAt(0) > 47 && element.charAt(0) < 58) || (element.charAt(0))=='-')
        return element;

       if(returnValue<0)
           return String.valueOf(alphabetArr.get(returnValue+alphabet));

       if(returnValue>(alphabet-1))
        return String.valueOf(alphabetArr.get(returnValue-alphabet));

       return String.valueOf(alphabetArr.get(returnValue));
    }
}
