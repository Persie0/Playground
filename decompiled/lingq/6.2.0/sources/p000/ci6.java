package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ci6 extends bh6 {

    /* JADX INFO: renamed from: a */
    public final String f10114a;

    public ci6(String str) {
        this.f10114a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ci6) && this.f10114a.equals(((ci6) obj).f10114a);
    }

    public final int hashCode() {
        return this.f10114a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ToCheckEmail(email=", this.f10114a, ")");
    }
}
