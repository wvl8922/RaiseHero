import java.util.Scanner;

public class Warrior extends Hero {
//	public class Hero extends Character {
//		String name; //이름
//		int Lev; //레벨
//		int hp;  //hp
//		int str; //str
//		int def; //def
//		int exp; //exp
//		int gold; //gold	
//		public int attackedDamage(int damage) { //공격 받은 데미지
//			return damage - def;
//		}
//		
//		public void useGold(int entirePrice){ // 돈을 사용하는 메서드
//			if((this.gold - entirePrice) > 0) { //만약 객체의 골드가 전체 가격보다 많다면
//				this.gold = this.gold - entirePrice;
//			} 
//			if((gold - entirePrice) < 0) { //만약 객체의 골드가 전체 가격보다 적다면.
//				System.out.println("골드가 부족합니다.");			
//			}
//		}
//	}

	// 1. Warrior 생성자
	Warrior() {
		System.out.println("전사가 생성되었습니다.\n");
		lev = 1; // 레벨
		className = "전사";
		maxHp = 200; // 최대체력
		hp = 200; // hp
		maxMana = 50; // 최대체력
		mana = 50; // mana
		str = 40; // str
		def = 20; // def
		exp = 0; // exp
		gold = 0; // gold
		showStatus();
	}

	public void showStatus() {
		System.out.println("----------------------------------------");
		System.out.println("<당신의 기본 능력치>");
		System.out.println("레벨 : " + this.lev + "     " + "   직업 : " + this.className);
		System.out.println("공격력 : " + this.str + "     " + "방어력 : " + this.def);
		System.out.println("체력 : " + this.hp + "     " + "마나 : " + this.mana);
		System.out.println("경험치 : " + this.exp + "     " + " 보유골드 : " + this.gold);
		System.out.println("----------------------------------------");
	}
	/*
	 * Private 멤버는 class 외부에서 접근할 수 없는 변수를 Public 멤버는 class 외부에서 접근할 수 있는 변수를 의미합니다.
	 */

	private int attackDamage;

	public int attack() {
		System.out.println("공격 옵션을 선택해주세요.");
		System.out.println("1. 베기      2. 치명적인 일격");
		System.out.println("3. 아이템사용  4. 도망가기");
		Scanner choiceAttackOption = new Scanner(System.in); // 스캔 받을 스캐너 객체 만들기
		int attackOption = choiceAttackOption.nextInt();
		switch (attackOption) {
		case 1: {
			System.out.println("베기를 사용하셨습니다.");
			attackDamage = str;
			return attackDamage;
		}
		case 2: {
			System.out.println("치명적인 일격을 사용하셨습니다.");
			System.out.println("마나가 20 소모됩니다.");
			mana = mana - 20;
			attackDamage = str * 2;
			return attackDamage;
		}
		}
		return attackDamage;
	}
	
	public void attacked(int damageTaken) {
		if (def > damageTaken) {
			hp = hp;
			System.out.println("몬스터의 공격을 방어했습니다.");
			System.out.println("현재 영웅의 체력 : " + hp + "/" + maxHp);
		}
		if (def < damageTaken) {
			this.hp = this.hp + this.def - damageTaken;
			System.out.println("몬스터 공격에 의해 " + (def-damageTaken) +"만큼의 피해를 받았습니다.");
			System.out.println("현재 영웅의 체력 : " + hp + "/" + maxHp);
		}
	}
	

}
