package com.example.listingnews.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listingnews.R
import com.example.listingnews.model.GetAllNewsResponseItem
import kotlinx.android.synthetic.main.item_adapter_news.view.*

class AdapterNews(): RecyclerView.Adapter<AdapterNews.ViewHolder>() {
    private var newsData : List<GetAllNewsResponseItem>? = null

    fun setNewsList(newsList : List<GetAllNewsResponseItem>){
        this.newsData = newsList
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterNews.ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_adapter_news, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AdapterNews.ViewHolder, position: Int) {
        holder.itemView.tv_title_news.text = newsData!![position].title
        holder.itemView.tv_createat_news.text = newsData!![position].createdAt
        holder.itemView.tv_author_news.text = newsData!![position].author

        Glide.with(holder.itemView.context).load(newsData!![position].image).into(holder.itemView.iv_image_news)
    }

    override fun getItemCount(): Int {
        if (newsData == null){
            return 0
        }else{
            return newsData!!.size
        }
    }
}