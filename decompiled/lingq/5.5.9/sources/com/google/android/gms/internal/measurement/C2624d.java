package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2624d implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterator f14140a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Iterator f14141b;

    public C2624d(Iterator it, Iterator it2) {
        this.f14140a = it;
        this.f14141b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14140a.hasNext()) {
            return true;
        }
        return this.f14141b.hasNext();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f14140a;
        if (it.hasNext()) {
            return new C2842t(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f14141b;
        if (it2.hasNext()) {
            return new C2842t((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
