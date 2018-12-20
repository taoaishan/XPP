package tv.danmaku.ijk.media.example.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import tv.danmaku.ijk.media.example.R;
import tv.danmaku.ijk.media.example.application.AppActivity;
import tv.danmaku.ijk.media.example.fragments.SampleMediaListFragments;

public class SecActivity extends AppActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Fragment newFragment = SampleMediaListFragments.newInstance();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.body, newFragment);
        transaction.commit();
    }


}
