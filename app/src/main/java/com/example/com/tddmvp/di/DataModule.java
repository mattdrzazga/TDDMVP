package com.example.com.tddmvp.di;

import com.example.com.tddmvp.list.DataSource;
import com.example.com.tddmvp.list.ListRepository;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public interface DataModule {
    @Binds
    @Singleton
    DataSource bindDataSource(ListRepository repository);
}
