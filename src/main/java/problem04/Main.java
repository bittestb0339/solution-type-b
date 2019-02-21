package problem04;

public class Main {
	
	public static void main(String[] args) {
		int amountOfStone = 10;
		int amountOfRiver = 10;
				
		//돌다리와 물이 세팅될 스테이지
		char[] stage = new char[amountOfStone + amountOfRiver];
		int numberOfRemainingStones = amountOfStone;
		int numberOfRemainingRivers = amountOfRiver;
		
		for(int i=0; i<stage.length; i++) {//i는 스테이지배열의 인덱스
			
			while(numberOfRemainingRivers==0 && numberOfRemainingStones==0) {
				
				//난수 생성 0또는 1
				int randomNumber0or1 = (int)(Math.random()*2);
				
				if(randomNumber0or1 == 0) {//돌을 생성
					if(numberOfRemainingStones==0) {
						continue;
					}
					stage[i] = 'O';
					numberOfRemainingStones--;
					
				} else if(randomNumber0or1 == 1) {//물을 생성
					if(numberOfRemainingRivers==0) {
						continue;
					}
					stage[i] = '#';
					numberOfRemainingRivers--;
				}
			}//end of while
		}//end of make a stage
		
		//stage확인하기
		for(char c : stage) {
			System.out.print(c);
		}
		
		
	}//end of main()

}
