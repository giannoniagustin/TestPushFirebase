package com.example.testpushfirebase

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseInstanceIDService : FirebaseMessagingService() {
    private val TAG = "MyFirebaseIIDService"
    override fun onNewToken(token: String) {
        Log.d(TAG, "Refreshed token: $token")

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // FCM registration token to your app server.
      //  sendRegistrationToServer(token)
    }
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        // ...
        Log.d(TAG, "From: ${remoteMessage.from}")
    }

}