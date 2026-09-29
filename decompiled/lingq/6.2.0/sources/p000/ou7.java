package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ou7 extends gv7 {

    /* JADX INFO: renamed from: a */
    public final String f55003a;

    public ou7(String str) {
        str.getClass();
        this.f55003a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ou7) && fa4.m11650l(this.f55003a, ((ou7) obj).f55003a);
    }

    public final int hashCode() {
        return this.f55003a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("GrammarGuide(url=", this.f55003a, ")");
    }
}
