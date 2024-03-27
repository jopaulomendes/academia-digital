package me.dio.academia.digital.entity.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class MatriculaForm {

	@NotNull(message = "Preencha o campo corretamente")
	@Positive(message = "O Código do Aluno precisa ser positivo")
	private Long alunoId;

}
