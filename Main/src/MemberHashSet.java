package Main.src;

import java.util.HashSet;
import java.util.Iterator;

class Member {

    private int memberId;
    private String memberName;

    public Member(int id, String Name){
        this.memberId = id;
        this.memberName = Name;
    }

    public int getId(){
        return this.memberId;
    }
    public String getName(){
        return this.memberName;
    }
    @Override
    public String toString(){
        return "¸â¹ö " + " {id: " + this.memberId + " Name: " + this.memberName + "}";
    }
    @Override
    public int hashCode(){
        return this.memberId;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null||getClass() != obj.getClass()) return false;

        Member member = (Member)obj;
        return memberId == member.memberId;
    }

}

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet(){
        hashSet = new HashSet<Member>();
    }
    public void addMember(Member member){
        Iterator<Member> it = hashSet.iterator();
        while (it.hasNext()) {
            Member memberHash = it.next();
            if(memberHash.getId() == member.getId()){
                System.out.println("name ID <" + member.getId() + "> exist.");
                return;
            }
        }
        hashSet.add(member);
    }
    public boolean removeMember(int memberId){
        Iterator<Member> it = hashSet.iterator();
        while (it.hasNext()) {
            Member member = it.next();
            if(member.getId() == memberId){
                it.remove();
                return true;
            }
        }
        return false;
    }

    public void showAll(){
        Iterator<Member> it = hashSet.iterator();
        while (it.hasNext()) {
            Member member = it.next();
            System.out.println(member);
        }
    }

    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();
    
        System.out.println("Generating Member...");
        Member memberLee = new Member(101, "Lee");
        Member memberKim = new Member(102, "Kim");
        Member memberPark = new Member(103, "Park");
        System.out.println("");
    
        System.out.println("Adding Members...");
        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberPark);
        System.out.println("");
    
        System.out.println("Showing All");
        memberHashSet.showAll();
        System.out.println("");
    
        System.out.println("Adding Member...");
        Member memberLee2 = new Member(103, "Lee2");
        memberHashSet.addMember(memberLee2);
        memberHashSet.showAll();
        System.out.println("");

        System.out.println("Removing Member...");
        memberHashSet.removeMember(102);
        memberHashSet.showAll();
        
    }
    
}
