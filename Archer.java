import java.util.Scanner;

public class Archer extends Hero {
	// 1. Archer ������
	Archer() {
		System.out.println("�ü��� �����Ǿ����ϴ�.\n");
		lev = 1; // ����
		className = "�ü�";
		hp = 150; // hp
		maxHp = 150; //�ִ�ü��
		maxMana = 100; //�ִ�ü��
		mana = 100; //�ִ�ü��
		str = 60; // str
		def = 10; // def
		exp = 0; // exp
		gold = 0; // gold
		showStatus();
	}
	
	public void showStatus() {
		System.out.println("----------------------------------------");
		System.out.println("<����� �⺻ �ɷ�ġ>");
		System.out.println("���� : " + lev + "     " + "   ���� : " + className);
		System.out.println("���ݷ� : " + str + "     " + "���� : " + def);
		System.out.println("����ġ : " + exp + "     " + " ������� : " + gold);
		System.out.println("----------------------------------------");
	}

	private int attackDamage;

	public int attack() {
		System.out.println("���� �ɼ��� �������ּ���.");
		System.out.println("1. ȭ�����   2. ������ �ϰ�");
		System.out.println("3. �����ۻ��  4. ��������");
		Scanner choiceAttackOption = new Scanner(System.in); // ��ĵ ���� ��ĳ�� ��ü �����
		int attackOption = choiceAttackOption.nextInt();
		switch (attackOption) {
		case 1: {
			System.out.println("ȭ�� ������ ����ϼ̽��ϴ�.");
			attackDamage = str;
			return attackDamage;
		}
		case 2: {
			System.out.println("ġ������ �ϰ��� ����ϼ̽��ϴ�.");
			mana = mana - 20;
			attackDamage = str * 2;
			return attackDamage;
		}
		}
		return attackDamage;
	}
}
