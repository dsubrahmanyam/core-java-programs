package co.iostreams;

import java.io.File;
import java.io.IOException;

public class FileCreate {
	public static void main(String[] args) throws IOException
	{
		File f = new File("raj.txt");
	boolean b = f.createNewFile();
	if (b)
	{ System.out.println("File is created successfully");
	}
	else
	{ System.out.println("File is already existed in location");
	}
	}
	
}
