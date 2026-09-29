package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class xw0 extends yw0 {

    /* JADX INFO: renamed from: a */
    public final String f68880a;

    public xw0(String str) {
        this.f68880a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xw0) && this.f68880a.equals(((xw0) obj).f68880a);
    }

    public final int hashCode() {
        return this.f68880a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Streaming(text=", this.f68880a, ")");
    }
}
