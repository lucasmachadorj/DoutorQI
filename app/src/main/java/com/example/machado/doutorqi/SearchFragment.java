package com.example.machado.doutorqi;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by igor on 29/06/15.
 */
public class SearchFragment extends Fragment {

    // newInstance constructor for creating fragment with arguments
    public static SearchFragment newInstance() {
        SearchFragment fragmentSearch = new SearchFragment();
        Bundle args = new Bundle();
        fragmentSearch.setArguments(args);
        return fragmentSearch;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        /*TextView tvLabel = (TextView) view.findViewById(R.id.tvLabel);
        tvLabel.setText(page + " -- " + title);*/
        return view;
    }
}
