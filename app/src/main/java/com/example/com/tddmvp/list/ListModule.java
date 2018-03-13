package com.example.com.tddmvp.list;

import dagger.Binds;
import dagger.Module;

@Module
public interface ListModule {
    @Binds ListContract.Presenter bindPresenter(Presenter presenter);

    @Binds ListContract.View bindView(ListActivity activity);
}
