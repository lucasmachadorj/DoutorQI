package com.example.machado.doutorqi;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.*;

/**
 * Created by igor on 29/06/15.
 */
public class PerfilFragment extends Fragment {



    // newInstance constructor for creating fragment with arguments
    public static PerfilFragment newInstance() {
        PerfilFragment fragmentPerfil = new PerfilFragment();
        Bundle args = new Bundle();
        fragmentPerfil.setArguments(args);
        return fragmentPerfil;
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
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);
        return view;
    }
}
