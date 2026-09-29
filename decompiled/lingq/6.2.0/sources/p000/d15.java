package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class d15 extends q15 {

    /* JADX INFO: renamed from: a */
    public final int f34833a;

    /* JADX INFO: renamed from: b */
    public final int f34834b;

    public d15(int i, int i2) {
        this.f34833a = i;
        this.f34834b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d15)) {
            return false;
        }
        d15 d15Var = (d15) obj;
        return this.f34833a == d15Var.f34833a && this.f34834b == d15Var.f34834b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34834b) + (Integer.hashCode(this.f34833a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f34833a, this.f34834b, "OnAudioTimestampSet(timeCentis=", ", type=", ")");
    }
}
