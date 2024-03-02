package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

// 아래와 같이 자바 프로그램을 직접 작성하는 것은 좋은 유닛 테스트 방식이 아니다. 유닛 테스트 프레임워크인 JUnit 으로 테스트 하자!
public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new AppConfig().memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member : " + member.getName());
        System.out.println("find Member : " + findMember.getName());
    }
}
