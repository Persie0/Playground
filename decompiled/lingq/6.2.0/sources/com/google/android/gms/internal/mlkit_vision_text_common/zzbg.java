package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import p000.AbstractC2911d1;

/* JADX INFO: loaded from: classes2.dex */
final class zzbg extends AbstractC2911d1 implements Serializable {

    /* JADX INFO: renamed from: b */
    public final Object f12082b;

    /* JADX INFO: renamed from: c */
    public final C0974e f12083c;

    public zzbg(Object obj, C0974e c0974e) {
        super(1, false);
        this.f12082b = obj;
        this.f12083c = c0974e;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12082b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12083c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
