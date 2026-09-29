package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class u95 extends w95 {

    /* JADX INFO: renamed from: a */
    public final String f63611a;

    public u95(String str) {
        str.getClass();
        this.f63611a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m22634a() {
        return this.f63611a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u95) && fa4.m11650l(this.f63611a, ((u95) obj).f63611a);
    }

    public final int hashCode() {
        return this.f63611a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("NavigateToWebPage(url=", this.f63611a, ")");
    }
}
