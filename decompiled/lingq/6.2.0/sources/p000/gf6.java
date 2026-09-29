package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class gf6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final String f40730a;

    public gf6(String str) {
        this.f40730a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m12567a() {
        return this.f40730a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gf6) && this.f40730a.equals(((gf6) obj).f40730a);
    }

    public final int hashCode() {
        return this.f40730a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("YearInReview(url=", this.f40730a, ")");
    }
}
