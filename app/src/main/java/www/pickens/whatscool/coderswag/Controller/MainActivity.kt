package www.pickens.whatscool.coderswag.Controller

import android.content.AbstractThreadedSyncAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import www.pickens.whatscool.coderswag.Model.Category
import www.pickens.whatscool.coderswag.R
import www.pickens.whatscool.coderswag.Services.DataService


class MainActivity : AppCompatActivity() {

    lateinit var  adapter: ArrayAdapter<Category>

            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                adapter = ArrayAdapter(this,
                    android.R.layout.simple_list_item_1,
                   DataService.Categories)

                catogoryListview.adapter = adapter
    }
}
