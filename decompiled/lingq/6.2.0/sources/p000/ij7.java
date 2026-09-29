package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ij7 {

    /* JADX INFO: renamed from: a */
    public final int f44189a;

    /* JADX INFO: renamed from: b */
    public final int f44190b;

    /* JADX INFO: renamed from: c */
    public final int f44191c;

    public ij7(int i, int i2, int i3) {
        this.f44189a = i;
        this.f44190b = i2;
        this.f44191c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij7)) {
            return false;
        }
        ij7 ij7Var = (ij7) obj;
        return this.f44189a == ij7Var.f44189a && this.f44190b == ij7Var.f44190b && this.f44191c == ij7Var.f44191c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44191c) + wq1.m24106b(this.f44190b, Integer.hashCode(this.f44189a) * 31, 31);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m22994q(this.f44189a, this.f44190b, "PremiumLessonDialogState(price=", ", balance=", ", lessonId="), this.f44191c, ")");
    }
}
