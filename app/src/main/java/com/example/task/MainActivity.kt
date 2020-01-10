package com.example.task

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RecoverySystem
import android.widget.ProgressBar
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var counter:Int = 10

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ProgressBar>(R.id.progress_bar_id).setProgress(15, true)

        done_btn.setOnClickListener {
            counter+=100/7
            IncProgress()
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun IncProgress()
    {
        var ProgressShow:Int = 49
        var UserProgress:Int = counter

        var progressBar = findViewById<ProgressBar>(R.id.progress_bar_id).also {
            it.setProgress(UserProgress,true)
            if(UserProgress>=100)
            {
                resetProgress()
            }
        }


    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun resetProgress()
    {
        counter=10
        findViewById<ProgressBar>(R.id.progress_bar_id).setProgress(15, true)

    }


}
