package org.d3if4011.matauangconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import org.d3if4011.matauangconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener { idrToUSD() }
        binding.button2.setOnClickListener { idrToYen() }
        binding.button3.setOnClickListener { idrToEuro()}
    }

    private fun idrToUSD() {
        val jumlahUang = binding.jumlahUangInp.text.toString()
        if (TextUtils.isEmpty(jumlahUang)) {
            Toast.makeText(this, "Masukan jumlah uang.", Toast.LENGTH_LONG).show()
            return
        }
        val usd = jumlahUang.toFloat() / 14300

        binding.hasil.text = getString(R.string.hasil_x, usd)
    }

    private fun idrToYen() {
        val jumlahUang = binding.jumlahUangInp.text.toString()
        if (TextUtils.isEmpty(jumlahUang)) {
            Toast.makeText(this, "Masukan jumlah uang.", Toast.LENGTH_LONG).show()
            return
        }
        val yen = jumlahUang.toFloat() / 117

        binding.hasil.text = getString(R.string.hasil_x, yen)
    }

    private fun idrToEuro() {
        val jumlahUang = binding.jumlahUangInp.text.toString()
        if (TextUtils.isEmpty(jumlahUang)) {
            Toast.makeText(this, "Masukan jumlah uang.", Toast.LENGTH_LONG).show()
            return
        }
        val euro = jumlahUang.toFloat() / 15900

        binding.hasil.text = getString(R.string.hasil_x, euro)
    }
}