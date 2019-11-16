package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buNumberEvent(view:View){

        if(isNew == true){
            display.setText("")
        }
        isNew = false
        //val EntryData = display.text
        val buSelect = view as Button
        var Number:String = display.text.toString()
        when(buSelect.id){
            zero.id->{
                Number += "0"
            }
            one.id->{
                Number += "1"

            }
            two.id->{
                Number += "2"
            }
            three.id->{
                Number += "3"
            }
            four.id->{
                Number += "4"
            }
            five.id->{
                Number += "5"
            }
            six.id->{
                Number += "6"
            }
            seven.id->{
                Number += "7"
            }
            eight.id->{
                Number += "8"
            }
            nine.id->{
                Number += "9"
            }
            dot.id->{
                Number += "."
            }
            plusMinus.id->{
                Number = "-"+ Number
            }
            plus.id ->{



            }
            minus.id->{

            }

        }
        display.setText(Number)

    }

var operation = "+"
var oldNumber = ""
    var isNew = true

    fun OperationEvent(view:View){

        val buSelect = view as Button
        oldNumber = display.text.toString()


        when(buSelect.id){
            plus.id ->{
                operation = "+"

            }
            minus.id ->{
                operation = "-"
            }
            divide.id->{
                operation = "/"
            }
            multiply.id->{
                operation = "*"
            }


        }
        isNew = true
    }
    fun equalOp(view:View){

        val newNumber = display.text.toString()
        var result:Double? = null

        when(operation){
            "+"->{
                result = newNumber.toDouble() + oldNumber.toDouble()

            }
            "-"->{
                result = newNumber.toDouble() - oldNumber.toDouble()

            }
            "/"->{
                result = newNumber.toDouble() / oldNumber.toDouble()

            }
            "*"->{
                result = newNumber.toDouble() * oldNumber.toDouble()

            }
        }
        display.setText(result.toString())
        isNew = true
    }

    fun buPercent(view:View){

        val num = display.text.toString().toDouble() /100

        display.setText(num.toString())
        isNew = true


    }
    fun clear(view: View){

        //val buSelect: Button = view as Button

        display.setText("0")
        isNew = true


    }

}
