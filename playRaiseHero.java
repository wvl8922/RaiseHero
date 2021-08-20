import java.util.Scanner;

public class playRaiseHero {
	public static Hero myHero;

	public static void main(String[] args) {
		myHero = new Hero();
		// 게임 시작
		Map startingPoint = new Map("startingPoint");
		System.out.println("영웅의 직업을 선택해주세요.");
		System.out.println("1. 전사 : 칼에 능숙한 영웅입니다.");
		System.out.println("2. 궁수 : 활에 능숙한 영웅입니다.");
		Scanner chooseHeroClass = new Scanner(System.in); // 스캔 받을 스캐너 객체 만들기
		int ClassOfHero = chooseHeroClass.nextInt();
		System.out.println("당신이 정한 영웅의 직업은 " + ClassOfHero + "입니다.");
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

		// 메인 행동 선택
		while (true) { // 메인행동선택에 대한 while 문 시작
			Map mainAct = new Map("mainAct");
			Scanner chooseMainAct = new Scanner(System.in); // 스캔 받을 스캐너 객체 만들기
			int numOfMainAct = chooseMainAct.nextInt();
			switch (numOfMainAct) { // 메인행동 선택 스위치문
			case 1: { // 메인 행동 : 던전 사냥 선택 시
				while (true) { // 던전 타입 선택에 대한 while 문 시작
					System.out.println("던전을 선택하셨습니다.");
					System.out.println("던전으로 이동합니다.");
					Map chooseDungeon = new Map("chooseDungeon");
					Scanner choiceDungeonType = new Scanner(System.in); // 스캔 받을 스캐너 객체 만들기
					int DungeonType = choiceDungeonType.nextInt();
					switch (DungeonType) { // 스위치문 : 던전 선택
					case 1: {// 동물 던전 선택 시
//						while(true) { // 동물 선택 while문 시작
						Map map = new Map("animalDungeon");
						Scanner choiceAnimalOption = new Scanner(System.in); // 스캔 받을 스캐너 객체 만들기
						int animalOption = choiceAnimalOption.nextInt();
						switch (animalOption) { // 스위치문 : 동물선택
						case 1: {
							Monster monster = new Animal("wolf"); //늑대 몬스터 객체 생성
//							monster.start(); //몬스터 자동공격 시작
							while (true) { //영웅공격에 대한 while문 시작
								int attackDamageByHero = myHero.attack(); //영웅 공격
								monster.attacked(attackDamageByHero); //몬스터 데미지 받음
								if (monster.hp <= 0) { //몬스터 체력이 0 이하일 때, while문 종료
									Thread.interrupted();
									break;
								}
								if (myHero.hp <= 0) { //영웅 체력이 0 이하일 때, while문 종료
									Thread.interrupted();
									System.out.println("영웅이 죽었습니다.");
									System.out.println("영웅을 부활 시킵니다.");
									System.out.println("계속하려면 아무키나 누르세요.");
									break;
								}
							} //영웅공격에 대한 while문 끝
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
							System.out.println("뒤로 돌아갑니다.");
							myHero.attack();
							break;
						}
						}
						break;
					} // 동물 던전 선택 시 끝
					case 2: { // 오크 던전 선택 시
						Map map = new Map("oakDungeon");
						break;
					} // 오크 던전 선택 시 끝
					case 3: { // 언데드 던전 선택
						Map map = new Map("undeadDungeon");
						break;
					} // 언데드 던전 선택 시 끝
					case 4: { // 비밀의 던전 선택
						Map map = new Map("secretDungeon");
						break;
					} // 비밀의 던전 선택 끝
					case 5: { // 뒤로돌아가기
						System.out.println("뒤로 돌아갑니다.");
						break;
					} // 뒤로 돌아가기 끝
					}// 스위치문 : 던전 선택 끝
					break;
				} // 던전 타입 선택에 대한 while 문 끝
				break;
			} // 메인 행동 : 던전 사냥 선택 끝

			case 2: {
				Map shop = new Map("shop");
				break;
			}
			case 3: {
				Map trainingCenter = new Map("trainingCenter");
				break;
			}
			case 4: {
				System.out.println("내 상태를 출력합니다.");
				break;
			}
			} // 메인행동 선택 스위치문 끝

		} // 메인행동선택에 대한 while 문 끝
	}
}
