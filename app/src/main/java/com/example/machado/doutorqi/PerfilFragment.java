package com.example.machado.doutorqi;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.*;
import android.widget.EditText;

/**
 * Created by igor on 29/06/15.
 */
public class PerfilFragment extends Fragment {
    // Store instance variables

    //private String title;
    //private int page;

    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    // newInstance constructor for creating fragment with arguments
    public static PerfilFragment newInstance(int page) {
        PerfilFragment fragmentPerfil = new PerfilFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        fragmentPerfil.setArguments(args);
        return fragmentPerfil;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);
        return view;
    }
}
