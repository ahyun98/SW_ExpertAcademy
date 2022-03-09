import java.util.Scanner;

public class Swea1873 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			char[][] map = new char[H][W];
			for (int i = 0; i < map.length; i++) {
				map[i] = sc.next().toCharArray();
			}
			int commandnum = sc.nextInt(); // 숫자 들어옴
			String command = sc.next();
			int tank_r = 0;
			int tank_c = 0;

			// 탱크 위치 저장
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < W; j++) {
					if (map[i][j] == '^' || map[i][j] == 'v' || map[i][j] == '<' || map[i][j] == '>') {
						tank_r = i;
						tank_c = j;
						break;
					}
				}
			}

			for (int i = 0; i < commandnum; i++) {
//				System.out.println(command.charAt(i));
				switch (command.charAt(i)) {
				case 'S':
					if (map[tank_r][tank_c] == '^') {
						for (int j = tank_r; j >= 0; j--) {
							if (map[j][tank_c] == '#') {
								break;
							} else if (map[j][tank_c] == '*') {
								map[j][tank_c] = '.';
								break;
							}
						}
					} else if (map[tank_r][tank_c] == 'v') {
						for (int j = tank_r; j < map.length; j++) {
							if (map[j][tank_c] == '#') {
								break;
							} else if (map[j][tank_c] == '*') {
								map[j][tank_c] = '.';
								break;
							}
						}

					} else if (map[tank_r][tank_c] == '<') {
						for (int j = tank_c; j >= 0; j--) {
							if (map[tank_r][j] == '#') {
								break;
							} else if (map[tank_r][j] == '*') {
								map[tank_r][j] = '.';
								break;
							}
						}
					} else if(map[tank_r][tank_c]=='>'){
						for (int j = tank_c; j < W; j++) {
							if (map[tank_r][j] == '#') {
								break;
							} else if (map[tank_r][j] == '*') {
								map[tank_r][j] = '.';
								break;
							}
						}

					}

					break;

				case 'U':
					map[tank_r][tank_c] = '^';
					if (tank_r - 1 >= 0 && map[tank_r - 1][tank_c] == '.') {
						map[tank_r][tank_c] = '.';
						map[tank_r - 1][tank_c] = '^';
						tank_r = tank_r - 1;
					}
					break;

				case 'D':
					map[tank_r][tank_c] = 'v';
					if (tank_r + 1 < map.length && map[tank_r + 1][tank_c] == '.') {
						map[tank_r][tank_c] = '.';
						map[tank_r + 1][tank_c] = 'v';
						tank_r = tank_r + 1;
					}

					break;

				case 'L':
					map[tank_r][tank_c] = '<';
					if (tank_c - 1 >= 0 && map[tank_r][tank_c - 1] == '.') {
						map[tank_r][tank_c] = '.';
						map[tank_r][tank_c - 1] = '<';
						tank_c = tank_c - 1;
					}

					break;

				case 'R':
					map[tank_r][tank_c] = '>';
					if (tank_c + 1 < W && map[tank_r][tank_c + 1] == '.') {
						map[tank_r][tank_c] = '.';
						map[tank_r][tank_c + 1] = '>';
						tank_c = tank_c + 1;
					}

					break;

				}

			}
			System.out.print("#"+tc+" ");
			for (int k = 0; k < map.length; k++) {
				for (int j = 0; j < map[k].length; j++) {
					System.out.print(map[k][j]);
				}
				System.out.println();
			}

		} // 테케 마무리
	}
}
