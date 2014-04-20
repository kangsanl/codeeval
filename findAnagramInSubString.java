public class findAnagramInSubString{
	public static boolean findAnalgram(String src, String target){
		int[] targetCount = new int[128];
		int[] srcCountInWindow = new int [128];
		
		if(target.length() > src.length()){
			return false;
		}
		
		for(int i = 0; i < target.length(); i++){
			targetCount[target.charAt(i)]++;
			srcCountInWindow[src.charAt(i)]++;
		}
		
		int windowStart = 0;
		int windowEnd = target.length() - 1;
		int i = 0;
		while(windowEnd < src.length()){
			for(i = 0; i < target.length(); i++){
				if(targetCount[target.charAt(i)] != srcCountInWindow[target.charAt(i)]){
					break;
				}
			}
			if(i == target.length()){
				return true;
			}
			
			if(windowEnd + 1 > src.length()-1){
				break;
			}
			srcCountInWindow[src.charAt(windowStart++)]--;
			srcCountInWindow[src.charAt(++windowEnd)]++;
		}
		return false;
		
	}
	
	
}

}
