package hello.demo;

import hello.demo.Member.Grade;
import hello.demo.Member.Member;
import hello.demo.Member.MemberService;
import hello.demo.Member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args){
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member = " + member.getName());
        System.out.println("fing Member = " + findMember.getName());
    }
}
