package CollectionsLive;

public class Main {

	public static void main(String[] args) {
		File discC=new File();
		discC.name="Hard Drive (C)";
		
		File pesho=new File();
		pesho.name="Pesho.txt";
		
		File consoleInfo=new File();
		consoleInfo.name="Console info. text";
		
		
		File windows=new File();
		windows.name="Windows Directory";
		
		File system32=new File();
		system32.name="System32.dll" ;
		
		windows.files.add(pesho);
		

		discC.files.add(pesho);
		discC.files.add(consoleInfo);
		discC.files.add(windows);
		
		
		printFileSystem(discC, "--");
			
	}
	private static void printFileSystem(File file, String indent){
		System.out.print(indent+" "+file.name);
		if(file.files.size()>0){
			System.out.println("[FOLDER]");	
		}else{
			System.out.println("[FILE]");
		}
		for(File innerFile:file.files){
			printFileSystem(innerFile,indent+"--" );
		}
	}

}
