import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner getData = new Scanner(System.in);
        System.out.print("CEP: ");
        String cep = getData.nextLine();

        ConsultaCep consultaCep = new ConsultaCep();
        try {
            Endereco endereco = consultaCep.buscaEndereco(cep);
            System.out.println(endereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.salvaJson(endereco);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Aplicação finalizada!");
        }
    }
}