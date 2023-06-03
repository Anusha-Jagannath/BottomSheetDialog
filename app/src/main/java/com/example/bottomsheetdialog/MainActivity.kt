package com.example.bottomsheetdialog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.bottomsheetdialog.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submit.setOnClickListener {
            showBottomSheetDialog()
        }
    }

    private fun showBottomSheetDialog() {
        val bottomSheetDialog = BottomSheetDialog(this, R.style.BottomSheetTheme)
        val view = LayoutInflater.from(this).inflate(R.layout.layout_bottom_sheet_dialog, null)

        val button = view.findViewById<Button>(R.id.submitBtn)
        val item1 = view.findViewById<TextView>(R.id.shareTv)
        val item2 = view.findViewById<TextView>(R.id.commentTv)
        val item3 = view.findViewById<TextView>(R.id.programmingTv)

        item1.setOnClickListener {
            Toast.makeText(this, "item1 is clicked", Toast.LENGTH_SHORT).show()
        }

        item2.setOnClickListener {
            Toast.makeText(this, "item2 is clicked", Toast.LENGTH_SHORT).show()
        }

        item3.setOnClickListener {
            Toast.makeText(this, "item3 is clicked", Toast.LENGTH_SHORT).show()
        }
        button.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }

        bottomSheetDialog.setContentView(view)
        bottomSheetDialog.show()
    }
}