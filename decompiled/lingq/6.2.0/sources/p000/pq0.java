package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class pq0 implements rq0 {

    /* JADX INFO: renamed from: a */
    public final String f56645a;

    public pq0(String str) {
        str.getClass();
        this.f56645a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pq0) && fa4.m11650l(this.f56645a, ((pq0) obj).f56645a);
    }

    public final int hashCode() {
        return this.f56645a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ToggleBookLanguage(language=", this.f56645a, ")");
    }
}
