package com.android.github.soloader.inspector

import java.io.File

class SoLoadedInspector(loadedClassLoader: ClassLoader) : LoadedInspector {

  companion object {
    fun newInstance(loadedClassLoader: ClassLoader): SoLoadedInspector {
      return SoLoadedInspector(loadedClassLoader)
    }
  }

  override fun isLoaded(prettyName: String): Boolean {
    return checkOnFile(prettyName)
  }

  private fun checkOnFile(prettyName: String): Boolean {
    val maps = File("/proc/self/maps")
    var result = false
    maps.forEachLine {
      if (it.contains(prettyName)) {
        result = true
      }
    }
    return result
  }
}