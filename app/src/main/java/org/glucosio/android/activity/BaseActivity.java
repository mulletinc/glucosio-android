package org.glucosio.android.activity;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.glucosio.android.util.SnackbarUtil;

/**
 * Created by luke on 24/01/17.
 */

public class BaseActivity extends AppCompatActivity {

    protected void showSnackBar(View parentView, String text, int length) {
        SnackbarUtil.showSnackBar(parentView, text, length);
    }

}
