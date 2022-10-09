//冒泡排序思路分析与代码实现
public class bubbleSorting{
	public static void main(String[] args) {
		int array[] =  {6,9,8,4,50,84,35,78};//定义一个代码
		//第一步应该将本轮最大的一个数放到最后
		//第二步，找出规律。
		//第三步将规律变化为一个外部循环
		//第四步，将代码变活
		for(int i = 0; i < array.length-1;i++){
		 for (int j = 0; j < array.length-1-i; j++) {
		 	if (array[j] > array[j+1]) {
		 		int temp = 0;
		 		temp = array[j];
		 		array[j] = array[j+1];
		 		array[j+1] = temp;
		 	}
		 }
		 System.out.print("\n" + "第" + (i+1) + "轮数组排序如下");
		 for (int num = 0;num < array.length ; num++) {
		 	System.out.print(array[num] + "\t");
		 }
}
		 // for (int j = 0; j < 7; j++) {
		 // 	int count = 0;//计数，优化，当数列没问题时直接退出
		 // 	if (array[j] > array[j+1]) {
		 // 		int temp = 0;
		 // 		temp = array[j];
		 // 		array[j] = array[j+1];
		 // 		array[j+1] = temp;
		 // 		count++;
		 // 	}
		 // 	if (count == 0) {
		 // 		break;
		 // 	}
		 // }
		 // System.out.print("\n" + "第" + "轮数组排序如下")
		 // for (int num = 0;num < array.length ; num++) {
		 // 	System.out.print(array[num] + "\t");
		 // }
	}
}