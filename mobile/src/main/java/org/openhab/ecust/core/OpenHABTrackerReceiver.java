/*
 * Copyright (c) 2010-2016, openHAB.org and others.
 *
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhab.ecust.core;

public interface OpenHABTrackerReceiver {
    public void onOpenHABTracked(String baseUrl, String message);
    public void onError(String error);
    public void onBonjourDiscoveryStarted();
    public void onBonjourDiscoveryFinished();
}
