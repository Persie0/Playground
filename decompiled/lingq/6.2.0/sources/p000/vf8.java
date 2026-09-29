package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class vf8 {

    /* JADX INFO: renamed from: a */
    public final boolean f65320a;

    /* JADX INFO: renamed from: b */
    public final boolean f65321b;

    /* JADX INFO: renamed from: c */
    public final boolean f65322c;

    public vf8(boolean z, boolean z2, boolean z3) {
        this.f65320a = z;
        this.f65321b = z2;
        this.f65322c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf8)) {
            return false;
        }
        vf8 vf8Var = (vf8) obj;
        return this.f65320a == vf8Var.f65320a && this.f65321b == vf8Var.f65321b && this.f65322c == vf8Var.f65322c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65322c) + g9a.m12428e(Boolean.hashCode(this.f65320a) * 31, 31, this.f65321b);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(hn1.m13357g("StudySentenceActivities(unscramble=", ", speaking=", ", matching=", this.f65320a, this.f65321b), this.f65322c, ")");
    }
}
