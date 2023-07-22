package PracticeProject.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import PracticeProject.domain.ProblemsDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@Transactional
@RequiredArgsConstructor
@Slf4j
public class ProDaoImpl implements ProDao {
	private final SqlSession session;

	@Override
	public List<ProblemsDto> pbList() {
		List<ProblemsDto> pbList = null;
		try {
			pbList = session.selectList("test");
		} catch (Exception e) {
			log.error("error -> ", e.getMessage() );
		}
		return pbList;
	}

}
