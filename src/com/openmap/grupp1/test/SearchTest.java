package com.openmap.grupp1.test;


import com.jayway.android.robotium.solo.Solo;
import com.openmap.grupp1.MainActivity;
import com.openmap.grupp1.R;
import com.openmap.grupp1.SplashScreenActivity;
import com.openmap.grupp1.helpfunctions.SearchTagActivity;

import android.test.ActivityInstrumentationTestCase2;


/*
 * Test search and adds filters for the markers
 */
public class SearchTest extends
		ActivityInstrumentationTestCase2<SplashScreenActivity> {

		
	private Solo solo;
	
	public SearchTest() {
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
			
			solo.drag(200, 240, 200, 240, 2);
			//Searchbutton
			solo.pressMenuItem(2);
			
			solo.assertCurrentActivity("ErrorLoadingSearch", SearchTagActivity.class);
			if(!solo.waitForActivity(SearchTagActivity.class)){
				fail();
			}
			else{
			//Tries to type , add ,remove and presses filter button
			solo.typeText(0,"bad");
			solo.clickInList(0,0);
			solo.typeText(0,"test");
			solo.clickInList(0,1);
			solo.pressMenuItem(2);
			solo.clickInList(0,0);
			solo.pressMenuItem(0);
		
			
			if(!solo.waitForActivity(MainActivity.class)){
				fail();
			}
			else{
			solo.pressMenuItem(0);}}
			
			
			
			

		}
			
		}
	}


