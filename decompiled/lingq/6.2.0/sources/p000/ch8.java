package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ch8 {

    /* JADX INFO: renamed from: a */
    public final long f10093a = aa1.f412k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ch8) {
            return aa1.m199c(this.f10093a, ((ch8) obj).f10093a);
        }
        return false;
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Long.hashCode(this.f10093a) * 961;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) aa1.m205i(this.f10093a)) + ", focus=null, rippleAlpha=null)";
    }
}
