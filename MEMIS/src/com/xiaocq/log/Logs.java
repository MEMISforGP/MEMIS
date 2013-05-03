package com.xiaocq.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Logs {
	private static Log log;
	
	static{
		log = LogFactory.getLog(Logs.class);
	}
	public static Log getLog(){
		return log;
	}
}
