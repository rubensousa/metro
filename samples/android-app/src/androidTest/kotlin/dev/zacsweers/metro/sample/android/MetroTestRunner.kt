// Copyright (C) 2026 Zac Sweers
// SPDX-License-Identifier: Apache-2.0
package dev.zacsweers.metro.sample.android

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner

class MetroTestRunner : AndroidJUnitRunner() {

  override fun newApplication(cl: ClassLoader, name: String, context: Context): Application {
    return super.newApplication(cl, MetroTestApp::class.java.name, context)
  }
}
