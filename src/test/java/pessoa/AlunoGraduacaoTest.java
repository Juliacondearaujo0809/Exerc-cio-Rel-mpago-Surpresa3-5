package pessoa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {

    @Test
    void alunoGraduacaoAprovado() {

        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao.setNota1(7.0f);
        alunoGraduacao.setNota2(7.0f);
        assertEquals("Aluno Aprovado",alunoGraduacao.receberCalculoMedias());


    }

    @Test
    void alunoEnsinoMedioReprovado() {

        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao.setNota1(6.9f);
        alunoGraduacao.setNota2(7.0f);
        assertEquals("Aluno Reprovado",alunoGraduacao.receberCalculoMedias());
    }

    @Test
    void retornaNomeAlunoGraduacao() {

        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao.setNome("Júlia");
        assertEquals("Júlia",alunoGraduacao.getNome());

    }

    @Test
    void retornaMatriculaAlunoGraduacao() {

        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao.setMatricula("202065147A");
        assertEquals("202065147A",alunoGraduacao.getMatricula());

    }
}