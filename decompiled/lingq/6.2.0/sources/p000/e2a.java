package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class e2a implements j3a {

    /* JADX INFO: renamed from: a */
    public final String f36630a;

    public e2a(String str) {
        str.getClass();
        this.f36630a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2a) && fa4.m11650l(this.f36630a, ((e2a) obj).f36630a);
    }

    public final int hashCode() {
        return this.f36630a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ChangePopularMeaningLocale(newLocale=", this.f36630a, ")");
    }
}
