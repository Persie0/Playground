package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import p000.AbstractC3393o1;

/* JADX INFO: loaded from: classes2.dex */
final class CompoundOrdering<T> extends AbstractC1104t implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Comparator[] f13386a;

    public CompoundOrdering(AbstractC1104t abstractC1104t, Comparator comparator) {
        this.f13386a = new Comparator[]{abstractC1104t, comparator};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f13386a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompoundOrdering) {
            return Arrays.equals(this.f13386a, ((CompoundOrdering) obj).f13386a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13386a);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(new StringBuilder("Ordering.compound("), Arrays.toString(this.f13386a), ")");
    }
}
