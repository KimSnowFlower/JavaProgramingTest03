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
		
		System.out.print("인원수>>");
		int count = scanner.nextInt();
		
		Phone phonebook[] = new Phone[count];
		
		for(int i = 0; i < phonebook.length; i++) {
			System.out.print("이름과 전화번호 (이름과 번호는 빈 칸없이 입력)>>");
			
			String name = scanner.next();
			String tel = scanner.next();
		
			phonebook[i] = new Phone(tel, name);
		}
		
		System.out.println("저장되었습니다...");
		
		while(true) {
			System.out.print("검색할 이름>>");
			String searchName = scanner.next();
			
			if(searchName.equals("그만")) break;
			
			for(int i = 0; i < phonebook.length; i++) {
				if(searchName.equals(phonebook[i].getName())) {
					System.out.println(searchName + "의 번호는 " + phonebook[i].getTelNumer() + "입니다.");
					break;
				}
				
				if(i == phonebook.length - 1)
					System.out.println(searchName + "이 없습니다.");
			}
		}
	}

}
