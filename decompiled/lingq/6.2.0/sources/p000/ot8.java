package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ot8 implements nca {

    /* JADX INFO: renamed from: a */
    public final nt8 f54970a;

    /* JADX INFO: renamed from: b */
    public final k47 f54971b = new k47(32);

    /* JADX INFO: renamed from: c */
    public int f54972c;

    /* JADX INFO: renamed from: d */
    public int f54973d;

    /* JADX INFO: renamed from: e */
    public boolean f54974e;

    /* JADX INFO: renamed from: f */
    public boolean f54975f;

    public ot8(nt8 nt8Var) {
        this.f54970a = nt8Var;
    }

    @Override // p000.nca
    /* JADX INFO: renamed from: a */
    public final void mo3474a(int i, k47 k47Var) {
        int iM14842z;
        boolean z = (i & 1) != 0;
        if (z) {
            iM14842z = k47Var.f46701b + k47Var.m14842z();
        } else {
            iM14842z = -1;
        }
        if (this.f54975f) {
            if (!z) {
                return;
            }
            this.f54975f = false;
            k47Var.m14818M(iM14842z);
            this.f54973d = 0;
        }
        while (k47Var.m14820a() > 0) {
            int i2 = this.f54973d;
            k47 k47Var2 = this.f54971b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iM14842z2 = k47Var.m14842z();
                    k47Var.m14818M(k47Var.f46701b - 1);
                    if (iM14842z2 == 255) {
                        this.f54975f = true;
                        return;
                    }
                }
                int iMin = Math.min(k47Var.m14820a(), 3 - this.f54973d);
                k47Var.m14827k(k47Var2.f46700a, this.f54973d, iMin);
                int i3 = this.f54973d + iMin;
                this.f54973d = i3;
                if (i3 == 3) {
                    k47Var2.m14818M(0);
                    k47Var2.m14817L(3);
                    k47Var2.m14819N(1);
                    int iM14842z3 = k47Var2.m14842z();
                    int iM14842z4 = k47Var2.m14842z();
                    this.f54974e = (iM14842z3 & 128) != 0;
                    int i4 = (((iM14842z3 & 15) << 8) | iM14842z4) + 3;
                    this.f54972c = i4;
                    byte[] bArr = k47Var2.f46700a;
                    if (bArr.length < i4) {
                        k47Var2.m14821c(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(k47Var.m14820a(), this.f54972c - this.f54973d);
                k47Var.m14827k(k47Var2.f46700a, this.f54973d, iMin2);
                int i5 = this.f54973d + iMin2;
                this.f54973d = i5;
                int i6 = this.f54972c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.f54974e) {
                        k47Var2.m14817L(i6);
                    } else {
                        if (uma.m22815j(0, k47Var2.f46700a, i6, -1) != 0) {
                            this.f54975f = true;
                            return;
                        }
                        k47Var2.m14817L(this.f54972c - 4);
                    }
                    k47Var2.m14818M(0);
                    this.f54970a.mo11950b(k47Var2);
                    this.f54973d = 0;
                }
            }
        }
    }

    @Override // p000.nca
    /* JADX INFO: renamed from: c */
    public final void mo3476c(g1a g1aVar, jy2 jy2Var, mca mcaVar) {
        this.f54970a.mo11951c(g1aVar, jy2Var, mcaVar);
        this.f54975f = true;
    }

    @Override // p000.nca
    /* JADX INFO: renamed from: d */
    public final void mo3477d() {
        this.f54975f = true;
    }
}
