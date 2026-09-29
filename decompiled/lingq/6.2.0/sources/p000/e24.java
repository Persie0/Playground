package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class e24 extends g24 {

    /* JADX INFO: renamed from: a */
    public final ika f36614a;

    /* JADX INFO: renamed from: b */
    public final boolean f36615b;

    /* JADX INFO: renamed from: c */
    public final boolean f36616c;

    /* JADX INFO: renamed from: d */
    public final et2 f36617d;

    public e24(ika ikaVar, boolean z, boolean z2, et2 et2Var) {
        ikaVar.getClass();
        this.f36614a = ikaVar;
        this.f36615b = z;
        this.f36616c = z2;
        this.f36617d = et2Var;
    }

    /* JADX INFO: renamed from: a */
    public final ika m10796a() {
        return this.f36614a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e24)) {
            return false;
        }
        e24 e24Var = (e24) obj;
        return fa4.m11650l(this.f36614a, e24Var.f36614a) && this.f36615b == e24Var.f36615b && this.f36616c == e24Var.f36616c && fa4.m11650l(this.f36617d, e24Var.f36617d);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(g9a.m12428e(this.f36614a.hashCode() * 31, 31, this.f36615b), 31, this.f36616c);
        et2 et2Var = this.f36617d;
        return iM12428e + (et2Var == null ? 0 : et2Var.hashCode());
    }

    public final String toString() {
        return "Import(userImportData=" + this.f36614a + ", autoOpenAfterImport=" + this.f36615b + ", isOnline=" + this.f36616c + ", error=" + this.f36617d + ")";
    }
}
