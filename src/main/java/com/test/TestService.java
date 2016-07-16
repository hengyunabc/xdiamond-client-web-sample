package com.test;

import org.springframework.stereotype.Service;

import io.github.xdiamond.client.annotation.AllKeyListener;
import io.github.xdiamond.client.annotation.OneKeyListener;
import io.github.xdiamond.client.event.ConfigEvent;

@Service
public class TestService {

	public TestService() {
		System.err.println("TestService");

	}

	@OneKeyListener(key = "testKey")
	public void test(ConfigEvent event) {

		System.err.println("@OneKeyListener");
		System.err.println(event);

	}

	@AllKeyListener
	public void testAll(ConfigEvent event) {
		System.err.println("@AllKeyListener");
		System.err.println(event);

	}
}
