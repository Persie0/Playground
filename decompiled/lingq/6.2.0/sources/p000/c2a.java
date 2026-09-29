package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class c2a implements j3a {

    /* JADX INFO: renamed from: a */
    public final String f9372a;

    public c2a(String str) {
        str.getClass();
        this.f9372a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2a) && fa4.m11650l(this.f9372a, ((c2a) obj).f9372a);
    }

    public final int hashCode() {
        return this.f9372a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("AddCustomTag(tag=", this.f9372a, ")");
    }
}
