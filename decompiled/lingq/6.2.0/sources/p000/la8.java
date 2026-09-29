package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class la8 extends cb8 {

    /* JADX INFO: renamed from: a */
    public final String f49370a;

    public la8(String str) {
        str.getClass();
        this.f49370a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof la8) && fa4.m11650l(this.f49370a, ((la8) obj).f49370a);
    }

    public final int hashCode() {
        return this.f49370a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnSessionItemClicked(term=", this.f49370a, ")");
    }
}
