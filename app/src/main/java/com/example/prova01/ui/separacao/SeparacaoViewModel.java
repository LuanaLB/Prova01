package com.example.prova01.ui.separacao;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SeparacaoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SeparacaoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is separação fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}