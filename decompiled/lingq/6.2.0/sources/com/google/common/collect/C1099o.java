package com.google.common.collect;

import java.util.Arrays;
import java.util.Comparator;
import p000.b14;
import p000.d32;

/* JADX INFO: renamed from: com.google.common.collect.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C1099o extends C1098n {

    /* JADX INFO: renamed from: d */
    public final Comparator f13476d;

    public C1099o(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.f13476d = comparator;
    }

    @Override // com.google.common.collect.C1098n, p000.b14
    /* JADX INFO: renamed from: a */
    public final b14 mo3156a(Object obj) {
        super.mo3156a(obj);
        return this;
    }

    @Override // com.google.common.collect.C1098n
    /* JADX INFO: renamed from: g */
    public final C1098n mo3156a(Object obj) {
        super.mo3156a(obj);
        return this;
    }

    @Override // com.google.common.collect.C1098n
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ ImmutableSet mo6343h() {
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public final ImmutableSortedSet m6344i() {
        RegularImmutableSortedSet regularImmutableSortedSet;
        Object[] objArrCopyOf = this.f7758a;
        int i = this.f7759b;
        Comparator comparator = this.f13476d;
        if (i == 0) {
            int i2 = ImmutableSortedSet.f13404f;
            regularImmutableSortedSet = NaturalOrdering.f13415a != comparator ? new RegularImmutableSortedSet(RegularImmutableList.f13416e, comparator) : RegularImmutableSortedSet.f13439h;
        } else {
            int i3 = ImmutableSortedSet.f13404f;
            d32.m10011I(objArrCopyOf, i);
            Arrays.sort(objArrCopyOf, 0, i, comparator);
            int i4 = 1;
            for (int i5 = 1; i5 < i; i5++) {
                Object obj = objArrCopyOf[i5];
                if (comparator.compare(obj, objArrCopyOf[i4 - 1]) != 0) {
                    objArrCopyOf[i4] = obj;
                    i4++;
                }
            }
            Arrays.fill(objArrCopyOf, i4, i, (Object) null);
            if (i4 < objArrCopyOf.length / 2) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            }
            regularImmutableSortedSet = new RegularImmutableSortedSet(ImmutableList.m6283l(objArrCopyOf, i4), comparator);
        }
        this.f7759b = regularImmutableSortedSet.f13440g.size();
        this.f7760c = true;
        return regularImmutableSortedSet;
    }
}
