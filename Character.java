
public class Character extends Thread {
	String name; //�̸�
	int lev; //����
	int maxHp; //�ִ�ü��
	int maxMana; //�ִ�ü��
	int hp;  //hp
	int mana; //mana
	int str; //str
	int def; //def
	int exp; //exp
	int gold; //gold	
	public int attackedDamage(int damage) { //���� ���� ������
		return damage - def;
	}
}
