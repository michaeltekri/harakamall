package com.tekri.harakamall.dta


import androidx.lifecycle.LiveData
import androidx.room.*
import com.tekri.harakamall.model.Product
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductDao {
    @Query("SELECT * FROM products")
    fun getAllProducts(): LiveData<List<Product>>

    @Insert
    suspend fun insertProduct(product: Product)

    @Update
    suspend fun updateProduct(product: Product)

    @Delete
    suspend fun deleteProduct(product: Product)
}