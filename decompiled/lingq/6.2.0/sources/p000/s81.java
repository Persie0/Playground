package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class s81 extends v81 {

    /* JADX INFO: renamed from: a */
    public final String f60503a;

    public s81(String str) {
        this.f60503a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s81) && this.f60503a.equals(((s81) obj).f60503a);
    }

    public final int hashCode() {
        return this.f60503a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnOpenWeb(url=", this.f60503a, ")");
    }
}
