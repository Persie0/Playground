package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.common.collect.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3177a0<T> implements Comparator<T> {
    /* JADX INFO: renamed from: a */
    public static <T> AbstractC3177a0<T> m9123a(Comparator<T> comparator) {
        return comparator instanceof AbstractC3177a0 ? (AbstractC3177a0) comparator : new ComparatorOrdering(comparator);
    }

    /* JADX INFO: renamed from: b */
    public static <C extends Comparable> AbstractC3177a0<C> m9124b() {
        return NaturalOrdering.f16115a;
    }

    /* JADX INFO: renamed from: c */
    public <S extends T> AbstractC3177a0<S> mo9119c() {
        return new ReverseOrdering(this);
    }
}
