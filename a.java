import java.util.*;
import java.io.*;

class A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split(",");
        sum(str);
        System.out.println();
    }

    public static void sum(String[] str){
        int len = str.length;

        if( len == 1 ){
            System.out.println(str[0]);
            return;
        }

        int s = 0;
        for(int i = 0; i<len; i++){
            s += Integer.parseInt(str[i]);
        }

        for(int i = 0; i<len-1; i++){
            System.out.print(s - Integer.parseInt(str[i]) + ",");
        }
        System.out.print(s - Integer.parseInt(str[len-1]));

    }

}