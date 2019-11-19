package lab2;

import java.util.Scanner;


public class Main {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = in.nextLine();
        int state = 1;

        char[] line = str.toCharArray();
        for(int i=0 ; i<line.length; i++){
            switch (state){
                case 1: {
                    if (line[i] == 'a') state = 2;
                    else if (line[i] == 'b') state = 3;
                    else { state = 0; break; }
                } break;
                case 2: {
                    if (line[i] == 'a') state = 2;
                    else if (line[i] == 'b') state = 3;
                    else if (line[i] == 'c') state = 6;
                    else { state = 0; break; }
                } break;
                case 3: {
                    if (line[i] == 'a') state = 4;
                    else if (line[i] == 'b') state = 3;
                    else { state = 0; break; }
                } break;
                case 4: {
                    if (line[i] == 'a') {state = 0; break ; }
                    else if (line[i] == 'b') state = 6;
                    else if (line[i] == 'c') state = 6;
                    else { state = 0; break; }
                } break;
                case 6: {
                    state = 0;
                } break;
            }
        }
        if (state != 0 && state != 4)  System.out.println("Good string");
        else System.out.println("Bad string");
    }
}