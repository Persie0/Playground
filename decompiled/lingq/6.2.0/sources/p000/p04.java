package p000;

/* JADX INFO: loaded from: classes.dex */
public final class p04 {

    /* JADX INFO: renamed from: k */
    public static int f55356k;

    /* JADX INFO: renamed from: l */
    public static final to2 f55357l = new to2();

    /* JADX INFO: renamed from: a */
    public final String f55358a;

    /* JADX INFO: renamed from: b */
    public final float f55359b;

    /* JADX INFO: renamed from: c */
    public final float f55360c;

    /* JADX INFO: renamed from: d */
    public final float f55361d;

    /* JADX INFO: renamed from: e */
    public final float f55362e;

    /* JADX INFO: renamed from: f */
    public final roa f55363f;

    /* JADX INFO: renamed from: g */
    public final long f55364g;

    /* JADX INFO: renamed from: h */
    public final int f55365h;

    /* JADX INFO: renamed from: i */
    public final boolean f55366i;

    /* JADX INFO: renamed from: j */
    public final int f55367j;

    public p04(String str, float f, float f2, float f3, float f4, roa roaVar, long j, int i, boolean z) {
        int i2;
        synchronized (f55357l) {
            i2 = f55356k;
            f55356k = i2 + 1;
        }
        this.f55358a = str;
        this.f55359b = f;
        this.f55360c = f2;
        this.f55361d = f3;
        this.f55362e = f4;
        this.f55363f = roaVar;
        this.f55364g = j;
        this.f55365h = i;
        this.f55366i = z;
        this.f55367j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p04)) {
            return false;
        }
        p04 p04Var = (p04) obj;
        return fa4.m11650l(this.f55358a, p04Var.f55358a) && xj2.m24560b(this.f55359b, p04Var.f55359b) && xj2.m24560b(this.f55360c, p04Var.f55360c) && this.f55361d == p04Var.f55361d && this.f55362e == p04Var.f55362e && this.f55363f.equals(p04Var.f55363f) && aa1.m199c(this.f55364g, p04Var.f55364g) && this.f55365h == p04Var.f55365h && this.f55366i == p04Var.f55366i;
    }

    public final int hashCode() {
        int iHashCode = (this.f55363f.hashCode() + wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(this.f55358a.hashCode() * 31, this.f55359b, 31), this.f55360c, 31), this.f55361d, 31), this.f55362e, 31)) * 31;
        int i = aa1.f413l;
        return Boolean.hashCode(this.f55366i) + wq1.m24106b(this.f55365h, ux5.m22981d(this.f55364g, iHashCode, 31), 31);
    }
}
