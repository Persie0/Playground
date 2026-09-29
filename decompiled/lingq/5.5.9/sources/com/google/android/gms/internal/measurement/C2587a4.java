package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2587a4 extends ContentObserver {
    public C2587a4() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        C2615c4.f14083d.set(true);
    }
}
