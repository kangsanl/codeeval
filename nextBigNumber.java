public class nextBigNumber{
	public static main(String[] args){
		
	}
	public static int findNextBigNumber(int _input){
		int num = 0;
		int M = 0;
		int P = 0;
		int temp = _input;
		int[] inputArray = new int[10];
		
		//Convert the number to an array
		while(temp > 0){
			inputArray[num++] = temp % 10;
			temp /= 10;
		}

		//Find M
		for(int i = 0; i < num - 1; i++){
			if(inputArray[i] > inputArray[i+1]){
				M = i+1;
				break;
			}
		}
		
		//Already the biggest number
		if(M == 0){
			return _input;
		}
		
		//Swap the reversed number with the smallest number bigger than a[M]
		for(int i = 0; i < M; i++){
			if(inputArray[i] > inputArray[M]){
				P = i;
				int tempVal = inputArray[M];
				inputArray[M] = inputArray[i];
				inputArray[i] = tempVal;
			}			
		}
	
		//sort digit from  0 to M-1;

		 Array.Sort(inputArray, 0, M-1);
		
		int result = 0;
		for(int i = 0 ; i < num; i++){
			result = inputArray[i] + result*10;
		}

		return result;

		

	}

}
