package p000;

/* JADX INFO: loaded from: classes.dex */
public final class am4 {

    /* JADX INFO: renamed from: a */
    public final String f826a;

    public am4(String str) {
        str.getClass();
        this.f826a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am4) && fa4.m11650l(this.f826a, ((am4) obj).f826a);
    }

    public final int hashCode() {
        return this.f826a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("LanguageInfo(code=", this.f826a, ")");
    }
}
