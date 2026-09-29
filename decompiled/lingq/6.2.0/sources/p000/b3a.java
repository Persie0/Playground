package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class b3a implements j3a {

    /* JADX INFO: renamed from: a */
    public final String f7880a;

    public b3a(String str) {
        str.getClass();
        this.f7880a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3a) && fa4.m11650l(this.f7880a, ((b3a) obj).f7880a);
    }

    public final int hashCode() {
        return this.f7880a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("SelectTag(tag=", this.f7880a, ")");
    }
}
