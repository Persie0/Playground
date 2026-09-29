package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class oza extends qza {

    /* JADX INFO: renamed from: a */
    public final String f55339a;

    public oza(String str) {
        str.getClass();
        this.f55339a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oza) && fa4.m11650l(this.f55339a, ((oza) obj).f55339a);
    }

    public final int hashCode() {
        return this.f55339a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnSelectionItemSelected(key=", this.f55339a, ")");
    }
}
