package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class wv1 {

    /* JADX INFO: renamed from: a */
    public final String f67329a;

    /* JADX INFO: renamed from: b */
    public final int f67330b;

    public wv1(String str, int i) {
        str.getClass();
        this.f67329a = str;
        this.f67330b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv1)) {
            return false;
        }
        wv1 wv1Var = (wv1) obj;
        return fa4.m11650l(this.f67329a, wv1Var.f67329a) && this.f67330b == wv1Var.f67330b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67330b) + (this.f67329a.hashCode() * 31);
    }

    public final String toString() {
        return "CupSignupTeam(code=" + this.f67329a + ", participants=" + this.f67330b + ")";
    }
}
