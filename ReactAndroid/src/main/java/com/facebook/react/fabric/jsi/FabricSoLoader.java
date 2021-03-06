/**
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * <p>This source code is licensed under the MIT license found in the LICENSE file in the root
 * directory of this source tree.
 */
package com.facebook.react.fabric.jsi;

import static com.facebook.systrace.Systrace.TRACE_TAG_REACT_JAVA_BRIDGE;

import com.facebook.soloader.SoLoader;
import com.facebook.systrace.Systrace;

public class FabricSoLoader {
  private static boolean sDidInit = false;

  public static void staticInit() {
    if (sDidInit) {
      return;
    }
    sDidInit = true;

    Systrace.beginSection(
        Systrace.TRACE_TAG_REACT_JAVA_BRIDGE, "FabricSoLoader.staticInit::load:fabricjni");
    SoLoader.loadLibrary("fabricjni");
    Systrace.endSection(TRACE_TAG_REACT_JAVA_BRIDGE);
  }
}
