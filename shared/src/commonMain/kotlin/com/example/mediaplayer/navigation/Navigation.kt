package com.example.mediaplayer.navigation

import androidx.compose.runtime.compositionLocalOf
import com.example.mediaplayer.model.VideoModel

interface Navigation {
    fun back(): Boolean
    fun backToRoot(): Boolean

    fun goToVideoPlayerScreen(currentVideo: VideoModel): Boolean
}

val LocalNavigation = compositionLocalOf<Navigation> { error("navigation failure") }