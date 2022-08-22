package com.example.otabaadrian

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class IntentActivity : AppCompatActivity() {
    lateinit var Buttonsms:Button
    lateinit var Buttoncall:Button
    lateinit var Buttondial:Button
    lateinit var Buttoncamera:Button
    lateinit var Buttonmpesa:Button
    lateinit var Buttonshare:Button
    lateinit var Buttonemail:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        Buttonsms=findViewById(R.id.Btn_sms)
        Buttoncall=findViewById(R.id.Btn_call)
        Buttondial=findViewById(R.id.Btn_Dial)
        Buttoncamera=findViewById(R.id.Btn_Cam)
        Buttonmpesa=findViewById(R.id.Btn_Mpesa)
        Buttonshare=findViewById(R.id.Btn_Share)
        Buttonemail=findViewById(R.id.Btn_email)


        Buttonsms.setOnClickListener {
            val uri: Uri = Uri.parse("smsto:0717530637")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("Hello", "How are you doing")

            startActivity(intent)

        }
        Buttoncall.setOnClickListener {
            val uri = Uri.parse("smsto:YOUR_SMS_NUMBER")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("sms_body", "The SMS text")

            startActivity(intent)

        }
        Buttondial.setOnClickListener {
            val phone = "+34666777888"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)

        }
        Buttoncamera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takePictureIntent, 1)

        }
        Buttonshare.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            startActivity(shareIntent)

        }
        Buttonemail.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))

        }
        Buttonmpesa.setOnClickListener {

        }
    }
}