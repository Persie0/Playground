package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class c15 extends q15 {

    /* JADX INFO: renamed from: a */
    public final int f9309a;

    /* JADX INFO: renamed from: b */
    public final int f9310b;

    public c15(int i, int i2) {
        this.f9309a = i;
        this.f9310b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c15)) {
            return false;
        }
        c15 c15Var = (c15) obj;
        return this.f9309a == c15Var.f9309a && this.f9310b == c15Var.f9310b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9310b) + (Integer.hashCode(this.f9309a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f9309a, this.f9310b, "OnAudioTimestampAdjusted(quantity=", ", type=", ")");
    }
}
