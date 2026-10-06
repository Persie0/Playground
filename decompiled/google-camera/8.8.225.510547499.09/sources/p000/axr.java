package p000;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axr {

    /* JADX INFO: renamed from: a */
    public static final axr f2678a = new axr(null);

    /* JADX INFO: renamed from: b */
    public final boolean f2679b;

    /* JADX INFO: renamed from: c */
    public final boolean f2680c;

    /* JADX INFO: renamed from: d */
    public final boolean f2681d;

    /* JADX INFO: renamed from: e */
    public final boolean f2682e;

    /* JADX INFO: renamed from: f */
    public final long f2683f;

    /* JADX INFO: renamed from: g */
    public final long f2684g;

    /* JADX INFO: renamed from: h */
    public final Set f2685h;

    /* JADX INFO: renamed from: i */
    public final int f2686i;

    public axr() {
        this(null);
    }

    public axr(int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        this.f2686i = i;
        this.f2679b = z;
        this.f2680c = z2;
        this.f2681d = z3;
        this.f2682e = z4;
        this.f2683f = j;
        this.f2684g = j2;
        this.f2685h = set;
    }

    public /* synthetic */ axr(byte[] bArr) {
        this(1, false, false, false, false, -1L, -1L, okx.f46217a);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2089a() {
        return !this.f2685h.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ooc.m18737c(getClass(), obj.getClass())) {
            return false;
        }
        axr axrVar = (axr) obj;
        if (this.f2679b == axrVar.f2679b && this.f2680c == axrVar.f2680c && this.f2681d == axrVar.f2681d && this.f2682e == axrVar.f2682e && this.f2683f == axrVar.f2683f && this.f2684g == axrVar.f2684g && this.f2686i == axrVar.f2686i) {
            return ooc.m18737c(this.f2685h, axrVar.f2685h);
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.f2686i * 31) + (this.f2679b ? 1 : 0)) * 31) + (this.f2680c ? 1 : 0)) * 31) + (this.f2681d ? 1 : 0)) * 31) + (this.f2682e ? 1 : 0);
        long j = this.f2683f;
        long j2 = this.f2684g;
        return (((((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f2685h.hashCode();
    }
}
