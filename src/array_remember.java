import java.util.Scanner;

public class array_remember {
    public static void main(String[] args) {
        String word;
        String []presidents={"Kennedy", "Johnson", "Nixon", "Ford", "Carter", "Reagan", "Bush", "Clinton", "Bush", "Obama"};
        System.out.println("here is the original list of the last 10 america presidents");

        for(int i=0;i<presidents.length;i++){
            System.out.println(presidents[i]);
        }
        System.out.println("type 'Hstory' to display their names starting with the most recent'");
        Scanner scanner=new Scanner(System.in);
        word=scanner.nextLine();
        if(word.equalsIgnoreCase("history")){
            for(int i=presidents.length-1;i>=0;i--){
                System.out.println(presidents[i]);
            }
        }
        else{
            System.out.println("please enter the correct word");
            System.exit(0);
        }
    }
}
