package com.example.com.tddmvp.list;

import android.support.annotation.NonNull;

import java.util.List;

public interface DataSource {
    void getData(@NonNull Callback callback);

    interface Callback {
        void onDataLoaded(@NonNull List<String> data);
    }
}
