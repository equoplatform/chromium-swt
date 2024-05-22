/****************************************************************************
**
** Copyright (C) 2024 Equo
**
** This file is part of Equo Chromium.
**
** Commercial License Usage
** Licensees holding valid commercial Equo licenses may use this file in
** accordance with the commercial license agreement provided with the
** Software or, alternatively, in accordance with the terms contained in
** a written agreement between you and Equo. For licensing terms
** and conditions see https://www.equo.dev/terms.
**
** GNU General Public License Usage
** Alternatively, this file may be used under the terms of the GNU
** General Public License version 3 as published by the Free Software
** Foundation. Please review the following
** information to ensure the GNU General Public License requirements will
** be met: https://www.gnu.org/licenses/gpl-3.0.html.
**
****************************************************************************/


package org.cef;

import java.lang.reflect.InvocationTargetException;

public interface WindowingToolkit {

    public static final int DEFAULT_LOOP_TIME = 1000 / 30;

    CefClient createClient();
    boolean isEDT();
    void runInEDT(Runnable r);
    void runInEDTAndWait(Runnable r) throws InterruptedException, InvocationTargetException;
    void stopMessageLoopTimer();
    void startMessageLoopTimer(int ms, Runnable run);
    void shutdown(Runnable runnable);
    default int getLoopTime() {
        return DEFAULT_LOOP_TIME;
    };

}