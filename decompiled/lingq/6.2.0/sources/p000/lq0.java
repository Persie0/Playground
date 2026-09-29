package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class lq0 implements rq0 {

    /* JADX INFO: renamed from: a */
    public final String f49996a;

    public lq0(String str) {
        this.f49996a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lq0) && this.f49996a.equals(((lq0) obj).f49996a);
    }

    public final int hashCode() {
        return this.f49996a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ChangeCountry(country=", this.f49996a, ")");
    }
}
