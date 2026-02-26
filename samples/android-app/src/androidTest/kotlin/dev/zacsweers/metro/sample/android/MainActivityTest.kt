// Copyright (C) 2026 Zac Sweers
// SPDX-License-Identifier: Apache-2.0
package dev.zacsweers.metro.sample.android

import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class MainActivityTest {

  private val tracker = FakeTrackerBindings.tracker

  @Test
  fun incrementButtonClickEventIsTracked() {
    // given
    launchActivity<MainActivity>()

    // when
    Espresso.onView(withId(R.id.increment_button)).perform(click())

    // then
    assertThat(tracker.increments).isEqualTo(1)
  }
}
