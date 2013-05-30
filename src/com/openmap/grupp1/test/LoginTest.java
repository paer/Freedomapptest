package com.openmap.grupp1.test;


import com.jayway.android.robotium.solo.Solo;
import com.openmap.grupp1.LoginRegisterActivity;
import com.openmap.grupp1.MainActivity;
import com.openmap.grupp1.SplashScreenActivity;
import com.openmap.grupp1.helpfunctions.SearchTagActivity;

import android.test.ActivityInstrumentationTestCase2;

public class LoginTest extends
		ActivityInstrumentationTestCase2<SplashScreenActivity> {

		/*
		 * Login test
		 */
	private Solo solo;
	
	public LoginTest() {
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
			if(!solo.waitForActivity(LoginRegisterActivity.class)){
				fail();
			}
			else{
			solo.assertCurrentActivity("ErrorLoadingSearch", LoginRegisterActivity.class);
			
	
				//Logs in with an accound and succed
				solo.enterText(0, "Adam");
				solo.enterText(1, "1234");
				solo.clickOnButton(0);
					if(!solo.waitForActivity(MainActivity.class)){
						fail();
					}
					else{
						solo.assertCurrentActivity("ErrorLoadingSearch", MainActivity.class);}
					
		

		
			
		}
	}
		}}

