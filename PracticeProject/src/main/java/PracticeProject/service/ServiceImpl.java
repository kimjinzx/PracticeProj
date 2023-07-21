package PracticeProject.service;

import java.lang.annotation.Annotation;

import org.springframework.stereotype.Service;

import PracticeProject.dao.Dao;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ServiceImpl implements Service {
	private final Dao dao;

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String value() {
		// TODO Auto-generated method stub
		return null;
	}

}
