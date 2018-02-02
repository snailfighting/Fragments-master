package com.example.vv.fragments;

import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

   // Fragment titles = new TitleFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(String url){
        FragmentManager fm = getSupportFragmentManager();
       WebFragment webFragment = (WebFragment) fm.findFragmentById(R.id.tf);
        webFragment.show(url);
    }
//        if (getResources().getConfiguration().orientation ==
//                Configuration.ORIENTATION_LANDSCAPE) {
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .add(R.id.left, titles)
//                    .add(R.id.right, new WebFragment())
//                    .commit();
//        } else {
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .add(R.id.main, titles)
//                    .commit();
//        }
//    }
//        void show(String url){
//             WebFragment fragment = new WebFragment();
//             Bundle bundle = new Bundle();
//             bundle.putString("url", url);
//             fragment.setArguments(bundle);
//        if (getResources().getConfiguration().orientation ==
//                Configuration.ORIENTATION_LANDSCAPE){
//               getSupportFragmentManager().beginTransaction().replace(R.id.right, fragment)
//               .commit();
//        }
//        else{
//                getSupportFragmentManager().
//                        beginTransaction().
//                        replace(R.id.main, fragment).
//                        addToBackStack(null).commit();
//        }
//
    }



