package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class nj2 implements pj2 {

    /* JADX INFO: renamed from: a */
    public final String f52827a;

    public nj2(String str) {
        this.f52827a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nj2) && this.f52827a.equals(((nj2) obj).f52827a);
    }

    public final int hashCode() {
        return this.f52827a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Error(message=", this.f52827a, ")");
    }
}
