package com.android.github.soloader

import com.android.github.soloader.inspector.SoLoadedInspector
import com.android.github.soloader.inspector.LoadedInspector

class DefaultBriskConfig(loadedClassLoader: ClassLoader) : LoadedInspector by SoLoadedInspector.newInstance(loadedClassLoader)