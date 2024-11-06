package testV;

import java.util.*;

import java.lang.*;

import java.io.*;
 
class Main {

    public static void main(String[] args) {

        List<String> l = new ArrayList <String>(5);

        l.add("one");

        l.add("two");

        l.add("three");

        System.out.println(l.get(3));

        for(String s : l){

            if(s == "one"){

                l.remove(s);

            }

        }  

    }

}
 