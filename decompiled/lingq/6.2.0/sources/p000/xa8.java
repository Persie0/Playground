package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class xa8 extends cb8 {

    /* JADX INFO: renamed from: a */
    public final String f68000a;

    public xa8(String str) {
        str.getClass();
        this.f68000a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xa8) && fa4.m11650l(this.f68000a, ((xa8) obj).f68000a);
    }

    public final int hashCode() {
        return this.f68000a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnTagClicked(tag=", this.f68000a, ")");
    }
}
