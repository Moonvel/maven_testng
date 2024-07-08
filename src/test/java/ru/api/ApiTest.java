package ru.api;

import org.testng.annotations.Test;
import ru.base.BaseTests;

public class ApiTest extends BaseTests {

	@Test
	public void currentWeatherApiTest() {
		System.out.println("@Test - APITest currentWeatherApiTest - Проврека API 'Текущая погода'");
	}

	@Test
	public void dailyForecast16DaysTest() {
		System.out.println("@Test - APITest dailyForecast16DaysTest - Проврека API 'Погода на 16 дней'");
	}
}


