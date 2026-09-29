package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class q59 extends x59 {

    /* JADX INFO: renamed from: a */
    public final boolean f57298a;

    /* JADX INFO: renamed from: b */
    public final boolean f57299b;

    /* JADX INFO: renamed from: c */
    public final boolean f57300c;

    /* JADX INFO: renamed from: d */
    public final String f57301d;

    public q59(String str, boolean z, boolean z2, boolean z3) {
        this.f57298a = z;
        this.f57299b = z2;
        this.f57300c = z3;
        this.f57301d = str;
    }

    @Override // p000.x59
    /* JADX INFO: renamed from: a */
    public final String mo19662a() {
        return this.f57301d;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19663b() {
        return this.f57300c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m19664c() {
        return this.f57298a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19665d() {
        return this.f57299b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q59)) {
            return false;
        }
        q59 q59Var = (q59) obj;
        return this.f57298a == q59Var.f57298a && this.f57299b == q59Var.f57299b && this.f57300c == q59Var.f57300c && this.f57301d.equals(q59Var.f57301d);
    }

    public final int hashCode() {
        return this.f57301d.hashCode() + g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f57298a) * 31, 31, this.f57299b), 31, this.f57300c);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("ContentEmpty(isLesson=", ", isPlaylist=", ", showImport=", this.f57298a, this.f57299b);
        sbM13357g.append(this.f57300c);
        sbM13357g.append(", key=");
        sbM13357g.append(this.f57301d);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }
}
