package trie;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cherry Rose Semeña
 */
public class PerfectHashing {
    
    char[] letters = new char[26];
    
    //English letters, input is char
    public static int indexOf(char letter){
        return (int)(letter-'A');
    }
    
    //digits, input is int
    public static int indexOf(int digit){
        return digit;
    }
    
    //red, yellow, green in that order, input is String
    public static int indexOf(String color){
        switch (color){
            case "yellow":
                return 1;
            case "green":
                return 2;
            case "red":
                return 0;
        }
            throw new IllegalArgumentException(color + "is not a color");
    }
    
    public static void main(String[] args) {
        System.out.println("1." + indexOf('c'));
        System.out.println("2." + indexOf(5));
        System.out.println("3." + indexOf("green"));
    }
}
