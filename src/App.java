import java.util.Scanner;

public class App {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Raiz prinRoot = new Raiz();
        while(true){

        }
    }
    
    
    public void addCoisa(Raiz prinRoot){
        System.out.println("Adicione um valor à Arvre: ");
        String a = scan.nextLine();
        if (prinRoot.val == null){
            prinRoot.val = a;
        } else {
            Raiz dirRoot = prinRoot.dir;
            if (dirRoot.val != null){
                addCoisa(dirRoot);
            }
        }
    }
}