package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class iv6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final String f44676a;

    public iv6(String str) {
        str.getClass();
        this.f44676a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m14161a() {
        return this.f44676a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iv6) && fa4.m11650l(this.f44676a, ((iv6) obj).f44676a);
    }

    public final int hashCode() {
        return this.f44676a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("NameProvided(name=", this.f44676a, ")");
    }
}
