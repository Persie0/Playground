package com.pairip;

/* JADX INFO: loaded from: classes.dex */
public final class StartupLauncher {
    private static boolean launchCalled = false;
    private static String startupProgramName = "KYrJ3CzQ2V74PiFZ";

    public static synchronized void launch() {
        if (launchCalled) {
            return;
        }
        launchCalled = true;
        VMRunner.invoke(startupProgramName, null);
    }

    private StartupLauncher() {
    }
}
