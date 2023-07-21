package PracticeProject.domain;

import lombok.Data;

@Data
public class ProblemsDto {
	
	private String pbNumber;
	private String pbFavorite_yn;
	private String pbTitle;
	private Integer pbAnswer;
	private Integer pbScore;
	private String pbCorrectYn;
}
