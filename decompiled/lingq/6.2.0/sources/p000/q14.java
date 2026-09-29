package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class q14 extends t14 {

    /* JADX INFO: renamed from: a */
    public final String f57126a;

    public q14(String str) {
        str.getClass();
        this.f57126a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q14) && fa4.m11650l(this.f57126a, ((q14) obj).f57126a);
    }

    public final int hashCode() {
        return this.f57126a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnOpenUrl(url=", this.f57126a, ")");
    }
}
