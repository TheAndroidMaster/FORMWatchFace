/*
 * Copyright 2014 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.nurik.roman.formwatchface.common;

import android.app.IntentService;
import android.content.Intent;

public class ChangeConfigIntentService extends IntentService {
    public static final String EXTRA_THEME = "theme";

    public ChangeConfigIntentService() {
        super("ChangeConfigIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent.hasExtra(EXTRA_THEME)) {
            ConfigHelper helper = new ConfigHelper(this);
            helper.blockingPutTheme(intent.getStringExtra(EXTRA_THEME));
        }
    }
}