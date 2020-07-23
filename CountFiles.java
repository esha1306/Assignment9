import java.io.File;
import java.io.IOException;
public class CountFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\");
		int count = 0;
        for (File file : f.listFiles()) {
                if (file.isFile()) {
                        count++;
                }
        }
        System.out.println("Number of files: " + count);
	}

}
