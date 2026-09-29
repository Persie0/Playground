package p000;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class an0 implements InterfaceC0310a {

    /* JADX INFO: renamed from: a */
    public final zm0 f852a;

    /* JADX INFO: renamed from: b */
    public final C3309ls f853b;

    /* JADX INFO: renamed from: c */
    public u8a f854c;

    /* JADX INFO: renamed from: d */
    public u8a f855d;

    public an0() {
        ib2 ib2Var = bq1.f8854c;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        zm0 zm0Var = new zm0();
        zm0Var.f71734a = ib2Var;
        zm0Var.f71735b = layoutDirection;
        zm0Var.f71736c = mr2.f51766a;
        zm0Var.f71737d = 0L;
        this.f852a = zm0Var;
        this.f853b = new C3309ls(this);
    }

    /* JADX INFO: renamed from: b */
    public static u8a m590b(an0 an0Var, long j, ml2 ml2Var, float f, int i) {
        u8a u8aVarM596d = an0Var.m596d(ml2Var);
        Paint paint = (Paint) u8aVarM596d.f63594c;
        if (f != 1.0f) {
            j = aa1.m198b(aa1.m200d(j) * f, j);
        }
        if (!aa1.m199c(d32.m10035e(paint.getColor()), j)) {
            u8aVarM596d.m22555p(j);
        }
        if (((Shader) u8aVarM596d.f63595d) != null) {
            u8aVarM596d.m22559t(null);
        }
        if (!fa4.m11650l((fa1) u8aVarM596d.f63596e, null)) {
            u8aVarM596d.m22556q(null);
        }
        if (u8aVarM596d.f63593b != i) {
            u8aVarM596d.m22554o(i);
        }
        if (paint.isFilterBitmap()) {
            return u8aVarM596d;
        }
        u8aVarM596d.m22557r(1);
        return u8aVarM596d;
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: C0 */
    public final void mo591C0(vi0 vi0Var, long j, long j2, long j3, float f, ml2 ml2Var, fa1 fa1Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.f852a.f71736c.mo17012d(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), m595c(vi0Var, ml2Var, f, fa1Var, i, 1));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: K0 */
    public final void mo592K0(vi0 vi0Var, long j, long j2, float f, ml2 ml2Var, fa1 fa1Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.f852a.f71736c.mo17014f(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), m595c(vi0Var, ml2Var, f, fa1Var, i, 1));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: O */
    public final void mo593O(vi0 vi0Var, long j, long j2, float f, int i, float f2) {
        ym0 ym0Var = this.f852a.f71736c;
        u8a u8aVarM11125e = this.f855d;
        if (u8aVarM11125e == null) {
            u8aVarM11125e = eh0.m11125e();
            u8aVarM11125e.m22563x(1);
            this.f855d = u8aVarM11125e;
        }
        Paint paint = (Paint) u8aVarM11125e.f63594c;
        vi0Var.mo13650b(f2, mo1422h(), u8aVarM11125e);
        if (!fa4.m11650l((fa1) u8aVarM11125e.f63596e, null)) {
            u8aVarM11125e.m22556q(null);
        }
        if (u8aVarM11125e.f63593b != 3) {
            u8aVarM11125e.m22554o(3);
        }
        if (paint.getStrokeWidth() != f) {
            u8aVarM11125e.m22562w(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (u8aVarM11125e.m22546g() != i) {
            u8aVarM11125e.m22560u(i);
        }
        if (u8aVarM11125e.m22547h() != 0) {
            u8aVarM11125e.m22561v(0);
        }
        if (!fa4.m11650l((C3538rj) u8aVarM11125e.f63597f, null)) {
            u8aVarM11125e.m22558s(null);
        }
        if (!paint.isFilterBitmap()) {
            u8aVarM11125e.m22557r(1);
        }
        ym0Var.mo17026s(j, j2, u8aVarM11125e);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return this.f852a.f71734a.mo594a();
    }

    /* JADX INFO: renamed from: c */
    public final u8a m595c(vi0 vi0Var, ml2 ml2Var, float f, fa1 fa1Var, int i, int i2) {
        u8a u8aVarM596d = m596d(ml2Var);
        Paint paint = (Paint) u8aVarM596d.f63594c;
        if (vi0Var != null) {
            vi0Var.mo13650b(f, mo1422h(), u8aVarM596d);
        } else {
            if (((Shader) u8aVarM596d.f63595d) != null) {
                u8aVarM596d.m22559t(null);
            }
            long jM10035e = d32.m10035e(paint.getColor());
            long j = aa1.f403b;
            if (!aa1.m199c(jM10035e, j)) {
                u8aVarM596d.m22555p(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                u8aVarM596d.m22553n(f);
            }
        }
        if (!fa4.m11650l((fa1) u8aVarM596d.f63596e, fa1Var)) {
            u8aVarM596d.m22556q(fa1Var);
        }
        if (u8aVarM596d.f63593b != i) {
            u8aVarM596d.m22554o(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return u8aVarM596d;
        }
        u8aVarM596d.m22557r(i2);
        return u8aVarM596d;
    }

    /* JADX INFO: renamed from: d */
    public final u8a m596d(ml2 ml2Var) {
        if (fa4.m11650l(ml2Var, w33.f66328a)) {
            u8a u8aVar = this.f854c;
            if (u8aVar != null) {
                return u8aVar;
            }
            u8a u8aVarM11125e = eh0.m11125e();
            u8aVarM11125e.m22563x(0);
            this.f854c = u8aVarM11125e;
            return u8aVarM11125e;
        }
        if (!(ml2Var instanceof el9)) {
            gm5.m12750e();
            return null;
        }
        u8a u8aVarM11125e2 = this.f855d;
        if (u8aVarM11125e2 == null) {
            u8aVarM11125e2 = eh0.m11125e();
            u8aVarM11125e2.m22563x(1);
            this.f855d = u8aVarM11125e2;
        }
        Paint paint = (Paint) u8aVarM11125e2.f63594c;
        float strokeWidth = paint.getStrokeWidth();
        el9 el9Var = (el9) ml2Var;
        float f = el9Var.f37448a;
        if (strokeWidth != f) {
            u8aVarM11125e2.m22562w(f);
        }
        int iM22546g = u8aVarM11125e2.m22546g();
        int i = el9Var.f37450c;
        if (iM22546g != i) {
            u8aVarM11125e2.m22560u(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = el9Var.f37449b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iM22547h = u8aVarM11125e2.m22547h();
        int i2 = el9Var.f37451d;
        if (iM22547h != i2) {
            u8aVarM11125e2.m22561v(i2);
        }
        if (!fa4.m11650l((C3538rj) u8aVarM11125e2.f63597f, null)) {
            u8aVarM11125e2.m22558s(null);
        }
        return u8aVarM11125e2;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return this.f852a.f71734a.mo597d0();
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    public final LayoutDirection getLayoutDirection() {
        return this.f852a.f71735b;
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: h0 */
    public final void mo598h0(long j, long j2, long j3, long j4, ml2 ml2Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.f852a.f71736c.mo17012d(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), m590b(this, j, ml2Var, 1.0f, i));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: k */
    public final void mo599k(C3500qj c3500qj, long j, float f, ml2 ml2Var) {
        this.f852a.f71736c.mo17009a(c3500qj, m590b(this, j, ml2Var, f, 3));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: l0 */
    public final void mo600l0(vi0 vi0Var, float f, long j, float f2, ml2 ml2Var) {
        this.f852a.f71736c.mo17021m(f, j, m595c(vi0Var, ml2Var, f2, null, 3, 1));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: n0 */
    public final void mo601n0(long j, float f, float f2, long j2, long j3, float f3, el9 el9Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.f852a.f71736c.mo17013e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, m590b(this, j, el9Var, f3, 3));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: o */
    public final void mo602o(long j, float f, long j2, float f2, ml2 ml2Var) {
        this.f852a.f71736c.mo17021m(f, j2, m590b(this, j, ml2Var, f2, 3));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: o0 */
    public final C3309ls mo603o0() {
        return this.f853b;
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: w */
    public final void mo604w(long j, long j2, long j3, float f, int i, C3538rj c3538rj) {
        ym0 ym0Var = this.f852a.f71736c;
        u8a u8aVarM11125e = this.f855d;
        if (u8aVarM11125e == null) {
            u8aVarM11125e = eh0.m11125e();
            u8aVarM11125e.m22563x(1);
            this.f855d = u8aVarM11125e;
        }
        Paint paint = (Paint) u8aVarM11125e.f63594c;
        if (!aa1.m199c(d32.m10035e(paint.getColor()), j)) {
            u8aVarM11125e.m22555p(j);
        }
        if (((Shader) u8aVarM11125e.f63595d) != null) {
            u8aVarM11125e.m22559t(null);
        }
        if (!fa4.m11650l((fa1) u8aVarM11125e.f63596e, null)) {
            u8aVarM11125e.m22556q(null);
        }
        if (u8aVarM11125e.f63593b != 3) {
            u8aVarM11125e.m22554o(3);
        }
        if (paint.getStrokeWidth() != f) {
            u8aVarM11125e.m22562w(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (u8aVarM11125e.m22546g() != i) {
            u8aVarM11125e.m22560u(i);
        }
        if (u8aVarM11125e.m22547h() != 0) {
            u8aVarM11125e.m22561v(0);
        }
        if (!fa4.m11650l((C3538rj) u8aVarM11125e.f63597f, c3538rj)) {
            u8aVarM11125e.m22558s(c3538rj);
        }
        if (!paint.isFilterBitmap()) {
            u8aVarM11125e.m22557r(1);
        }
        ym0Var.mo17026s(j2, j3, u8aVarM11125e);
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: x0 */
    public final void mo605x0(C3185ki c3185ki, long j, long j2, long j3, float f, fa1 fa1Var, int i) {
        this.f852a.f71736c.mo17025r(c3185ki, j, j2, j3, m595c(null, w33.f66328a, f, fa1Var, 3, i));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: y */
    public final void mo606y(C3500qj c3500qj, vi0 vi0Var, float f, ml2 ml2Var, fa1 fa1Var, int i) {
        this.f852a.f71736c.mo17009a(c3500qj, m595c(vi0Var, ml2Var, f, fa1Var, i, 1));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: z */
    public final void mo607z(long j, long j2, long j3, float f, ml2 ml2Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.f852a.f71736c.mo17014f(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), m590b(this, j, ml2Var, f, i));
    }
}
