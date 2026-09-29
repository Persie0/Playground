package com.google.common.collect;

import java.io.Serializable;
import p000.C3835zj;

/* JADX INFO: loaded from: classes.dex */
final class ComparatorOrdering<T> extends AbstractC1104t implements Serializable {

    /* JADX INFO: renamed from: a */
    public final C3835zj f13385a;

    public ComparatorOrdering(C3835zj c3835zj) {
        this.f13385a = c3835zj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f13385a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ComparatorOrdering) && this.f13385a == ((ComparatorOrdering) obj).f13385a;
    }

    public final int hashCode() {
        return this.f13385a.hashCode();
    }

    public final String toString() {
        return this.f13385a.toString();
    }
}
