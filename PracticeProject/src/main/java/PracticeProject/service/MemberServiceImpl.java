package PracticeProject.service;

import org.springframework.stereotype.Service;

import PracticeProject.dao.MemberDao;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

	private final MemberDao dao;
}
