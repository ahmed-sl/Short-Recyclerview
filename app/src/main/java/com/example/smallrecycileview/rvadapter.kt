package com.example.smallrecycileview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class rvadapter (val lis:ArrayList<String>):RecyclerView.Adapter<rvadapter.ItemHold>() {
    class ItemHold (itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHold {

        return ItemHold(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ItemHold, position: Int) {

        val name = lis[position]

        holder.itemView.apply {
            mass.text = name
        }

    }

    override fun getItemCount() = lis.size


}