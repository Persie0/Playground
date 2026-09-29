package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class t95 extends w95 {

    /* JADX INFO: renamed from: a */
    public final String f62011a;

    public t95(String str) {
        this.f62011a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m21903a() {
        return this.f62011a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t95) && fa4.m11650l(this.f62011a, ((t95) obj).f62011a);
    }

    public final int hashCode() {
        String str = this.f62011a;
        return 857502373 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return wq1.m24118n("NavigateToUpgrade(source=library, offer=", this.f62011a, ")");
    }
}
