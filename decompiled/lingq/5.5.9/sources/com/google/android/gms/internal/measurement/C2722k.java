package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2722k implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterator f14277a;

    public C2722k(Iterator it) {
        this.f14277a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14277a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C2842t((String) this.f14277a.next());
    }
}
