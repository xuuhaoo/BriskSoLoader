package com.android.github.brisksoloader

class DefaultBriskConfig(loadedClassLoader: ClassLoader) : LoadedInspector {

  override fun isLoaded(): Boolean {
    return false
  }


}