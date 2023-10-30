import java.util.Scanner;
public class PhoneManager {
    public Scanner sc;
    Phone[] phone = new Phone[10];//ó���� �ӽ÷� ���� 10���� ������ ����
    Phone[] phoneUn = new PhoneUniv[10];
    Phone[] phonecom = new PhoneComp[10];
    public int i = 0;

    public void displayMenu(){
		System.out.println();
		System.out.println("�޴��� �����ϼ���.");
		System.out.println(" 1. ������ �Է�");
		System.out.println(" 2. ������ �˻�");
		System.out.println(" 3. ������ ����");
		System.out.println(" 4. ��ü ������ ���");
		System.out.println(" 5. ���α׷� ����");
		System.out.print(" ��ȣ�� �Է��ϼ���>> ");	
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
                    System.out.println("���α׷��� �����մϴ�.");
                    return;
                default:
                    System.out.println("�ùٸ� ��ȣ�� �Է��ϼ���.");
            }
        }
    }
    private void search() {
        System.out.println("�˻��� ��ȭ��ȣ�� �Է��ϼ���");
        System.out.println("�̸�: ");
        String name = sc.next();
        
        for(int i = 0; i < 9; i++){
            if(phone[i].getName() != name && phoneUn[i].getName() != name && phonecom[i].getName() != name){
                System.out.println("����ڿ� ��ġ�ϴ� ������ �����ϴ�.");
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
        System.out.println("����� ������ �Է��ϼ���");
        System.out.println("1. �Ϲ� - �̸�, ��ȭ��ȣ �Է�");
        System.out.println("2. ���� - �̸�, ��ȭ��ȣ �Է�, ����, �г�");
        System.out.println("3. ȸ�� - �̸�, ��ȭ��ȣ �Է�, ȸ���");
        System.out.println("���� �Է�(1~3): ");
        int input = sc.nextInt();
        String name;
        String PhoneNumber;
        switch(input){
            case 1:
                System.out.println("�̸�: ");
                name = sc.next();
                System.out.println("��ȭ��ȣ: ");
                PhoneNumber = sc.next();
                phone[i] = new Phone(name, PhoneNumber);
                i++;
                break;
            case 2:
                System.out.println("�̸�: ");
                name = sc.next();
                System.out.println("��ȭ��ȣ: ");
                PhoneNumber = sc.next();
                System.out.println("����: ");
                String Major = sc.next();
                System.out.println("�г�: ");
                int grade = sc.nextInt();
                phoneUn[i] = new PhoneUniv(name, PhoneNumber, Major, grade);
                i++;
            case 3:
                System.out.println("�̸�: ");
                name = sc.next();
                System.out.println("��ȭ��ȣ: ");
                PhoneNumber = sc.next();
                System.out.println("ȸ���");
                String CompName = sc.next();
                phonecom[i] = new PhoneComp(name, PhoneNumber, CompName);
                i++;
            default:
                System.out.println("�ùٸ� ��ȣ�� �Է��ϼ���");
        }
    }

    public void PrintAllData(){
        System.out.println("��ȣ �̸�");
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