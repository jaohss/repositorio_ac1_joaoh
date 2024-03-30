package aula5_ac1;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        double ac1=0;
        double ac2=0;
        double af=0;
        double ag=0;
        double media=0;
        double somaPond=0;
        double totalPond=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da AC1:  ");
        ac1 = scanner.nextDouble();  
        
        System.out.println("Digite a nota da AC2:  ");
        ac2 = scanner.nextDouble(); 

        System.out.println("Digite a nota da AG:  ");
        ag = scanner.nextDouble(); 

        System.out.println("Digite a nota da AF:  ");
        af = scanner.nextDouble(); 

        somaPond=ac1*0.15+ac2*0.3+ag*0.1+af*0.45;
        totalPond=0.15+0.3+0.45+0.1;
        media=somaPond/totalPond;

        System.out.println("A noto final do aluno Fulano de tal foi de: "+media);

        scanner.close();
        
    }
    
}
