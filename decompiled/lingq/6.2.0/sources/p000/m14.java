package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class m14 {

    /* JADX INFO: renamed from: a */
    public final ika f50430a;

    /* JADX INFO: renamed from: b */
    public final boolean f50431b;

    public m14(ika ikaVar, boolean z) {
        ikaVar.getClass();
        this.f50430a = ikaVar;
        this.f50431b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m14)) {
            return false;
        }
        m14 m14Var = (m14) obj;
        return fa4.m11650l(this.f50430a, m14Var.f50430a) && this.f50431b == m14Var.f50431b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50431b) + (this.f50430a.hashCode() * 31);
    }

    public final String toString() {
        return "ImportDataWithConnectivity(userImportData=" + this.f50430a + ", isOnline=" + this.f50431b + ")";
    }
}
