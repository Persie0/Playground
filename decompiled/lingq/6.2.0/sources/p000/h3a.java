package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class h3a implements j3a {

    /* JADX INFO: renamed from: a */
    public final String f41760a;

    public h3a(String str) {
        str.getClass();
        this.f41760a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3a) && fa4.m11650l(this.f41760a, ((h3a) obj).f41760a);
    }

    public final int hashCode() {
        return this.f41760a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("UpdateNotes(newNotes=", this.f41760a, ")");
    }
}
