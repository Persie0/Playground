package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class yc7 implements zc7 {

    /* JADX INFO: renamed from: a */
    public final int f69634a;

    /* JADX INFO: renamed from: b */
    public final String f69635b;

    /* JADX INFO: renamed from: c */
    public final boolean f69636c;

    public yc7(String str, int i, boolean z) {
        this.f69634a = i;
        this.f69635b = str;
        this.f69636c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc7)) {
            return false;
        }
        yc7 yc7Var = (yc7) obj;
        return this.f69634a == yc7Var.f69634a && this.f69635b.equals(yc7Var.f69635b) && this.f69636c == yc7Var.f69636c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69636c) + ux5.m22980c(Integer.hashCode(this.f69634a) * 31, this.f69635b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m22995r(this.f69634a, "Remove(lessonId=", ", url=", this.f69635b, ", isInMultiplePlaylists="), this.f69636c, ")");
    }
}
