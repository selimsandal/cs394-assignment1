package com.example.assignment1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment1.R
import com.example.assignment1.data.Item
import com.google.android.material.textview.MaterialTextView

class ItemAdapter(
    private val items: List<Item>,
    private val onClick: (Item) -> Unit
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { onClick(item) }
    }

    override fun getItemCount(): Int = items.size

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameText: MaterialTextView = itemView.findViewById(R.id.name_text)
        private val roleText: MaterialTextView = itemView.findViewById(R.id.role_text)
        private val locationText: MaterialTextView = itemView.findViewById(R.id.location_text)

        fun bind(item: Item) {
            nameText.text = item.name
            roleText.text = item.role
            locationText.text = item.location
        }
    }
}
