package ru.ui;

import org.testng.annotations.Test;
import ru.base.UIRegistrationTestsSettings;

public class UiRegistrationTests extends UIRegistrationTestsSettings {

	@Test
	public void registrationFormTest() {
		System.out.println("@Test - UITest registrationFormTest - Проверка формы регистрации");
	}

	@Test
	public void resetPassword() {
		System.out.println("@Test - UITest resetPassword - Восстановление пароля");
	}
}
