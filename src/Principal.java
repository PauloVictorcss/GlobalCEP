import com.google.gson.JsonSyntaxException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Infome o cep para pesquisar o endereço");
        String cep = leitura.nextLine();
        try{
            BuscaEndereco buscaendereco = new BuscaEndereco();
            Endereco novoendereco = buscaendereco.consultaCep(cep);

            System.out.println(novoendereco);
            GeradorEndereco gera = new GeradorEndereco();
            gera.arquiva(novoendereco);
        } catch (JsonSyntaxException e){
            System.out.println("Não existe esse cep");
        }



    }
}
