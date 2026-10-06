package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mvd extends mve implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final mvd f41678a = new mvd();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f41678a;
    }

    @Override // p000.mve
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ long mo17018a(Comparable comparable, Comparable comparable2) {
        return ((long) ((Integer) comparable2).intValue()) - ((long) ((Integer) comparable).intValue());
    }

    @Override // p000.mve
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Comparable mo17019b() {
        return Integer.MAX_VALUE;
    }

    @Override // p000.mve
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Comparable mo17020c() {
        return Integer.MIN_VALUE;
    }

    @Override // p000.mve
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Comparable mo17021d(Comparable comparable) {
        int iIntValue = ((Integer) comparable).intValue();
        if (iIntValue == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(iIntValue + 1);
    }

    @Override // p000.mve
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ Comparable mo17022e(Comparable comparable, long j) {
        Integer num = (Integer) comparable;
        if (j >= 0) {
            return Integer.valueOf(kxk.m14977W(num.longValue() + j));
        }
        throw new IllegalArgumentException("distance cannot be negative but was: " + j);
    }

    @Override // p000.mve
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Comparable mo17023f(Comparable comparable) {
        int iIntValue = ((Integer) comparable).intValue();
        if (iIntValue == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(iIntValue - 1);
    }

    public final String toString() {
        return "DiscreteDomain.integers()";
    }
}
