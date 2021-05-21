package spring5_webmvc_mybatis_study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring5_webmvc_mybatis_study.dto.Member;

@Component
public class MemberInfoPrinter {
	@Autowired
	private MemberDao memDao;
	@Autowired
	private MemberPrinter printer;

	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if (member == null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}

}
