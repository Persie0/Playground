package com.google.android.gms.internal.mlkit_vision_text_common;

import p000.bvb;

/* JADX INFO: loaded from: classes2.dex */
public enum zzot implements bvb {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);

    private final int zzf;

    zzot(int i) {
        this.zzf = i;
    }

    @Override // p000.bvb
    public final int zza() {
        return this.zzf;
    }
}
