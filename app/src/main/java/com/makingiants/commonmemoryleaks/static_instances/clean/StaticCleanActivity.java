package com.makingiants.commonmemoryleaks.static_instances.clean;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.makingiants.commonmemoryleaks.R;

public class StaticCleanActivity extends AppCompatActivity {
  // Because this remains with the activity reference there should be a memory leak
  static Retainer mRetainer;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.static_leaked_activity);
    setResult(Activity.RESULT_OK);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    mRetainer = new Retainer(this);
  }
}
