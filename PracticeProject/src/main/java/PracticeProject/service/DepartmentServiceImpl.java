package PracticeProject.service;

import org.springframework.stereotype.Service;

import PracticeProject.dao.DepartmentDao;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

	
	private final DepartmentDao dd;
}
