package com.malkinfo.addinformationfirebase.model

import com.google.firebase.database.Exclude

data class Product(
    var tenSP:String? = null,
    var giaSP: Float? = null,
    var anhSP:String? = null,
    var loaiSP:String? = null,
    @get:Exclude
    @set:Exclude
    var key:String? = null

)