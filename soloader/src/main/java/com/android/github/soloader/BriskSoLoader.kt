package com.android.github.soloader

class BriskSoLoader(soName: String,private val config: BriskConfig = BriskConfig(BriskSoLoader::class.java.classLoader!!)) {

  private val prettyName: String = soName.let {
    var tmpName = it
    if (tmpName.startsWith("lib")) {
      tmpName = tmpName.substringAfter("lib")
    }
    if (tmpName.endsWith(".so")) {
      tmpName = tmpName.substringBefore(".so")
    }
    tmpName
  }

  fun isLoaded(): Boolean {
    return config.isLoaded(prettyName)
  }
}