package PracticeProject.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@Transactional
@RequiredArgsConstructor
@Slf4j

public class DepartmentDaoImpl implements DepartmentDao {

	private final SqlSession session;
}
