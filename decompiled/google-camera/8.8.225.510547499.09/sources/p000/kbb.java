package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbb implements Comparable {

    /* JADX INFO: renamed from: a */
    public static final kbb f35512a = m13898e(100);

    /* JADX INFO: renamed from: b */
    public static final kbb f35513b = m13897c(0);

    /* JADX INFO: renamed from: c */
    public static final kbb f35514c = new kbb(-1);

    /* JADX INFO: renamed from: d */
    public static final kbb f35515d = m13897c(32);

    /* JADX INFO: renamed from: e */
    public final int f35516e;

    public kbb() {
    }

    public kbb(int i) {
        this.f35516e = i;
    }

    /* JADX INFO: renamed from: b */
    public static kbb m13896b(float f) {
        return m13897c((int) (f * 100.0f));
    }

    /* JADX INFO: renamed from: c */
    public static kbb m13897c(int i) {
        if (i > 99) {
            i = 99;
        }
        return m13898e(i);
    }

    /* JADX INFO: renamed from: e */
    private static kbb m13898e(int i) {
        lku.m15672z(i >= 0, "Percentages must be between [0,100] inclusive: %s", i);
        return new kbb(i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(kbb kbbVar) {
        int i = this.f35516e;
        int i2 = kbbVar.f35516e;
        if (i == i2) {
            return 0;
        }
        return i >= i2 ? 1 : -1;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13900d() {
        return this.f35516e >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof kbb) && this.f35516e == ((kbb) obj).f35516e;
    }

    public final int hashCode() {
        return this.f35516e ^ 1000003;
    }

    public final String toString() {
        return this.f35516e + "%";
    }
}
