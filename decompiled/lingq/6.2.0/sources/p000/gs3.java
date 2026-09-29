package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class gs3 extends hs3 {

    /* JADX INFO: renamed from: a */
    public final String f41263a;

    public gs3(String str) {
        this.f41263a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gs3) && this.f41263a.equals(((gs3) obj).f41263a);
    }

    public final int hashCode() {
        return this.f41263a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnWeb(url=", this.f41263a, ")");
    }
}
