package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class m42 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f50562a;

    public m42(String str) {
        this.f50562a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m42) && fa4.m11650l(this.f50562a, ((m42) obj).f50562a);
    }

    public final int hashCode() {
        String str = this.f50562a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Lynx(language=", this.f50562a, ")");
    }
}
