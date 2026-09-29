package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zt8 {

    /* JADX INFO: renamed from: a */
    public final byte[] f72153a;

    /* JADX INFO: renamed from: b */
    public int f72154b;

    /* JADX INFO: renamed from: c */
    public int f72155c;

    /* JADX INFO: renamed from: d */
    public boolean f72156d;

    /* JADX INFO: renamed from: e */
    public final boolean f72157e;

    /* JADX INFO: renamed from: f */
    public zt8 f72158f;

    /* JADX INFO: renamed from: g */
    public zt8 f72159g;

    public zt8(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.f72153a = bArr;
        this.f72154b = i;
        this.f72155c = i2;
        this.f72156d = z;
        this.f72157e = false;
    }

    /* JADX INFO: renamed from: a */
    public final zt8 m25776a() {
        zt8 zt8Var = this.f72158f;
        if (zt8Var == this) {
            zt8Var = null;
        }
        zt8 zt8Var2 = this.f72159g;
        zt8Var2.getClass();
        zt8Var2.f72158f = this.f72158f;
        zt8 zt8Var3 = this.f72158f;
        zt8Var3.getClass();
        zt8Var3.f72159g = this.f72159g;
        this.f72158f = null;
        this.f72159g = null;
        return zt8Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m25777b(zt8 zt8Var) {
        zt8Var.getClass();
        zt8Var.f72159g = this;
        zt8Var.f72158f = this.f72158f;
        zt8 zt8Var2 = this.f72158f;
        zt8Var2.getClass();
        zt8Var2.f72159g = zt8Var;
        this.f72158f = zt8Var;
    }

    /* JADX INFO: renamed from: c */
    public final zt8 m25778c() {
        this.f72156d = true;
        return new zt8(this.f72153a, this.f72154b, this.f72155c, true);
    }

    /* JADX INFO: renamed from: d */
    public final void m25779d(zt8 zt8Var, int i) {
        zt8Var.getClass();
        byte[] bArr = zt8Var.f72153a;
        if (!zt8Var.f72157e) {
            C3386nv.m17633t("only owner can write");
            return;
        }
        int i2 = zt8Var.f72155c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (zt8Var.f72156d) {
                ij6.m13959q();
                return;
            }
            int i4 = zt8Var.f72154b;
            if (i3 - i4 > 8192) {
                ij6.m13959q();
                return;
            } else {
                AbstractC3550rv.m20827U(bArr, 0, bArr, i4, i2);
                zt8Var.f72155c -= zt8Var.f72154b;
                zt8Var.f72154b = 0;
            }
        }
        int i5 = zt8Var.f72155c;
        int i6 = this.f72154b;
        AbstractC3550rv.m20827U(this.f72153a, i5, bArr, i6, i6 + i);
        zt8Var.f72155c += i;
        this.f72154b += i;
    }

    public zt8() {
        this.f72153a = new byte[8192];
        this.f72157e = true;
        this.f72156d = false;
    }
}
