
public class Animal extends Monster{
	
	Animal(String animalName) {
		switch (animalName) {
		case "wolf": {
			monsterName = "wolf";
			lev = 1;
			maxHp = 400;
			hp = 400; // hp
			str = 120; // str
			def = 10; // def
			exp = 50; // exp
			gold = 50; // gold
			rage = 10;
			System.out.println("���밡 ��Ÿ�����ϴ�.");
			System.out.println("���밡 ����� �����մϴ�.");
			break;
		}
		case "bear": {
			monsterName = "bear";
			lev = 1;
			maxHp = 600;
			hp = 600; // hp
			str = 40; // str
			def = 20; // def
			exp = 100; // exp
			gold = 100; // gold
			rage = 20;
			System.out.println("���� ��Ÿ�����ϴ�.");
			System.out.println("���� ����� �����մϴ�.");
			break;
		}
		case "tiger": {
			monsterName = "tiger";
			lev = 1;
			maxHp = 800;
			hp = 800; // hp
			str = 50; // str
			def = 30; // def
			exp = 150; // exp
			gold = 150; // gold
			rage = 30;
			System.out.println("ȣ���̰� ��Ÿ�����ϴ�.");
			System.out.println("ȣ���̰� ����� �����մϴ�.");
			break;
		}
		case "dragon": {
			monsterName = "dragon";
			lev = 1;
			hp = 2000; // hp
			str = 100; // str
			def = 50; // def
			exp = 300; // exp
			gold = 300; // gold
			rage = 50;
			System.out.println("�������� �巡���� ��Ÿ�����ϴ�.");
			System.out.println("�巡���� ��ſ��� ȭ���� ���ս��ϴ�.");
			break;
		}
		
		}
	}
	
	
	public void attacked(int damageTaken) {
		if (def > damageTaken) {
			hp = hp;
			System.out.println("���ݷ��� ���� ������ �� ���� ���߽��ϴ�.");
			System.out.println("���� ������ ü�� : " + hp + " / " + maxHp);
		}
		if (def < damageTaken) {
			this.hp = this.hp + this.def - damageTaken;
			System.out.println("���Ϳ��� " + (def-damageTaken) +"��ŭ�� ���ظ� �������ϴ�.");
			System.out.println("���� ������ ü�� : " + hp + "/" + maxHp);
		}
	}
	
	int attackDamage;
	
	public int attack() {
		attackDamage = str;
		return attackDamage;
	}
	
	public void run() {
		boolean goOrStop = false;
		while (!goOrStop) {
			try {
				Thread.sleep(3000);
				int attackDamageByMonster = attack();
				System.out.println("���Ͱ� ����� �����մϴ�.");
				System.out.println();
				playRaiseHero.myHero.attacked(attackDamageByMonster);
				if (playRaiseHero.myHero.hp <= 0) {
					goOrStop = true;
					System.out.println("������ �׾����ϴ�.");
					System.out.println("������ ��Ȱ ��ŵ�ϴ�.");
				}
			} catch (Exception e) {
				return;
			}
		}
	}
}
