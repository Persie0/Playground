package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class i14 implements l14 {

    /* JADX INFO: renamed from: a */
    public final String f43328a;

    public i14(String str) {
        this.f43328a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i14) && fa4.m11650l(this.f43328a, ((i14) obj).f43328a);
    }

    public final int hashCode() {
        String str = this.f43328a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ImportFailed(message=", this.f43328a, ")");
    }
}
