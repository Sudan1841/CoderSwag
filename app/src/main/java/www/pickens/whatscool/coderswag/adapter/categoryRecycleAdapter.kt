package www.pickens.whatscool.coderswag.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
//import androidx.core.R
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.category_list_item.*
import kotlinx.android.synthetic.main.category_list_item.view.*
import www.pickens.whatscool.coderswag.Model.Category
import www.pickens.whatscool.coderswag.R

class categoryRecycleAdapter(val context: Context, val categories: List<Category>): RecyclerView.Adapter<categoryRecycleAdapter.Holder>() {



    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(categories[position], context)

        //To change body of created functions use File | Settings | File Templates.

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.category_list_item, parent, false)
        return Holder(view)

        //To change body of created functions use File | Settings | File Templates.

    }

    override fun getItemCount(): Int {
       //To change body of created functions use File | Settings | File Templates.
        return categories.count()
    }



    inner  class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
//        val categoryImage= itemView.findViewById<ImageView>(R.id.categoryImage)
//        val  categoryName = itemView.findViewById<TextView>(R.id.)


        val categoryImage = itemView.findViewById<ImageView>(R.id.Categoryimage)
        val categoryName =itemView.findViewById<TextView>(R.id.catogeryName)


        fun bindCategory(category: Category, context: Context){
            val resourceId = context.resources.getIdentifier(category.image,
                "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text= category.title
        }

    }
}