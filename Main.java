import java.io.File;
public class Main
    {
        public static void FileDelete(File f)
        {
            if(f.isDirectory())
            {
                File[] files=f.listFiles();
                for(File file:files)
                {
                    FileDelete(file);
                }
            }
            f.delete();
        }
        public static void main(String[] args) throws Exception
        {
            String str=javax.swing.JOptionPane.showInputDialog("Enter files you wanted:");
            File f=new File(str);
            FileDelete(f);
        }
    }
