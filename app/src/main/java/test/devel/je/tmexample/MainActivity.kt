package test.devel.je.tmexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import test.devel.je.tmexample.api.ApiManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // test : discover/movie?api_key=${apikey}&language=en-US&sort_by=popularity
        // .desc&include_adult=false&include_video=false&page=1
//        ApiManager.service().movieLists()
    }
}
