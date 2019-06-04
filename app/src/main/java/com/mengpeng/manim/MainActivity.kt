package com.mengpeng.manim

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.coderdream.anim.MAnim
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            MAnim.getInstance()
                .with(imageView)
                .scaleXY(2000, 1f, 3f, 1f)
                .call {

                }
                .alpha(2000, 1f, 0.1f, 1f)
                .call {

                }
                .rotationX(2000, 0f, 360f, 0f)
                .call {

                }
                .rotationY(2000, 0f, 360f, 0f)
                .call {

                }
                .rotationXY(2000, 0f, 360f, 0f)
                .call {

                }
                .rotation(2000, 0f, 720f, 0f)
                .call {

                }
                .translationX(2000, 0f, 300f, -300f, 0f)
                .translationY(2000, 0f, 300f, -300f, 0f)
                .translationXY(2000, 0f, 300f, -300f, 0f)
                .translationYX(2000, 0f, -300f, 300f, 0f)
                .start()
        }

        button2.setOnClickListener {
            MAnim.getInstance()
                .with(imageView)
                .scaleXY(4000, 1f, 2f, 1f, 3f, 1f)
                .start()
            MAnim.getInstance()
                .with(imageView)
                .alpha(4000, 1f, 0.5f, 1f, 0.1f, 1f)
                .start()
            MAnim.getInstance()
                .with(imageView)
                .translationXY(2000, 0f, 300f, 0f, -300f, 0f)
                .start()
            MAnim.getInstance()
                .with(imageView)
                .translationYX(2000, 2000, 0f, -300f, 0f, 300f, 0f)
                .start()
            MAnim.getInstance()
                .with(imageView)
                .rotation(4000, 0f, 720f, 0f, 720f)
                .start()
        }
    }
}
