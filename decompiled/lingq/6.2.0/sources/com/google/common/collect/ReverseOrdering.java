package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class ReverseOrdering<T> extends AbstractC1104t implements Serializable {

    /* JADX INFO: renamed from: a */
    public final AbstractC1104t f13442a;

    public ReverseOrdering(AbstractC1104t abstractC1104t) {
        this.f13442a = abstractC1104t;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f13442a.compare(obj2, obj);
    }

    @Override // com.google.common.collect.AbstractC1104t
    /* JADX INFO: renamed from: e */
    public final AbstractC1104t mo6319e() {
        return this.f13442a;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.f13442a.equals(((ReverseOrdering) obj).f13442a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f13442a.hashCode();
    }

    public final String toString() {
        return this.f13442a + ".reverse()";
    }
}
