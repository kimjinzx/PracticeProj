package PracticeProject.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import PracticeProject.domain.ArticleDto;
import PracticeProject.domain.MemberDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@Transactional
@RequiredArgsConstructor
@Slf4j
public class ArticleDaoImpl implements ArticleDao {
	private final SqlSession session;

	@Override
	public List<ArticleDto> abList() {
		List<ArticleDto> abList = null;
		try {
			abList = session.selectList("test");
		} catch (Exception e) {
			log.error("error -> ", e.getMessage() );
		}
		return abList;
	}

}
