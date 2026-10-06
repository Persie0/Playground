package com.google.mediapipe.framework;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidAssetUtil {
    /* JADX INFO: renamed from: a */
    public static synchronized void m5173a(Context context) {
        nativeInitializeAssetManager(context, context.getCacheDir().getAbsolutePath());
    }

    private static native boolean nativeInitializeAssetManager(Context context, String str);
}
