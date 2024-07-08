package ru.base;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTests {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite - Настройка Suite");
	}
	@BeforeTest
	public void setUp() {
		System.out.println("@BeforeTest - Производим настройки среды тестирования");
	}
	@BeforeMethod
	public void beforeMethod(ITestResult result) {
		System.out.println("@BeforeMethod - Производим настройки перед тестом: " + result.getMethod().getMethodName());
	}
	@AfterMethod
	public void afterMethod(ITestResult result) {
		System.out.println("@AfterMethod - Завершение работы теста: " + result.getMethod().getMethodName());
	}
	@AfterTest
	public void tearDown() {
		System.out.println("@AfterTest - Производим очистку");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite - Завершение Suite");
	}
}
