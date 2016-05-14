package com.makingiants.commonmemoryleaks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.makingiants.commonmemoryleaks.static_instances.clean.StaticCleanActivity;
import com.makingiants.commonmemoryleaks.static_instances.leaked.StaticLeakedActivity;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.activityStaticLeakButton)
  void activityStaticLeakButton() {
    startActivity(StaticLeakedActivity.class);
  }

  @OnClick(R.id.activityStaticCleanButton)
  void activityStaticCleanButton() {
    startActivity(StaticCleanActivity.class);
  }

  private void startActivity(Class<? extends AppCompatActivity> activity) {
    startActivityForResult(new Intent(this, activity), 0);
  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (resultCode == Activity.RESULT_OK) {
      makeText(this, "Wait some seconds to see if leak canary got something!", LENGTH_LONG).show();
    }
  }
}
