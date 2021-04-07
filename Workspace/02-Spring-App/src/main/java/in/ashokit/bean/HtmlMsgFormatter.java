package in.ashokit.bean;

public class HtmlMsgFormatter implements IMsgFormatter {

	public HtmlMsgFormatter() {
		System.out.println("HtmlMsgFormatter:: Constructor");
	}
	
	public String format(String msg) {
		String formatMsg = "<html>" +msg+ "</html>";
		return formatMsg;
	}
}
