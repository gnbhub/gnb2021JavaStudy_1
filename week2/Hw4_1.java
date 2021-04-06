import java.util.Scanner;

class Hw4_1 {
	public static void main(String [] args){
		
		double x1, x2, y1, y2, garo, sero;
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("점1의 x좌표: ");
		x1 = s.nextDouble();
		System.out.printf("점1의 y좌표: ");
		y1 = s.nextDouble();
		System.out.printf("점2의 x좌표: ");
		x2 = s.nextDouble();
		System.out.printf("점2의 y좌표: ");
		y2 = s.nextDouble();

		garo = x1-x2;
		sero = y1-y2;
		
		if(garo<0)
			garo *= -1;
		if(sero<0)
			sero *= -1;
		
		while((garo==0)||(sero==0)){
			System.out.printf("점 (%.2f, %.2f)와 점 (%.2f, %.2f)는 직사각형을 이루지 않습니다.\n다시 입력해주세요.\n", x1, y1, x2, y2);
			
			System.out.printf("점1의 x좌표: ");
			x1 = s.nextDouble();
			System.out.printf("점1의 y좌표: ");
			y1 = s.nextDouble();
			System.out.printf("점2의 x좌표: ");
			x2 = s.nextDouble();
			System.out.printf("점2의 y좌표: ");
			y2 = s.nextDouble();

			garo = x1-x2;
			sero = y1-y2;
		
			if(garo<0)
				garo *= -1;
			if(sero<0)
				sero *= -1;
		}
		System.out.printf("=============계산 결과=============\n");
		System.out.format("- 둘레의 길이: %.2f\n", (garo+sero)*2);
		System.out.format("- 넓이: %.2f\n", garo*sero);
		System.out.format("- 대각선의 길이: %.2f\n", Math.sqrt(garo*garo+sero*sero));

	}
}