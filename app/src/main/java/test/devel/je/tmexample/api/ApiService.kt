package test.devel.je.tmexample.api

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import test.devel.je.tmexample.data.Movies

interface ApiService {
    @GET("discover/movie")
    fun movieLists(@Path("api_key") key:String,
                   @Path("language") ln:String,
                   @Path("sort_by") sort:String,
                   @Path("include_adult") inAdult:String,
                   @Path("include_video") inVideo:String,
                   @Path("page") page:Int) : Observable<Movies>
}