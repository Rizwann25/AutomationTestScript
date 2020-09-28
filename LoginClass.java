package com.atmecs.goibibo.testscripts;

	import org.testng.annotations.Test;

import com.atmecs.goibibo.pages.GoIbiboLogin;
import com.atmecs.goibibo.testsuit.SetUp;

	public class LoginClass extends SetUp {

		@Test(priority = 1)
		public void loginTravels() throws InterruptedException {
			GoIbiboLogin login = new GoIbiboLogin();
			login.login();
		}

	}

