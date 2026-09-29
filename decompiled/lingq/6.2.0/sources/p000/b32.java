package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b32 {

    /* JADX INFO: renamed from: a */
    public final List f7836a;

    /* JADX INFO: renamed from: b */
    public final boolean f7837b;

    /* JADX INFO: renamed from: c */
    public final boolean f7838c;

    /* JADX INFO: renamed from: d */
    public final boolean f7839d;

    public b32(List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f7836a = list;
        this.f7837b = z;
        this.f7838c = z2;
        this.f7839d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b32)) {
            return false;
        }
        b32 b32Var = (b32) obj;
        return fa4.m11650l(this.f7836a, b32Var.f7836a) && this.f7837b == b32Var.f7837b && this.f7838c == b32Var.f7838c && this.f7839d == b32Var.f7839d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7839d) + g9a.m12428e(g9a.m12428e(g9a.m12428e(this.f7836a.hashCode() * 31, 31, this.f7837b), 31, this.f7838c), 31, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DealBlueScreenState(words=");
        sb.append(this.f7836a);
        sb.append(", canCreateLingQs=");
        sb.append(this.f7837b);
        sb.append(", moveKnown=");
        return e65.m10875g(sb, this.f7838c, ", showContinue=true, hasCards=", this.f7839d, ")");
    }
}
