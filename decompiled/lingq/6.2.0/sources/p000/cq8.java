package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class cq8 extends dq8 {

    /* JADX INFO: renamed from: a */
    public final String f34392a;

    public cq8(String str) {
        str.getClass();
        this.f34392a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cq8) && fa4.m11650l(this.f34392a, ((cq8) obj).f34392a);
    }

    public final int hashCode() {
        return this.f34392a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnQueryChanged(query=", this.f34392a, ")");
    }
}
