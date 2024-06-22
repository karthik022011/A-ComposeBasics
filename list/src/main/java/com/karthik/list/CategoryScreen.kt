package com.karthik.list

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.karthik.list.composables.CategoryList


@Composable
fun CategoryScreen(){
    Surface{
        Column {
            CategoryList()
        }
    }
}



