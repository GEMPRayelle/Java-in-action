package Main.src.HashSet;

import java.util.HashSet;
import java.util.Iterator;


public class MemberHashSet{
    private HashSet<Member> hashSet;

    public MemberHashSet(){
        hashSet = new HashSet<Member>();
    }
    public void addMember(Member member){
        Iterator<Member> it = hashSet.iterator();
        while (it.hasNext()) {
            Member m = it.next();
            if(m.equals(member)){
                System.out.println("Same ID <"+member.getId()+"> exist..");
                break;
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
        while (it.hasNext()) {System.out.println(it.next());}
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

        System.out.println("");
        memberHashSet.showAll();
        System.out.println("");

        System.out.println("Removing Member...");
        memberHashSet.removeMember(102);
        memberHashSet.showAll();
        
    }
    
}