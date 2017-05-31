package cn.net.john.kotlindemo.kts.activity

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Zrzc on 2017/5/25.
 */
class ForecastListAdapter(val items: List<String>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        holder.textView.text = items.get(position)
        holder.textView.text = items[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return ViewHolder(TextView(parent.context))
    }

    override fun getItemCount(): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return items.size
    }


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView) {

    }
}