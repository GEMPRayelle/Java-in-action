package Main.src.HashSet;

import java.util.TreeMap;

public class MemberTreeMap{
    private TreeMap<Integer, Member> map;

    public MemberTreeMap(){
        map = new TreeMap<Integer, Member>();
    }
    public static void insertMember(TreeMap<Integer, Member> map,Member member){
        if (!map.containsKey(member.getId())) {
            map.put(member.getId(), member);
            System.out.println("Inserted: " + member);
        } else {
            System.out.println("Duplicate data. Insertion failed: " + member);
        }
    }

    private static void searchAndDeleteData(TreeMap<Integer, Member> treeMap, int memberId) {
        if (treeMap.containsKey(memberId)) {
            Member memberToRemove = treeMap.get(memberId);
            treeMap.remove(memberId);
            System.out.println("Deleted: " + memberToRemove);
        } else {
            System.out.println("Member with ID " + memberId + " not found.");
        }
    }

    public static void showAll(TreeMap<Integer, Member> map){
        for(Member member: map.values())
            System.out.println(member);
    }

    public static void main(String[] args) {
        TreeMap<Integer, Member> memberTreeMap = new TreeMap<>();
        
        insertMember(memberTreeMap, new Member(45, "Brown"));
        insertMember(memberTreeMap, new Member(37, "James"));
        insertMember(memberTreeMap, new Member(23, "Martin"));
		
		System.out.println("===== Members =====");
        showAll(memberTreeMap);
        
        // 데이터 검색 및 삭제
        int memberIdToSearch = 23;
        searchAndDeleteData(memberTreeMap, memberIdToSearch);

        // 데이터 출력 (검색 및 삭제 후)
        System.out.println("===== Members after searching and deleting =====");
        showAll(memberTreeMap);
        
    }
    
}