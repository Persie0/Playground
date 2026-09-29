package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class t42 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f61847a;

    /* JADX INFO: renamed from: b */
    public final String f61848b;

    public t42(String str, String str2) {
        this.f61847a = str;
        this.f61848b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t42)) {
            return false;
        }
        t42 t42Var = (t42) obj;
        return this.f61847a.equals(t42Var.f61847a) && this.f61848b.equals(t42Var.f61848b);
    }

    public final int hashCode() {
        return this.f61848b.hashCode() + (this.f61847a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("YearInReview(language=", this.f61847a, ", url=", this.f61848b, ")");
    }
}
