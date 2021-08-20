import java.util.Scanner;

public class Map {
	String MapName;

	public Map(String mapName) {
		switch (mapName) { // 스위치문 : 맵선택
		case "startingPoint":
			System.out.println("영웅키우기에 오신 것을 환영합니다.");
			System.out.println("영웅의 이름을 선택해주세요.");
			Scanner chooseHeroName = new Scanner(System.in); // 스캔 받을 스캐너 객체 만들기
			String heroName = chooseHeroName.next();
			System.out.println("당신이 정한 영웅의 이름은 " + heroName + "입니다.");
			break;

		case "mainAct":
			System.out.println("이동할 곳을 선택하세요.");
			System.out.println("1. 던전     2. 상점");
			System.out.println("3. 훈련소    4. 내 상태 보기");
			System.out.println("5. 뒤로 돌아가기    ");
			break;
			
		case "chooseDungeon":
			System.out.println("몬스터를 사냥할 던전을 선택해주세요.");
			System.out.println("1. 동물 던전     2. 오크 던전");
			System.out.println("3. 언데드 던전    4. 비밀의 던전");
			System.out.println("5. 뒤로 돌아가기    ");
			break;
			

		case "animalDungeon":
			System.out.println("동물 던전에 들어왔습니다.");
			System.out.println("사냥할 몬스터를 선택해주세요.");
			System.out.println("1. 늑대      2. 곰");
			System.out.println("3. 호랑이    4. 드래곤");
			System.out.println("5. 뒤로 돌아가기    ");
			break;
			
		
		case "oakDungeon":
			System.out.println("오크 던전에 들어왔습니다.");
			System.out.println("사냥할 몬스터를 선택해주세요.");
			System.out.println("1. 오크전사      2. 정예오크전사");
			System.out.println("3. 하이오크      4. 오크왕");
			System.out.println("5. 뒤로 돌아가기    ");	
			break;
			
			
		case "undeadDungeon":
			System.out.println("오크 던전에 들어왔습니다.");
			System.out.println("사냥할 몬스터를 선택해주세요.");
			System.out.println("1. 좀비      2. 구울");
			System.out.println("3. 벤시      4. 언데드왕");
			System.out.println("5. 뒤로 돌아가기    ");
			break;
			
		case "secretDungeon":
			System.out.println("비밀의 던전에 들어왔습니다.");
			System.out.println("자신과의 전투가 시작됩니다.");
			break;
			
		case "shop":
			System.out.println("상점에 들어왔습니다.");
			break;
			
		case "trainingCenter":
			System.out.println("훈련소에 들어왔습니다.");
			break;
				
			
		case "fightingArea":

		}
	}

}
