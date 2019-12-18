package com.example.kankouapp2.ui.my_page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.kankouapp2.R;

public class My_pageFragment extends Fragment {

    private My_pageViewModel my_pageViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        my_pageViewModel =
                ViewModelProviders.of(this).get(My_pageViewModel.class);
        View root = inflater.inflate(R.layout.fragment_my_page, container, false);
        final TextView textView = root.findViewById(R.id.text_my_page);
        my_pageViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}