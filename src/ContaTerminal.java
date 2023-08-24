import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Por favor digite as informações da conta: ");
        
        System.out.println("Número da conta:");
        int numeroConta = sc.nextInt();
       
        System.out.println("Agência:");
        int agencia= sc.nextInt();
        
        System.out.println("Nome do cliente:");
        String nome = sc.next();

        System.out.println("Saldo:");
        float saldo = sc.nextFloat();


        sc.close();

        System.out.println("Olá, "+ nome+" obrigado por criar uma conta em nosso banco, sua agencia é: " + agencia+ 
        ", conta "+ numeroConta +" e seu saldo " + saldo+" já está disponível para saque! ");

    }
}
