package pessoa;

public class AlunoGraduacao extends Aluno {



    public String receberCalculoMedias() {
        if (this.calcularMediaNotas()>=7.0f){
            return ("Aluno Aprovado");
        }
        else{
            return ("Aluno Reprovado");
        }
    }

}
