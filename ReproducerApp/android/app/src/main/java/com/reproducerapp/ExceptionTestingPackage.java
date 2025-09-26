package com.reproducerapp;

import androidx.annotation.NonNull;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;

import java.util.HashMap;
import java.util.Map;

public class ExceptionTestingPackage extends BaseReactPackage {
    @Override
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        if (name.equals(ExceptionTestingModule.NAME)) {
            return new ExceptionTestingModule(reactContext);
        } else {
            return null;
        }
    }

    @Override
    @NonNull
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() {
            @NonNull
            @Override
            public Map<String, ReactModuleInfo> getReactModuleInfos() {
                Map<String, ReactModuleInfo> map = new HashMap<>();
                map.put(ExceptionTestingModule.NAME, new ReactModuleInfo(
                        ExceptionTestingModule.NAME,
                        ExceptionTestingModule.NAME,
                        false,
                        false,
                        false,
                        true
                ));
                return map;
            }
        };
    }
}
