import java.util.Scanner;
class FirstLetterPrinter {
public static void main (String[] args) {
    //Input
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    System.out.println(firstLetterPrinter(input));
}
static String firstLetterPrinter(String str) {
    //Split words
    String[] words=str.split(" ");
    String word="";
    for(int i=0;i<words.length;i++){
        word=word+Character.toString(words[i].toCharArray()[0]);
    }
  return word  ;
 }
}