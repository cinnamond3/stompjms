/**
 * Copyright (C) 2010-2011, FuseSource Corp.  All rights reserved.
 *
 *     http://fusesource.com
 *
 * The software in this package is published under the terms of the
 * CDDL license a copy of which has been included with this distribution
 * in the license.txt file.
 */

package org.fusesource.stompjms.util;


/**
 * A simple callback object
 *
 * @param <T>
 * @version $Revision: 1.2 $
 */
public interface Callback<T> {

    /**
     * Executes some piece of code
     *
     * @param t
     */
    void execute(T t);
}
