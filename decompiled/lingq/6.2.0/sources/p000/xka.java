package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class xka extends yka {

    /* JADX INFO: renamed from: a */
    public final String f68320a;

    public xka(String str) {
        str.getClass();
        this.f68320a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xka) && fa4.m11650l(this.f68320a, ((xka) obj).f68320a);
    }

    public final int hashCode() {
        return this.f68320a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnQueryChanged(query=", this.f68320a, ")");
    }
}
