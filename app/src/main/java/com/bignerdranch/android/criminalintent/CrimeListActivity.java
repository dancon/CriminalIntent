package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by John on 2016/12/14 0014.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFrament() {
        return new CrimeListFragment();
    }
}
