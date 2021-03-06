/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.ide.eclipse.ddms;

/**
 * Classes which implement this interface are able to open a source file based on the name
 * of a running Android application on a connected device.
 */
public interface ISourceRevealer {

    /**
     * Sent to reveal a particular line in a source editor
     * @param applicationName the name of the application running the source.
     * @param className the fully qualified class name
     * @param line the line to reveal
     * @return true if the source was revealed.
     */
    public boolean reveal(String applicationName, String className, int line);

}
