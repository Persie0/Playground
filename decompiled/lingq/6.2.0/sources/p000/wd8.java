package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class wd8 extends xd8 {

    /* JADX INFO: renamed from: a */
    public final String f66658a;

    public wd8(String str) {
        this.f66658a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wd8) && this.f66658a.equals(((wd8) obj).f66658a);
    }

    public final int hashCode() {
        return this.f66658a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OpenWebPage(url=", this.f66658a, ")");
    }
}
