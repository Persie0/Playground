package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class yf0 extends bg0 {

    /* JADX INFO: renamed from: a */
    public final int f69760a;

    /* JADX INFO: renamed from: b */
    public final int f69761b;

    public yf0(int i, int i2) {
        this.f69760a = i;
        this.f69761b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf0)) {
            return false;
        }
        yf0 yf0Var = (yf0) obj;
        return this.f69760a == yf0Var.f69760a && this.f69761b == yf0Var.f69761b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69761b) + (Integer.hashCode(this.f69760a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f69760a, this.f69761b, "LastPage(cardsSize=", ", wordsSize=", ")");
    }
}
