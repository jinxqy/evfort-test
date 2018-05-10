package com.weex.app.extend.comopnent;

import android.content.Context;
import android.support.annotation.NonNull;

import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapOptions;
import com.amap.api.maps.MapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.MyLocationStyle;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.dom.WXDomObject;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;

public class WXMap extends WXComponent<MapView> {
    public WXMap(WXSDKInstance instance, WXDomObject dom, WXVContainer parent) {
        super(instance, dom, parent);
    }

    public WXMap(WXSDKInstance instance, WXDomObject dom, WXVContainer parent, int type) {
        super(instance, dom, parent, type);
    }

    private MapView mMapView;
    @Override
    protected MapView initComponentHostView(@NonNull Context context) {
        mMapView = new MapView(context);
        mMapView.onCreate(null);
        AMap aMap = mMapView.getMap();
        UiSettings uiSettings = aMap.getUiSettings();
        uiSettings.setMyLocationButtonEnabled(true);
        uiSettings.setScaleControlsEnabled(true);
        uiSettings.setZoomControlsEnabled(true);
        uiSettings.setLogoPosition(AMapOptions.LOGO_POSITION_BOTTOM_LEFT);
        MyLocationStyle locationStyle = new MyLocationStyle();
        locationStyle.myLocationType(MyLocationStyle.LOCATION_TYPE_LOCATE);
        aMap.setMyLocationStyle(locationStyle);
        aMap.setMyLocationEnabled(true);
        return mMapView;
    }

    @Override
    public void onActivityCreate() {
        super.onActivityCreate();
        if (mMapView != null) {
            mMapView.onCreate(null);
        }
    }

    @Override
    public void onActivityDestroy() {
        super.onActivityDestroy();
        if (mMapView != null) {
            mMapView.onDestroy();
        }
    }

    @Override
    public void onActivityResume() {
        super.onActivityResume();
        if (mMapView != null) {
            mMapView.onResume();
        }
    }

    @Override
    public void onActivityPause() {
        super.onActivityPause();
        if (mMapView != null) {
            mMapView.onPause();
        }
    }
}
