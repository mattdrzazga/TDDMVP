package com.example.com.tddmvp.di;

import com.example.com.tddmvp.list.ListActivity;
import com.example.com.tddmvp.list.ListModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface ActivityBindingModule {
    @ContributesAndroidInjector(modules = ListModule.class)
    ListActivity listActivity();
}
