package com.uninpahu.operaciones;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.digitalandroidweb.operaciones.R;
import com.uninpahu.operaciones.Login.HomeActivity;

public class PrimerFragmento extends Fragment implements NavigationView.OnNavigationItemSelectedListener {
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.primer_fragment, container, false);
        Button btn = (Button) myView.findViewById(R.id.primer_boton);
        //Button inv = (Button) myView.findViewById(R.id.invi);
       // inv.setClickable(false);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getActivity(), HomeActivity.class);
                startActivity(i);
            }
        });


        return myView;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
