package com.example.borcellecommunicationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class HomepageActivity : AppCompatActivity() {
    lateinit var cardaboutcompany:CardView
    lateinit var cardstaffdirectory:CardView
    lateinit var cardtrainingresources:CardView
    lateinit var cardnewsandupdates:CardView
    lateinit var cardsocialmedia:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        cardaboutcompany=findViewById(R.id.aboutcompany)
        cardstaffdirectory=findViewById(R.id.staffdirectory)
        cardtrainingresources=findViewById(R.id.trainingresources)
        cardnewsandupdates=findViewById(R.id.newsandupdates)
        cardsocialmedia=findViewById(R.id.socialmedia)

    }
}