package in.ashokit.bean;

public class XmlMsgFormatter implements IMsgFormatter {

	public XmlMsgFormatter() {
		System.out.println("XmlMsgFormatter:: Constructor");
	}
	
	public String format(String msg) {
		String formatMsg = "<xml>" +msg+ "</xml>";
		return formatMsg;
	}
}
