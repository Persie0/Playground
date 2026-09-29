package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class i42 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f43476a;

    public i42(String str) {
        this.f43476a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i42) && fa4.m11650l(this.f43476a, ((i42) obj).f43476a);
    }

    public final int hashCode() {
        String str = this.f43476a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Library(language=", this.f43476a, ")");
    }
}
