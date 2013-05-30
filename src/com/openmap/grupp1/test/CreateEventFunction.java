package com.openmap.grupp1.test;


import com.jayway.android.robotium.solo.Solo;
import com.openmap.grupp1.MainActivity;
import com.openmap.grupp1.SplashScreenActivity;
import com.openmap.grupp1.helpfunctions.AddEventActivity;
import com.openmap.grupp1.helpfunctions.SearchTagActivity;

import android.test.ActivityInstrumentationTestCase2;

public class CreateEventFunction extends
		ActivityInstrumentationTestCase2<SplashScreenActivity> {

		
	private Solo solo;
	
	public CreateEventFunction() {
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
			//drag screen to focus map
			solo.drag(200, 240, 200, 240, 2);
			
			//Add tag
			solo.clickLongOnScreen(200, 200);
			solo.clickOnButton("Yes");
		
			//testwith no title
			solo.clickOnButton("Tag");
			solo.clickOnButton("Ok");
			
			//enter title and description and tag and time
			solo.enterText(0, "text");
			solo.enterText(1, "text2");
			
			solo.clickOnText("Set start date");
			solo.setDatePicker(0,2013,10,20);
			solo.clickOnButton("Set");
			
			solo.clickOnText("Set end date");
			solo.setDatePicker(0,2013,11,22);
			solo.clickOnButton("Set");
			
			solo.clickOnText("Set start time");
			solo.setTimePicker(0,10,00);
			solo.clickOnButton("Set");
			
			solo.clickOnText("Set end time");
			solo.setTimePicker(0,16,00);
			solo.clickOnButton("Set");
			
			
			solo.clickOnButton("Tag");
				
			//add a tag and continue
			solo.typeText(0,"text");
			solo.pressMenuItem(2);
			solo.clickInList(0, 0);
			solo.clickOnButton("Tag");

			
		}
			
		}
	}


