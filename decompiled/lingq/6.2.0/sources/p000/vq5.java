package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class vq5 {

    /* JADX INFO: renamed from: a */
    public final String f65786a;

    /* JADX INFO: renamed from: b */
    public final String f65787b;

    public vq5(String str, String str2) {
        this.f65786a = str;
        this.f65787b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq5)) {
            return false;
        }
        vq5 vq5Var = (vq5) obj;
        return this.f65786a.equals(vq5Var.f65786a) && this.f65787b.equals(vq5Var.f65787b);
    }

    public final int hashCode() {
        return this.f65787b.hashCode() + (this.f65786a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("MatchPair(text=", this.f65786a, ", answer=", this.f65787b, ")");
    }
}
