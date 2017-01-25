package org.glucosio.android.activity;

import android.support.annotation.LayoutRes;

import butterknife.ButterKnife;

/**
 * Created by luke on 24/01/17.
 */

public class BoundActivity extends BaseActivity {

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }
}
