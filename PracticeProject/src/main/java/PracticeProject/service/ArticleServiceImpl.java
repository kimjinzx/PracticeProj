package PracticeProject.service;

import java.lang.annotation.Annotation;
import java.util.List;

import org.springframework.stereotype.Service;

import PracticeProject.dao.ArticleDao;
import PracticeProject.domain.ArticleDto;
import PracticeProject.domain.MemberDto;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
	private final ArticleDao dao;

	@Override
	public List<ArticleDto> findArticleList() {
		List<ArticleDto> abList = null;
		abList = dao.abList();
		return abList;
	}


}
