/*
 *
 *    Copyright (c) 2011 bitstrings.org - Pino Silvaggio
 *
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v1.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.bitstrings.eclipse.m2e.common;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;

public final class JavaProjectHelper
{
    private JavaProjectHelper() {}

    public static int indexOfPath(IPath path, IClasspathEntry... classpathEntries)
    {
        for (int i = 0; i < classpathEntries.length; i++)
        {
            if (classpathEntries[i].getPath().equals(path))
            {
                return i;
            }
        }

        return -1;
    }

    public static boolean containsPath(IPath path, IClasspathEntry... classpathEntries)
    {
        return (indexOfPath(path, classpathEntries) > -1);
    }
}
