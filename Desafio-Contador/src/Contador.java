import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
    
        Scanner terminal = (new Scanner(System.in));

        System.out.println("Insira um número inteiro");
        int parametroUm = terminal.nextInt();

        System.out.println("Insira um númmero inteiro");
        int parametroDois = terminal.nextInt();

        try {
            if(parametroUm > parametroDois){

            //Gera uma nova exceção personalizada caso a verificação seja verdadeira 
             throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro"); 
            
            } else {

           contar(parametroUm, parametroDois);

            }
        }catch (ParametrosInvalidosException exception) {

            //Exibe a messagem de erro para o usuário
             System.out.println(exception.getMessage());

        } finally {

            //Fecha o objeto Scanner para evitar vazamentos de recursos 
            terminal.close();

        }
   
    }

    public static void contar(int parametroUm, int parametroDois){
        for(int i = parametroUm;i <= parametroDois; i++){
            System.out.println(i);
        }
    }; 


}
