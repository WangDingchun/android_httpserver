package com.ver.httpserver.handler;

import java.io.IOException;

import android.content.Context;

import com.ver.httpserver.core.CoreHttpRequest;
import com.ver.httpserver.core.CoreHttpResponse;

public class AssetsHandler  extends BaseHttpHandler{
	
	private Context mContext;
	private String path;
	
	public AssetsHandler(Context context,String path) {
		this.mContext = context;
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}

	public AssetsHandler path(String path) {
		this.path = path;
		return this;
	}

	@Override
	public void handle(CoreHttpRequest request, CoreHttpResponse response) {
		try {
			response.render(mContext.getAssets().open(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



}
