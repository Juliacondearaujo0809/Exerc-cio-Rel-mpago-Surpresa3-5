package pessoa;

public class AlunoEnsinoMedio extends Aluno {



    public String receberCalculoMedias() {
        if (this.calcularMediaNotas()>=6.0f){
            return ("Aluno Aprovado");
        }
        else{
            return ("Aluno Reprovado");
        }
    }

}

