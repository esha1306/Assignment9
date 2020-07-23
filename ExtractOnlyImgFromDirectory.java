import java.io.File;
import java.io.FilenameFilter;

public class ExtractOnlyImgFromDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pathnames;
		
			File f = new File("D:\\");
			
//			
			// This filter will only include files ending with .py
			FilenameFilter filter = new FilenameFilter() {
			        @Override
			        public boolean accept(File f, String name) {
			            return name.endsWith(".PNG");
			        }
			    };
		    
//		    File[] files = f.listFiles(filter);
//		    
//		    for (int i = 0; i < files.length; i++) {
//	            System.out.println(files[i].getName());
//		    }
	    pathnames = f.list(filter);
	   // System.out.println(pathnames);

	    for (String pathname : pathnames) {
	    	System.out.println(pathname);
	    }
	}

}
