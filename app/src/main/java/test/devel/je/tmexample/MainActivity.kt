package test.devel.je.tmexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.util.Log
import org.jetbrains.anko.find
import test.devel.je.tmexample.api.ApiManager
import test.devel.je.tmexample.ui.list.movies.MovListAdapter

class MainActivity : AppCompatActivity() {
    lateinit var recycler:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(R.layout.fragment_list)
        recycler = this.find(R.id.recycler)

        ApiManager.service().movieLists(BuildConfig.API_KEY, "en-US",
                "popularity.desc", "false", "false", 1)
                .subscribe({
                    Log.d("DEBUG101", "title : ${it.original_title}")
                }, {})

        val movAdapter = MovListAdapter()
        movAdapter.setContext(this.applicationContext)
        recycler.adapter = movAdapter
    }
}
