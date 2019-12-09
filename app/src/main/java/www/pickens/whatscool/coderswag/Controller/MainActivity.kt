package www.pickens.whatscool.coderswag.Controller

import android.content.AbstractThreadedSyncAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import www.pickens.whatscool.coderswag.Model.Category
import www.pickens.whatscool.coderswag.R
import www.pickens.whatscool.coderswag.Services.DataService
import www.pickens.whatscool.coderswag.adapter.CatogeryAdapter


class MainActivity : AppCompatActivity() {

    lateinit var  adapter: CatogeryAdapter

            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                adapter = CatogeryAdapter(this, DataService.Categories)

                catogoryListview.adapter = adapter
//
//              catogoryListview.setOnItemClickListener { parent, view, position, l->
//                  var category = DataService.Categories[position]
//                 Toast.makeText(this, "You click me ${category.title} cell",Toast.LENGTH_SHORT).show()
//              }

    }
}
