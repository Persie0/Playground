package com.google.common.collect;

import java.util.Comparator;
import p000.C3835zj;
import p000.gj3;

/* JADX INFO: renamed from: com.google.common.collect.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1104t implements Comparator {
    /* JADX INFO: renamed from: b */
    public static AbstractC1104t m6349b(C3835zj c3835zj) {
        return new ComparatorOrdering(c3835zj);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC1104t m6350c() {
        return NaturalOrdering.f13415a;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1104t m6351a(Comparator comparator) {
        return new CompoundOrdering(this, comparator);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC1104t m6352d(gj3 gj3Var) {
        return new ByFunctionOrdering(gj3Var, this);
    }

    /* JADX INFO: renamed from: e */
    public AbstractC1104t mo6319e() {
        return new ReverseOrdering(this);
    }
}
