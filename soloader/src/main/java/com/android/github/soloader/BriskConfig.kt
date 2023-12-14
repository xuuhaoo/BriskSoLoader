package com.android.github.soloader

import com.android.github.soloader.inspector.LoadedInspector

open class BriskConfig(private val loadedClassLoader: ClassLoader) : LoadedInspector by DefaultBriskConfig(loadedClassLoader)