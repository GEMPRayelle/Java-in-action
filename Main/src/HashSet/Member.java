package Main.src.HashSet;

public class Member {
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
    public boolean equals(Object obj) {
        if (this.hashCode() == obj.hashCode()) {return true;}
        if (obj == null || getClass() != obj.getClass()) {return false;}
        Member member = (Member) obj;
        return memberId == member.memberId;
    }
}
