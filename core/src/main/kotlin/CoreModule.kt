/*
 * Copyright (C) 2018 The Tachiyomi Open Source Project
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package tachiyomi.core

import tachiyomi.core.os.AndroidAppState
import tachiyomi.core.os.AppState
import tachiyomi.core.util.AndroidCoroutineDispatchers
import tachiyomi.core.util.CoroutineDispatchers
import toothpick.ktp.binding.bind
import toothpick.ktp.binding.module
import toothpick.ktp.binding.toClass

val CoreModule = module {

  bind<AppState>().toClass<AndroidAppState>().singleton()
  bind<CoroutineDispatchers>().toClass<AndroidCoroutineDispatchers>().singleton()

}