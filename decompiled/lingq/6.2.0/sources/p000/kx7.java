package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class kx7 extends mx7 {

    /* JADX INFO: renamed from: a */
    public final int f48545a;

    /* JADX INFO: renamed from: b */
    public final int f48546b;

    /* JADX INFO: renamed from: c */
    public final boolean f48547c;

    public kx7(int i, int i2, boolean z) {
        this.f48545a = i;
        this.f48546b = i2;
        this.f48547c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx7)) {
            return false;
        }
        kx7 kx7Var = (kx7) obj;
        return this.f48545a == kx7Var.f48545a && this.f48546b == kx7Var.f48546b && this.f48547c == kx7Var.f48547c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48547c) + wq1.m24106b(this.f48546b, Integer.hashCode(this.f48545a) * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m22994q(this.f48545a, this.f48546b, "NavigateReaderEdit(lessonId=", ", sentenceIndex=", ", hasAudio="), this.f48547c, ")");
    }
}
