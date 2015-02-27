package com.ver.httpserver.handler;

import java.io.File;

import com.ver.httpserver.core.CoreHttpRequest;
import com.ver.httpserver.core.CoreHttpResponse;

public class FileHandler extends BaseHttpHandler{
	
	private File file;
	
	public FileHandler(String path) {
		this.file = new File(path);
	}
	
	public FileHandler(File file) {
		this.file = file;
	}
	

	@Override
	public void handle(CoreHttpRequest request, CoreHttpResponse response) {
		response.render(file);
	}

}
