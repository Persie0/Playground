package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class NaturalOrdering extends AbstractC1104t implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final NaturalOrdering f13415a = new NaturalOrdering();

    private Object readResolve() {
        return f13415a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // com.google.common.collect.AbstractC1104t
    /* JADX INFO: renamed from: e */
    public final AbstractC1104t mo6319e() {
        return ReverseNaturalOrdering.f13441a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
