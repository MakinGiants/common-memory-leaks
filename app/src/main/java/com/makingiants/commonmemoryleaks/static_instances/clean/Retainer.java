package com.makingiants.commonmemoryleaks.static_instances.clean;

import android.support.v7.app.AppCompatActivity;
import java.lang.ref.WeakReference;

public class Retainer {
  WeakReference<AppCompatActivity> mActivity;

  public Retainer(AppCompatActivity activity) {
    mActivity = new WeakReference<AppCompatActivity>(activity);
  }
}
