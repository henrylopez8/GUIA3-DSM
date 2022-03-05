package sv.edu.udb.dsm.guia3.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class login_with_relativeLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_with_relative_layout);
    }

    public void finalizarActividad(View v)
    {
        finish();
    }
}