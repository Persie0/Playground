package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class yh6 extends bh6 {

    /* JADX INFO: renamed from: a */
    public final om6 f69850a;

    public yh6(om6 om6Var) {
        om6Var.getClass();
        this.f69850a = om6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yh6) && fa4.m11650l(this.f69850a, ((yh6) obj).f69850a);
    }

    public final int hashCode() {
        return this.f69850a.hashCode();
    }

    public final String toString() {
        return "ToNotification(notification=" + this.f69850a + ")";
    }
}
