package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ola {

    /* JADX INFO: renamed from: a */
    public final String f54558a;

    public ola(String str) {
        str.getClass();
        this.f54558a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ola) && fa4.m11650l(this.f54558a, ((ola) obj).f54558a);
    }

    public final int hashCode() {
        return this.f54558a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("UserImportSelectionSearchState(query=", this.f54558a, ")");
    }
}
