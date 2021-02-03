import java.util.HashMap;

public class IDandPassword {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPassword() {
		
		logininfo.put("John", "password");
		logininfo.put("Frank", "qwertz");
		logininfo.put("Lojzek", "1234");
		
	}
	
	protected HashMap getLogininfo() {
		return logininfo;
	}
}
