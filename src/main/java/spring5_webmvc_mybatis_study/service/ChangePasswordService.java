package spring5_webmvc_mybatis_study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring5_webmvc_mybatis_study.controller.MemberDao;
import spring5_webmvc_mybatis_study.dto.Member;
import spring5_webmvc_mybatis_study.exception.MemberNotFoundException;

@Service
public class ChangePasswordService {
	
	@Autowired
	private MemberDao memberDao;

	@Transactional
	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);

		if (member == null) {
			throw new MemberNotFoundException();
		}

		member.changePassword(oldPwd, newPwd);

		memberDao.update(member);

	}

}
