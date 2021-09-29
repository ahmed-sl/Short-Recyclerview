package com.example.smallrecycileview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var rcv : RecyclerView
    lateinit var input : EditText
    lateinit var add : Button
    lateinit var names : ArrayList<String>
    lateinit var cl : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcv = findViewById(R.id.rv)
        input = findViewById(R.id.entname)
        add = findViewById(R.id.btn)
        cl = findViewById(R.id.cl)


        names = ArrayList()

        rcv.adapter = rvadapter(names)
        rcv.layoutManager = LinearLayoutManager(this)




        add.setOnClickListener {
             val name = input.text.toString()
            if (name.isNotEmpty()){
                names.add(name)
                input.text.clear()
                input.clearFocus()
            }else{

                Snackbar.make(cl,"Pleas Enter some name",Snackbar.LENGTH_SHORT).show()

            }
            rcv.adapter?.notifyDataSetChanged()


        }


    }
}