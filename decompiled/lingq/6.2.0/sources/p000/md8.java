package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class md8 {

    /* JADX INFO: renamed from: a */
    public final String f51108a;

    /* JADX INFO: renamed from: b */
    public final String f51109b;

    public md8(String str, String str2) {
        this.f51108a = str;
        this.f51109b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md8)) {
            return false;
        }
        md8 md8Var = (md8) obj;
        return this.f51108a.equals(md8Var.f51108a) && this.f51109b.equals(md8Var.f51109b);
    }

    public final int hashCode() {
        return this.f51109b.hashCode() + (this.f51108a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("ReviewMatchingPairState(text=", this.f51108a, ", answer=", this.f51109b, ")");
    }
}
