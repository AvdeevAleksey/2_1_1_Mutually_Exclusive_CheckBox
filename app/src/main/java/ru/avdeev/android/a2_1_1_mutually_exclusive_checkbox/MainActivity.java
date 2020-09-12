package ru.avdeev.android.a2_1_1_mutually_exclusive_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextAmount;
    EditText editTextDescription;
    CheckBox checkBoxBank;
    CheckBox checkBoxMobile;
    CheckBox checkBoxCash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextAmount = findViewById(R.id.amountEditText);
        editTextDescription = findViewById(R.id.descriptionEditText);
        checkBoxBank = findViewById(R.id.bankCardCheckBox);
        checkBoxMobile = findViewById(R.id.mobileCheckBox);
        checkBoxCash = findViewById(R.id.cashCheckBox);
    }
}