
public class Hero extends Character {
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
	String className;

	public void showStatus() {
	}

	public void useGold(int entirePrice) { // ���� ����ϴ� �޼���
		if ((this.gold - entirePrice) > 0) { // ���� ��ü�� ��尡 ��ü ���ݺ��� ���ٸ�
			this.gold = this.gold - entirePrice;
		}
		if ((gold - entirePrice) < 0) { // ���� ��ü�� ��尡 ��ü ���ݺ��� ���ٸ�.
			System.out.println("��尡 �����մϴ�.");
		}
	}

	public int attack() {
		return 0;
	}
	
	public void attacked(int damageTaken) {
	}
}
