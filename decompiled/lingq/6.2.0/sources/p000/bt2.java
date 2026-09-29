package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class bt2 extends et2 {

    /* JADX INFO: renamed from: a */
    public final String f8970a;

    public bt2(String str) {
        this.f8970a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bt2) && this.f8970a.equals(((bt2) obj).f8970a);
    }

    public final int hashCode() {
        return this.f8970a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Generic(message=", this.f8970a, ")");
    }
}
