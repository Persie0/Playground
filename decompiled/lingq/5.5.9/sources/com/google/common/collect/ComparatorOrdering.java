package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class ComparatorOrdering<T> extends AbstractC3177a0<T> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Comparator<T> f16036a;

    public ComparatorOrdering(Comparator<T> comparator) {
        this.f16036a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        return this.f16036a.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComparatorOrdering) {
            return this.f16036a.equals(((ComparatorOrdering) obj).f16036a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16036a.hashCode();
    }

    public final String toString() {
        return this.f16036a.toString();
    }
}
