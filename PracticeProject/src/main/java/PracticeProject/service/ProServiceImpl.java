package PracticeProject.service;

import java.lang.annotation.Annotation;
import java.util.List;

import org.springframework.stereotype.Service;

import PracticeProject.dao.ProDao;
import PracticeProject.domain.ProblemsDto;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProServiceImpl implements ProService {
	private final ProDao dao;

	@Override
	public List<ProblemsDto> findProblemsList() {
		List<ProblemsDto> pbList = null;
		pbList = dao.pbList();
		return pbList;
	}


}
