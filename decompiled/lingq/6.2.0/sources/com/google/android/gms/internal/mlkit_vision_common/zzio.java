package com.google.android.gms.internal.mlkit_vision_common;

import p000.ljb;

/* JADX INFO: loaded from: classes2.dex */
public enum zzio implements ljb {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);

    private final int zzh;

    zzio(int i) {
        this.zzh = i;
    }

    @Override // p000.ljb
    public final int zza() {
        return this.zzh;
    }
}
