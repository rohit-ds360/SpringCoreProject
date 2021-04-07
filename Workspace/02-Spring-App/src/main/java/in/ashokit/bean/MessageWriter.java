package in.ashokit.bean;

public class MessageWriter {

	private IMsgFormatter formatter;
	
	public MessageWriter() {
		System.out.println("MessageWriter:: Constructor");;
	}

	public void setFormatter(IMsgFormatter formatter) {
		System.out.println("setFormatter() method called");
		this.formatter = formatter;
	}



	public void formatMsg(String msg) {
		
		String formattedMsg = formatter.format(msg);
		
		System.out.println("formattedMsg :: "+formattedMsg);
	}
}
