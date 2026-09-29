package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class o42 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f53819a;

    public o42(String str) {
        this.f53819a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o42) && fa4.m11650l(this.f53819a, ((o42) obj).f53819a);
    }

    public final int hashCode() {
        String str = this.f53819a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Redirect(url=", this.f53819a, ")");
    }
}
