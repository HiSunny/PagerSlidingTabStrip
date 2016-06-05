package sunny.example.lianpagerslidingtabstrip;

//import android.support.v7.app.ActionBarActivity;
import com.astuetz.PagerSlidingTabStrip;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
		viewPager.setAdapter(new myPagerAdapter(getSupportFragmentManager()));
		PagerSlidingTabStrip tabs = (PagerSlidingTabStrip)findViewById(R.id.pagerSlidingTabStrip);
		//PagerSlidingTabStrip°ó¶¨ViewPager
		tabs.setViewPager(viewPager);
	}
	
	class myPagerAdapter extends FragmentPagerAdapter{

		String[] title = {"item1","item2","item3"};
		BlueFragment blueFragment;
		GreenFragment greenFragment;
		OrangeFragment orangeFragment;
		
		public myPagerAdapter(FragmentManager fm) {
			super(fm);
			// TODO Auto-generated constructor stub
		}
		@Override
		public Fragment getItem(int position) {
			// TODO Auto-generated method stub
			switch(position){
			case 0:
				blueFragment = new BlueFragment();
				return blueFragment;
			case 1:
				greenFragment = new GreenFragment();
				return greenFragment;
			case 2:
				orangeFragment = new OrangeFragment();
				return orangeFragment;
			default:
				return null;
			}
			
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return title.length;
		}
		
		@Override  
        public CharSequence getPageTitle(int position) {  
            return title[position];  
        }  
	}

	
}
