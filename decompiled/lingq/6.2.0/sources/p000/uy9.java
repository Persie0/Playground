package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class uy9 extends xy9 {

    /* JADX INFO: renamed from: a */
    public final String f64546a;

    public uy9(String str) {
        str.getClass();
        this.f64546a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uy9) && fa4.m11650l(this.f64546a, ((uy9) obj).f64546a);
    }

    public final int hashCode() {
        return this.f64546a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("UpdateTokenTransliterationStyle(value=", this.f64546a, ")");
    }
}
