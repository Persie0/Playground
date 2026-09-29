package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class l95 extends w95 {

    /* JADX INFO: renamed from: a */
    public final boolean f49343a;

    public l95(boolean z) {
        this.f49343a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16032a() {
        return this.f49343a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l95) && this.f49343a == ((l95) obj).f49343a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49343a);
    }

    public final String toString() {
        return hn1.m13355e("NavigateToCup(openSignup=", ")", this.f49343a);
    }
}
