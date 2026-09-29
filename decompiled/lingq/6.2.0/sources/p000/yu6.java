package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class yu6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final String f70488a;

    public yu6(String str) {
        str.getClass();
        this.f70488a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m25344a() {
        return this.f70488a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yu6) && fa4.m11650l(this.f70488a, ((yu6) obj).f70488a);
    }

    public final int hashCode() {
        return this.f70488a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("DictionaryLocaleSelected(locale=", this.f70488a, ")");
    }
}
