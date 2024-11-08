package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment1.data.Item
import com.example.assignment1.ui.ItemAdapter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = listOf(
            Item("John Doe", "Software Engineer", "San Francisco"),
            Item("Jane Smith", "Product Manager", "New York"),
            Item("Michael Brown", "Designer", "Los Angeles"),
            Item("Emily Davis", "QA Engineer", "Seattle")
        )

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemAdapter(items) { item ->
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("item", item)
            }
            startActivity(intent)
        }
    }
}
