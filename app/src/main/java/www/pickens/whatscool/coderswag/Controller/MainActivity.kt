package www.pickens.whatscool.coderswag.Controller

import android.content.AbstractThreadedSyncAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import www.pickens.whatscool.coderswag.Model.Category
import www.pickens.whatscool.coderswag.R
import www.pickens.whatscool.coderswag.Services.DataService
import www.pickens.whatscool.coderswag.adapter.CatogeryAdapter
import www.pickens.whatscool.coderswag.adapter.categoryRecycleAdapter


class MainActivity : AppCompatActivity() {

    lateinit var  adapter: categoryRecycleAdapter

            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                //we are create adapter here

                adapter = categoryRecycleAdapter(this, DataService.Categories)

                catogoryListview.adapter = adapter
                val layoutManager = LinearLayoutManager(this)
                catogoryListview.layoutManager = layoutManager

                catogoryListview.setHasFixedSize(true)

    }
}
