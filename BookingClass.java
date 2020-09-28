package com.atmecs.goibibo.testscripts;


	import org.testng.annotations.Test;

import com.atmecs.goibibo.pages.GoIbibioAction;
import com.atmecs.goibibo.testsuit.SetUp;



	public class BookingClass extends SetUp {
		@Test(priority = 2)
		public void book() throws InterruptedException {
			GoIbibioAction bookTicket = new GoIbibioAction();
			bookTicket.bookTickets();
		}

}
