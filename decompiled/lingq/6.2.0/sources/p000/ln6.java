package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ln6 extends pn6 {

    /* JADX INFO: renamed from: a */
    public final om6 f49866a;

    public ln6(om6 om6Var) {
        om6Var.getClass();
        this.f49866a = om6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ln6) && fa4.m11650l(this.f49866a, ((ln6) obj).f49866a);
    }

    public final int hashCode() {
        return this.f49866a.hashCode();
    }

    public final String toString() {
        return "MarkNotificationRead(notification=" + this.f49866a + ")";
    }
}
