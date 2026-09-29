package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class dp2 extends fp2 {

    /* JADX INFO: renamed from: a */
    public final String f35987a;

    public dp2(String str) {
        str.getClass();
        this.f35987a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dp2) && fa4.m11650l(this.f35987a, ((dp2) obj).f35987a);
    }

    public final int hashCode() {
        return this.f35987a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnEmailLogin(email=", this.f35987a, ")");
    }
}
