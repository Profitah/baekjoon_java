import java.io.*;

public class Main {
	static char arr[][];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		arr = new char[N][N];

		// 별 찍기 시작
		makeStar(0, 0, N, false);

		// 출력 
		for(int i=0; i<N; i++) {
			bw.write(arr[i]);
			bw.write('\n');
		}

		bw.flush();
		bw.close();

	} // End of main

	/**
	 * 별 찍기 함수
	 * @param x 시작 x 좌표
	 * @param y 시작 y 좌표
	 * @param N 현재 크기
	 * @param blank 공백 여부
	 */
	static void makeStar(int x, int y, int N, boolean blank) {

		// 공백칸일 경우
		if(blank) {
			for(int i=x; i<x + N; i++) {
				for(int j=y; j<y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}

		// 현재 크기가 1이면 별 찍기
		if(N == 1) {
			arr[x][y] = '*';
			return;
		}

		int size = N / 3;
		int count = 0;
		for(int i=x; i<x + N; i+=size) {
			for(int j=y; j<y + N; j+=size) {
				count ++;

				// 중앙은 공백 처리
				if(count == 5) {
					makeStar(i, j, size, true);
				}
				else {
					makeStar(i, j, size, false);
				}
			}
		}
	}
}
