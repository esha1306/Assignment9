import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;
public class AscendAllFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("D:\\");
		if(dir.isDirectory()) {
			File[] files = dir.listFiles();
			
			System.out.println("All files including folders");
			System.out.println("-----------------------------");
			
			for(File file:files) {
				System.out.println(file.getName());
			}
//			FileFilter fileFilter = new FileFilter()
//		      {
//		        @Override
//		        public boolean accept(File file) {
//		          return !file.isDirectory();
//		        }
//		      };
//		   
//		   files = dir.listFiles(fileFilter);
//		   
			System.out.println("\nAfter sorting by name");
		    System.out.println("----------------------------------");
		    
		    //sorting by Size
		    Arrays.sort(files, new Comparator()
		      {
		        @Override
		        public int compare(Object f1, Object f2)
		        {
		          if (((File) f1).length() < ((File) f2).length())
		          {
		            return -1;
		          }
		          else if (((File) f1).length() > ((File) f2).length())
		          {
		            return 1;
		          }
		          else
		          {
		            return 0;
		          }
		        }
		      });

		    for(File file:files)
		      {
		        System.out.println(file.getName());
		      }
		      System.out.println("\nAfter sorting by name");
		      System.out.println("----------------------------------");
		      
		   // Sort files by date.
		      Arrays.sort(files, new Comparator()
		      {
		        @Override
		        public int compare(Object f1, Object f2)
		        {
		          if (((File) f1).lastModified() < ((File) f2).lastModified())
		          {
		            return -1;
		          }
		          else if (((File) f1).lastModified() > ((File) f2).lastModified())
		          {
		            return 1;
		          }
		          else
		          {
		            return 0;
		          }
		        }
		      });
		      for(File file:files)
		      {
		        System.out.println(file.getName());
		      }
		     
		}
	}

}
