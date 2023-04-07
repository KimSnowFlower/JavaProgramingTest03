import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	
	public Phone() { tel = "000-0000"; name = " "; }
	public Phone(String tel, String name) { this.tel = tel; this.name = name;}
	
	public String getTelNumer() { return this.tel; }
	public String getName() { return this.name; }
	
}
public class PhoneBook {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		
		System.out.print("�ο���>>");
		int count = scanner.nextInt();
		
		Phone phonebook[] = new Phone[count];
		
		for(int i = 0; i < phonebook.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ (�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			
			String name = scanner.next();
			String tel = scanner.next();
		
			phonebook[i] = new Phone(tel, name);
		}
		
		System.out.println("����Ǿ����ϴ�...");
		
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String searchName = scanner.next();
			
			if(searchName.equals("�׸�")) break;
			
			for(int i = 0; i < phonebook.length; i++) {
				if(searchName.equals(phonebook[i].getName())) {
					System.out.println(searchName + "�� ��ȣ�� " + phonebook[i].getTelNumer() + "�Դϴ�.");
					break;
				}
				
				if(i == phonebook.length - 1)
					System.out.println(searchName + "�� �����ϴ�.");
			}
		}
	}

}
