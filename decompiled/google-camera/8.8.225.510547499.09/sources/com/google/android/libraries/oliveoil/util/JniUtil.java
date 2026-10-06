package com.google.android.libraries.oliveoil.util;

import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class JniUtil {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f7954a = 0;

    static {
        m4712a();
    }

    /* JADX INFO: renamed from: a */
    public static void m4712a() {
        try {
            System.loadLibrary(wUzNh.suhrv);
        } catch (UnsatisfiedLinkError e) {
            if (!System.getProperty("java.vm.name").equals("Dalvik")) {
                throw new UnsatisfiedLinkError("Not running Dalvik VM. Details: ".concat(e.toString()));
            }
            throw e;
        }
    }
}
