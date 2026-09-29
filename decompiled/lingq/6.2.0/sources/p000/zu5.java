package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zu5 {

    /* JADX INFO: renamed from: a */
    public final jv5 f72178a;

    /* JADX INFO: renamed from: b */
    public final long f72179b;

    /* JADX INFO: renamed from: c */
    public final long f72180c;

    /* JADX INFO: renamed from: d */
    public final long f72181d;

    /* JADX INFO: renamed from: e */
    public final long f72182e;

    /* JADX INFO: renamed from: f */
    public final long f72183f;

    /* JADX INFO: renamed from: g */
    public final boolean f72184g;

    /* JADX INFO: renamed from: h */
    public final boolean f72185h;

    /* JADX INFO: renamed from: i */
    public final boolean f72186i;

    /* JADX INFO: renamed from: j */
    public final boolean f72187j;

    /* JADX INFO: renamed from: k */
    public final boolean f72188k;

    public zu5(jv5 jv5Var, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        bna.m3969q(!z5 || z3);
        bna.m3969q(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        bna.m3969q(z6);
        this.f72178a = jv5Var;
        this.f72179b = j;
        this.f72180c = j2;
        this.f72181d = j3;
        this.f72182e = j4;
        this.f72183f = j5;
        this.f72184g = z;
        this.f72185h = z2;
        this.f72186i = z3;
        this.f72187j = z4;
        this.f72188k = z5;
    }

    /* JADX INFO: renamed from: a */
    public final zu5 m25790a(long j) {
        if (j == this.f72181d) {
            return this;
        }
        return new zu5(this.f72178a, this.f72179b, this.f72180c, j, this.f72182e, this.f72183f, this.f72184g, this.f72185h, this.f72186i, this.f72187j, this.f72188k);
    }

    /* JADX INFO: renamed from: b */
    public final zu5 m25791b(long j, long j2) {
        if (j == this.f72179b && j2 == this.f72180c) {
            return this;
        }
        return new zu5(this.f72178a, j, j2, this.f72181d, this.f72182e, this.f72183f, this.f72184g, this.f72185h, this.f72186i, this.f72187j, this.f72188k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zu5.class == obj.getClass()) {
            zu5 zu5Var = (zu5) obj;
            if (this.f72179b == zu5Var.f72179b && this.f72181d == zu5Var.f72181d && this.f72182e == zu5Var.f72182e && this.f72183f == zu5Var.f72183f && this.f72184g == zu5Var.f72184g && this.f72185h == zu5Var.f72185h && this.f72186i == zu5Var.f72186i && this.f72187j == zu5Var.f72187j && this.f72188k == zu5Var.f72188k && Objects.equals(this.f72178a, zu5Var.f72178a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f72178a.hashCode() + 527) * 31) + ((int) this.f72179b)) * 31) + ((int) this.f72181d)) * 31) + ((int) this.f72182e)) * 31) + ((int) this.f72183f)) * 31) + (this.f72184g ? 1 : 0)) * 31) + (this.f72185h ? 1 : 0)) * 31) + (this.f72186i ? 1 : 0)) * 31) + (this.f72187j ? 1 : 0)) * 31) + (this.f72188k ? 1 : 0);
    }
}
