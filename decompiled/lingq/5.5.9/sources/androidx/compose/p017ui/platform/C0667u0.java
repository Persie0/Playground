package androidx.compose.p017ui.platform;

import ae.C0062b;
import android.graphics.Matrix;
import cm.InterfaceC2056p;
import dm.C5207g;
import p260m8.C7499b;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.platform.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0667u0<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2056p<T, Matrix, C9072e> f4345a;

    /* JADX INFO: renamed from: b */
    public Matrix f4346b;

    /* JADX INFO: renamed from: c */
    public Matrix f4347c;

    /* JADX INFO: renamed from: d */
    public float[] f4348d;

    /* JADX INFO: renamed from: e */
    public float[] f4349e;

    /* JADX INFO: renamed from: f */
    public boolean f4350f;

    /* JADX INFO: renamed from: g */
    public boolean f4351g;

    /* JADX INFO: renamed from: h */
    public boolean f4352h;

    /* JADX WARN: Multi-variable type inference failed */
    public C0667u0(InterfaceC2056p<? super T, ? super Matrix, C9072e> interfaceC2056p) {
        C5207g.m11111f(interfaceC2056p, "getMatrix");
        this.f4345a = interfaceC2056p;
        this.f4350f = true;
        this.f4351g = true;
        this.f4352h = true;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m2491a(T t10) {
        float[] fArrM14961r = this.f4349e;
        if (fArrM14961r == null) {
            fArrM14961r = C7499b.m14961r();
            this.f4349e = fArrM14961r;
        }
        if (this.f4351g) {
            this.f4352h = C0062b.m390r1(m2492b(t10), fArrM14961r);
            this.f4351g = false;
        }
        if (this.f4352h) {
            return fArrM14961r;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final float[] m2492b(T t10) {
        float[] fArrM14961r = this.f4348d;
        if (fArrM14961r == null) {
            fArrM14961r = C7499b.m14961r();
            this.f4348d = fArrM14961r;
        }
        if (!this.f4350f) {
            return fArrM14961r;
        }
        Matrix matrix = this.f4346b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f4346b = matrix;
        }
        this.f4345a.mo1337m0(t10, matrix);
        Matrix matrix2 = this.f4347c;
        if (matrix2 == null || !C5207g.m11106a(matrix, matrix2)) {
            C8573r0.m16716b1(matrix, fArrM14961r);
            this.f4346b = matrix2;
            this.f4347c = matrix;
        }
        this.f4350f = false;
        return fArrM14961r;
    }

    /* JADX INFO: renamed from: c */
    public final void m2493c() {
        this.f4350f = true;
        this.f4351g = true;
    }
}
