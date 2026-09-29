package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hbb extends pbb {

    /* JADX INFO: renamed from: a */
    public final String f42144a;

    public hbb(String str) {
        str.getClass();
        this.f42144a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hbb) && fa4.m11650l(this.f42144a, ((hbb) obj).f42144a);
    }

    public final int hashCode() {
        return this.f42144a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ChangeVideo(videoUrl=", this.f42144a, ")");
    }
}
