package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.common.collect.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3195n extends AbstractC3187f0<Object> {

    /* JADX INFO: renamed from: a */
    public boolean f16165a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f16166b;

    public C3195n(Object obj) {
        this.f16166b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f16165a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f16165a) {
            throw new NoSuchElementException();
        }
        this.f16165a = true;
        return this.f16166b;
    }
}
