package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class iz0 extends nz0 {

    /* JADX INFO: renamed from: a */
    public final String f44793a;

    public iz0(String str) {
        this.f44793a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iz0) && this.f44793a.equals(((iz0) obj).f44793a);
    }

    public final int hashCode() {
        return this.f44793a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Content(accumulatedText=", this.f44793a, ")");
    }
}
