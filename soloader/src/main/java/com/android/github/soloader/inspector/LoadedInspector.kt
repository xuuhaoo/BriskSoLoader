package com.android.github.soloader.inspector

interface LoadedInspector {
  fun isLoaded(prettyName: String): Boolean
}