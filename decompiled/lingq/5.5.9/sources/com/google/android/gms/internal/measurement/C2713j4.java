package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2713j4 extends ContentObserver {
    public C2713j4() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        AbstractC2886w4.f14486h.incrementAndGet();
    }
}
