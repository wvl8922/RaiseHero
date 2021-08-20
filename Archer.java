import java.util.Scanner;

public class Archer extends Hero {
	// 1. Archer 생성자
	Archer() {
		System.out.println("궁수가 생성되었습니다.\n");
		lev = 1; // 레벨
		className = "궁수";
		hp = 150; // hp
		maxHp = 150; //최대체력
		maxMana = 100; //최대체력
		mana = 100; //최대체력
		str = 60; // str
		def = 10; // def
		exp = 0; // exp
		gold = 0; // gold
		showStatus();
	}
	
	public void showStatus() {
		System.out.println("----------------------------------------");
		System.out.println("<당신의 기본 능력치>");
		System.out.println("레벨 : " + lev + "     " + "   직업 : " + className);
		System.out.println("공격력 : " + str + "     " + "방어력 : " + def);
		System.out.println("경험치 : " + exp + "     " + " 보유골드 : " + gold);
		System.out.println("----------------------------------------");
	}

	private int attackDamage;

	public int attack() {
		System.out.println("공격 옵션을 선택해주세요.");
		System.out.println("1. 화살공격   2. 집중의 일격");
		System.out.println("3. 아이템사용  4. 도망가기");
		Scanner choiceAttackOption = new Scanner(System.in); // 스캔 받을 스캐너 객체 만들기
		int attackOption = choiceAttackOption.nextInt();
		switch (attackOption) {
		case 1: {
			System.out.println("화살 공격을 사용하셨습니다.");
			attackDamage = str;
			return attackDamage;
		}
		case 2: {
			System.out.println("치명적인 일격을 사용하셨습니다.");
			mana = mana - 20;
			attackDamage = str * 2;
			return attackDamage;
		}
		}
		return attackDamage;
	}
}
