/**
 * Created by DELL on 08/09/2022.
 */
public class Q2 {
    public static void main(String[] args) {
        String  word="mississippi";

       String word1=word.replaceAll("i","ii");

        System.out.println(word1);
        System.out.println(word1.length());

        String word2=word.replaceAll("ss","s");
        System.out.println(word2);
        System.out.println(word2.length());

    }
}
