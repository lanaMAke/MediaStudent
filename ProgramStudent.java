import java.util.Scanner;
import java.util.Locale;

public class ProgramStudent{

    public static void main(String[] args){
       Locale.setDefault(Locale.US);
       Scanner scanner = new Scanner(System.in);
       
       Student aluno = new Student();

       
       System.out.println("Digite nome do Aluno.:");
       aluno.name = scanner.nextLine();
       System.out.println("Digite notas dos três trimestres.: ");
       System.out.println("Nota Grade1.");
       aluno.grade1 = scanner.nextDouble();
       System.out.println("Nota Grade2.");
       aluno.grade2 = scanner.nextDouble();
       System.out.println("Nota Grade3.");
       aluno.grade3 = scanner.nextDouble();
       

      
       double nota = aluno.finalGrade();
       if(nota >= 60.00){
        System.out.print("FINAL GRADE = ");
        System.out.print(aluno.finalGrade());
        System.out.println("\nPASS!!");
       }else{
        System.out.print("FINAL GRADE = ");
        System.out.print(aluno.finalGrade());
        System.out.println("\nFALEID");
        System.out.println(aluno);

       }


    }
}