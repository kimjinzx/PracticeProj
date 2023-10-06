package PracticeProject.domain;


import java.util.Date;

import lombok.Data;

@Data
public class ArticleDto {

	private String artId;
	private String artMemId;
	private String artCategory;
	private String artTitle;
	private String artContent;
	private Date artDate;
	private Integer artRead;
	
}
