package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class fu1 implements hu1 {

    /* JADX INFO: renamed from: a */
    public final String f39637a;

    public fu1(String str) {
        str.getClass();
        this.f39637a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fu1) && fa4.m11650l(this.f39637a, ((fu1) obj).f39637a);
    }

    public final int hashCode() {
        return this.f39637a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("JoinedWelcome(teamCode=", this.f39637a, ")");
    }
}
