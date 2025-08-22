public class Funcionario {
    private int matricula;
    private String nome;
    private Departamento dept;

    public Funcionario(int matricula, String nome, Departamento dept){
        this.matricula = matricula;
        this.nome = nome;
        this.dept = dept;
    }

    public int getMatricula(){
        return matricula;
    }

    public Departamento getDept(){
        return dept;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setDept(Departamento d){
        dept = d;
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String toString(){
        return getNome() + " - " + getMatricula() + " - " + getDept().toString();
    }



    
}