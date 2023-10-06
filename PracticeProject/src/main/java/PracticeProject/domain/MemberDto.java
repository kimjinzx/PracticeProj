package PracticeProject.domain;

import lombok.Data;

@Data
public class MemberDto {
	
	private String memId;
	private Integer memDeptNo;
	private String memName;
	private String memPassword;
	private String memEmail;
}
