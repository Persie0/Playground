package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ks0 implements ls0 {

    /* JADX INFO: renamed from: a */
    public final List f48374a;

    /* JADX INFO: renamed from: b */
    public final int f48375b;

    public ks0(int i, List list) {
        this.f48374a = list;
        this.f48375b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks0)) {
            return false;
        }
        ks0 ks0Var = (ks0) obj;
        return this.f48374a.equals(ks0Var.f48374a) && this.f48375b == ks0Var.f48375b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48375b) + (this.f48374a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(stats=" + this.f48374a + ", rank=" + this.f48375b + ")";
    }
}
