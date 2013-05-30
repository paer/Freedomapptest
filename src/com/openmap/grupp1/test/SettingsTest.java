package com.openmap.grupp1.test;


import com.jayway.android.robotium.solo.Solo;
import com.openmap.grupp1.MainActivity;
import com.openmap.grupp1.SplashScreenActivity;
import com.openmap.grupp1.helpfunctions.SearchTagActivity;
import com.openmap.grupp1.helpfunctions.SettingsActivity;

import android.test.ActivityInstrumentationTestCase2;
/*
 * Test the settings
 * 
 */
public class SettingsTest extends
		ActivityInstrumentationTestCase2<SplashScreenActivity> {

		
	private Solo solo;
	
	public SettingsTest() {
		super(SplashScreenActivity.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(),getActivity());
		
	}
	
	
	public void testmaps(){
		if(!solo.waitForActivity(MainActivity.class)){
			fail();
		}
		//Test to turn on and off notifications
		for(int i = 0; i < 2; i++){
			solo.drag(200, 240, 200, 240, 2);
			solo.pressMenuItem(1);
			if(!solo.waitForActivity(SettingsActivity.class)){
				fail();
			}
				if(solo.searchToggleButton("OFF")){
					solo.clickOnToggleButton("OFF");
				}
				else{
					solo.clickOnToggleButton("ON");
				}
				solo.assertCurrentActivity("Fel", SettingsActivity.class);
				solo.clickOnButton("Apply");
				
			if(!solo.waitForActivity(MainActivity.class)){
				fail();
			}}
			
			
			
/*
 * Test all maptypes
 */
		if(!solo.waitForActivity(MainActivity.class)){
			fail();
		}
		else{
			solo.drag(200, 240, 200, 240, 2);
			solo.pressMenuItem(1);
			if(!solo.waitForActivity(SettingsActivity.class)){
				fail();
			}
			else{
				for(int i = 0; i < 5; i++){
			
				solo.pressSpinnerItem(0, i);
				solo.clickOnButton("Apply");
				if(!solo.waitForActivity(MainActivity.class)){
					fail();
				}
				else{
					solo.pressMenuItem(1);
					
					
					
					
					if(!solo.waitForActivity(SettingsActivity.class)){
						fail();
					}}}
					

					
		

		}
			
		}}
	}


