package br.edu.ifsp.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import br.edu.ifsp.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(activityMainBinding.getRoot());

        Spinner spinner = findViewById(activityMainBinding.spinner.getId());

        spinner.setAdapter(new ArrayAdapter<UF>(
                this, android.R.layout.simple_spinner_item, UF.values()));

        activityMainBinding.btnSalvar.setOnClickListener(
                view -> {
                    String nomeCompleto = activityMainBinding.inputNomeCompleto.getText().toString();
                    String telefone = activityMainBinding.inputTelefone.getText().toString();
                    String email = activityMainBinding.inputEmail.getText().toString();
                    boolean listado = activityMainBinding.ckListaEmail.isChecked();
                    String sexo = activityMainBinding.radioSexoFeminino.isChecked() ? "Feminino" : "Masculino";
                    String cidade = activityMainBinding.inputCidade.getText().toString();
                    String uf = activityMainBinding.spinner.getSelectedItem().toString();

                    Formulario formulario = new Formulario(nomeCompleto, telefone, email, listado, sexo, cidade, uf);

                    Toast.makeText(this, formulario.toString(), Toast.LENGTH_LONG).show();
                }
        );

        activityMainBinding.btnLimpar.setOnClickListener(
                view -> {
                    activityMainBinding.inputNomeCompleto.getText().clear();
                    activityMainBinding.inputTelefone.getText().clear();
                    activityMainBinding.inputEmail.getText().clear();
                    activityMainBinding.ckListaEmail.setChecked(false);
                    activityMainBinding.radioGroup.clearCheck();
                    activityMainBinding.inputCidade.getText().clear();
                    activityMainBinding.spinner.setAdapter(new ArrayAdapter<UF>(
                            this, android.R.layout.simple_spinner_item, UF.values()));
                }
        );
    }
}