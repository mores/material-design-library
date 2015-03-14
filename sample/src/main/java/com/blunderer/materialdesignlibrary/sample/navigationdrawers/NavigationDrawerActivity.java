package com.blunderer.materialdesignlibrary.sample.navigationdrawers;

import android.content.Intent;

import com.blunderer.materialdesignlibrary.handlers.NavigationDrawerAccountsHandler;
import com.blunderer.materialdesignlibrary.handlers.NavigationDrawerAccountsMenuHandler;
import com.blunderer.materialdesignlibrary.handlers.NavigationDrawerBottomHandler;
import com.blunderer.materialdesignlibrary.handlers.NavigationDrawerTopHandler;
import com.blunderer.materialdesignlibrary.models.Account;
import com.blunderer.materialdesignlibrary.sample.R;
import com.blunderer.materialdesignlibrary.sample.listviews.ListViewFragment;
import com.blunderer.materialdesignlibrary.sample.viewpagers.ViewPagerActivity;
import com.blunderer.materialdesignlibrary.sample.viewpagers.ViewPagerFragment;
import com.blunderer.materialdesignlibrary.sample.viewpagers.ViewPagerWithTabsFragment;

public class NavigationDrawerActivity extends
        com.blunderer.materialdesignlibrary.activities.NavigationDrawerActivity {

    @Override
    protected NavigationDrawerAccountsHandler getNavigationDrawerAccountsHandler() {
        return null;
    }

    @Override
    protected NavigationDrawerAccountsMenuHandler getNavigationDrawerAccountsMenuHandler() {
        return null;
    }

    @Override
    protected void onNavigationDrawerAccountChange(Account account) {
    }

    @Override
    protected NavigationDrawerTopHandler getNavigationDrawerTopHandler() {
        return new NavigationDrawerTopHandler(this)
                .addSection(R.string.fragment)
                .addItem(R.string.fragment_listview, new ListViewFragment())
                .addItem(R.string.fragment_viewpager, new ViewPagerFragment())
                .addItem(R.string.fragment_viewpager_with_tabs, new ViewPagerWithTabsFragment())
                .addSection(R.string.activity)
                .addItem(R.string.start_activity,
                        new Intent(getApplicationContext(), ViewPagerActivity.class));
    }

    @Override
    protected NavigationDrawerBottomHandler getNavigationDrawerBottomHandler() {
        return new NavigationDrawerBottomHandler(this)
                .addSettings(null)
                .addHelpAndFeedback(null);
    }

    @Override
    protected boolean replaceActionBarTitleByNavigationDrawerItemTitle() {
        return true;
    }

    @Override
    protected int defaultNavigationDrawerItemSelectedPosition() {
        return 1;
    }

}
