
public class Monster extends Character {
//	String name; //�̸�
//	int lev; //����
//	int hp;  //hp
//	int str; //str
//	int def; //def
//	int exp; //exp
//	int gold; //gold	
//	public int attackedDamage(int damage) { //���� ���� ������
//		return damage - def;
//	}	
	String monsterName;
	int rage;

	int attackDamage;

	public int attack() {
		attackDamage = str;
		return attackDamage;
	}

	public void attacked(int damageTaken) {

	}

	public void run() {
		boolean goOrStop = false;
		while (!goOrStop) {
			try {
				if (playRaiseHero.myHero.hp <= 0) {
					goOrStop = true;
					break;
				}
				if (playRaiseHero.myHero.hp > 0) {
					Thread.sleep(3000);
					int attackDamageByMonster = attack();
					System.out.println("���Ͱ� ����� �����մϴ�.");
					System.out.println();
					playRaiseHero.myHero.attacked(attackDamageByMonster);
				}
			} catch (Exception e) {
				return;
			}
		}
	}

}
