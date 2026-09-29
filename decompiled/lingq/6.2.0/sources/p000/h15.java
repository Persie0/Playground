package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class h15 extends q15 {

    /* JADX INFO: renamed from: a */
    public final String f41661a;

    public h15(String str) {
        str.getClass();
        this.f41661a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h15) && fa4.m11650l(this.f41661a, ((h15) obj).f41661a);
    }

    public final int hashCode() {
        return this.f41661a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnNoteFocused(language=", this.f41661a, ")");
    }
}
