package poo;

import model.Cliente;
import model.Endereco;

public class EntregaCartaoApp {

    public static void main(String[] args) {
        // Dados do endereco
        Endereco endereco = new Endereco();
        endereco.cep = "00000";

        // Dados do cliente
        Cliente cliente = new Cliente();

        try {
            cliente.adicionarEndereco(endereco);
            System.out.println("Endereco adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("Houve um erro ao adicionar o endereco: " + e.getMessage());
        }
    }
}
