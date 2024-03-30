package com.example.prova01.ui.elementos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ElementosViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ElementosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is elementos fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}