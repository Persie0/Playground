package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class uf8 {

    /* JADX INFO: renamed from: a */
    public final boolean f63847a;

    /* JADX INFO: renamed from: b */
    public final boolean f63848b;

    /* JADX INFO: renamed from: c */
    public final boolean f63849c;

    /* JADX INFO: renamed from: d */
    public final boolean f63850d;

    /* JADX INFO: renamed from: e */
    public final boolean f63851e;

    public uf8(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f63847a = z;
        this.f63848b = z2;
        this.f63849c = z3;
        this.f63850d = z4;
        this.f63851e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf8)) {
            return false;
        }
        uf8 uf8Var = (uf8) obj;
        return this.f63847a == uf8Var.f63847a && this.f63848b == uf8Var.f63848b && this.f63849c == uf8Var.f63849c && this.f63850d == uf8Var.f63850d && this.f63851e == uf8Var.f63851e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63851e) + g9a.m12428e(g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f63847a) * 31, 31, this.f63848b), 31, this.f63849c), 31, this.f63850d);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("ReviewActivities(flash=", ", reverse=", ", cloze=", this.f63847a, this.f63848b);
        wq1.m24101A(sbM13357g, this.f63849c, ", multi=", this.f63850d, ", dictation=");
        return AbstractC3393o1.m17740o(sbM13357g, this.f63851e, ")");
    }
}
