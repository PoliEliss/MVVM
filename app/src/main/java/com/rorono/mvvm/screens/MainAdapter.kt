package com.rorono.mvvm.screens

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rorono.mvvm.R
import com.rorono.mvvm.models.AppNote

class MainAdapter : RecyclerView.Adapter<MainAdapter.MainHolder>() {

    private var mListNotes = emptyList<AppNote>()

    inner class MainHolder(view: View) : RecyclerView.ViewHolder(view) {

        val nameNote: TextView = view.findViewById(R.id.textViewItemNoteName)
        val textNote: TextView = view.findViewById(R.id.textViewItemNoteText)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.note_item, parent, false)
        return MainHolder(view)

    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.textNote.text = mListNotes[position].text
        holder.nameNote.text = mListNotes[position].name
    }

    override fun getItemCount(): Int {
        return mListNotes.size
    }

    fun setList(list: List<AppNote>) {

        mListNotes = list
        notifyDataSetChanged()

    }
}