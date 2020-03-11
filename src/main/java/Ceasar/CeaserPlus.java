package Ceasar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CeaserPlus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        List<Integer> offset = new ArrayList<Integer>();
        offset.add(0);
        char[] code = new char[N];
        for (int i = 0; i < N ; i++) {

            if (scan.hasNextInt()) {
                offset.add(scan.nextInt());
                code[i] = '#';
            }
            else
            code[i] = scan.next().charAt(0);

        }

//        for (int i = 0; i <code.length ; i++) {
//            System.out.println(code[i]);
//        }
        sipher(code , offset);

    }

    public static void sipher(char[] arr , List<Integer> offsets){
            int offsetAt = 0;
            int totaloffset = 0;
        List<Character> temp = new ArrayList<Character>();

        //Format
        temp = format(arr);



        //Output
        for (int i = 0; i <temp.size() ; i++) {

            while(temp.get(i)=='#') {
                offsetAt++;
                totaloffset = totaloffset+offsets.get(offsetAt);
                temp.remove(i);
            }
            System.out.println(changeChar(temp.get(i), totaloffset));
        }
    }

    public static List<Character> format(char[] arr){
        List<Character> temparr = new ArrayList<Character>();
        int delcouunt = 0;

        for (int i = 0; i < arr.length ; i++) {

            temparr.add(arr[i]);
            if (arr[i]!='^'){
                delcouunt = 0;
            }

            if (arr[i]=='^') {
                temparr.remove(temparr.size() - 1);
                delcouunt++;

                if (temparr.get(temparr.size() - 1) != '#')
                    temparr.remove(temparr.size() - 1);
                else if (delcouunt>1 && !(temparr.get(temparr.size()-2)=='#')){
                   temparr.set(temparr.size()-2,'#');
                   temparr.remove(temparr.size()-1);
                }
            }

        }


        for (int i = 0; i <temparr.size() ; i++) {
            System.out.println(temparr.get(i));
        }
        System.out.println("--------------------------------");
        return temparr;
    }

    public static char changeChar(char a , int offset){
        int alphabet = 26;
        int changeTo = offset%alphabet;
//        List<Character> temp = new LinkedList.LinkedList<Character>();
//        for (int i = 65; i < 91 ; i++) {
//            temp.add((char)i);
//        }
//        return temp.get(temp.indexOf(a)+changeTo);

        a = (char) (a+changeTo);

        if(a <='Z' && !(a<'A'))
        return a;
        if (a >'Z')
            return (char) ((a-'Z')+('@'));
        if (a<'A')
            return (char) (('A'-a)-('['));
        return a;
    }
}
//((temparr.get(temparr.size()-1)>='A') && (temparr.get(temparr.size()-1)<='Z'))