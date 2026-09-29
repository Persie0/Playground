package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class az1 {

    /* JADX INFO: renamed from: a */
    public final int f7682a;

    /* JADX INFO: renamed from: b */
    public final boolean f7683b;

    /* JADX INFO: renamed from: c */
    public final boolean f7684c;

    public az1(int i, boolean z, boolean z2) {
        this.f7682a = i;
        this.f7683b = z;
        this.f7684c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az1)) {
            return false;
        }
        az1 az1Var = (az1) obj;
        return this.f7682a == az1Var.f7682a && this.f7683b == az1Var.f7683b && this.f7684c == az1Var.f7684c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7684c) + g9a.m12428e(Integer.hashCode(this.f7682a) * 31, 31, this.f7683b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyLingqSettings(count=");
        sb.append(this.f7682a);
        sb.append(", sendEmail=");
        sb.append(this.f7683b);
        sb.append(", sendNotification=");
        return AbstractC3393o1.m17740o(sb, this.f7684c, ")");
    }
}
