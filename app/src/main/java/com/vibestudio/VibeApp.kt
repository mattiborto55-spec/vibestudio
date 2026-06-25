package com.vibestudio

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Application entry point. Inizializza Hilt per la dependency injection
 * su tutta l'app (repository, API client, use case).
 */
@HiltAndroidApp
class VibeApp : Application()
