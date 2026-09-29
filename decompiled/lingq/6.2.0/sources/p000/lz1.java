package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class lz1 implements nz1 {

    /* JADX INFO: renamed from: a */
    public final String f50327a;

    public lz1(String str) {
        this.f50327a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lz1) && this.f50327a.equals(((lz1) obj).f50327a);
    }

    public final int hashCode() {
        return this.f50327a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Message(text=", this.f50327a, ")");
    }
}
