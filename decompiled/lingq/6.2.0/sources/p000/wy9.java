package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class wy9 extends xy9 {

    /* JADX INFO: renamed from: a */
    public final String f67530a;

    public wy9(String str) {
        str.getClass();
        this.f67530a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy9) && fa4.m11650l(this.f67530a, ((wy9) obj).f67530a);
    }

    public final int hashCode() {
        return this.f67530a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("UpdateTransliterationStyle(value=", this.f67530a, ")");
    }
}
