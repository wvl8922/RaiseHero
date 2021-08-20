
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
			System.out.println("늑대가 나타났습니다.");
			System.out.println("늑대가 당신을 공격합니다.");
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
			System.out.println("곰이 나타났습니다.");
			System.out.println("곰이 당신을 공격합니다.");
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
			System.out.println("호랑이가 나타났습니다.");
			System.out.println("호랑이가 당신을 공격합니다.");
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
			System.out.println("보스몬스터 드래곤이 나타났습니다.");
			System.out.println("드래곤이 당신에게 화염을 내뿜습니다.");
			break;
		}
		
		}
	}
	
	
	public void attacked(int damageTaken) {
		if (def > damageTaken) {
			hp = hp;
			System.out.println("공격력이 낮아 몬스터의 방어를 뚫지 못했습니다.");
			System.out.println("현재 몬스터의 체력 : " + hp + " / " + maxHp);
		}
		if (def < damageTaken) {
			this.hp = this.hp + this.def - damageTaken;
			System.out.println("몬스터에게 " + (def-damageTaken) +"만큼의 피해를 입혔습니다.");
			System.out.println("현재 몬스터의 체력 : " + hp + "/" + maxHp);
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
				System.out.println("몬스터가 당신을 공격합니다.");
				System.out.println();
				playRaiseHero.myHero.attacked(attackDamageByMonster);
				if (playRaiseHero.myHero.hp <= 0) {
					goOrStop = true;
					System.out.println("영웅이 죽었습니다.");
					System.out.println("영웅을 부활 시킵니다.");
				}
			} catch (Exception e) {
				return;
			}
		}
	}
}
