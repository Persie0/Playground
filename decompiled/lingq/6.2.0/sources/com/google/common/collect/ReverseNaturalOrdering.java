package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class ReverseNaturalOrdering extends AbstractC1104t implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final ReverseNaturalOrdering f13441a = new ReverseNaturalOrdering();

    private Object readResolve() {
        return f13441a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.AbstractC1104t
    /* JADX INFO: renamed from: e */
    public final AbstractC1104t mo6319e() {
        return NaturalOrdering.f13415a;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
