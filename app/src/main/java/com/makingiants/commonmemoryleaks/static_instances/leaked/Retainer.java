package com.makingiants.commonmemoryleaks.static_instances.leaked;

import android.support.v7.app.AppCompatActivity;

public class Retainer {
  AppCompatActivity mActivity;

  public Retainer(AppCompatActivity activity) {
    mActivity = activity;
  }
}
