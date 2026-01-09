import java.awt.*;
import java.util.Date;

public class  ContaCorrente{
    //Atributos(Simplificado)

    //Número da conta
    int numeroDaConta;

    //Número da agência
    int numeroDaAgencia;

    //Nome do cliente
    String nomeDoCliente;

    //Data de nascimento
    String dataDeNascimento;// Usando String para simplificar

    //Saldo da conta
    double saldo;// Usando double para simplificar

    //Métodos

    /**
     * Sacar um valor da conta.
     */
    void sacar(double valor){

    }
    /**
     * Transfere um valor para outra conta corrente.
     */
    void transferir(double valor,  ContaCorrente conta){

    }
    /**
     * Cancela a conta (lógica básica).
     */
    boolean cancelar(ContaCorrente conta, String justificativa){

        return false;
    }
    /**
     * Consulta o extrato.
     */
    List consultarExtrato(Date dataInicio, Date dataFim){

        return;
    }
    /**
     * Consulta o saldo atual.
     */
    Double consultarSaldo(){
        return saldo;
    }




}
