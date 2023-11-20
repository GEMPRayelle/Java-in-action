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
        return "��� " + " {id: " + this.id + " Name: " + this.Name + "}";
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
                System.out.println("���� id�� �ֽ��ϴ�");
                return;
            }
        }

        memberList.add(member);
        System.out.println("��ϼ���");

    }
    public void removeMember(int id){
        for(Member member: memberList){
            if(member.getId() == id){
                memberList.remove(member);
                System.out.println("�����Ϸ�");
                return;
            }
        }
        System.out.println("ã�� ����� �����ϴ�");
    }

    public void showAll(){
        if(memberList.isEmpty()){
            System.out.println("��ϵ� ȸ���� �����ϴ�");
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
        Member memberPark3 = new Member(104, "Park3");//����߰��ϱ�

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