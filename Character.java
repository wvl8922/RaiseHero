
public class Character extends Thread {
	String name; //이름
	int lev; //레벨
	int maxHp; //최대체력
	int maxMana; //최대체력
	int hp;  //hp
	int mana; //mana
	int str; //str
	int def; //def
	int exp; //exp
	int gold; //gold	
	public int attackedDamage(int damage) { //공격 받은 데미지
		return damage - def;
	}
}
