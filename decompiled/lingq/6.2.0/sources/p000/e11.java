package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class e11 {

    /* JADX INFO: renamed from: a */
    public final long f36556a;

    /* JADX INFO: renamed from: b */
    public final long f36557b;

    /* JADX INFO: renamed from: c */
    public final long f36558c;

    /* JADX INFO: renamed from: d */
    public final long f36559d;

    /* JADX INFO: renamed from: e */
    public final long f36560e;

    /* JADX INFO: renamed from: f */
    public final long f36561f;

    /* JADX INFO: renamed from: g */
    public final long f36562g;

    /* JADX INFO: renamed from: h */
    public final long f36563h;

    public e11(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f36556a = j;
        this.f36557b = j2;
        this.f36558c = j3;
        this.f36559d = j4;
        this.f36560e = j5;
        this.f36561f = j6;
        this.f36562g = j7;
        this.f36563h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e11)) {
            return false;
        }
        e11 e11Var = (e11) obj;
        return aa1.m199c(this.f36556a, e11Var.f36556a) && aa1.m199c(this.f36557b, e11Var.f36557b) && aa1.m199c(this.f36558c, e11Var.f36558c) && aa1.m199c(this.f36559d, e11Var.f36559d) && aa1.m199c(this.f36560e, e11Var.f36560e) && aa1.m199c(this.f36561f, e11Var.f36561f) && aa1.m199c(this.f36562g, e11Var.f36562g) && aa1.m199c(this.f36563h, e11Var.f36563h);
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Long.hashCode(this.f36563h) + ux5.m22981d(this.f36562g, ux5.m22981d(this.f36561f, ux5.m22981d(this.f36560e, ux5.m22981d(this.f36559d, ux5.m22981d(this.f36558c, ux5.m22981d(this.f36557b, Long.hashCode(this.f36556a) * 31, 31), 31), 31), 31), 31), 31);
    }
}
