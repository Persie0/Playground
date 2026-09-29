package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class d42 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f34981a;

    public d42(String str) {
        this.f34981a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d42) && fa4.m11650l(this.f34981a, ((d42) obj).f34981a);
    }

    public final int hashCode() {
        String str = this.f34981a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Import(language=", this.f34981a, ")");
    }
}
