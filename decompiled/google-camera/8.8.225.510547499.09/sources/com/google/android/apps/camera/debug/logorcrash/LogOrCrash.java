package com.google.android.apps.camera.debug.logorcrash;

import android.os.Handler;
import android.os.Looper;
import p000.kbi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LogOrCrash {

    /* JADX INFO: renamed from: a */
    private static final Handler f6602a;

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        f6602a = handler;
        handler.getClass();
        try {
            kbi.m13939b(LogOrCrash.class, "logorcrash");
            nativeGetFlavorId();
        } catch (IllegalStateException | UnsatisfiedLinkError e) {
        }
    }

    private LogOrCrash() {
    }

    private static native int nativeGetFlavorId();
}
