package dditgame;

public class Character {
	
	String name; // 이름
	int hp; // 기력
	int mp; // 피로
	int dang; // 당
	int studyPoint; // 성취도
	int classtime = 0; // 교시
	
	Character(String name, int hp, int mp, int dang, int studyPoint){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.dang = dang;
		this.studyPoint = studyPoint;
	}
	
	//내 상태
	void showInfo(){
		System.out.println();
		System.out.println("===============================");
		System.out.println("-------------상태---------------");
		System.out.println("이름 : " + name);
		System.out.println("기력 : " + hp);
		System.out.println("피로 : " + mp);
		System.out.println("당 : " + dang);
		System.out.println("성취도 : " + studyPoint + "%");
		System.out.println("===============================");
	}
	
	//1 ~ 8 교시
	String subject;
	void toStudy(){
		classtime++;
		if(classtime < 5){
			subject = "SQL";
			System.out.println();
			System.out.println(classtime + "교시 입니다.");
			System.out.println();
			System.out.println(classtime + "교시 수업은" + subject + "입니다");
		} else if(classtime < 9) {
			subject = "JAVA";
			System.out.println();
			System.out.println(classtime + "교시 입니다.");
			System.out.println();
			System.out.println(classtime + "교시 수업은" + subject + "입니다");
		} else{
			System.out.println();
			System.out.println("오늘의 수업은 더 이상 진행할수 없습니다.");
			System.out.println("야간자율학습만 가능합니다.");
		}
	}
	//야간자율학습
	void toStudyNight(){
		if(classtime < 9){
			System.out.println();
			System.out.println("아직은 야간자율학습을 진행할수 없습니다.");
		} else{
			System.out.println();
			System.out.println("야간자율학습을 진행합니다.");
		}
	}
	
	//집중도 상
	void high(){
		hp -= 10;
		mp += 10;
		studyPoint += 15;
		System.out.println();
		System.out.println("기력이 10 감소했습니다.");
		System.out.println("피로가 10 상승했습니다.");
		System.out.println("성취도가 15 상승했습니다.");
	}
	//집중도 중
	void middle(){
		hp -= 5;
		mp += 5;
		studyPoint += 10;
		System.out.println();
		System.out.println("기력이 5 감소했습니다.");
		System.out.println("피로가 5 상승했습니다.");
		System.out.println("성취도가 10 상승했습니다.");
	}
	//집중도 하
	void low(){
		hp += 5;
		mp -= 5;
		studyPoint += 5;
		System.out.println();
		System.out.println("기력이 5 상승했습니다.");
		System.out.println("피로가 5 감소했습니다.");
		System.out.println("성취도가 5 상승했습니다.");
	}
}
