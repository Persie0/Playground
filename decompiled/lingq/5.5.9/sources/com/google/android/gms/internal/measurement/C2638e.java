package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2638e implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f14160a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2652f f14161b;

    public C2638e(C2652f c2652f) {
        this.f14161b = c2652f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14160a < this.f14161b.m7791q();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i10 = this.f14160a;
        C2652f c2652f = this.f14161b;
        if (i10 >= c2652f.m7791q()) {
            throw new NoSuchElementException(C0166e.m761g("Out of bounds index: ", this.f14160a));
        }
        int i11 = this.f14160a;
        this.f14160a = i11 + 1;
        return c2652f.m7792s(i11);
    }
}
