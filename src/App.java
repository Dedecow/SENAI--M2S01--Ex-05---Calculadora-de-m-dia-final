import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira as notas do semestre: ");
        System.out.println("Nota1: ");
        double nota1 = Double.parseDouble(sc.nextLine());
        System.out.println("Nota2: ");
        double nota2 = Double.parseDouble(sc.nextLine());
        System.out.println("Nota3: ");
        double nota3 = Double.parseDouble(sc.nextLine());
        double mediaFinal = (nota1 + nota2 + nota3)/3;
        System.out.printf("Sua média final é: %.2f ", mediaFinal);
        
        sc.close();
    }
}
