package com.example.prova01.ui.separacao;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.prova01.databinding.FragmentSeparacaoBinding;

public class SeparacaoFragment extends Fragment {

    private FragmentSeparacaoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SeparacaoViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SeparacaoViewModel.class);

        binding = FragmentSeparacaoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSeparacao;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}