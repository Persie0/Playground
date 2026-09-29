package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class nx7 {

    /* JADX INFO: renamed from: a */
    public final h24 f53363a;

    /* JADX INFO: renamed from: b */
    public final go3 f53364b;

    public nx7(h24 h24Var, go3 go3Var) {
        go3Var.getClass();
        this.f53363a = h24Var;
        this.f53364b = go3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx7)) {
            return false;
        }
        nx7 nx7Var = (nx7) obj;
        return this.f53363a.equals(nx7Var.f53363a) && fa4.m11650l(this.f53364b, nx7Var.f53364b);
    }

    public final int hashCode() {
        return this.f53364b.hashCode() + (this.f53363a.hashCode() * 31);
    }

    public final String toString() {
        return "ReaderNotificationEntry(notification=" + this.f53363a + ", goalMet=" + this.f53364b + ")";
    }
}
