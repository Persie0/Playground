package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2731k8 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f14292a;

    public C2731k8(C2745l8 c2745l8) {
        this.f14292a = c2745l8.f14300a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14292a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f14292a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
