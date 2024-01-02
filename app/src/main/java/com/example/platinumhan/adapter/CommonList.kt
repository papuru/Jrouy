package com.example.platinumhan.adapter
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.Button
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.example.platinumhan.R
//import com.example.platinumhan.data.Cloth
//
//class CommonList(private val dataList: ArrayList<Cloth>): RecyclerView.Adapter<CommonList.ViewHolder>() {
//
//    inner class ViewHolder(listView: View): RecyclerView.ViewHolder(listView) {
//        val textView: TextView = listView.findViewById(R.id.textView)
//        val btnView: Button =  listView.findViewById(R.id.button)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view = LayoutInflater.from(parent.context)
//            .inflate(R.layout.list_item, parent, false)
//        return ViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val cl: Cloth = dataList[position]
//        holder.textView.text = cl.clothName
//        val button: Button = holder.btnView
//        button.text = cl.clothPrice
//    }
//
//    override fun getItemCount(): Int {
//        return dataList.size
//    }
//}