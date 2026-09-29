package p000;

import androidx.compose.runtime.snapshots.C0285a;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class nj6 extends s66 {

    /* JADX INFO: renamed from: o */
    public final s66 f52844o;

    /* JADX INFO: renamed from: p */
    public boolean f52845p;

    public nj6(long j, C0285a c0285a, vi3 vi3Var, vi3 vi3Var2, s66 s66Var) {
        super(j, c0285a, vi3Var, vi3Var2);
        this.f52844o = s66Var;
        s66Var.mo3166k();
    }

    @Override // p000.s66, p000.jc9
    /* JADX INFO: renamed from: c */
    public final void mo3162c() {
        if (this.f45418c) {
            return;
        }
        super.mo3162c();
        if (this.f52845p) {
            return;
        }
        this.f52845p = true;
        this.f52844o.mo3167l();
    }

    @Override // p000.s66
    /* JADX INFO: renamed from: w */
    public final bna mo3587w() {
        nj6 nj6Var;
        s66 s66Var = this.f52844o;
        if (s66Var.f60427m || s66Var.f45418c) {
            return new kc9(this);
        }
        o66 o66Var = this.f60422h;
        long j = this.f45417b;
        HashMap mapM17350b = o66Var != null ? nc9.m17350b(s66Var.mo3582g(), this, this.f52844o.mo3581d()) : null;
        Object obj = nc9.f52602c;
        synchronized (obj) {
            try {
                nc9.m17351c(this);
                if (o66Var == null || o66Var.f1305d == 0) {
                    nj6Var = this;
                    nj6Var.m14391a();
                } else {
                    nj6Var = this;
                    bna bnaVarM21129z = nj6Var.m21129z(this.f52844o.mo3582g(), o66Var, mapM17350b, this.f52844o.mo3581d());
                    if (!bnaVarM21129z.equals(lc9.f49479x)) {
                        return bnaVarM21129z;
                    }
                    o66 o66VarMo3588x = nj6Var.f52844o.mo3588x();
                    if (o66VarMo3588x != null) {
                        o66VarMo3588x.m17817j(o66Var);
                    } else {
                        nj6Var.f52844o.mo3578B(o66Var);
                        nj6Var.f60422h = null;
                    }
                }
                if (fa4.m11652n(nj6Var.f52844o.mo3582g(), j) < 0) {
                    nj6Var.f52844o.m21128v();
                }
                s66 s66Var2 = nj6Var.f52844o;
                s66Var2.mo3584r(s66Var2.mo3581d().m1314f(j).m1313d(nj6Var.f60424j));
                nj6Var.f52844o.m21127A(j);
                s66 s66Var3 = nj6Var.f52844o;
                int i = nj6Var.f45419d;
                nj6Var.f45419d = -1;
                if (i >= 0) {
                    int[] iArr = s66Var3.f60425k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    s66Var3.f60425k = iArrCopyOf;
                } else {
                    s66Var3.getClass();
                }
                s66 s66Var4 = nj6Var.f52844o;
                C0285a c0285a = nj6Var.f60424j;
                s66Var4.getClass();
                synchronized (obj) {
                    s66Var4.f60424j = s66Var4.f60424j.m1316h(c0285a);
                    s66 s66Var5 = nj6Var.f52844o;
                    int[] iArr2 = nj6Var.f60425k;
                    s66Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = s66Var5.f60425k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        s66Var5.f60425k = iArr2;
                    }
                }
                nj6Var.f60427m = true;
                if (!nj6Var.f52845p) {
                    nj6Var.f52845p = true;
                    nj6Var.f52844o.mo3167l();
                }
                return lc9.f49479x;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
