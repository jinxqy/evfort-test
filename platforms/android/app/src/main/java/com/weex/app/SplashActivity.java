package com.weex.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.MyLocationStyle;


public class SplashActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);

    View textView = findViewById(R.id.fullscreen_content);
    ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
    RotateAnimation rotateAnimation = new RotateAnimation(0f, 360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);

    AnimationSet animationSet = new AnimationSet(false);
    animationSet.addAnimation(scaleAnimation);
    animationSet.addAnimation(rotateAnimation);
    animationSet.setDuration(1500);

    animationSet.setAnimationListener(new Animation.AnimationListener() {
      @Override
      public void onAnimationStart(Animation animation) {
      }

      @Override
      public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(SplashActivity.this, WXPageActivity.class);
        Uri data = getIntent().getData();
        if (data != null) {
          intent.setData(data);
        }
        intent.putExtra("from", "splash");
        startActivity(intent);
        finish();
      }

      @Override
      public void onAnimationRepeat(Animation animation) {
      }
    });
    textView.startAnimation(animationSet);
//    loadMap(savedInstanceState);
  }

  private MapView mMapView;
  private AMap mAMap;
  private UiSettings mUiSettings;
  private void loadMap(Bundle savedInstanceState) {
    setContentView(R.layout.layout_map_test);

    mMapView = findViewById(R.id.mv_test_map);
    mMapView.onCreate(savedInstanceState);
    mAMap = mMapView.getMap();
    mUiSettings = mAMap.getUiSettings();
    mUiSettings.setMyLocationButtonEnabled(true);

    MyLocationStyle locationStyle = new MyLocationStyle();
    locationStyle.showMyLocation(true);
    locationStyle.myLocationType(MyLocationStyle.LOCATION_TYPE_LOCATE);
    mAMap.setMyLocationStyle(locationStyle);
    mAMap.setMyLocationEnabled(true);
  }

  @Override
  protected void onResume() {
    super.onResume();
    if (mMapView != null) {
      mMapView.onResume();
    }
  }

  @Override
  protected void onPause() {
    super.onPause();
    if (mMapView != null) {
      mMapView.onPause();
    }
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    if (mMapView != null) {
      mMapView.onDestroy();
    }
  }
}
