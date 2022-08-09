package br.edu.ifsp.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import br.edu.ifsp.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(activityMainBinding.getRoot());

        spinner = findViewById(activityMainBinding.spinner.getId());

        spinner.setAdapter(new ArrayAdapter<UF>(
                this, android.R.layout.simple_spinner_item, UF.values()));

        activityMainBinding.btnSalvar.setOnClickListener(
                view -> {
                    String nomeCompleto = activityMainBinding.inputNomeCompleto.toString();
                    String telefone = activityMainBinding.inputTelefone.toString();
                    String email = activityMainBinding.inputEmail.toString();
                    boolean listado = false;
//                    boolean listado = activityMainBinding.ckListaEmail.getSele;
                    String sexo = "Masculino";
//                    String sexo = activityMainBinding.inputTelefone.toString();
                    String cidade = activityMainBinding.inputCidade.toString();
                    String uf = activityMainBinding.spinner.getSelectedItem().toString();

                    Formulario formulario = new Formulario(nomeCompleto, telefone, email, listado, sexo, cidade, uf);

                    Toast.makeText(this, formulario.toString(), Toast.LENGTH_LONG).show();

                    System.out.println(formulario);
                }
        );
    }
}