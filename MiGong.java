//���Ը����Ϻ�˼·д��һ���������Թ�������
public class MiGong{
	public static void main(String[] args) {
		//����0�ǿ����ߵ�·��1���ϰ���
		//�Թ�Ϊ�������еļ��Թ�
		int map[][] = new int[8][7];
		//�����ֻ���migong��������ά���鸳�����֣�
		for (int i = 0;i < 8 ;i++ ) {
			for (int j = 0;j < 7 ;j++ ) {
				if (j == 0 || i == 0 || j == 6 || i == 7) {
					map[i][j] = 1;//�Թ��ı߿�ȫ����Ϊ�ϰ���
				}else if (i == 3 && j < 3) {
					map[i][j] = 1;//�Թ��м���ϰ���
				}else{
					map[i][j] = 0;
				}
			}
		}//�Թ������飩�������
		map[4][3] = 1;
		System.out.println("=====��ǰ��ͼ�����=====");
		for (int x = 0;x < 8 ;x++ ) {
			for (int y = 0;y < 7 ;y++ ) {
				System.out.print(map[x][y] + " ");
			}
			System.out.println();
		}//��ӡ���Թ���������
		T migong = new T();
		boolean q = migong.findWay(map,1,1);
		if(q){
		System.out.println("=====�߹��Ժ��ͼ�����=====");
		for (int a = 0;a < 8 ;a++ ) {
			for (int b = 0;b < 7 ;b++ ) {
				System.out.print(map[a][b] + " ");
			}
			System.out.println();
		}//��ӡ���Թ���������
		System.out.println("���߳��Թ�");
	}else{
		System.out.println("=====�߹��Ժ��ͼ�����=====");
		for (int z = 0;z < 8 ;z++ ) {
			for (int m = 0;m < 7 ;m++ ) {
				System.out.print(map[z][m] + " ");
			}
			System.out.println();
		}//��ӡ���Թ���������
		System.out.println("�߲����Թ�");
	}
	}
}
class T{
	//1.�ҵ�Ϊtrue��û�ҵ�Ϊfalse
	//2.��ʼ����λ��Ӧ���ǣ�1��1��
	//3.�ҵ���6��5�������Թ�
	//4.����0�ǿ����ߵ�·��1���ϰ��2�ǿ����ߵ�·��3���߹������߲�ͨ��·��
	//5��·�ķ�ʽ ��->��->��->��
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