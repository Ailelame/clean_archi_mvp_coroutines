package com.stormbirdmedia.cleanarchi.screen.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stormbirdmedia.cleanarchi.R
import com.stormbirdmedia.domain.model.BasicCrypto

class MainAdapter : RecyclerView.Adapter<BasicCryptoViewHolder>() {
    private val items = mutableListOf<BasicCrypto>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BasicCryptoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_rv_cell_basic_product, parent, false)
        return BasicCryptoViewHolder(view)
    }

    override fun onBindViewHolder(holder: BasicCryptoViewHolder, position: Int) {
        val item = items.getOrNull(position)
        item?.let {
            holder.bindItem(it)
        }
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    fun setItems(list: List<BasicCrypto>) {
        this.items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }
}