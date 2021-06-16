package pessoa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {

    @Test
    void alunoEnsinoMedioAprovado() {

        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio.setNota1(6.0f);
        alunoEnsinoMedio.setNota2(6.0f);
        assertEquals("Aluno Aprovado",alunoEnsinoMedio.receberCalculoMedias());


    }

    @Test
    void alunoEnsinoMedioReprovado() {

        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio.setNota1(5.9f);
        alunoEnsinoMedio.setNota2(6.0f);
        assertEquals("Aluno Reprovado",alunoEnsinoMedio.receberCalculoMedias());


    }

    @Test
    void retornaNomeAlunoEnsinoMedio() {

        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio.setNome("Júlia");
        assertEquals("Júlia",alunoEnsinoMedio.getNome());

    }

    @Test
    void retornaMatriculaAlunoEnsinoMedio() {

        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio.setMatricula("202065147A");
        assertEquals("202065147A",alunoEnsinoMedio.getMatricula());

    }
}