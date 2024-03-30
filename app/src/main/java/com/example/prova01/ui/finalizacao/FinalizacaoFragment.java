package com.example.prova01.ui.finalizacao;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.prova01.databinding.FragmentElementosBinding;
import com.example.prova01.databinding.FragmentFinalizacaoBinding;

public class FinalizacaoFragment extends Fragment {

    private FragmentFinalizacaoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FinalizacaoViewModel galleryViewModel =
                new ViewModelProvider(this).get(FinalizacaoViewModel.class);

        binding = FragmentFinalizacaoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFinalizacao;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}