package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class oi6 extends bh6 {

    /* JADX INFO: renamed from: a */
    public final boolean f54376a;

    /* JADX INFO: renamed from: b */
    public final boolean f54377b;

    public oi6(boolean z, boolean z2) {
        this.f54376a = z;
        this.f54377b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi6)) {
            return false;
        }
        oi6 oi6Var = (oi6) obj;
        return this.f54376a == oi6Var.f54376a && this.f54377b == oi6Var.f54377b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54377b) + (Boolean.hashCode(this.f54376a) * 31);
    }

    public final String toString() {
        return "ManageSubscription(goToUrl=" + this.f54376a + ", goToUpgrade=" + this.f54377b + ")";
    }
}
