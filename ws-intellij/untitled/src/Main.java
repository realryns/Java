package uscs;

public class TesteAluno {
    public static void main(String[] args) {
        // Criar uma pessoa
        Pessoa pessoa = new Pessoa("José", "Rua Antonio Marques, 30", "568.234.981-15", "3.698.222-8");

        // Imprimir os dados da pessoa
        System.out.println("### Dados da Pessoa ###");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("RG: " + pessoa.getRg());

        // Criar um aluno
        Aluno aluno = new Aluno("Pedro", "Rua Almeida, 20", "456.876.123-12", "4.687.098-2", 59751, 4.5, 8.0, 10);

        // Imprimir todos os dados do aluno
        aluno.ImprimeAluno();

        // Imprimir o status do aluno
        aluno.Resultado();
    }
}
