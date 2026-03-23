class Pessoa{
    String nome;
    int idade;
    String sexo;
    String telefone;

    String exibirDados(){
        return
            "Nome: " + nome +
            ", Idade: " + idade + 
            ", Sexo: " + sexo +
            ", Telefone: " + telefone;

        
    }
}

class Contatos{
    String nome;
    String telefone;
    int idade;
    String CPF;

    public String toString(){
        return
        "Nome: " + nome +
        ", CPF: " + CPF + 
        ", Idade: " + idade +
        ", Telefone: " + telefone;
    }
}



class programa{
    public static void main(String[] args){

        Pessoa estudante;
        estudante = new Pessoa();

        estudante.nome = "Jose da Silva";
        estudante.idade = 27;
        estudante.sexo = "Masculino";
        estudante.telefone = "(62)99999-9999";

        Pessoa professor;
        professor = new Pessoa();

        professor.nome = "Maria Soares";
        professor.idade = 45;
        professor.sexo = "Feminino";
        professor.telefone = "(62)98888-8888";

        Pessoa diretor;
        diretor = new Pessoa();

        diretor.nome = "Almeida Fernandes";
        diretor.idade = 60;
        diretor.sexo = "Masculino";
        diretor.telefone = "(62)97777-7777";

        System.out.println();
        System.out.println(estudante.exibirDados());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(professor.exibirDados());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(diretor.exibirDados());

        System.out.println();

        System.out.println("----------------CONTATOS ----------------");

        Contatos contato1;
        contato1 = new Contatos();
        contato1.nome = "Brenno Soares";
        contato1.CPF = "111.111.111-11";
        contato1.idade = 27;
        contato1.telefone = "(62)99188-9478"; 

        Contatos contato2;
        contato2 = new Contatos();
        contato2.nome = "Alexandro Silva";
        contato2.CPF = "222.222.222-22";
        contato2.idade = 50;
        contato2.telefone = "(62)92222-2222"; 

        Contatos contato3;
        contato3 = new Contatos();
        contato3.nome = "Jhennifer Paixao";
        contato3.CPF = "333.333.333-33";
        contato3.idade = 25;
        contato3.telefone = "(62)91111-1111"; 

        System.out.println(contato1);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(contato2);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(contato3);
        System.out.println();
    }
}