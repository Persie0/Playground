package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s */
/* JADX INFO: loaded from: classes.dex */
public final class C2829s implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f14420a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2842t f14421b;

    public C2829s(C2842t c2842t) {
        this.f14421b = c2842t;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14420a < this.f14421b.f14432a.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i10 = this.f14420a;
        C2842t c2842t = this.f14421b;
        if (i10 >= c2842t.f14432a.length()) {
            throw new NoSuchElementException();
        }
        this.f14420a = i10 + 1;
        return new C2842t(String.valueOf(c2842t.f14432a.charAt(i10)));
    }
}
