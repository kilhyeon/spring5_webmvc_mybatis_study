package spring5_webmvc_mybatis_study.controller;

import org.springframework.stereotype.Component;

import spring5_webmvc_mybatis_study.dto.Member;

@Component
public class MemberPrinter {
	public void print(Member member) {
		System.out.printf("회원 정보: 아이디=%s, 이메일=%s, 이름=%s, 등록일=%tF %n", member.getId(), member.getEmail(),
				member.getName(), member.getRegisterDateTime());
	}
}
