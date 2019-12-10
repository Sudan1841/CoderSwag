package www.pickens.whatscool.coderswag.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.ViewFlipper
import www.pickens.whatscool.coderswag.Model.Category
import www.pickens.whatscool.coderswag.R
import java.math.MathContext

class CatogeryAdapter(context:Context, categories:List<Category>):BaseAdapter() {

    val context = context
    val categories = categories





    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        var holder: ViewHolder
        if (convertView==null){
            categoryView =LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder=ViewHolder()

           holder.categoryImage= categoryView.findViewById(R.id.Categoryimage)
           holder.categoryName =  categoryView.findViewById(R.id.catogeryName)

            println("I exit for first time")
            categoryView.tag=holder

        }else{
            holder= convertView.tag as ViewHolder
            categoryView =convertView
            println("go green, recycle!")
        }


        //2@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


        val category= categories[position]
        val  resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)

       holder. categoryName?.text = category.title

        return  categoryView

    }


    override fun getItem(position: Int): Any {
        return categories[position]

    }
    /**
     * Get the row id associated with the specified position in the list.
     *
     * @param position The position of the item within the adapter's data set whose row id we want.
     * @return The id of the item at the specified position.
     */
    override fun getItemId(position: Int): Long {
        return 0
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * How many items are in the data set represented by this Adapter.
     *
     * @return Count of items.
     */
    override fun getCount(): Int {
        return  categories.count()
    }
    private class ViewHolder{
       var categoryImage: ImageView? = null
        var categoryName: TextView? = null

    }
}