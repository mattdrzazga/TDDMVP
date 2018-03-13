package com.example.com.tddmvp.di;

import android.content.Context;

import com.example.com.tddmvp.app.MyApplication;

import dagger.Binds;
import dagger.Module;

@Module
public interface AppModule {

    @Binds
    Context bindContext(MyApplication application);
}
