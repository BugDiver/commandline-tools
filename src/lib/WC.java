package lib;

class WC{
	private String content;

	public WC(String text){
		this.content = text;
	}

	public int countChars(){
		return content.length();
	}
}