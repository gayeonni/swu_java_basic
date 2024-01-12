package garbagecollection;

public class GarbageCollectorTestMain {

	public static void main(String[] args) throws Exception{
		
		GarbageCollectorTest test2 = null;
		
		for(int i = 0; i < 5; i++) {
			GarbageCollectorTest test = 
					new GarbageCollectorTest(i);
			
			if(i == 3) {
				test2 = test; //3번 객체는 test2와 연결 유지
			}
			
			test = null;
			
			
		}
		
		// 쓰레기 수집 강제 실행 명령어(실제로는 쓸 필요는 없음)
		System.gc();
					
		Thread.sleep(1000); // 1초간 코드 정지

	}

}
