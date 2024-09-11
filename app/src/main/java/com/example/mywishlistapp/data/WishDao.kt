package com.example.mywishlistapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WishDao {

    //on conflict is used for methods for if the same wish is added again
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun addAWish(wishEntity: Wish)

    //it is used to display all the wishes in the list
    //Flow is used for live data changes
    @Query("Select * from `wish-table`")
    abstract fun getAllWishes():Flow<List<Wish>>

    @Update
    abstract suspend fun updateAWish(wishEntity: Wish)

    @Delete
    abstract suspend fun deleteAWish(wishEntity: Wish)


    @Query("Select * from `wish-table` where id=:id")
    abstract fun getAWishById(id:Long):Flow<Wish>


}