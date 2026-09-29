package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class i0b extends p0b {

    /* JADX INFO: renamed from: a */
    public final String f43301a;

    public i0b(String str) {
        str.getClass();
        this.f43301a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0b) && fa4.m11650l(this.f43301a, ((i0b) obj).f43301a);
    }

    public final int hashCode() {
        return this.f43301a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OpenCard(term=", this.f43301a, ")");
    }
}
