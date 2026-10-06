package p000;

import android.database.ContentObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class juj extends ContentObserver {
    public juj() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        jum.f34840e.set(true);
    }
}
