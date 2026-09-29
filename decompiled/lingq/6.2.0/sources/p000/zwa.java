package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class zwa extends fxa {

    /* JADX INFO: renamed from: a */
    public final String f72323a;

    public zwa(String str) {
        str.getClass();
        this.f72323a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zwa) && fa4.m11650l(this.f72323a, ((zwa) obj).f72323a);
    }

    public final int hashCode() {
        return this.f72323a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnQueryChanged(query=", this.f72323a, ")");
    }
}
