package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2714j5 extends AbstractC2728k5 {

    /* JADX INFO: renamed from: b */
    public boolean f14268b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f14269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2714j5(Object obj) {
        super(0);
        this.f14269c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f14268b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC2728k5, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (this.f14268b) {
            throw new NoSuchElementException();
        }
        this.f14268b = true;
        return this.f14269c;
    }
}
