
public class Monster extends Character {
//	String name; //이름
//	int lev; //레벨
//	int hp;  //hp
//	int str; //str
//	int def; //def
//	int exp; //exp
//	int gold; //gold	
//	public int attackedDamage(int damage) { //공격 받은 데미지
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
					System.out.println("몬스터가 당신을 공격합니다.");
					System.out.println();
					playRaiseHero.myHero.attacked(attackDamageByMonster);
				}
			} catch (Exception e) {
				return;
			}
		}
	}

}
