package com.example.praktikum3

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Inisialisasi Widget
        val etNama = findViewById<EditText>(R.id.etNama)
        val rgGender = findViewById<RadioGroup>(R.id.rgGender)
        val cbMembaca = findViewById<CheckBox>(R.id.cbMembaca)
        val cbCoding = findViewById<CheckBox>(R.id.cbCoding)
        val cbOlahraga = findViewById<CheckBox>(R.id.cbOlahraga)
        val btnTampilkan = findViewById<Button>(R.id.btnTampilkan)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        // 2. Set Listener Tombol
        btnTampilkan.setOnClickListener {
            val nama = etNama.text.toString().trim()

            if (nama.isEmpty()) {
                etNama.error = "Nama tidak boleh kosong"
                Toast.makeText(this, "Nama tidak boleh kosong!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else {
                etNama.error = null
            }

            val selectedGenderId = rgGender.checkedRadioButtonId
            if (selectedGenderId == -1) {
                Toast.makeText(this, "Jenis kelamin harus dipilih!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val selectedGender = findViewById<RadioButton>(selectedGenderId).text.toString()

            val hobbies = mutableListOf<String>()
            if (cbMembaca.isChecked) hobbies.add(cbMembaca.text.toString())
            if (cbCoding.isChecked) hobbies.add(cbCoding.text.toString())
            if (cbOlahraga.isChecked) hobbies.add(cbOlahraga.text.toString())

            val hobiText = if (hobbies.isEmpty()) "Tidak ada" else hobbies.joinToString(", ")

            val hasil = buildString {
                append("Nama    : $nama\n")
                append("Kelamin : $selectedGender\n")
                append("Hobi    : $hobiText")
            }
            tvHasil.text = hasil
        }
    }
}