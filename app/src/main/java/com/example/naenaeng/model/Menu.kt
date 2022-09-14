package com.example.naenaeng.model

import com.google.firebase.firestore.PropertyName

data class Menu (
        val name:String = "",
        val title:String = "",
        val index:String = "",
        @get:PropertyName("additional ingredients") @set:PropertyName("additional ingredients")
        var additionalIngredients:String = "",
        @get:PropertyName("essential ingredients") @set:PropertyName("essential ingredients")
        var essentialIngredients:String = "",
        val ImageName:String = "",
        val step:String = ""
)