package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class yn6 {

    /* JADX INFO: renamed from: a */
    public final String f70105a;

    /* JADX INFO: renamed from: b */
    public final Integer f70106b;

    /* JADX INFO: renamed from: c */
    public final boolean f70107c;

    /* JADX INFO: renamed from: d */
    public final boolean f70108d;

    /* JADX INFO: renamed from: e */
    public final xu8 f70109e;

    public yn6(String str, Integer num, boolean z, boolean z2, xu8 xu8Var) {
        str.getClass();
        xu8Var.getClass();
        this.f70105a = str;
        this.f70106b = num;
        this.f70107c = z;
        this.f70108d = z2;
        this.f70109e = xu8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn6)) {
            return false;
        }
        yn6 yn6Var = (yn6) obj;
        return fa4.m11650l(this.f70105a, yn6Var.f70105a) && fa4.m11650l(this.f70106b, yn6Var.f70106b) && this.f70107c == yn6Var.f70107c && this.f70108d == yn6Var.f70108d && fa4.m11650l(this.f70109e, yn6Var.f70109e);
    }

    public final int hashCode() {
        int iHashCode = this.f70105a.hashCode() * 31;
        Integer num = this.f70106b;
        return this.f70109e.hashCode() + g9a.m12428e(g9a.m12428e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f70107c), 31, this.f70108d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsDailyLingqsState(title=");
        sb.append(this.f70105a);
        sb.append(", count=");
        sb.append(this.f70106b);
        sb.append(", sendEmail=");
        wq1.m24101A(sb, this.f70107c, ", sendNotification=", this.f70108d, ", selectionSheet=");
        sb.append(this.f70109e);
        sb.append(")");
        return sb.toString();
    }
}
