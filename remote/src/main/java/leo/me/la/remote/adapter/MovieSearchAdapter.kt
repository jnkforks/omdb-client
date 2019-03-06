package leo.me.la.remote.adapter

import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.ToJson
import leo.me.la.exception.OmdbErrorException
import leo.me.la.remote.model.RemoteMovieModel
import leo.me.la.remote.model.RemoteMovieSearchModel
import java.rmi.UnexpectedException

internal class MovieSearchAdapter {
    @FromJson
    fun fromJson(
        reader: JsonReader,
        movieAdapter: JsonAdapter<RemoteMovieModel>
    ): RemoteMovieSearchModel {
        val result = mutableListOf<RemoteMovieModel>()
        var totalResults = 0
        reader.apply {
            beginObject()
            while (hasNext()) {
                when(nextName()) {
                    "Search" -> {
                        beginArray()
                        while(hasNext()) {
                            movieAdapter.fromJson(this)?.let {
                                result.add(it)
                            }
                        }
                        endArray()
                    }
                    "totalResults" -> {
                        totalResults = nextInt()
                    }
                    "Error" -> {
                        val errorMessage = nextString()
                        endObject()
                        throw OmdbErrorException(errorMessage)
                    }
                    else -> skipValue()
                }
            }
            endObject()
            if (result.size == 0 || totalResults == 0) {
                throw UnexpectedException("Response misses field(s)")
            }
            return RemoteMovieSearchModel(result, totalResults)
        }
    }

    @Suppress("Unused", "UNUSED_PARAMETER")
    @ToJson
    fun toJson(
        writer: JsonWriter,
        content: RemoteMovieSearchModel?
    ) {
        throw UnsupportedOperationException("Cannot deserialize RemoteMovieSearchModel")
    }
}
