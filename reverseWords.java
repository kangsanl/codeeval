import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main (String[] args) {
        File file = new File(args[0]);
    	String temp = "";
        String result = "";
		int start = -1;
		int end = -1;
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while((line = in.readLine()) != null){
				String[] inputString = line.split("[ ]+");
				start = 0;
				end = inputString.length-1;
				
				while(start < end){
					temp = inputString[start];
					inputString[start] = inputString[end];
					inputString[end] = temp;
                    start++;
                    end--;
				}
                result = inputString[0];
                for(int i = 1; i < inputString.length; i++){
                    result += " "+inputString[i];    
                }
                System.out.println(result);
                
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
}
