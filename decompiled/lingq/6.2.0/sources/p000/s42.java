package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class s42 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f60265a;

    /* JADX INFO: renamed from: b */
    public final String f60266b;

    public s42(String str, String str2) {
        this.f60265a = str;
        this.f60266b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s42)) {
            return false;
        }
        s42 s42Var = (s42) obj;
        return this.f60265a.equals(s42Var.f60265a) && this.f60266b.equals(s42Var.f60266b);
    }

    public final int hashCode() {
        return this.f60266b.hashCode() + (this.f60265a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("Web2Wave(userId=", this.f60265a, ", email=", this.f60266b, ")");
    }
}
