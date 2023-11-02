package test.mypac;

public class Member {
	//필드
	public int num;
	public String name;
	public String addr;
	//default 생성자
	public Member() {}
	//int, String, String type 을 전달받는 생성자
	public Member(int num, String name, String addr) {
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
		
	//메소드
	public void printInfo() {
		System.out.println("번호:"+num+" 이름:"+name+" 주소:"+addr);
	}
}
