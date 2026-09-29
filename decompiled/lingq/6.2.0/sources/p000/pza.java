package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class pza extends qza {

    /* JADX INFO: renamed from: a */
    public final String f57060a;

    public pza(String str) {
        str.getClass();
        this.f57060a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pza) && fa4.m11650l(this.f57060a, ((pza) obj).f57060a);
    }

    public final int hashCode() {
        return this.f57060a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnSelectionQueryChanged(query=", this.f57060a, ")");
    }
}
