package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ug6 implements vg6 {

    /* JADX INFO: renamed from: a */
    public final String f63890a;

    public ug6(String str) {
        str.getClass();
        this.f63890a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m22727a() {
        return this.f63890a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug6) && fa4.m11650l(this.f63890a, ((ug6) obj).f63890a);
    }

    public final int hashCode() {
        return this.f63890a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("NavigateWeb(url=", this.f63890a, ")");
    }
}
