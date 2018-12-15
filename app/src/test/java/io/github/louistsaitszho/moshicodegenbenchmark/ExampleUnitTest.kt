package io.github.louistsaitszho.moshicodegenbenchmark

import com.squareup.moshi.Moshi
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun blockchainExchangeRate() {
        val exchangeRateAdapter = ExchangeRateJsonAdapter(Moshi.Builder().build())
        var totalTime: Long = 0
        jsonStrings.forEach {
            val startTime = System.currentTimeMillis()
            val exchangeRate = exchangeRateAdapter.fromJson(it)
            val endTime = System.currentTimeMillis()
            val mills = endTime - startTime
            totalTime += mills
        }
        println("It took $totalTime ms to parse all of the json")
    }
}
