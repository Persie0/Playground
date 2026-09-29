package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class gk1 extends hk1 {

    /* JADX INFO: renamed from: a */
    public final int f40903a;

    public gk1(int i) {
        this.f40903a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m12718a() {
        return this.f40903a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gk1) && this.f40903a == ((gk1) obj).f40903a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40903a);
    }

    public final String toString() {
        return wq1.m24122r(new StringBuilder("ConstraintsNotMet(reason="), this.f40903a, ')');
    }
}
