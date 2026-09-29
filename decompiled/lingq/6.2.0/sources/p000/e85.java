package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class e85 {

    /* JADX INFO: renamed from: a */
    public final ws1 f36838a;

    /* JADX INFO: renamed from: b */
    public final boolean f36839b;

    public e85(ws1 ws1Var, boolean z) {
        this.f36838a = ws1Var;
        this.f36839b = z;
    }

    /* JADX INFO: renamed from: a */
    public static e85 m10918a(e85 e85Var) {
        return new e85(e85Var.f36838a, true);
    }

    /* JADX INFO: renamed from: b */
    public final ws1 m10919b() {
        return this.f36838a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10920c() {
        return this.f36839b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e85)) {
            return false;
        }
        e85 e85Var = (e85) obj;
        return this.f36838a.equals(e85Var.f36838a) && this.f36839b == e85Var.f36839b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36839b) + (this.f36838a.hashCode() * 31);
    }

    public final String toString() {
        return "LibraryCupBanner(banner=" + this.f36838a + ", isDismissed=" + this.f36839b + ")";
    }
}
