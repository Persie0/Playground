package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class gs8 extends hs8 {

    /* JADX INFO: renamed from: a */
    public final String f41268a;

    public gs8(String str) {
        this.f41268a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gs8) && this.f41268a.equals(((gs8) obj).f41268a);
    }

    public final int hashCode() {
        return this.f41268a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnUndoSourceBlacklist(source=", this.f41268a, ")");
    }
}
