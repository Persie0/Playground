package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qx9 extends i16 {

    /* JADX INFO: renamed from: b */
    public final String f58346b;

    /* JADX INFO: renamed from: c */
    public final vx9 f58347c;

    /* JADX INFO: renamed from: d */
    public final wa3 f58348d;

    /* JADX INFO: renamed from: e */
    public final int f58349e;

    /* JADX INFO: renamed from: f */
    public final boolean f58350f;

    /* JADX INFO: renamed from: g */
    public final int f58351g;

    /* JADX INFO: renamed from: h */
    public final int f58352h;

    public qx9(String str, vx9 vx9Var, wa3 wa3Var, int i, boolean z, int i2, int i3) {
        this.f58346b = str;
        this.f58347c = vx9Var;
        this.f58348d = wa3Var;
        this.f58349e = i;
        this.f58350f = z;
        this.f58351g = i2;
        this.f58352h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx9)) {
            return false;
        }
        qx9 qx9Var = (qx9) obj;
        return fa4.m11650l(this.f58346b, qx9Var.f58346b) && fa4.m11650l(this.f58347c, qx9Var.f58347c) && fa4.m11650l(this.f58348d, qx9Var.f58348d) && this.f58349e == qx9Var.f58349e && this.f58350f == qx9Var.f58350f && this.f58351g == qx9Var.f58351g && this.f58352h == qx9Var.f58352h;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        tx9 tx9Var = new tx9();
        tx9Var.f63063J = this.f58346b;
        tx9Var.f63064K = this.f58347c;
        tx9Var.f63065L = this.f58348d;
        tx9Var.f63066M = this.f58349e;
        tx9Var.f63067N = this.f58350f;
        tx9Var.f63068O = this.f58351g;
        tx9Var.f63069P = this.f58352h;
        return tx9Var;
    }

    public final int hashCode() {
        return (((g9a.m12428e(wq1.m24106b(this.f58349e, (this.f58348d.hashCode() + ux5.m22982e(this.f58347c, this.f58346b.hashCode() * 31, 31)) * 31, 31), 31, this.f58350f) + this.f58351g) * 31) + this.f58352h) * 31;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        wa3 wa3Var;
        wa3 wa3Var2;
        int i5;
        int i6;
        tx9 tx9Var = (tx9) d16Var;
        tx9Var.getClass();
        vx9 vx9Var = tx9Var.f63064K;
        boolean z5 = false;
        boolean z6 = true;
        vx9 vx9Var2 = this.f58347c;
        if (vx9Var2 != vx9Var) {
            if (!vx9Var2.f66065a.m13211c(vx9Var.f66065a)) {
                z = true;
            }
            str = tx9Var.f63063J;
            str2 = this.f58346b;
            if (!fa4.m11650l(str, str2)) {
                tx9Var.f63063J = str2;
                tx9Var.f63073T = null;
                z5 = true;
            }
            z2 = !tx9Var.f63064K.m23587d(vx9Var2);
            tx9Var.f63064K = vx9Var2;
            i = tx9Var.f63069P;
            i2 = this.f58352h;
            if (i != i2) {
                tx9Var.f63069P = i2;
                z2 = true;
            }
            i3 = tx9Var.f63068O;
            i4 = this.f58351g;
            if (i3 != i4) {
                tx9Var.f63068O = i4;
                z2 = true;
            }
            z3 = tx9Var.f63067N;
            z4 = this.f58350f;
            if (z3 != z4) {
                tx9Var.f63067N = z4;
                z2 = true;
            }
            wa3Var = tx9Var.f63065L;
            wa3Var2 = this.f58348d;
            if (!fa4.m11650l(wa3Var, wa3Var2)) {
                tx9Var.f63065L = wa3Var2;
                z2 = true;
            }
            i5 = tx9Var.f63066M;
            i6 = this.f58349e;
            if (i5 == i6) {
                z6 = z2;
            } else {
                tx9Var.f63066M = i6;
            }
            if (z5 || z6) {
                i37 i37VarM22334Z0 = tx9Var.m22334Z0();
                String str3 = tx9Var.f63063J;
                vx9 vx9Var3 = tx9Var.f63064K;
                wa3 wa3Var3 = tx9Var.f63065L;
                int i7 = tx9Var.f63066M;
                boolean z7 = tx9Var.f63067N;
                int i8 = tx9Var.f63068O;
                int i9 = tx9Var.f63069P;
                i37VarM22334Z0.f43425a = str3;
                i37VarM22334Z0.f43426b = vx9Var3;
                i37VarM22334Z0.f43427c = wa3Var3;
                i37VarM22334Z0.f43428d = i7;
                i37VarM22334Z0.f43429e = z7;
                i37VarM22334Z0.f43430f = i8;
                i37VarM22334Z0.f43431g = i9;
                i37VarM22334Z0.f43443s = (i37VarM22334Z0.f43443s << 2) | 2;
                i37VarM22334Z0.m13646c();
            }
            if (tx9Var.f34836I) {
                if (z5 || (z && tx9Var.f63072S != null)) {
                    thb.m22062u(tx9Var);
                }
                if (z5 || z6) {
                    d32.m10020R(tx9Var);
                    AbstractC3489q9.m19789s(tx9Var);
                }
                if (z) {
                    AbstractC3489q9.m19789s(tx9Var);
                }
            }
            return;
        }
        vx9Var2.getClass();
        z = false;
        str = tx9Var.f63063J;
        str2 = this.f58346b;
        if (!fa4.m11650l(str, str2)) {
            tx9Var.f63063J = str2;
            tx9Var.f63073T = null;
            z5 = true;
        }
        z2 = !tx9Var.f63064K.m23587d(vx9Var2);
        tx9Var.f63064K = vx9Var2;
        i = tx9Var.f63069P;
        i2 = this.f58352h;
        if (i != i2) {
            tx9Var.f63069P = i2;
            z2 = true;
        }
        i3 = tx9Var.f63068O;
        i4 = this.f58351g;
        if (i3 != i4) {
            tx9Var.f63068O = i4;
            z2 = true;
        }
        z3 = tx9Var.f63067N;
        z4 = this.f58350f;
        if (z3 != z4) {
            tx9Var.f63067N = z4;
            z2 = true;
        }
        wa3Var = tx9Var.f63065L;
        wa3Var2 = this.f58348d;
        if (!fa4.m11650l(wa3Var, wa3Var2)) {
            tx9Var.f63065L = wa3Var2;
            z2 = true;
        }
        i5 = tx9Var.f63066M;
        i6 = this.f58349e;
        if (i5 == i6) {
            z6 = z2;
        } else {
            tx9Var.f63066M = i6;
        }
        if (z5) {
            i37 i37VarM22334Z1 = tx9Var.m22334Z0();
            String str4 = tx9Var.f63063J;
            vx9 vx9Var4 = tx9Var.f63064K;
            wa3 wa3Var4 = tx9Var.f63065L;
            int i10 = tx9Var.f63066M;
            boolean z8 = tx9Var.f63067N;
            int i11 = tx9Var.f63068O;
            int i12 = tx9Var.f63069P;
            i37VarM22334Z1.f43425a = str4;
            i37VarM22334Z1.f43426b = vx9Var4;
            i37VarM22334Z1.f43427c = wa3Var4;
            i37VarM22334Z1.f43428d = i10;
            i37VarM22334Z1.f43429e = z8;
            i37VarM22334Z1.f43430f = i11;
            i37VarM22334Z1.f43431g = i12;
            i37VarM22334Z1.f43443s = (i37VarM22334Z1.f43443s << 2) | 2;
            i37VarM22334Z1.m13646c();
        } else {
            i37 i37VarM22334Z2 = tx9Var.m22334Z0();
            String str5 = tx9Var.f63063J;
            vx9 vx9Var5 = tx9Var.f63064K;
            wa3 wa3Var5 = tx9Var.f63065L;
            int i13 = tx9Var.f63066M;
            boolean z9 = tx9Var.f63067N;
            int i14 = tx9Var.f63068O;
            int i15 = tx9Var.f63069P;
            i37VarM22334Z2.f43425a = str5;
            i37VarM22334Z2.f43426b = vx9Var5;
            i37VarM22334Z2.f43427c = wa3Var5;
            i37VarM22334Z2.f43428d = i13;
            i37VarM22334Z2.f43429e = z9;
            i37VarM22334Z2.f43430f = i14;
            i37VarM22334Z2.f43431g = i15;
            i37VarM22334Z2.f43443s = (i37VarM22334Z2.f43443s << 2) | 2;
            i37VarM22334Z2.m13646c();
        }
        if (tx9Var.f34836I) {
            return;
        }
        if (z5) {
            thb.m22062u(tx9Var);
        } else {
            thb.m22062u(tx9Var);
        }
        if (z5) {
            d32.m10020R(tx9Var);
            AbstractC3489q9.m19789s(tx9Var);
        } else {
            d32.m10020R(tx9Var);
            AbstractC3489q9.m19789s(tx9Var);
        }
        if (z) {
            AbstractC3489q9.m19789s(tx9Var);
        }
    }
}
