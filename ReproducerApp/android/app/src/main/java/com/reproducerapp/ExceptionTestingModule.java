package com.reproducerapp;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.testing.nativeexception.NativeExceptionTestSpec;

public class ExceptionTestingModule extends NativeExceptionTestSpec {
    public static final String NAME = "NativeExceptionTest";

    public ExceptionTestingModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }

    @Override
    public boolean nonVoidFunction() {
        throw new RuntimeException("Exception handled in Javascript");
    }

    @Override
    public void voidFunction() {
        throw new RuntimeException("Exception crashes app");
    }
}