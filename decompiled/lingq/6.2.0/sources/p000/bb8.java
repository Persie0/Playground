package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class bb8 extends cb8 {

    /* JADX INFO: renamed from: a */
    public final String f8281a;

    public bb8(String str) {
        str.getClass();
        this.f8281a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bb8) && fa4.m11650l(this.f8281a, ((bb8) obj).f8281a);
    }

    public final int hashCode() {
        return this.f8281a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnUnscrambleWordTapped(word=", this.f8281a, ")");
    }
}
