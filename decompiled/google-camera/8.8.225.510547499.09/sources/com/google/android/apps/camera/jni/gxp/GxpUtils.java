package com.google.android.apps.camera.jni.gxp;

import p000.nbe;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class GxpUtils {

    /* JADX INFO: renamed from: a */
    private static final nbh f6753a = nbh.m17259h("com/google/android/apps/camera/jni/gxp/GxpUtils");

    /* JADX INFO: renamed from: a */
    public static boolean m4186a() {
        int i;
        int[] versionNative = getVersionNative();
        if (versionNative.length > 1) {
            int i2 = versionNative[0];
            int i3 = versionNative[1];
        } else {
            ((nbe) ((nbe) f6753a.m17252c()).mo17276G((char) 1606)).mo17293r("Error loading version: %s", versionNative);
            versionNative = new int[0];
        }
        if (versionNative.length > 1 && ((i = versionNative[0]) > 1 || (i == 1 && versionNative[1] >= 5))) {
            return true;
        }
        if (!releaseNative()) {
            ((nbe) ((nbe) f6753a.m17252c()).mo17276G((char) 1605)).mo17290o("Error releasing.");
        }
        return false;
    }

    static native int[] getVersionNative();

    static native boolean releaseNative();
}
