package org.glucosio.android.util;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by luke on 24/01/17.
 */

public class SnackbarUtil {

    public static void showSnackBar(View rootLayout, String message, int length, String... messageArgs) {
        Snackbar.make(rootLayout, String.format(message, messageArgs), length).show();
    }

}
