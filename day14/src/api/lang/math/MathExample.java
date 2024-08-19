package api.lang.math;

public class MathExample {
	public static void main(String[] args) {
		// 수학 관련된 연산이나 혹은 상수를 저장해둔 Math 클래스는 정적 변수와 메서드를 가지므로
		// 굳이 Math 객체를 생성하지 않아도 활용할 수 있다.
		
		// 절댓값 출력
		System.out.println(Math.abs(-15.294));
		
		// 올림값 출력
		System.out.println(Math.ceil(10.0));
		System.out.println(Math.ceil(10.000001));
		
		// 내림값 출력
		System.out.println(Math.floor(10.0));
		System.out.println(Math.floor(10.9999999));
		
		// 최댓값: 제시된 수 중 가장 큰 값 하나만 출력
		System.out.println(Math.max(99.9, 12.34));
		
		// 최솟값: 제시된 수 중 가장 작은 값 하나만 출력
		System.out.println(Math.min(0.0001, 0.00001));
		
		// 무작위 수: 하지만 컴퓨터 시스템은 완벽한 난수가 아닌 시드값에 따른 의사난수를 쓴다.
		System.out.println(Math.random());
		
		// 가장 가까운 실수 출력
		System.out.println(Math.rint(12.500001));
		System.out.println(Math.rint(12.499999));
		
		// 반올림: 소수점 아래 값이 0.5 미만이면 그대로, 이상이면 1 증가
		System.out.println(Math.round(10.49999));
		System.out.println(Math.round(10.500001));
		
		// 혹은 Math 클래스 내에 정적변수로 자주 사용하는 상수값(원주율, 자연상수 등)도 제공한다.
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}
}
