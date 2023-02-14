package com.example.testpushfirebase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.common.internal.Objects
import com.google.android.gms.tasks.Task
import com.google.firebase.messaging.FirebaseMessaging


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getFirebaseMessagingToken()

    }
    fun getFirebaseMessagingToken() {
        FirebaseMessaging.getInstance().token
            .addOnCompleteListener { task: Task<String?> ->
                if (!task.isSuccessful) {
                    //Could not get FirebaseMessagingToken
                    return@addOnCompleteListener
                }
                if (null != task.result) {
                    //Got FirebaseMessagingToken
                   // val firebaseMessagingToken: String = (task.result)
                    //Use firebaseMessagingToken further
                }
            }
    }
}