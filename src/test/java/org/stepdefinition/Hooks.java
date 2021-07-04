package org.stepdefinition;

import java.io.IOException;

import org.baseclass.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void beforeScenario() {
		System.out.println("Scenario starts.....");
		launchBrowser();
		maximizeWindow();
		applyWaitToAllLocators();
	}
	@After
	public void afterScenario(Scenario s) throws IOException {
		String str = s.getName();
		String name = str.replaceAll(" ", "_");
		takeSnap(name);
		closeBrowser();
		System.out.println(".....Scenario ends");
	}
}
