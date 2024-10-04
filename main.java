package lista2;

import javax.crypto.spec.PSource;

public class main {
    public static void main(String[] args) {


        Pessoa pessoa1 = new Pessoa("João", "Silva");
        Funcionario pessoa2 = new Funcionario("Maria", "Medeiros", 123, 1750.00);
        Professor pessoa3 = new Professor("José", "Souza", 123, -500.00);
        Professor pessoa4 = new Professor("Ana", "Oliveira", 123, 1500.00);

        System.out.println("Nome pessoa1: " + pessoa1.getNomeCompleto());
        System.out.println("Nome pessoa2: " + pessoa2.getNomeCompleto());
        System.out.println("Nome pessoa3: " + pessoa3.getNomeCompleto());
        System.out.println("Nome pessoa4: " + pessoa4.getNomeCompleto());


        System.out.println(" primeira parcela pessoa2: " + pessoa2.getSalarioPrimeiraParcela());
        System.out.println(" segunda parcela pessoa2: " + pessoa2.getSalarioSegundaParcela());
        System.out.println(" primeira parcela pessoa3: " + pessoa3.getSalarioPrimeiraParcela());
        System.out.println(" segunda parcela pessoa3: " + pessoa3.getSalarioSegundaParcela());
        System.out.println(" primeira parcela pessoa4: " + pessoa4.getSalarioPrimeiraParcela());
        System.out.println(" segunda parcela pessoa4: " + pessoa4.getSalarioSegundaParcela());
    }
}





