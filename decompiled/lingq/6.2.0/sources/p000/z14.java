package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class z14 extends d24 {

    /* JADX INFO: renamed from: a */
    public final String f70746a;

    public z14(String str) {
        str.getClass();
        this.f70746a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z14) && fa4.m11650l(this.f70746a, ((z14) obj).f70746a);
    }

    public final int hashCode() {
        return this.f70746a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnContentChanged(content=", this.f70746a, ")");
    }
}
