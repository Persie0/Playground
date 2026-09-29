package com.clevertap.android.sdk.inapp;

import android.util.LruCache;
import com.clevertap.android.sdk.C2181a;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2212c0 extends LruCache<String, byte[]> {
    public C2212c0(int i10) {
        super(i10);
    }

    @Override // android.util.LruCache
    public final int sizeOf(String str, byte[] bArr) {
        int length = bArr.length / 1024;
        C2181a.m6455h("CTInAppNotification.GifCache: have gif of size: " + length + "KB for key: " + str);
        return length;
    }
}
