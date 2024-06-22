package com.karthik.list.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.karthik.list.model.Category


@Composable
fun CategoryItem(category: Category) {
    Text(text = category.name)
}