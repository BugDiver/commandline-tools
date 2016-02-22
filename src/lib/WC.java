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
	public String partialDetails(String option){
		StringBuilder sb = new StringBuilder("\t"); 
		switch (option) {
			case "-l":
				sb.append(countLines()).append("\t");
				break;
			case "-w":
				sb.append(countWords()).append("\t");
				break;
			case "-c":
				sb.append(countChars()).append("\t");
				break;
			default:
				sb.append("Illegal Option!!");
		}
		sb.append(fileName);
		return sb.toString();
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