package test.devel.je.tmexample.ui.list.movies

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import test.devel.je.tmexample.R

class MovListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var mContext:Context? = null

    fun setContext(context: Context?) {
        mContext = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =LayoutInflater.from(parent.context)
                .inflate(R.layout.cell_movie, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolder).bind(mContext, position)
    }

    private class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        lateinit var title:TextView
        lateinit var desc:TextView

        init {
            itemView?.let {
                title = it.findViewById(R.id.txtTitle)
                desc = it.findViewById(R.id.txtDescript)
            }
        }

        fun bind(context:Context?, position: Int){
            title.text = "po = ${position}"
        }
    }

}