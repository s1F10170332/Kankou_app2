package com.example.kankouapp2.ui.my_page;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class My_pageViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public My_pageViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}