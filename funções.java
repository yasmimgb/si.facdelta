public class MyClass {
    public static void main(String args[]) {
      
      int[] vetor = new int[] {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};
      System.out.println("A soma é: " + soma(vetor));
    }
    
    public static int soma(int vetor[]){
        int soma = 0;
      
      for(int i=0; i < vetor.length; i++){
        soma = soma + vetor[i];
      }
        return soma;
        
    }
}
