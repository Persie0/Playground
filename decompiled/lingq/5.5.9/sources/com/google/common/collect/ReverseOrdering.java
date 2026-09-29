package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class ReverseOrdering<T> extends AbstractC3177a0<T> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final AbstractC3177a0<? super T> f16141a;

    public ReverseOrdering(AbstractC3177a0<? super T> abstractC3177a0) {
        abstractC3177a0.getClass();
        this.f16141a = abstractC3177a0;
    }

    @Override // com.google.common.collect.AbstractC3177a0
    /* JADX INFO: renamed from: c */
    public final <S extends T> AbstractC3177a0<S> mo9119c() {
        return this.f16141a;
    }

    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        return this.f16141a.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.f16141a.equals(((ReverseOrdering) obj).f16141a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f16141a.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f16141a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 10);
        sb2.append(strValueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }
}
