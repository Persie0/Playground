package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class dv1 implements ev1 {

    /* JADX INFO: renamed from: a */
    public final String f36258a;

    public dv1(String str) {
        str.getClass();
        this.f36258a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dv1) && fa4.m11650l(this.f36258a, ((dv1) obj).f36258a);
    }

    public final int hashCode() {
        return this.f36258a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnSignupTeamSelected(code=", this.f36258a, ")");
    }
}
