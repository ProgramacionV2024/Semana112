package com.jalfaro.semana12.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.jalfaro.semana12.database.entities.Mascota
import com.jalfaro.semana12.databinding.MascotaItemBinding

class MascotaAdapter(val list: ArrayList<Mascota>):
    RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder>() {
    class MascotaViewHolder(val binding: MascotaItemBinding): ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MascotaViewHolder(MascotaItemBinding
            .inflate(LayoutInflater.from(parent.context),parent, false))

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MascotaViewHolder, position: Int) {
        holder.binding.nombre.text = list.get(position).nombre
        holder.binding.raza.text = list.get(position).raza
    }

    fun loadNewItems(newList: List<Mascota>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }



}