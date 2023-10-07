package mx.edu.isc.tesoem.mml.actividad_7s21;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipalActivity extends AppCompatActivity {

    Spinner lista;
    ImageView imagenest;
    List<String> Milista = new ArrayList<>(Arrays.asList("","Yucatan", "Guerrero", "Chiapas", "Sonora", "Guanajuato"));
    ArrayAdapter<String> adaptador;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        imagenest = findViewById(R.id.barraes);
        Milista.add("Estado de Mexico");

        imagenest = findViewById(R.id.imagenest);

        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Milista);
        lista.setAdapter(adaptador);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String valor = adapterView.getItemAtPosition(i).toString();
                if (i == 1) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(imagenest).load("https://drive.google.com/uc?export=download&id=1IdUzwAOqM35NEMnfhYSaMKO06W-3iLns").into(imagenest);
                } else if (i == 2) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(imagenest).load("https://drive.google.com/uc?export=download&id=1whD12-pB9xcCVFZo-9k9nKIJrclyMjO4").into(imagenest);
                } else if (i == 3) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(imagenest).load("https://drive.google.com/uc?export=download&id=1FDqetM56W4WW3lsrvrPLJ5kP2s0u4Dyp").into(imagenest);
                } else if (i == 4) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(imagenest).load("https://drive.google.com/uc?export=download&id=1T-hXSIIupG8EFDh5iLb7M7no8L3CP0sv").into(imagenest);
                } else if (i == 5) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(imagenest).load("https://drive.google.com/uc?export=download&id=1fyVmaZ8y0aIKIctDNoXrrq_5B_1wL_-6").into(imagenest);
                } else if (i == 6) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(imagenest).load("https://drive.google.com/uc?export=download&id=1gSIK2kKmGuEXgnkgflryHVIEcZLuF6-2").into(imagenest);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}