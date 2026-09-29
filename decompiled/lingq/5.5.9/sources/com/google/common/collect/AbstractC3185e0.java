package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.common.collect.e0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3185e0<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: a */
    public final Iterator<? extends F> f16155a;

    public AbstractC3185e0(Iterator<? extends F> it) {
        it.getClass();
        this.f16155a = it;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo9129a(F f3);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16155a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return mo9129a(this.f16155a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f16155a.remove();
    }
}
