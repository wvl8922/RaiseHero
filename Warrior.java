import java.util.Scanner;

public class Warrior extends Hero {
//	public class Hero extends Character {
//		String name; //�̸�
//		int Lev; //����
//		int hp;  //hp
//		int str; //str
//		int def; //def
//		int exp; //exp
//		int gold; //gold	
//		public int attackedDamage(int damage) { //���� ���� ������
//			return damage - def;
//		}
//		
//		public void useGold(int entirePrice){ // ���� ����ϴ� �޼���
//			if((this.gold - entirePrice) > 0) { //���� ��ü�� ��尡 ��ü ���ݺ��� ���ٸ�
//				this.gold = this.gold - entirePrice;
//			} 
//			if((gold - entirePrice) < 0) { //���� ��ü�� ��尡 ��ü ���ݺ��� ���ٸ�.
//				System.out.println("��尡 �����մϴ�.");			
//			}
//		}
//	}

	// 1. Warrior ������
	Warrior() {
		System.out.println("���簡 �����Ǿ����ϴ�.\n");
		lev = 1; // ����
		className = "����";
		maxHp = 200; // �ִ�ü��
		hp = 200; // hp
		maxMana = 50; // �ִ�ü��
		mana = 50; // mana
		str = 40; // str
		def = 20; // def
		exp = 0; // exp
		gold = 0; // gold
		showStatus();
	}

	public void showStatus() {
		System.out.println("----------------------------------------");
		System.out.println("<����� �⺻ �ɷ�ġ>");
		System.out.println("���� : " + this.lev + "     " + "   ���� : " + this.className);
		System.out.println("���ݷ� : " + this.str + "     " + "���� : " + this.def);
		System.out.println("ü�� : " + this.hp + "     " + "���� : " + this.mana);
		System.out.println("����ġ : " + this.exp + "     " + " ������� : " + this.gold);
		System.out.println("----------------------------------------");
	}
	/*
	 * Private ����� class �ܺο��� ������ �� ���� ������ Public ����� class �ܺο��� ������ �� �ִ� ������ �ǹ��մϴ�.
	 */

	private int attackDamage;

	public int attack() {
		System.out.println("���� �ɼ��� �������ּ���.");
		System.out.println("1. ����      2. ġ������ �ϰ�");
		System.out.println("3. �����ۻ��  4. ��������");
		Scanner choiceAttackOption = new Scanner(System.in); // ��ĵ ���� ��ĳ�� ��ü �����
		int attackOption = choiceAttackOption.nextInt();
		switch (attackOption) {
		case 1: {
			System.out.println("���⸦ ����ϼ̽��ϴ�.");
			attackDamage = str;
			return attackDamage;
		}
		case 2: {
			System.out.println("ġ������ �ϰ��� ����ϼ̽��ϴ�.");
			System.out.println("������ 20 �Ҹ�˴ϴ�.");
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
			System.out.println("������ ������ ����߽��ϴ�.");
			System.out.println("���� ������ ü�� : " + hp + "/" + maxHp);
		}
		if (def < damageTaken) {
			this.hp = this.hp + this.def - damageTaken;
			System.out.println("���� ���ݿ� ���� " + (def-damageTaken) +"��ŭ�� ���ظ� �޾ҽ��ϴ�.");
			System.out.println("���� ������ ü�� : " + hp + "/" + maxHp);
		}
	}
	

}
