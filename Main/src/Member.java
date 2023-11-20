package Main.src;

import java.util.ArrayList;

public class Member {

    private int id;
    private String Name;

    public Member(int id, String Name){
        this.id = id;
        this.Name = Name;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.Name;
    }
    @Override
    public String toString(){
        return "멤버 " + " {id: " + this.id + " Name: " + this.Name + "}";
    }

}

class MemberArrayList{
    private ArrayList<Member> memberList;
    
    public MemberArrayList(){
        memberList = new ArrayList<>();
    }

    public void addMember(Member member){

        for(Member existmember : memberList){
            if(existmember.getId() == member.getId()){
                System.out.println("같은 id가 있습니다");
                return;
            }
        }

        memberList.add(member);
        System.out.println("등록성공");

    }
    public void removeMember(int id){
        for(Member member: memberList){
            if(member.getId() == id){
                memberList.remove(member);
                System.out.println("삭제완료");
                return;
            }
        }
        System.out.println("찾는 멤버가 없습니다");
    }

    public void showAll(){
        if(memberList.isEmpty()){
            System.out.println("등록된 회원이 없습니다");
        } else {
            for(Member member: memberList){
                System.out.println(member);
            }
        }
    }

    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(101, "Lee");
        Member memberKim = new Member(102, "Kim");
        Member memberPark = new Member(103, "Park");
        Member memberPark2 = new Member(104, "Park");
        Member memberPark3 = new Member(104, "Park3");//출력추가하기

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberPark);
        memberArrayList.addMember(memberPark2);
        memberArrayList.addMember(memberPark3);

        System.out.println("");
        System.out.println("Print All");
        memberArrayList.showAll();

        System.out.println("Print after removing");
        memberArrayList.removeMember(memberKim.getId());
        memberArrayList.showAll();
        
    }
}