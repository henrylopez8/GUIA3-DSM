package sv.edu.udb.dsm.guia3.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void llamarActividad(View v)
    {
        Intent llamar = new Intent(this,login_with_relativeLayout.class);
        startActivity(llamar);
    }

}