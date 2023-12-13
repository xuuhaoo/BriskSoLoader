package com.android.github.brisksoloader

open class BriskConfig(val loadedClassLoader: ClassLoader) : LoadedInspector by DefaultBriskConfig(loadedClassLoader)