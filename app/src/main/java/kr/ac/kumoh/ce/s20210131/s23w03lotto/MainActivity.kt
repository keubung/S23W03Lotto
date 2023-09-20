package kr.ac.kumoh.ce.s20210131.s23w03lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.ce.s20210131.s23w03lotto.databinding.ActivityMainBinding
import kotlin.random.Random

//class는 접근지정자 지정안하면 private struct는 public
class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.btnGenerate.setOnClickListener{
            main.num1.text = Random.nextInt(1, 46).toString()
            main.num2.text = Random.nextInt(1, 46).toString()
            main.num3.text = Random.nextInt(1, 46).toString()
            main.num4.text = Random.nextInt(1, 46).toString()
            main.num5.text = Random.nextInt(1, 46).toString()
            main.num6.text = Random.nextInt(1, 46).toString()
        }
    }
}