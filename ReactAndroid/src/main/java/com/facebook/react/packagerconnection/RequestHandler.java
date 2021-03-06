/**
 * Copyright (c) 2015-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.packagerconnection;

import javax.annotation.Nullable;

public interface RequestHandler {
  void onRequest(@Nullable Object params, Responder responder);
  void onNotification(@Nullable Object params);
}
