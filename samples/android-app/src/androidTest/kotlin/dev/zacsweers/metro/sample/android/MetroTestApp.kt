// Copyright (C) 2026 Zac Sweers
// SPDX-License-Identifier: Apache-2.0
package dev.zacsweers.metro.sample.android

import dev.zacsweers.metro.createDynamicGraphFactory

class MetroTestApp : MetroApp() {

  override fun createGraph(): AppGraph {
    return createDynamicGraphFactory<AppGraph.Factory>(FakeTrackerBindings).create(this)
  }
}
