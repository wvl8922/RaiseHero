import java.util.Scanner;

public class Map {
	String MapName;

	public Map(String mapName) {
		switch (mapName) { // ����ġ�� : �ʼ���
		case "startingPoint":
			System.out.println("����Ű��⿡ ���� ���� ȯ���մϴ�.");
			System.out.println("������ �̸��� �������ּ���.");
			Scanner chooseHeroName = new Scanner(System.in); // ��ĵ ���� ��ĳ�� ��ü �����
			String heroName = chooseHeroName.next();
			System.out.println("����� ���� ������ �̸��� " + heroName + "�Դϴ�.");
			break;

		case "mainAct":
			System.out.println("�̵��� ���� �����ϼ���.");
			System.out.println("1. ����     2. ����");
			System.out.println("3. �Ʒü�    4. �� ���� ����");
			System.out.println("5. �ڷ� ���ư���    ");
			break;
			
		case "chooseDungeon":
			System.out.println("���͸� ����� ������ �������ּ���.");
			System.out.println("1. ���� ����     2. ��ũ ����");
			System.out.println("3. �𵥵� ����    4. ����� ����");
			System.out.println("5. �ڷ� ���ư���    ");
			break;
			

		case "animalDungeon":
			System.out.println("���� ������ ���Խ��ϴ�.");
			System.out.println("����� ���͸� �������ּ���.");
			System.out.println("1. ����      2. ��");
			System.out.println("3. ȣ����    4. �巡��");
			System.out.println("5. �ڷ� ���ư���    ");
			break;
			
		
		case "oakDungeon":
			System.out.println("��ũ ������ ���Խ��ϴ�.");
			System.out.println("����� ���͸� �������ּ���.");
			System.out.println("1. ��ũ����      2. ������ũ����");
			System.out.println("3. ���̿�ũ      4. ��ũ��");
			System.out.println("5. �ڷ� ���ư���    ");	
			break;
			
			
		case "undeadDungeon":
			System.out.println("��ũ ������ ���Խ��ϴ�.");
			System.out.println("����� ���͸� �������ּ���.");
			System.out.println("1. ����      2. ����");
			System.out.println("3. ����      4. �𵥵��");
			System.out.println("5. �ڷ� ���ư���    ");
			break;
			
		case "secretDungeon":
			System.out.println("����� ������ ���Խ��ϴ�.");
			System.out.println("�ڽŰ��� ������ ���۵˴ϴ�.");
			break;
			
		case "shop":
			System.out.println("������ ���Խ��ϴ�.");
			break;
			
		case "trainingCenter":
			System.out.println("�Ʒüҿ� ���Խ��ϴ�.");
			break;
				
			
		case "fightingArea":

		}
	}

}
