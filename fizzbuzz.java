import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
    	fizzbuzz(args);
	}
	
	
	public static void fizzbuzz(String[] args) throws IOException{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null){
			String[] lineArray = line.split("[ ]+");
			if(lineArray.length > 0){
				fizzbuzeCore(lineArray);
			}
		}
	}
	
	public static void fizzbuzeCore(String[] list){
		Integer fizzNum = new Integer(list[0]);
		Integer buzzNum = new Integer(list[1]);
		Integer N = new Integer(list[2]);
		String result = "";
		for(int i = 1; i <= N; i++){
			
			if(i != 1){
				result += " ";
			}
			
			if(i%fizzNum == 0 && i%buzzNum == 0){
				result += "FB";
			}
			else if(i%buzzNum == 0){
				result += "B";
			}
			else if(i%fizzNum == 0){
				result += "F";
			}
			else{
				result += i;
			}
			
		}
		System.out.println(result);
	}
	
}


