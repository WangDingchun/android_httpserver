package com.ver.testsample.httpserver;

import android.content.Context;

import com.ver.httpserver.core.CoreHttpRequest;
import com.ver.httpserver.core.CoreHttpResponse;
import com.ver.httpserver.handler.BaseHttpHandler;

public class ResultHandler extends BaseHttpHandler {
	private Context context;

	public ResultHandler(Context context) {
		this.context = context;
	}

	/*
	 * 处理收到的请求
	 */
	@Override
	public void handle(CoreHttpRequest request, CoreHttpResponse response) {

		request.getParam("test");// 通过Key获取请求参数，

		response.render("200");// 相应结果，返回字符串；
		// response.render(context, "html/index.html");//设置返回结果：是一个网页
	}
}
