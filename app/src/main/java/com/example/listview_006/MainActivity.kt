package com.example.listview_006

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Instant

class MainActivity : AppCompatActivity() {

    val titleArr = arrayOf("แครอท","แตงกวา","ขมิ้น","ผักกาดขาว","พริก"
                           ,"มะนาว","กระเทียม","กระเพรา","ถั่วงอก","มะระกอ")

    val priceArr = arrayOf(20,10,10,30,15,20,25,5,15,35,34)
    val context = this

    public final val KEY_TITLE = "TITLE"
    public final val KEY_SESULT = "RESULT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("รายการผัก")

        val mAdp = ArrayAdapter(context,android.R.layout.simple_list_item_1,titleArr)
        lv_result.adapter = mAdp

        lv_result.setOnItemClickListener { parent, view, position, id ->

         //   Toast.makeText(context," ชื่อผัก ${titleArr[position]}",Toast.LENGTH_LONG).show()
            val goPageResult = Intent(context,SecondActivity::class.java)

            goPageResult.putExtra(KEY_TITLE,titleArr[position])
            goPageResult.putExtra(KEY_SESULT,priceArr[position])

            startActivity(goPageResult)

        }
    }
}
