/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.pilight.internal;

import org.openhab.binding.pilight.internal.communication.Status;

/**
 * Callback interface to signal any listeners that an update was received from pilight
 *
 * @author Jeroen Idserda
 * @since 1.0
 */
public interface PilightConnectionCallback {

    /**
     * Message was received on a connection
     *
     * @param connection The connection to pilight that received the update
     * @param status Object containing list of devices that were updated and their current state
     */
    public void messageReceived(PilightConnection connection, Status status);

    /**
     * Connection to pilight was successfully set up
     *
     * @param connection The relevant connection to pilight
     */
    public void connected(PilightConnection connection);
}
