package com.example.prova01.ui.finalizacao;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FinalizacaoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FinalizacaoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is finalização fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}