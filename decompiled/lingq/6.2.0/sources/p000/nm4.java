package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class nm4 extends qm4 {

    /* JADX INFO: renamed from: a */
    public final String f52958a;

    public nm4(String str) {
        str.getClass();
        this.f52958a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nm4) && fa4.m11650l(this.f52958a, ((nm4) obj).f52958a);
    }

    public final int hashCode() {
        return this.f52958a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Loading(language=", this.f52958a, ")");
    }
}
