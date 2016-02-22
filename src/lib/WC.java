package lib;

public class WC{
	private String fileName;
	private String content;

	public WC(String text,String fileName){
		this.fileName = fileName;
		this.content = text;
	}

	public int countChars(){
		return content.length();
	}

	public int countWords(){
		return content.split("\\s+").length;
	}

	public int countLines(){
		return content.split("\\n+").length-1;
	}

	public String formatedResult(){
		StringBuilder sb = new StringBuilder(""); 
		sb.append("\t").append(countLines());
        sb.append("\t").append(countWords());
        sb.append("\t").append(countChars());
        sb.append("\t").append(fileName);
        return sb.toString();
	}
}