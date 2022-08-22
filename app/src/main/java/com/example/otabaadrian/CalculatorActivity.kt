package com.example.otabaadrian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Buttonadd:Button
    lateinit var Buttonsub:Button
    lateinit var Buttonmult:Button
    lateinit var Buttondiv:Button
    lateinit var firstnumber:EditText
    lateinit var secondnumber:EditText
    lateinit var textanswer:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        Buttonadd=findViewById(R.id.Btn_Add)
        Buttonsub=findViewById(R.id.Btn_Sub)
        Buttonmult=findViewById(R.id.Btn_Mult)
        Buttondiv=findViewById(R.id.Btn_Div)
        firstnumber=findViewById(R.id.Edt_fnum)
        secondnumber=findViewById(R.id.Edt_snum)
        textanswer=findViewById(R.id.txt_Answer)

        Buttonadd.setOnClickListener {
            var firstnum=firstnumber.text.toString()
            var secondnum=secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                textanswer.text="please enter all the inputs"
            }else{
                var answer=firstnum.toDouble()+secondnum.toDouble()
                textanswer.text=answer.toString()
            }
        }
        Buttonsub.setOnClickListener {
            var firstnum=firstnumber.text.toString()
            var secondnum=secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                textanswer.text="please enter all the inputs"
            }else{
                var answer=firstnum.toDouble()-secondnum.toDouble()
                textanswer.text=answer.toString()
            }
        }
        Buttonmult.setOnClickListener {
            var firstnum=firstnumber.text.toString()
            var secondnum=secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                textanswer.text="please enter all the inputs"
            }else{
                var answer=firstnum.toDouble()*secondnum.toDouble()
                textanswer.text=answer.toString()
            }
        }
        Buttondiv.setOnClickListener {
            var firstnum=firstnumber.text.toString()
            var secondnum=secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                textanswer.text="please enter all the inputs"
            }else{
                var answer=firstnum.toDouble()/secondnum.toDouble()
                textanswer.text=answer.toString()
            }
        }

    }
}