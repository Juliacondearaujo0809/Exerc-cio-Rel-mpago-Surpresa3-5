package pessoa;

public class Aluno extends Pessoa{

    private String matricula;
    private float nota1;
    private float nota2;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float calcularMediaNotas() {
        return ((this.nota1 + this.nota2)/2);
    }

}
