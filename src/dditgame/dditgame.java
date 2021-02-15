spackage dditgame;

import E_oop.ScanUtil;

public class dditgame {
	Character c;
	int runcount = 0;
	int smokeCount = 0;
	int dangCount = 0;
	dditgame(){
		c = new Character("훈련생", 100, 20, 20, 5);
	}
	
	public static void main(String[] args) {
		System.out.println("ddit is a game");
		System.out.println("선택지에 따라 엔딩이 달라집니다");
		new dditgame().start();
	}
	
	void start(){
		int input = 0;
		while(true){
			System.out.println();
			System.out.println("==선택하세요==");
			System.out.println();
			System.out.println("1.내 정보 || 2.수업을 준비한다  || 3.야간자율학습을 한다 || 4.간식을 먹는다  || 5.흡연을 하러간다. || 6.개발원에서 도망친다.");
			System.out.println();
			input = ScanUtil.nextInt();
			
			switch (input){
			case 1:
				c.showInfo();
				break;
			case 2:
				c.toStudy();
				studyharder();
				break;
			case 3:
				c.toStudyNight();
				studynight();
				break;
				
			case 4:
				c.hp += 10;
				c.dang += 10;
				dangCount++;
				System.out.println();
				System.out.println("당이 오르는것이 느껴집니다.");
				System.out.println("기력이 10 증가했습니다.");
				System.out.println("당이 10 증가했습니다.");
				System.out.println();
				break;
				
			case 5:
				c.hp -= 8;
				c.mp -= 5;
				smokeCount++;
				System.out.println();
				System.out.println("활력이 느껴지나 머리가 어지럽습니다.");
				System.out.println("기력이 8 감소했습니다.");
				System.out.println("피로가 5 감소했습니다.");
				System.out.println();
				break;
				
			case 6:
				runcount++;
				System.out.println();
				System.out.println("이제는 도망칠수 없습니다.");
				break;
			}
		}
	}
	void studyharder(){
		int input = 0;
		run : while(c.classtime < 9){
			System.out.println();
			System.out.println("공부 강도를 선택하세요.");
			System.out.println("1.강\t2.중\t3.약");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				c.high();
				break run;
			case 2:
				c.middle();
				break run;
			case 3:
				c.low();
				break run;
			}
		}
	}
	
	void studynight(){
		int input = 0;
		while(c.classtime >= 9){
			System.out.println();
			System.out.println("야간자율학습 시간입니다. 퇴실시간을 선택해주세요.");
			System.out.println("1.9시까지 !\t2.8시까지 !\t3.7시까지 !");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				c.high();
				home();
				break;
			case 2:
				c.middle();
				home();
				break;
			case 3:
				c.low();
				home();
				break;
			}
		}
	}
	
	void home(){
		System.out.println();
		System.out.println("당신은 야간자율학습을 마치고 집에 귀가했습니다. 고생하셨습니다.");
		System.out.println();
		System.out.println("당신의 선택지에 따른 결과입니다.");
		if(c.hp > 80){ // 기력
			System.out.println();
			System.out.println("당신은 오늘 개발원에서 활력이 넘쳤습니다.");
		} else if(c.hp >= 21 && c.hp <= 79){
			System.out.println();
			System.out.println("당신은 오늘 개발원에서 그저 그랬습니다.");
		} else if(c.hp < 20){
			System.out.println();
			System.out.println("당신은 오늘 개발원에서 무기력 했습니다.");
		}
		
		if(c.mp > 75){ // 피로
			System.out.println();
			System.out.println("열심히 수업을 들어 무척 피곤했으며.");
		} else if(c.mp <= 75 && c.mp >= 20){
			System.out.println();
			System.out.println("수업을 열심히 듣고싶었으나 피곤했고. ");
		} else if(c.mp <= 20){
			System.out.println();
			System.out.println("졸린적은 없었구요.");
		}
		
		if(dangCount > 10){ // 당
			System.out.println();
			System.out.println("그리고 단 것을 좋아합니다.");
		} else if(dangCount <= 9 && c.dang >= 1){
			System.out.println();
			System.out.println("간식거리는 졸음을 이기기 위해서 몇 번 먹는정도.");
		} else if(dangCount == 0){
			System.out.println();
			System.out.println("공부할때 간식 먹는 것을 좋아하는 편은 아니네요.");
		}
		
		if(smokeCount == 0){ // 흡연횟수
			System.out.println();
			System.out.println("또한 당신은 비흡연자입니다.");
		} else if(smokeCount > 2 && smokeCount < 9){
			System.out.println();
			System.out.println("가끔 피로할때 혹은 집중이 안될때마다 담배를 피웠으며.");
		} else if(smokeCount > 10){
			System.out.println();
			System.out.println("담배를 너무 많이 피웁니다. 2교시 쉬는시간에 한번 정도면 충분할 것 같네요.");
		}
		
		if(c.studyPoint > 100){ //성취도
			System.out.println();
			System.out.println("오늘 공부에 있어 이해도를 높게 느껴도 좋을것 같네요." + c.studyPoint + "% 만큼 성취도를 달성했습니다.");
		} else if(c.studyPoint > 40 && c.studyPoint < 99){
			System.out.println();
			System.out.println("열심히 했지만 그래도 좀 아쉬운 느낌을 느낄것 같네요");
		} else if(c.studyPoint < 40){
			System.out.println();
			System.out.println("오늘의 집중력은 최악이였습니다. 내일은 좀 더 열심히 할 수 있도록 노력해야 할것 같네요..");
		}
		System.out.println();
		System.out.println("그리고 당신은 " + runcount + "번 대덕인재개발원에서의 도주를 시도했습니다");
		System.out.println();
		System.out.println("최종 정보입니다.");
		c.showInfo();
		System.exit(0);
		
	
	}
		

}

