package ru.smoke;

import org.testng.annotations.Test;
import ru.base.BaseTests;

public class SmokeTests extends BaseTests {

	@Test
	public void uiSmokeTest() {
		System.out.println("@Test - Smoke uiSmokeTest - Быстрая проверка важного UI функционала");
	}

	@Test
	public void apiSmokeTest() {
		System.out.println("@Test - Smoke apiSmokeTest - Быстрая проверка важного API функционала");
	}
}
