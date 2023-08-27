package com.perf.statics;

import java.util.HashMap;

public class CodeManager {
	private HashMap<String, String> codeMap;
	private static CodeDAO cDAO;
	private static CodeManager cm;
	
	static {
		cDAO = new CodeDAO();
		cm = new CodeManager();
		if(!cm.getCodes()) {
			// 에러처
		}
	}

	public CodeManager() {
		super();
	}
	

	public static CodeManager getInstance() {
		return cm;
	}
	
	private boolean getCodes() {
		try {
			codeMap = cDAO.getCodes();
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public boolean updateCodes() {
		return cm.getCodes();
	}
	
	public String getCodeValues(String code) {
		return codeMap.get(code);
	}
	

}
