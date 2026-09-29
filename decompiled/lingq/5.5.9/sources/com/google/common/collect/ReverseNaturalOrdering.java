package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class ReverseNaturalOrdering extends AbstractC3177a0<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final ReverseNaturalOrdering f16140a = new ReverseNaturalOrdering();

    private ReverseNaturalOrdering() {
    }

    private Object readResolve() {
        return f16140a;
    }

    @Override // com.google.common.collect.AbstractC3177a0
    /* JADX INFO: renamed from: c */
    public final <S extends Comparable<?>> AbstractC3177a0<S> mo9119c() {
        return NaturalOrdering.f16115a;
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

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
