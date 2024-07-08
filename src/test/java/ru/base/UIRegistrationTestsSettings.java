package ru.base;

import java.lang.reflect.Method;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class UIRegistrationTestsSettings {

	@BeforeTest
	public void setUp() {
		System.out.println("@BeforeTest - Производим настройки среды тестирования для UIRegistrationTestsSettings");
	}

	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("@BeforeMethod - Производим настройки перед тестом: " + method.getName());
	}

	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("@AfterMethod - Завершение работы теста: " + method.getName());
	}

	@AfterTest
	public void tearDown() {
		System.out.println("@AfterTest - Производим очистку после UIRegistrationTestsSettings");
	}
}
