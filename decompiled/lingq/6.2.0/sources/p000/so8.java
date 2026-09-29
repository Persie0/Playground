package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class so8 extends zyc {

    /* JADX INFO: renamed from: a */
    public final int f61111a;

    /* JADX INFO: renamed from: b */
    public final int f61112b;

    public so8(int i, int i2) {
        this.f61111a = i;
        this.f61112b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so8)) {
            return false;
        }
        so8 so8Var = (so8) obj;
        return this.f61111a == so8Var.f61111a && this.f61112b == so8Var.f61112b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61112b) + (Integer.hashCode(this.f61111a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f61111a, this.f61112b, "ConfirmPremiumLessonPurchase(price=", ", lessonId=", ")");
    }
}
