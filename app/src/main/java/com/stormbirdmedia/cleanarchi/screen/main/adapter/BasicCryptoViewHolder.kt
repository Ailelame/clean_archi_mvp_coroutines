package com.stormbirdmedia.cleanarchi.screen.main.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.stormbirdmedia.cleanarchi.application.src
import com.stormbirdmedia.cleanarchi.databinding.MainRvCellBasicProductBinding
import com.stormbirdmedia.domain.model.BasicCrypto

class BasicCryptoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

  val binding = MainRvCellBasicProductBinding.bind(view)

    fun bindItem(crypto : BasicCrypto){
        binding.icon.src(crypto.imageUrl)
        binding.label.text = crypto.name
    }
}