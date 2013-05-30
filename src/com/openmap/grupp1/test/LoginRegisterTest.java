package com.openmap.grupp1.test;


import com.jayway.android.robotium.solo.Solo;
import com.openmap.grupp1.LoginRegisterActivity;
import com.openmap.grupp1.MainActivity;
import com.openmap.grupp1.SplashScreenActivity;

import android.test.ActivityInstrumentationTestCase2;

public class LoginRegisterTest extends
		ActivityInstrumentationTestCase2<SplashScreenActivity> {
/*
 * Test to login and fail, afterwards it register and fail.
 * In the end it register
 * 
 */
		
	private Solo solo;
	
	public LoginRegisterTest() {
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
			
			if(!solo.waitForActivity(LoginRegisterActivity.class)){
				fail();
			}
			else{
				//tries to log in without an account
				solo.enterText(0, "Test");
				solo.enterText(1, "Test");
				solo.clickOnButton(0);
				//Click ok on popup
				solo.clickOnButton("Ok");
				solo.waitForDialogToClose(1000);
				//Tries to register instead 
				solo.clickOnText("Missing account?");
				solo.enterText(0, "Test");
				solo.enterText(1, "Test");
				solo.clickOnButton(0);
				//due the account already exist the user can't register
				solo.waitForDialogToOpen(1000);
				solo.clickOnButton(0);
				solo.waitForDialogToClose(1000);
				//Enter some new text ( Change here to be able to register)
				solo.enterText(0, "Test");
				solo.enterText(1, "Test");
				solo.clickOnButton(0);
					if(!solo.waitForActivity(MainActivity.class)){
						fail();
					}
					else{
						solo.assertCurrentActivity("ErrorLoadingSearch", MainActivity.class);

		}
			
		}}}}
	}


