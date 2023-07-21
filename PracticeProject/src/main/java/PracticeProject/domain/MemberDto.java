package PracticeProject.domain;


import lombok.Data;

@Data
public class MemberDto {

	private String memId;
	private String memName;
	private String memPassword;
	private String memEmail;
	private Integer memAuthority;
	private String memYn;
	
}
