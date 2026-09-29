package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class o81 extends v81 {

    /* JADX INFO: renamed from: a */
    public final String f53967a;

    public o81(String str) {
        this.f53967a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o81) && this.f53967a.equals(((o81) obj).f53967a);
    }

    public final int hashCode() {
        return this.f53967a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnCopyLink(url=", this.f53967a, ")");
    }
}
