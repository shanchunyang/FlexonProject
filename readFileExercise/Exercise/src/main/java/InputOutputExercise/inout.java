package InputOutputExercise;
import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class inout {

        public static void main(String[] args) throws FileNotFoundException {

                System.out.println(new File(".").getAbsolutePath());
                File file = new File("test.txt");
                Scanner scan = new Scanner(file);

                HashMap<String, Integer> count = new HashMap<String, Integer>();
                while (scan.hasNextLine()) {
                        String [] str_lst = scan.nextLine().split(" ");
                        for (String word: str_lst) {
                                if (count.containsKey(word)) {
                                        int freq = count.get(word);
                                        count.put(word, freq + 1);
                                } else {
                                        count.put(word, 1);
                                }
                        }
                }
                ArrayList<String> freq_word_list = new ArrayList<String>();
                int value;
                String key;
                for (Map.Entry<String,Integer> entry : count.entrySet()) {


                        value = entry.getValue();
                        key = entry.getKey();
                        if (value >= 5) {
                                freq_word_list.add(reverseString(key));
                        }
                }

                       // System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
                System.out.print("List of the reversed words that appear more than 5 times: ");
                System.out.println(freq_word_list);

                for (String s: freq_word_list){
                        System.out.println(s);
                }

        }


        private static String reverseString(String s){
                String st = "";
                int l = s.length() - 1;
                while (l >= 0) {
                        st += s.charAt(l);
                        l--;
                }
                return st;

        }



}








