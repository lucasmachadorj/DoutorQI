package com.example.machado.doutorqi;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;

/**
 * Created by igor on 29/06/15.
 */
public class PerfilFragment extends Fragment {
    // Store instance variables
    private String title;
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static PerfilFragment newInstance(int page, String title) {
        PerfilFragment fragmentPerfil = new PerfilFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentPerfil.setArguments(args);
        return fragmentPerfil;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);
        /*TextView tvLabel = (TextView) view.findViewById(R.id.tvLabel);
        tvLabel.setText(page + " -- " + title);*/
        return view;
    }
}
