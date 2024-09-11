package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id:Long =0L,
    @ColumnInfo(name = "wish-title")
    val title:String= " ",
    @ColumnInfo(name = "wish-desc")
    val description:String=" "
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch 2", description = "An android watch made by google"),
        Wish(title = "watch ultra 2", description = "An ios watch made by apple"),
        Wish(title = "Samsung", description = "An android watch made by Samsung"),
        Wish(title = "cmf by nothing", description = "An Android watch made by apple")

    )
}
