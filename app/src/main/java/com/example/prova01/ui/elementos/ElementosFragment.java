package com.example.prova01.ui.elementos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.prova01.databinding.FragmentElementosBinding;

public class ElementosFragment extends Fragment {

    private FragmentElementosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ElementosViewModel galleryViewModel =
                new ViewModelProvider(this).get(ElementosViewModel.class);

        binding = FragmentElementosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textElementos;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}