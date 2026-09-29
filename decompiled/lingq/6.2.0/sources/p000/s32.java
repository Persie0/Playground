package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class s32 {

    /* JADX INFO: renamed from: a */
    public final String f60226a;

    /* JADX INFO: renamed from: b */
    public final boolean f60227b;

    public s32(String str, boolean z) {
        str.getClass();
        this.f60226a = str;
        this.f60227b = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m21044a() {
        return this.f60226a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21045b() {
        return this.f60227b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s32)) {
            return false;
        }
        s32 s32Var = (s32) obj;
        return fa4.m11650l(this.f60226a, s32Var.f60226a) && this.f60227b == s32Var.f60227b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60227b) + (this.f60226a.hashCode() * 31);
    }

    public final String toString() {
        return "DeepLinkData(deepLink=" + this.f60226a + ", isUserLoggedIn=" + this.f60227b + ")";
    }
}
