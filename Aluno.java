package ListaExercicios;

public class Aluno {
    private String nome;
    private int matricula;
    private int ano;
    Curso curso;

    Aluno (String nome){
        this.nome = nome;
    }

    public void matricular (int matricula, String curso, int ano){
        this.matricula = matricula;
        this.curso = curso;
        this.ano = ano;
    }

    public String toString(){
        return "Aluno:" + nome + "- Matricula:" + matricula + "- Curso:" + curso + "-" + ano;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
}

class Principal{
    public static void main(String[] args) {
    
        Aluno estudante = new Aluno("Brenno");
        estudante.matricular(202505645, "Engenharia de Software", 2025);
        
        System.out.println(estudante.toString());

        estudante.setCurso("Medicina");
        estudante.setAno(2027);

        System.out.println(estudante.toString());
    }

}
