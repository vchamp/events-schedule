package com.vm.dazntask.core.ui.model

data class UiEvent(
    val id: String,
    val title: String,
    val subtitle: String,
    val date: String,
    val imageUrl: String,
    val videoUrl: String?
)
