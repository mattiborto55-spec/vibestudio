package com.vibestudio

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.PhotoLibrary
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Destinazioni principali mostrate nella bottom navigation bar.
 */
enum class TopLevelDestination(
    val route: String,
    val label: String,
    val icon: ImageVector,
) {
    HOME("home", "Studio", Icons.Filled.PhotoLibrary),
    TRENDS("trends", "Trend", Icons.Filled.TrendingUp),
    ;

    companion object {
        val entries get() = values().toList()
    }
}
