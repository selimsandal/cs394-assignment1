package com.example.assignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.assignment1.data.Item
import com.google.android.material.textview.MaterialTextView

class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val item = intent.getParcelableExtra<Item>("item")
        item?.let {
            findViewById<MaterialTextView>(R.id.name_text).text = it.name
            findViewById<MaterialTextView>(R.id.role_text).text = it.role
            findViewById<MaterialTextView>(R.id.location_text).text = it.location
        }
    }
}
