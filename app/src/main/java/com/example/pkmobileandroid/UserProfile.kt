package com.example.myapp

data class UserProfile(
    val userId: String = "",
    val email: String = "",
    val displayName: String = "",
    val phoneNumber: String = "",

) {

    constructor() : this("", "", "", "")


    fun toMap(): Map<String, Any> {
        return mapOf(
            "userId" to userId,
            "email" to email,
            "displayName" to displayName,
            "phoneNumber" to phoneNumber
        )
    }

    companion object {

        fun fromMap(map: Map<String, Any>): UserProfile {
            return UserProfile(
                userId = map["userId"] as? String ?: "",
                email = map["email"] as? String ?: "",
                displayName = map["displayName"] as? String ?: "",
                phoneNumber = map["phoneNumber"] as? String ?: ""
            )
        }
    }
}