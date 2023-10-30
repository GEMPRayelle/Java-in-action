import java.util.Scanner;
public class PhoneManager {
    public Scanner sc;
    Phone[] phone = new Phone[10];//처음은 임시로 각각 10개의 정보만 저장
    Phone[] phoneUn = new PhoneUniv[10];
    Phone[] phonecom = new PhoneComp[10];
    public int i = 0;

    public void displayMenu(){
		System.out.println();
		System.out.println("메뉴를 선택하세요.");
		System.out.println(" 1. 데이터 입력");
		System.out.println(" 2. 데이터 검색");
		System.out.println(" 3. 데이터 삭제");
		System.out.println(" 4. 전체 데이터 출력");
		System.out.println(" 5. 프로그램 종료");
		System.out.print(" 번호를 입력하세요>> ");	
    }
    public void ManagerStart(){
        while(true){
            displayMenu();
            int menuNum = sc.nextInt();
            switch(menuNum){
                case 1: insert();
                    break;
                case 2: search();;
                    break;
                case 3: delete();
                    break;
                case 4: PrintAllData();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 번호를 입력하세요.");
            }
        }
    }
    private void search() {
        System.out.println("검색할 전화번호를 입력하세요");
        System.out.println("이름: ");
        String name = sc.next();
        
        for(int i = 0; i < 9; i++){
            if(phone[i].getName() != name && phoneUn[i].getName() != name && phonecom[i].getName() != name){
                System.out.println("사용자와 일치하는 정보가 없습니다.");
            }
            else{
                
            }
        }
        
    }
    private void delete() {
    }
    private void update() {
    }
    public void insert(){
        System.out.println("등록할 정보를 입력하세요");
        System.out.println("1. 일반 - 이름, 전화번호 입력");
        System.out.println("2. 대학 - 이름, 전화번호 입력, 전공, 학년");
        System.out.println("3. 회사 - 이름, 전화번호 입력, 회사명");
        System.out.println("정보 입력(1~3): ");
        int input = sc.nextInt();
        String name;
        String PhoneNumber;
        switch(input){
            case 1:
                System.out.println("이름: ");
                name = sc.next();
                System.out.println("전화번호: ");
                PhoneNumber = sc.next();
                phone[i] = new Phone(name, PhoneNumber);
                i++;
                break;
            case 2:
                System.out.println("이름: ");
                name = sc.next();
                System.out.println("전화번호: ");
                PhoneNumber = sc.next();
                System.out.println("전공: ");
                String Major = sc.next();
                System.out.println("학년: ");
                int grade = sc.nextInt();
                phoneUn[i] = new PhoneUniv(name, PhoneNumber, Major, grade);
                i++;
            case 3:
                System.out.println("이름: ");
                name = sc.next();
                System.out.println("전화번호: ");
                PhoneNumber = sc.next();
                System.out.println("회사명");
                String CompName = sc.next();
                phonecom[i] = new PhoneComp(name, PhoneNumber, CompName);
                i++;
            default:
                System.out.println("올바른 번호를 입력하세요");
        }
    }

    public void PrintAllData(){
        System.out.println("번호 이름");
    }

    public static void main(String[] args) {
        PhoneManager pm = new PhoneManager();
        pm.ManagerStart();

    }
}

class Phone extends PhoneManager{
    private String name;
    private String PhoneNumber;

    public Phone(String name, String PhoneNumber) {
        this.name = name;
        this.PhoneNumber = PhoneNumber;
    }
    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return PhoneNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPhoneNumber(String number){
        PhoneNumber = number;
    }

}

class PhoneUniv extends Phone{
    private String Major;
    private int Grade;
    public PhoneUniv(String name, String phoneNumber, String Major, int Grade){
        super(name, phoneNumber);
        this.Major = Major;
        this.Grade = Grade;
    }
    public String getMajor(){
        return Major;
    }
    public int getGrade(){
        return Grade;
    }
    public void setMajor(String Major){
        this.Major = Major;
    }
    public void setGrade(int Grade){
        this.Grade = Grade;
    }
}

class PhoneComp extends Phone{
    private String CompName;
    public PhoneComp(String name, String phoneNumber, String CompName){
        super(name, phoneNumber);
        this.CompName = CompName;
    }

    public String getCompName(){
        return CompName;
    }
    public void setCompName(String CompName){
        this.CompName = CompName;
    }
}