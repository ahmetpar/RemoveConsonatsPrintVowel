package Denemeler_Ahmet_Parlak;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveConsonantsPrintVowels {
    // kullanicidan String kelime ya da cumle al ve
    // icindeki sessiz harfleri kaldir, sadece sesli harfleri yazdir.
    /*
    Get a String word or sentence from the user and
     remove the consonants in it, just print the vowels.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("sesli harfleri bulmak icin cumle giriniz:");
        String str= scan.nextLine();
        String sesliHarf= "aeiou";


        // ******* birinci yol
        for (int i = 0; i <sesliHarf.length() ; i++) {
            for (int j = 0; j <str.length(); j++) {
                if (sesliHarf.charAt(i)==str.charAt(j)) {
                    System.out.print(sesliHarf.charAt(i)+" ");

                }

            }

        }
        System.out.println();
        //************ ikinci yol
        int index=0;
        while (index<str.length()){
            char c = str.charAt(index);
            if (c == 'a'|| c == 'e'||c == 'i'||c == 'o'||c == 'u'){
                System.out.print(c+" ");
            }


            index++;
        }
        System.out.println();

//************ ucuncu yol replace all
        String replaceYontemi = str.replaceAll("[^aeiou]","");
        // bu karakterler disindaki(^) herseyi hiclikle degistir. cok kisa cozum bulduk
        System.out.println("replaceYontemi = " + replaceYontemi);
// ************ dorduncu yol lambda expression
        String []str1Arr = str.split("");
        Arrays.stream(str1Arr).filter(t->sesliHarf.contains(t)).forEach(t->System.out.print(t+" "));
    }
}
