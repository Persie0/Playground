package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class dv6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final String f36271a;

    public dv6(String str) {
        str.getClass();
        this.f36271a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m10685a() {
        return this.f36271a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dv6) && fa4.m11650l(this.f36271a, ((dv6) obj).f36271a);
    }

    public final int hashCode() {
        return this.f36271a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("LevelSelected(level=", this.f36271a, ")");
    }
}
