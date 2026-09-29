package com.google.android.gms.internal.mlkit_vision_document_scanner;

import p000.hmb;

/* JADX INFO: loaded from: classes2.dex */
public enum zzmy implements hmb {
    FORMAT_UNKNOWN(0),
    FORMAT_JPEG(1),
    FORMAT_PDF(2);

    private final int zzd;

    zzmy(int i) {
        this.zzd = i;
    }

    @Override // p000.hmb
    public final int zza() {
        return this.zzd;
    }
}
