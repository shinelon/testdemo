package orhter.demo;


public class OnlyOneTest {
	public static void main(String args[]){
		boolean[] array = new boolean[500];
		for(int i=0; i<array.length; i++){
			array[i] = true;
		}
		
		int leftCount = array.length ;  //ʣ�µ�����
		int countNum = 0; //ÿ����Ϊһ��
		int current = 0;  //��ǰָ���������һ��
		
		while(leftCount > 1){
			if(array[current] == true){
				countNum++;
				if(countNum == 3){
					array[current] = false;
					countNum = 0;
					leftCount --;
				}
			}
			current++;
			
			if(current == array.length){
				current = 0;
			}
			
		}
		
		for(int i = 0; i < array.length ; i++){
			if( array[i] == true){
				System.out.println(i);
			}
		}
			
	}
}


