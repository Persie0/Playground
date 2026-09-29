package p000;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class j9a {

    /* JADX INFO: renamed from: b */
    public final Matrix f45243b;

    /* JADX INFO: renamed from: c */
    public final Matrix f45244c;

    /* JADX INFO: renamed from: d */
    public final Matrix f45245d;

    /* JADX INFO: renamed from: e */
    public final float[] f45246e;

    /* JADX INFO: renamed from: l */
    public m90 f45253l;

    /* JADX INFO: renamed from: m */
    public m90 f45254m;

    /* JADX INFO: renamed from: n */
    public m90 f45255n;

    /* JADX INFO: renamed from: o */
    public m90 f45256o;

    /* JADX INFO: renamed from: p */
    public m90 f45257p;

    /* JADX INFO: renamed from: q */
    public j73 f45258q;

    /* JADX INFO: renamed from: r */
    public j73 f45259r;

    /* JADX INFO: renamed from: s */
    public j73 f45260s;

    /* JADX INFO: renamed from: t */
    public j73 f45261t;

    /* JADX INFO: renamed from: u */
    public j73 f45262u;

    /* JADX INFO: renamed from: v */
    public m90 f45263v;

    /* JADX INFO: renamed from: w */
    public m90 f45264w;

    /* JADX INFO: renamed from: x */
    public final boolean f45265x;

    /* JADX INFO: renamed from: a */
    public final Matrix f45242a = new Matrix();

    /* JADX INFO: renamed from: f */
    public float f45247f = Float.NaN;

    /* JADX INFO: renamed from: g */
    public float f45248g = Float.NaN;

    /* JADX INFO: renamed from: h */
    public float f45249h = Float.NaN;

    /* JADX INFO: renamed from: i */
    public float f45250i = 1.0f;

    /* JADX INFO: renamed from: j */
    public float f45251j = 1.0f;

    /* JADX INFO: renamed from: k */
    public boolean f45252k = true;

    public j9a(C0852cm c0852cm) {
        C3800yl c3800yl = c0852cm.f10244a;
        this.f45253l = c3800yl == null ? null : c3800yl.mo550a();
        InterfaceC2969em interfaceC2969em = c0852cm.f10245b;
        this.f45254m = interfaceC2969em == null ? null : interfaceC2969em.mo550a();
        C3726wl c3726wl = c0852cm.f10246c;
        this.f45255n = c3726wl == null ? null : c3726wl.mo550a();
        C3763xl c3763xl = c0852cm.f10247d;
        this.f45256o = c3763xl == null ? null : c3763xl.mo550a();
        C3763xl c3763xl2 = c0852cm.f10249f;
        this.f45258q = c3763xl2 == null ? null : c3763xl2.mo550a();
        this.f45265x = c0852cm.f10256m;
        C3763xl c3763xl3 = c0852cm.f10251h;
        this.f45260s = c3763xl3 == null ? null : c3763xl3.mo550a();
        C3763xl c3763xl4 = c0852cm.f10252i;
        this.f45261t = c3763xl4 == null ? null : c3763xl4.mo550a();
        C3763xl c3763xl5 = c0852cm.f10253j;
        this.f45262u = c3763xl5 == null ? null : c3763xl5.mo550a();
        if (this.f45258q != null) {
            this.f45243b = new Matrix();
            this.f45244c = new Matrix();
            this.f45245d = new Matrix();
            this.f45246e = new float[9];
        } else {
            this.f45243b = null;
            this.f45244c = null;
            this.f45245d = null;
            this.f45246e = null;
        }
        C3763xl c3763xl6 = c0852cm.f10250g;
        this.f45259r = c3763xl6 == null ? null : c3763xl6.mo550a();
        C3726wl c3726wl2 = c0852cm.f10248e;
        if (c3726wl2 != null) {
            this.f45257p = c3726wl2.mo550a();
        }
        C3763xl c3763xl7 = c0852cm.f10254k;
        if (c3763xl7 != null) {
            this.f45263v = c3763xl7.mo550a();
        } else {
            this.f45263v = null;
        }
        C3763xl c3763xl8 = c0852cm.f10255l;
        if (c3763xl8 != null) {
            this.f45264w = c3763xl8.mo550a();
        } else {
            this.f45264w = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14354a(o90 o90Var) {
        o90Var.m17863e(this.f45257p);
        o90Var.m17863e(this.f45263v);
        o90Var.m17863e(this.f45264w);
        o90Var.m17863e(this.f45253l);
        o90Var.m17863e(this.f45254m);
        o90Var.m17863e(this.f45255n);
        o90Var.m17863e(this.f45256o);
        o90Var.m17863e(this.f45258q);
        o90Var.m17863e(this.f45259r);
        o90Var.m17863e(this.f45260s);
        o90Var.m17863e(this.f45261t);
        o90Var.m17863e(this.f45262u);
    }

    /* JADX INFO: renamed from: b */
    public final void m14355b(i90 i90Var) {
        m90 m90Var = this.f45257p;
        if (m90Var != null) {
            m90Var.m16687a(i90Var);
        }
        m90 m90Var2 = this.f45263v;
        if (m90Var2 != null) {
            m90Var2.m16687a(i90Var);
        }
        m90 m90Var3 = this.f45264w;
        if (m90Var3 != null) {
            m90Var3.m16687a(i90Var);
        }
        m90 m90Var4 = this.f45253l;
        if (m90Var4 != null) {
            m90Var4.m16687a(i90Var);
        }
        m90 m90Var5 = this.f45254m;
        if (m90Var5 != null) {
            m90Var5.m16687a(i90Var);
        }
        m90 m90Var6 = this.f45255n;
        if (m90Var6 != null) {
            m90Var6.m16687a(i90Var);
        }
        m90 m90Var7 = this.f45256o;
        if (m90Var7 != null) {
            m90Var7.m16687a(i90Var);
        }
        j73 j73Var = this.f45258q;
        if (j73Var != null) {
            j73Var.m16687a(i90Var);
        }
        j73 j73Var2 = this.f45259r;
        if (j73Var2 != null) {
            j73Var2.m16687a(i90Var);
        }
        j73 j73Var3 = this.f45260s;
        if (j73Var3 != null) {
            j73Var3.m16687a(i90Var);
            this.f45260s.m16687a(new i9a(this, 0));
        }
        j73 j73Var4 = this.f45261t;
        if (j73Var4 != null) {
            j73Var4.m16687a(i90Var);
            this.f45261t.m16687a(new i9a(this, 1));
        }
        j73 j73Var5 = this.f45262u;
        if (j73Var5 != null) {
            j73Var5.m16687a(i90Var);
            this.f45262u.m16687a(new i9a(this, 2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14356c(p33 p33Var, Object obj) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == yl5.f70005a) {
            m90 m90Var = this.f45253l;
            if (m90Var == null) {
                this.f45253l = new wna(p33Var, new PointF());
                return true;
            }
            m90Var.m16695k(p33Var);
            return true;
        }
        if (obj == yl5.f70006b) {
            m90 m90Var2 = this.f45254m;
            if (m90Var2 == null) {
                this.f45254m = new wna(p33Var, new PointF());
                return true;
            }
            m90Var2.m16695k(p33Var);
            return true;
        }
        if (obj == yl5.f70007c) {
            m90 m90Var3 = this.f45254m;
            if (m90Var3 instanceof tf9) {
                ((tf9) m90Var3).f62233m = p33Var;
                return true;
            }
        }
        if (obj == yl5.f70008d) {
            m90 m90Var4 = this.f45254m;
            if (m90Var4 instanceof tf9) {
                ((tf9) m90Var4).f62234n = p33Var;
                return true;
            }
        }
        if (obj == yl5.f70014j) {
            m90 m90Var5 = this.f45255n;
            if (m90Var5 == null) {
                this.f45255n = new wna(p33Var, new nm8());
                return true;
            }
            m90Var5.m16695k(p33Var);
            return true;
        }
        if (obj == yl5.f70015k) {
            m90 m90Var6 = this.f45256o;
            if (m90Var6 == null) {
                this.f45256o = new wna(p33Var, fValueOf2);
                return true;
            }
            m90Var6.m16695k(p33Var);
            return true;
        }
        if (obj == 3) {
            m90 m90Var7 = this.f45257p;
            if (m90Var7 == null) {
                this.f45257p = new wna(p33Var, 100);
                return true;
            }
            m90Var7.m16695k(p33Var);
            return true;
        }
        if (obj == yl5.f69991A) {
            m90 m90Var8 = this.f45263v;
            if (m90Var8 == null) {
                this.f45263v = new wna(p33Var, fValueOf);
                return true;
            }
            m90Var8.m16695k(p33Var);
            return true;
        }
        if (obj == yl5.f69992B) {
            m90 m90Var9 = this.f45264w;
            if (m90Var9 == null) {
                this.f45264w = new wna(p33Var, fValueOf);
                return true;
            }
            m90Var9.m16695k(p33Var);
            return true;
        }
        if (obj == yl5.f70019o) {
            if (this.f45258q == null) {
                this.f45258q = new j73(Collections.singletonList(new kj4(fValueOf2)));
            }
            this.f45258q.m16695k(p33Var);
            return true;
        }
        if (obj == yl5.f70020p) {
            if (this.f45259r == null) {
                this.f45259r = new j73(Collections.singletonList(new kj4(fValueOf2)));
            }
            this.f45259r.m16695k(p33Var);
            return true;
        }
        if (obj == yl5.f70016l) {
            if (this.f45260s == null) {
                this.f45260s = new j73(Collections.singletonList(new kj4(fValueOf2)));
            }
            this.f45260s.m16695k(p33Var);
            return true;
        }
        if (obj == yl5.f70017m) {
            if (this.f45261t == null) {
                this.f45261t = new j73(Collections.singletonList(new kj4(fValueOf2)));
            }
            this.f45261t.m16695k(p33Var);
            return true;
        }
        if (obj != yl5.f70018n) {
            return false;
        }
        if (this.f45262u == null) {
            this.f45262u = new j73(Collections.singletonList(new kj4(fValueOf2)));
        }
        this.f45262u.m16695k(p33Var);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m14357d() {
        for (int i = 0; i < 9; i++) {
            this.f45246e[i] = 0.0f;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Matrix m14358e() {
        j73 j73Var;
        j73 j73Var2;
        PointF pointF;
        nm8 nm8Var;
        PointF pointF2;
        Matrix matrix = this.f45242a;
        matrix.reset();
        j73 j73Var3 = this.f45260s;
        if ((j73Var3 == null || j73Var3.m14316m() == 0.0f) && (((j73Var = this.f45261t) == null || j73Var.m14316m() == 0.0f) && ((j73Var2 = this.f45262u) == null || j73Var2.m14316m() == 0.0f))) {
            m90 m90Var = this.f45254m;
            if (m90Var != null && (pointF2 = (PointF) m90Var.mo16692f()) != null) {
                float f = pointF2.x;
                if (f != 0.0f || pointF2.y != 0.0f) {
                    matrix.preTranslate(f, pointF2.y);
                }
            }
            if (!this.f45265x) {
                m90 m90Var2 = this.f45256o;
                if (m90Var2 != null) {
                    float fFloatValue = m90Var2 instanceof wna ? ((Float) m90Var2.mo16692f()).floatValue() : ((j73) m90Var2).m14316m();
                    if (fFloatValue != 0.0f) {
                        matrix.preRotate(fFloatValue);
                    }
                }
            } else if (m90Var != null) {
                float f2 = m90Var.f50799d;
                PointF pointF3 = (PointF) m90Var.mo16692f();
                float f3 = pointF3.x;
                float f4 = pointF3.y;
                m90Var.mo16694j(1.0E-4f + f2);
                PointF pointF4 = (PointF) m90Var.mo16692f();
                m90Var.mo16694j(f2);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
            }
            j73 j73Var4 = this.f45258q;
            if (j73Var4 != null) {
                j73 j73Var5 = this.f45259r;
                float fCos = j73Var5 == null ? 0.0f : (float) Math.cos(Math.toRadians((-j73Var5.m14316m()) + 90.0f));
                j73 j73Var6 = this.f45259r;
                float fSin = j73Var6 == null ? 1.0f : (float) Math.sin(Math.toRadians((-j73Var6.m14316m()) + 90.0f));
                float fTan = (float) Math.tan(Math.toRadians(j73Var4.m14316m()));
                m14357d();
                float[] fArr = this.f45246e;
                fArr[0] = fCos;
                fArr[1] = fSin;
                float f5 = -fSin;
                fArr[3] = f5;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.f45243b;
                matrix2.setValues(fArr);
                m14357d();
                fArr[0] = 1.0f;
                fArr[3] = fTan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.f45244c;
                matrix3.setValues(fArr);
                m14357d();
                fArr[0] = fCos;
                fArr[1] = f5;
                fArr[3] = fSin;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.f45245d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            m90 m90Var3 = this.f45255n;
            if (m90Var3 != null && (nm8Var = (nm8) m90Var3.mo16692f()) != null) {
                float f6 = nm8Var.f52968a;
                if (f6 != 1.0f || nm8Var.f52969b != 1.0f) {
                    matrix.preScale(f6, nm8Var.f52969b);
                }
            }
            m90 m90Var4 = this.f45253l;
            if (m90Var4 != null && (pointF = (PointF) m90Var4.mo16692f()) != null) {
                float f7 = pointF.x;
                if (f7 != 0.0f || pointF.y != 0.0f) {
                    matrix.preTranslate(-f7, -pointF.y);
                }
            }
        } else {
            j73 j73Var7 = this.f45260s;
            float fM14316m = j73Var7 != null ? j73Var7.m14316m() : 0.0f;
            j73 j73Var8 = this.f45261t;
            float fM14316m2 = j73Var8 != null ? j73Var8.m14316m() : 0.0f;
            j73 j73Var9 = this.f45262u;
            float fM14316m3 = j73Var9 != null ? j73Var9.m14316m() : 0.0f;
            if (this.f45252k || fM14316m != this.f45247f || fM14316m2 != this.f45248g || fM14316m3 != this.f45249h) {
                this.f45247f = fM14316m;
                this.f45248g = fM14316m2;
                this.f45249h = fM14316m3;
                if (fM14316m != 0.0f) {
                    this.f45250i = (float) Math.cos(Math.toRadians(fM14316m));
                } else {
                    this.f45250i = 1.0f;
                }
                if (fM14316m2 != 0.0f) {
                    this.f45251j = (float) Math.cos(Math.toRadians(fM14316m2));
                } else {
                    this.f45251j = 1.0f;
                }
                this.f45252k = false;
            }
            m90 m90Var5 = this.f45253l;
            PointF pointF5 = m90Var5 == null ? null : (PointF) m90Var5.mo16692f();
            m90 m90Var6 = this.f45254m;
            PointF pointF6 = m90Var6 == null ? null : (PointF) m90Var6.mo16692f();
            m90 m90Var7 = this.f45255n;
            nm8 nm8Var2 = m90Var7 != null ? (nm8) m90Var7.mo16692f() : null;
            float f8 = nm8Var2 != null ? nm8Var2.f52968a : 1.0f;
            float f9 = nm8Var2 != null ? nm8Var2.f52969b : 1.0f;
            float f10 = this.f45250i;
            float f11 = this.f45251j;
            matrix.reset();
            if (pointF6 != null) {
                float f12 = pointF6.x;
                if (f12 != 0.0f || pointF6.y != 0.0f) {
                    matrix.preTranslate(f12, pointF6.y);
                }
            }
            if (fM14316m3 != 0.0f) {
                matrix.preRotate(fM14316m3);
            }
            if (fM14316m2 != 0.0f) {
                matrix.preScale(f11, 1.0f);
            }
            if (fM14316m != 0.0f) {
                matrix.preScale(1.0f, f10);
            }
            if (f8 != 1.0f || f9 != 1.0f) {
                matrix.preScale(f8, f9);
            }
            if (pointF5 != null) {
                float f13 = pointF5.x;
                if (f13 != 0.0f || pointF5.y != 0.0f) {
                    matrix.preTranslate(-f13, -pointF5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    /* JADX INFO: renamed from: f */
    public final Matrix m14359f(float f) {
        m90 m90Var = this.f45254m;
        PointF pointF = m90Var == null ? null : (PointF) m90Var.mo16692f();
        m90 m90Var2 = this.f45255n;
        nm8 nm8Var = m90Var2 == null ? null : (nm8) m90Var2.mo16692f();
        m90 m90Var3 = this.f45253l;
        PointF pointF2 = m90Var3 != null ? (PointF) m90Var3.mo16692f() : null;
        Matrix matrix = this.f45242a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        j73 j73Var = this.f45260s;
        float fM14316m = j73Var != null ? j73Var.m14316m() * f : 0.0f;
        j73 j73Var2 = this.f45261t;
        float fM14316m2 = j73Var2 != null ? j73Var2.m14316m() * f : 0.0f;
        j73 j73Var3 = this.f45262u;
        float fM14316m3 = j73Var3 != null ? j73Var3.m14316m() * f : 0.0f;
        if (fM14316m == 0.0f && fM14316m2 == 0.0f && fM14316m3 == 0.0f) {
            m90 m90Var4 = this.f45256o;
            if (m90Var4 != null) {
                matrix.preRotate(((Float) m90Var4.mo16692f()).floatValue() * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float fCos = fM14316m != 0.0f ? (float) Math.cos(Math.toRadians(fM14316m)) : 1.0f;
            float fCos2 = fM14316m2 != 0.0f ? (float) Math.cos(Math.toRadians(fM14316m2)) : 1.0f;
            if (fM14316m3 != 0.0f) {
                matrix.preRotate(fM14316m3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            if (fM14316m2 != 0.0f) {
                matrix.preScale(fCos2, 1.0f);
            }
            if (fM14316m != 0.0f) {
                matrix.preScale(1.0f, fCos);
            }
        }
        if (nm8Var != null) {
            double d = f;
            matrix.preScale((float) Math.pow(nm8Var.f52968a, d), (float) Math.pow(nm8Var.f52969b, d));
        }
        return matrix;
    }
}
