package com.dodgejcr.sdxtools;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;


public class SdxtoolsActivity extends Activity {
	
    /** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);
	 
	    MyPagerAdapter adapter = new MyPagerAdapter();
	    ViewPager myPager = (ViewPager) findViewById(R.id.toolspager);
	    myPager.setAdapter(adapter);
	    myPager.setCurrentItem(0);
	}
private class MyPagerAdapter extends PagerAdapter {
    	
        public int getCount() {
            return 9;
        }
 
        public Object instantiateItem(View collection, int position) {
 
            LayoutInflater inflater = (LayoutInflater) collection.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
            int resId = 0;
            switch (position) {
            case 0:
                resId = R.layout.menu;
                break;
            case 1:
                resId = R.layout.phoneinfo;
                break;
            case 2:
                resId = R.layout.appremoval;
                break;
            case 3:
            	resId = R.layout.filemanager;
            	break;
            case 4:
            	resId = R.layout.scriptmanager;
            	break;
            case 5:
                resId = R.layout.logcat;
                break;
            case 6:
            	resId = R.layout.phonedump;
            	break;
            case 7:
            	resId = R.layout.root;
            	break;
            case 8: 
            	resId = R.layout.kernel;
            	break;          
            }
 
            View view = inflater.inflate(resId, null);
 
            ((ViewPager) collection).addView(view, 0);
 
            return view;
        }
 
        @Override
        public void destroyItem(View arg0, int arg1, Object arg2) {
            ((ViewPager) arg0).removeView((View) arg2);
 
        }
 
        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            return arg0 == ((View) arg1);
 
        }
 
        @Override
        public Parcelable saveState() {
            return null;
        }

		@Override
		public void finishUpdate(View arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void restoreState(Parcelable arg0, ClassLoader arg1) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void startUpdate(View arg0) {
			// TODO Auto-generated method stub
			
		}
		
}
}