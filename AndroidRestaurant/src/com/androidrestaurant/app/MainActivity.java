
package com.androidrestaurant.app;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;

public class MainActivity
    extends SherlockActivity
    implements TabListener
{

    private TextView hello;
    private String[] locations;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello = ((TextView) findViewById(R.id.hello));
        locations = getResources().getStringArray(R.array.locations);
        configureActionBar();
    }

    private void configureActionBar() {
        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        for (String location: locations) {
            Tab tab = getSupportActionBar().newTab();
            tab.setText(location);
            tab.setTabListener(this);
            getSupportActionBar().addTab(tab);
        }
    }

    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater();
        return true;
    }
    @Override
 public void onTabUnselected(Tab tab, FragmentTransaction ft) {}@Override
public void onTabReselected(Tab tab, FragmentTransaction ft) {}
}
