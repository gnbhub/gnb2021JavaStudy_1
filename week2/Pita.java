import java.util.*;

class Pita {
	public static void main(String[] args) {
			int a, b, c; // 각 변의 길이
			int A, B, C; // 각 변의 길이 제곱
			int tmp = 0; // 피타고라스의 정리 만족하는 직각 삼각형의 개수
			
			
			for (a = 1;a < 100; a++) {
				for (b = 1; b < 100; b++) {
					for (c = 1; c < 100; c++) {
					        A = (int)Math.pow(a, 2);
			                B = (int)Math.pow(b, 2);
			                C = (int)Math.pow(c, 2);
							if(C == (A + B)) {
							System.out.printf("%d² + %d² = %d²\n", a, b, c);
							tmp++;
							}
					}
				}
			}
			System.out.printf("각 변의 길이가 100보다 작은 삼각형 중에서 피타고라스의 정리가 성립하는 직각 삼각형은 %d개입니다.", tmp);
	}
}
