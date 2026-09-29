package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2816r implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f14410a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2842t f14411b;

    public C2816r(C2842t c2842t) {
        this.f14411b = c2842t;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14410a < this.f14411b.f14432a.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i10 = this.f14410a;
        if (i10 >= this.f14411b.f14432a.length()) {
            throw new NoSuchElementException();
        }
        this.f14410a = i10 + 1;
        return new C2842t(String.valueOf(i10));
    }
}
