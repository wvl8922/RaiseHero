import java.util.Scanner;

public class playRaiseHero {
	public static Hero myHero;

	public static void main(String[] args) {
		myHero = new Hero();
		// ���� ����
		Map startingPoint = new Map("startingPoint");
		System.out.println("������ ������ �������ּ���.");
		System.out.println("1. ���� : Į�� �ɼ��� �����Դϴ�.");
		System.out.println("2. �ü� : Ȱ�� �ɼ��� �����Դϴ�.");
		Scanner chooseHeroClass = new Scanner(System.in); // ��ĵ ���� ��ĳ�� ��ü �����
		int ClassOfHero = chooseHeroClass.nextInt();
		System.out.println("����� ���� ������ ������ " + ClassOfHero + "�Դϴ�.");
		switch (ClassOfHero) {
		case 1: {
			myHero = new Warrior();
			break;
		}
		case 2: {
			myHero = new Archer();
			break;
		}
		}

		// ���� �ൿ ����
		while (true) { // �����ൿ���ÿ� ���� while �� ����
			Map mainAct = new Map("mainAct");
			Scanner chooseMainAct = new Scanner(System.in); // ��ĵ ���� ��ĳ�� ��ü �����
			int numOfMainAct = chooseMainAct.nextInt();
			switch (numOfMainAct) { // �����ൿ ���� ����ġ��
			case 1: { // ���� �ൿ : ���� ��� ���� ��
				while (true) { // ���� Ÿ�� ���ÿ� ���� while �� ����
					System.out.println("������ �����ϼ̽��ϴ�.");
					System.out.println("�������� �̵��մϴ�.");
					Map chooseDungeon = new Map("chooseDungeon");
					Scanner choiceDungeonType = new Scanner(System.in); // ��ĵ ���� ��ĳ�� ��ü �����
					int DungeonType = choiceDungeonType.nextInt();
					switch (DungeonType) { // ����ġ�� : ���� ����
					case 1: {// ���� ���� ���� ��
//						while(true) { // ���� ���� while�� ����
						Map map = new Map("animalDungeon");
						Scanner choiceAnimalOption = new Scanner(System.in); // ��ĵ ���� ��ĳ�� ��ü �����
						int animalOption = choiceAnimalOption.nextInt();
						switch (animalOption) { // ����ġ�� : ��������
						case 1: {
							Monster monster = new Animal("wolf"); //���� ���� ��ü ����
//							monster.start(); //���� �ڵ����� ����
							while (true) { //�������ݿ� ���� while�� ����
								int attackDamageByHero = myHero.attack(); //���� ����
								monster.attacked(attackDamageByHero); //���� ������ ����
								if (monster.hp <= 0) { //���� ü���� 0 ������ ��, while�� ����
									Thread.interrupted();
									break;
								}
								if (myHero.hp <= 0) { //���� ü���� 0 ������ ��, while�� ����
									Thread.interrupted();
									System.out.println("������ �׾����ϴ�.");
									System.out.println("������ ��Ȱ ��ŵ�ϴ�.");
									System.out.println("����Ϸ��� �ƹ�Ű�� ��������.");
									break;
								}
							} //�������ݿ� ���� while�� ��
							break;
						}
						case 2: {
							Monster monster = new Animal("bear");
							myHero.attack();
							break;
						}
						case 3: {
							Monster monster = new Animal("tiger");
							myHero.attack();
							break;
						}
						case 4: {
							Monster monster = new Animal("dragon");
							myHero.attack();
							break;
						}
						case 5: {
							System.out.println("�ڷ� ���ư��ϴ�.");
							myHero.attack();
							break;
						}
						}
						break;
					} // ���� ���� ���� �� ��
					case 2: { // ��ũ ���� ���� ��
						Map map = new Map("oakDungeon");
						break;
					} // ��ũ ���� ���� �� ��
					case 3: { // �𵥵� ���� ����
						Map map = new Map("undeadDungeon");
						break;
					} // �𵥵� ���� ���� �� ��
					case 4: { // ����� ���� ����
						Map map = new Map("secretDungeon");
						break;
					} // ����� ���� ���� ��
					case 5: { // �ڷε��ư���
						System.out.println("�ڷ� ���ư��ϴ�.");
						break;
					} // �ڷ� ���ư��� ��
					}// ����ġ�� : ���� ���� ��
					break;
				} // ���� Ÿ�� ���ÿ� ���� while �� ��
				break;
			} // ���� �ൿ : ���� ��� ���� ��

			case 2: {
				Map shop = new Map("shop");
				break;
			}
			case 3: {
				Map trainingCenter = new Map("trainingCenter");
				break;
			}
			case 4: {
				System.out.println("�� ���¸� ����մϴ�.");
				break;
			}
			} // �����ൿ ���� ����ġ�� ��

		} // �����ൿ���ÿ� ���� while �� ��
	}
}
