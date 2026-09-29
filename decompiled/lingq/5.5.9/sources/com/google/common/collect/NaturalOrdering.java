package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class NaturalOrdering extends AbstractC3177a0<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final NaturalOrdering f16115a = new NaturalOrdering();

    private NaturalOrdering() {
    }

    private Object readResolve() {
        return f16115a;
    }

    @Override // com.google.common.collect.AbstractC3177a0
    /* JADX INFO: renamed from: c */
    public final <S extends Comparable<?>> AbstractC3177a0<S> mo9119c() {
        return ReverseNaturalOrdering.f16140a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
