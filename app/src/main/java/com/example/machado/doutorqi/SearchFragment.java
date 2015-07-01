package com.example.machado.doutorqi;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

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

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        try {
            Spinner spinner = (Spinner) getActivity().findViewById(R.id.especialidades_spinner);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                    getActivity(),R.array.especialidades_array, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
        } catch (Exception e) {
            Toast.makeText(getActivity(), e.toString(), 1).show();
        }

        try {
            Spinner spinner = (Spinner) getActivity().findViewById(R.id.planos_spinner);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                    getActivity(),R.array.planos_array, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
        } catch (Exception e) {
            Toast.makeText(getActivity(), e.toString(), 1).show();
        }
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
