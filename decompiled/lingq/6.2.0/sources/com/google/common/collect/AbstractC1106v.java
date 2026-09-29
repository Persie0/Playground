package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import p000.xd9;

/* JADX INFO: renamed from: com.google.common.collect.v */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1106v {
    /* JADX INFO: renamed from: a */
    public static boolean m6353a(Comparator comparator, Collection collection) {
        Comparator comparator2;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            comparator2 = ((SortedSet) collection).comparator();
            if (comparator2 == null) {
                comparator2 = NaturalOrdering.f13415a;
            }
        } else {
            if (!(collection instanceof xd9)) {
                return false;
            }
            comparator2 = ((xd9) collection).comparator();
        }
        return comparator.equals(comparator2);
    }
}
