package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class bza extends cza {

    /* JADX INFO: renamed from: a */
    public final String f9206a;

    public bza(String str) {
        str.getClass();
        this.f9206a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bza) && fa4.m11650l(this.f9206a, ((bza) obj).f9206a);
    }

    public final int hashCode() {
        return this.f9206a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnQueryChanged(query=", this.f9206a, ")");
    }
}
