package com.google.android.gms.internal.mlkit_vision_document_scanner;

import p000.hmb;

/* JADX INFO: loaded from: classes2.dex */
public enum zzmx implements hmb {
    MODE_UNKNOWN(0),
    MODE_AUTO(1),
    MODE_MANUAL(2);

    private final int zzd;

    zzmx(int i) {
        this.zzd = i;
    }

    @Override // p000.hmb
    public final int zza() {
        return this.zzd;
    }
}
