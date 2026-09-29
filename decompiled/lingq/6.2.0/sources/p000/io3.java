package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class io3 extends ko3 {

    /* JADX INFO: renamed from: a */
    public final h24 f44353a;

    /* JADX INFO: renamed from: b */
    public final go3 f44354b;

    public io3(h24 h24Var, go3 go3Var) {
        go3Var.getClass();
        this.f44353a = h24Var;
        this.f44354b = go3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io3)) {
            return false;
        }
        io3 io3Var = (io3) obj;
        return this.f44353a.equals(io3Var.f44353a) && fa4.m11650l(this.f44354b, io3Var.f44354b);
    }

    public final int hashCode() {
        return this.f44354b.hashCode() + (this.f44353a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowNotification(notification=" + this.f44353a + ", goalMet=" + this.f44354b + ")";
    }
}
