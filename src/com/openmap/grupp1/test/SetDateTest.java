package com.openmap.grupp1.test;


import com.jayway.android.robotium.solo.Solo;
import com.openmap.grupp1.MainActivity;
import com.openmap.grupp1.SplashScreenActivity;
import com.openmap.grupp1.helpfunctions.SearchTagActivity;

import android.test.ActivityInstrumentationTestCase2;
/*Sets date and test all different kombinations that wont work.
 */
public class SetDateTest extends
		ActivityInstrumentationTestCase2<SplashScreenActivity> {

		
	private Solo solo;
	
	public SetDateTest() {
		super(SplashScreenActivity.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(),getActivity());
		
	}
	
	public void testadduser(){
		solo.assertCurrentActivity("erroronActivity", SplashScreenActivity.class);
		if(!solo.waitForActivity(MainActivity.class)){
			fail();
		}
		else{
			//Add a marker
			solo.clickLongOnScreen(200, 200);
			solo.clickOnButton("Yes");
			
			//Prepare for date test
			solo.enterText(0, "text");
	
		
			
			
			/*
			 * Picking not correct dates
			 * Part 1
			 */
			//Only one date then test
			solo.clickOnText("Set start date");
			solo.setDatePicker(0,2013,10,20);
			solo.clickOnButton("Set");
			
			solo.clickOnButton("Tag");
			solo.waitForDialogToOpen(1000);
			solo.clickOnButton("Ok");
			solo.waitForDialogToClose(1000);
			
			solo.clickOnButton("Cancel");
			
			//Add a marker 
			//Part 2
			solo.clickLongOnScreen(200, 200);
			solo.clickOnButton("Yes");
			
			//Prepare for date test
			solo.enterText(0, "text");
		
			//test only time
			solo.clickOnText("Set end time");
			solo.setTimePicker(0,15,50);
			solo.clickOnButton("Set");
			
			solo.clickOnButton("Tag");
			solo.waitForDialogToOpen(1000);
			solo.clickOnButton("Ok");
			solo.waitForDialogToClose(1000);
			
			//test starttime after end time
			solo.clickOnText("Set start time");
			solo.setTimePicker(0,16,00);
			solo.clickOnButton("Set");
			
			solo.clickOnText("Set start date");
			solo.setDatePicker(0,2013,10,20);
			solo.clickOnButton("Set");
			solo.clickOnText("Set end date");
			solo.setDatePicker(0,2013,10,20);
			solo.clickOnButton("Set");
			
			solo.clickOnButton("Tag");
			solo.waitForDialogToOpen(1000);
			solo.clickOnButton("Ok");
			solo.waitForDialogToClose(1000);
			
			
			solo.clickOnButton("Cancel");
			
			//Part 3
			solo.clickLongOnScreen(200, 200);
			solo.clickOnButton("Yes");
			
			//Prepare for date test
			solo.enterText(0, "text");
		
			//test enddate before startdate
			solo.clickOnText("Set start time");
			solo.setTimePicker(0,15,00);
			solo.clickOnButton("Set");
			
			solo.clickOnText("Set end time");
			solo.setTimePicker(0,15,50);
			solo.clickOnButton("Set");
			
			solo.clickOnText("Set start date");
			solo.setDatePicker(0,2013,10,20);
			solo.clickOnButton("Set");
			solo.clickOnText("Set end date");
			solo.setDatePicker(0,2013,10,18);
			solo.clickOnButton("Set");
			
			solo.clickOnButton("Tag");
			solo.waitForDialogToOpen(1000);
			solo.clickOnButton("Ok");
			solo.waitForDialogToClose(1000);

			solo.clickOnButton("Cancel");
			
			//Part 4
			solo.clickLongOnScreen(200, 200);
			solo.clickOnButton("Yes");
			solo.enterText(0, "text");
			
			//Allt samma
			solo.clickOnText("Set start date");
			solo.setDatePicker(0,2013,9,21);
			solo.clickOnButton("Set");
			
			solo.clickOnText("Set end date");
			solo.setDatePicker(0,2013,9,21);
			solo.clickOnButton("Set");
			
			solo.clickOnText("Set start time");
			solo.setTimePicker(0,16,00);
			solo.clickOnButton("Set");
			
			solo.clickOnText("Set end time");
			solo.setTimePicker(0,16,00);
			solo.clickOnButton("Set");
			
			solo.clickOnButton("Tag");
			solo.waitForDialogToOpen(1000);
			solo.clickOnButton("Ok");
			solo.waitForDialogToClose(1000);
			
			solo.clickOnButton("Cancel");
			
			//Part 5
			solo.clickLongOnScreen(200, 200);
			solo.clickOnButton("Yes");
			solo.enterText(0, "text");
			
			//Before now time SET DATE 
			solo.clickOnText("Set start date");
			solo.setDatePicker(0,2010,11,11);
			solo.clickOnButton("Set");
			
			solo.clickOnText("Set end date");
			solo.setDatePicker(0,2013,9,21);
			solo.clickOnButton("Set");
			
			solo.clickOnText("Set start time");
			solo.setTimePicker(0,16,00);
			solo.clickOnButton("Set");
			
			solo.clickOnText("Set end time");
			solo.setTimePicker(0,16,00);
			solo.clickOnButton("Set");
			
			solo.clickOnButton("Tag");
			solo.waitForDialogToOpen(1000);
			solo.clickOnButton("Ok");
			solo.waitForDialogToClose(1000);
			
			solo.clickOnButton("Cancel");
			
			//Part 6
			solo.clickLongOnScreen(200, 200);
			solo.clickOnButton("Yes");
			solo.enterText(0, "text");
			
			//Before now time TIME SET CURRENT DATE HERE AND TIME BEFORE NOW
			solo.clickOnText("Set start date");
			solo.setDatePicker(0,2013,4,30);
			solo.clickOnButton("Set");
			
			solo.clickOnText("Set end date");
			solo.setDatePicker(0,2013,4,30);
			solo.clickOnButton("Set");
			
			solo.clickOnText("Set start time");
			solo.setTimePicker(0,10,00);
			solo.clickOnButton("Set");
			
			solo.clickOnText("Set end time");
			solo.setTimePicker(0,16,00);
			solo.clickOnButton("Set");
			
			solo.clickOnButton("Tag");
			solo.waitForDialogToOpen(1000);
			solo.clickOnButton("Ok");
			solo.waitForDialogToClose(1000);
			
			solo.clickOnButton("Cancel");
			
		
	
		}
			
		}
	}


