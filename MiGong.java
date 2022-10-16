//尝试跟着老韩思路写出一个老鼠走迷宫的问题
public class MiGong{
	public static void main(String[] args) {
		//定义0是可以走的路，1是障碍物
		//迷宫为八行七列的简单迷宫
		int map[][] = new int[8][7];
		//用数字画出migong（即给二维数组赋予数字）
		for (int i = 0;i < 8 ;i++ ) {
			for (int j = 0;j < 7 ;j++ ) {
				if (j == 0 || i == 0 || j == 6 || i == 7) {
					map[i][j] = 1;//迷宫的边框全设置为障碍物
				}else if (i == 3 && j < 3) {
					map[i][j] = 1;//迷宫中间的障碍物
				}else{
					map[i][j] = 0;
				}
			}
		}//迷宫（数组）创建完成
		map[4][3] = 1;
		System.out.println("=====当前地图的情况=====");
		for (int x = 0;x < 8 ;x++ ) {
			for (int y = 0;y < 7 ;y++ ) {
				System.out.print(map[x][y] + " ");
			}
			System.out.println();
		}//打印出迷宫看看样子
		T migong = new T();
		boolean q = migong.findWay(map,1,1);
		if(q){
		System.out.println("=====走过以后地图的情况=====");
		for (int a = 0;a < 8 ;a++ ) {
			for (int b = 0;b < 7 ;b++ ) {
				System.out.print(map[a][b] + " ");
			}
			System.out.println();
		}//打印出迷宫看看样子
		System.out.println("能走出迷宫");
	}else{
		System.out.println("=====走过以后地图的情况=====");
		for (int z = 0;z < 8 ;z++ ) {
			for (int m = 0;m < 7 ;m++ ) {
				System.out.print(map[z][m] + " ");
			}
			System.out.println();
		}//打印出迷宫看看样子
		System.out.println("走不出迷宫");
	}
	}
}
class T{
	//1.找到为true，没找到为false
	//2.初始化的位置应该是（1，1）
	//3.找到（6，5）即出迷宫
	//4.定义0是可以走的路，1是障碍物，2是可以走的路，3是走过但是走不通的路。
	//5走路的方式 下->右->上->左
	public boolean findWay(int map[][], int row,int column){
		if (map[6][5] == 2) {
			return true;
		}else if(map[row][column] == 0){
			map[row][column] = 2;
			if (findWay(map,row+1,column)) {
				return true;
			}
			else if (findWay(map,row,column+1)) {
				return true;
			}else if (findWay(map,row-1,column)) {
				return true;
			}else if (findWay(map,row,column-1)) {
				return true;
			}else {
			map[row][column] = 3;
			return false;
			}
		}else
		return false;
	}
}