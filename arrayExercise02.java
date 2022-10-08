public class  arrayExercise02{
	public static void main(String[]args){
		int[] array = {4,-1,9,10,23};
		int end = 0;
		for (int i = 0;i < (array.length - 1);i++ ) {//遍历数组
			int n = 0;
			n = i + 1;
			if (array[i] <= array[n]) {//比较
				end = array[n];
			}else{
				end = array[i];
			}
			
		}
		System.out.print("最大数为" + end);//输出
	}
}
// 老师的优化：
// int[] array = {4,-1,9,10,23};
// int max = array[0];
// int maxIndex = 0;
// for (int i = 0;i < array.length;i++ ) {
// if(max < array[i]){
// max = array[i];
// }
// }