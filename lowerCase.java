import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[]  args)throws IOException{

		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		char[] result = null;
		while((line = in.readLine()) != null){
			result = line.toCharArray();
			for(int i=0; i<result.length; i++){
				if(result[i] >= 'A' && result[i] <= 'Z'){
					result[i] += 'a'-'A';
				}
			}
			System.out.println(result);
		}
	}
}
