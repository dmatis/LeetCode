
public class RomanToInt {

    public static int romanToInt(String s) {
        int number = 0;
        char prevChar = ' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'M') {
                if (prevChar == 'C') {
                    number += 800;
                    prevChar = ' ';
                }
                else number += 1000;
            }
            else if (c == 'D') {
                if (prevChar == 'C') {
                    number += 300;
                    prevChar = ' ';
                }
                else number += 500;
            }
            else if (c == 'C') {
                if (prevChar == 'X') {
                    number += 80;
                    prevChar = ' ';
                }
                else {
                    number += 100;
                    prevChar = 'C';
                }
            }
            else if (c == 'L') {
                if (prevChar == 'X') {
                    number += 30;
                    prevChar = ' ';
                }
                else number += 50;
            }
            else if (c == 'X') {
                if (prevChar == 'I') {
                    number += 8;
                    prevChar = ' ';
                }
                else {
                    number += 10;
                    prevChar = 'X';
                }
            }
            else if (c == 'V') {
                if (prevChar == 'I') {
                    number += 3;
                    prevChar = ' ';
                }
                else {
                    number += 5;
                }
            }
            else if (c == 'I') {
                number += 1;
                prevChar = 'I';
            }
            else throw new IllegalArgumentException("Invalid Roman numeral entered");
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCDLXXVI"));
    }
}
