package com.example.mobile_profile.ui.home

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.mobile_profile.R

class HomeViewModel : ViewModel() {

    // Compose-friendly state
    val profileCardContent: MutableState<ProfileCardData> = mutableStateOf(
        ProfileCardData(
            name = "Raihan Firmansyah",
            location = "📍 Malang, Indonesia",
            bio = "I am a backend engineer currently working at Govtech Procurement by Telkom Indonesia, proficient in Golang, Node.js, PostgreSQL, MySQL, MongoDB, and GitHub Actions. With a keen interest in machine learning, I strive to innovate and deliver efficient solutions that drive digital transformation in the public sector.",
            imageRes = R.drawable.raihan
        )
    )
}

// Data class to hold profile info
data class ProfileCardData(
    val name: String,
    val location: String,
    val bio: String,
    val imageRes: Int
)
