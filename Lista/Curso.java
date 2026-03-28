package ListaExercicios;

public class Curso {
    private String sigla;
    private String nome;
    private int codigo;
    private String unidadeEnsino;


    Curso(String sigla, String nome, int codigo, String unidadeEnsino){
        this.sigla = sigla;
        this.nome = nome;
        this.codigo = codigo;
        this.unidadeEnsino = unidadeEnsino;
    }

    public void setSigla(String sigla){
        this.sigla = sigla;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setUnidadeEnsino(String unidadeEnsino){
        this.unidadeEnsino = unidadeEnsino;
    }

    public String toString(){
        return "Curso: " + nome + "Sigla: " + sigla + "Código: " + codigo + "UE: " + unidadeEnsino;
    }
}
