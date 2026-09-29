package p000;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.C0868b;
import com.airbnb.lottie.model.content.GradientType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ep3 implements am2, i90, oi4 {

    /* JADX INFO: renamed from: a */
    public final String f37659a;

    /* JADX INFO: renamed from: b */
    public final boolean f37660b;

    /* JADX INFO: renamed from: c */
    public final o90 f37661c;

    /* JADX INFO: renamed from: d */
    public final tk5 f37662d = new tk5((Object) null);

    /* JADX INFO: renamed from: e */
    public final tk5 f37663e = new tk5((Object) null);

    /* JADX INFO: renamed from: f */
    public final Path f37664f;

    /* JADX INFO: renamed from: g */
    public final yk4 f37665g;

    /* JADX INFO: renamed from: h */
    public final RectF f37666h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f37667i;

    /* JADX INFO: renamed from: j */
    public final GradientType f37668j;

    /* JADX INFO: renamed from: k */
    public final bp3 f37669k;

    /* JADX INFO: renamed from: l */
    public final ha1 f37670l;

    /* JADX INFO: renamed from: m */
    public final bp3 f37671m;

    /* JADX INFO: renamed from: n */
    public final bp3 f37672n;

    /* JADX INFO: renamed from: o */
    public wna f37673o;

    /* JADX INFO: renamed from: p */
    public wna f37674p;

    /* JADX INFO: renamed from: q */
    public final C0868b f37675q;

    /* JADX INFO: renamed from: r */
    public final int f37676r;

    /* JADX INFO: renamed from: s */
    public m90 f37677s;

    /* JADX INFO: renamed from: t */
    public float f37678t;

    public ep3(C0868b c0868b, gl5 gl5Var, o90 o90Var, dp3 dp3Var) {
        Path path = new Path();
        this.f37664f = path;
        this.f37665g = new yk4(1, 0);
        this.f37666h = new RectF();
        this.f37667i = new ArrayList();
        this.f37678t = 0.0f;
        this.f37661c = o90Var;
        this.f37659a = dp3Var.f35994g;
        this.f37660b = dp3Var.f35995h;
        this.f37675q = c0868b;
        this.f37668j = dp3Var.f35988a;
        path.setFillType(dp3Var.f35989b);
        this.f37676r = (int) (gl5Var.m12729c() / 32.0f);
        m90 m90VarMo550a = dp3Var.f35990c.mo550a();
        this.f37669k = (bp3) m90VarMo550a;
        m90VarMo550a.m16687a(this);
        o90Var.m17863e(m90VarMo550a);
        m90 m90VarMo550a2 = dp3Var.f35991d.mo550a();
        this.f37670l = (ha1) m90VarMo550a2;
        m90VarMo550a2.m16687a(this);
        o90Var.m17863e(m90VarMo550a2);
        m90 m90VarMo550a3 = dp3Var.f35992e.mo550a();
        this.f37671m = (bp3) m90VarMo550a3;
        m90VarMo550a3.m16687a(this);
        o90Var.m17863e(m90VarMo550a3);
        m90 m90VarMo550a4 = dp3Var.f35993f.mo550a();
        this.f37672n = (bp3) m90VarMo550a4;
        m90VarMo550a4.m16687a(this);
        o90Var.m17863e(m90VarMo550a4);
        if (o90Var.mo10092k() != null) {
            j73 j73VarMo550a = ((C3763xl) o90Var.mo10092k().f42410b).mo550a();
            this.f37677s = j73VarMo550a;
            j73VarMo550a.m16687a(this);
            o90Var.m17863e(this.f37677s);
        }
    }

    @Override // p000.i90
    /* JADX INFO: renamed from: a */
    public final void mo9827a() {
        this.f37675q.invalidateSelf();
    }

    @Override // p000.qk1
    /* JADX INFO: renamed from: b */
    public final void mo9828b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            qk1 qk1Var = (qk1) list2.get(i);
            if (qk1Var instanceof h57) {
                this.f37667i.add((h57) qk1Var);
            }
        }
    }

    @Override // p000.ni4
    /* JADX INFO: renamed from: c */
    public final void mo9829c(mi4 mi4Var, int i, ArrayList arrayList, mi4 mi4Var2) {
        f06.m11426g(mi4Var, i, arrayList, mi4Var2, this);
    }

    @Override // p000.am2
    /* JADX INFO: renamed from: d */
    public final void mo555d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f37664f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f37667i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((h57) arrayList.get(i)).mo9831g(), matrix);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int[] m11309e(int[] iArr) {
        wna wnaVar = this.f37674p;
        if (wnaVar != null) {
            Integer[] numArr = (Integer[]) wnaVar.mo16692f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // p000.ni4
    /* JADX INFO: renamed from: f */
    public final void mo9830f(p33 p33Var, Object obj) {
        PointF pointF = yl5.f70005a;
        if (obj == 4) {
            this.f37670l.m16695k(p33Var);
            return;
        }
        ColorFilter colorFilter = yl5.f69999I;
        o90 o90Var = this.f37661c;
        if (obj == colorFilter) {
            wna wnaVar = this.f37673o;
            if (wnaVar != null) {
                o90Var.m17867n(wnaVar);
            }
            wna wnaVar2 = new wna(p33Var, null);
            this.f37673o = wnaVar2;
            wnaVar2.m16687a(this);
            o90Var.m17863e(this.f37673o);
            return;
        }
        if (obj == yl5.f70000J) {
            wna wnaVar3 = this.f37674p;
            if (wnaVar3 != null) {
                o90Var.m17867n(wnaVar3);
            }
            this.f37662d.m22175a();
            this.f37663e.m22175a();
            wna wnaVar4 = new wna(p33Var, null);
            this.f37674p = wnaVar4;
            wnaVar4.m16687a(this);
            o90Var.m17863e(this.f37674p);
            return;
        }
        if (obj == yl5.f70009e) {
            m90 m90Var = this.f37677s;
            if (m90Var != null) {
                m90Var.m16695k(p33Var);
                return;
            }
            wna wnaVar5 = new wna(p33Var, null);
            this.f37677s = wnaVar5;
            wnaVar5.m16687a(this);
            o90Var.m17863e(this.f37677s);
        }
    }

    @Override // p000.qk1
    public final String getName() {
        return this.f37659a;
    }

    @Override // p000.am2
    /* JADX INFO: renamed from: h */
    public final void mo556h(Canvas canvas, Matrix matrix, int i, qm2 qm2Var) {
        float[] fArr;
        int[] iArr;
        Shader linearGradient;
        int[] iArr2;
        if (this.f37660b) {
            return;
        }
        AsyncUpdates asyncUpdates = wk4.f66962a;
        Path path = this.f37664f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f37667i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((h57) arrayList.get(i2)).mo9831g(), matrix);
            i2++;
        }
        path.computeBounds(this.f37666h, false);
        GradientType gradientType = this.f37668j;
        GradientType gradientType2 = GradientType.LINEAR;
        bp3 bp3Var = this.f37669k;
        bp3 bp3Var2 = this.f37672n;
        bp3 bp3Var3 = this.f37671m;
        if (gradientType == gradientType2) {
            long jM11310i = m11310i();
            tk5 tk5Var = this.f37662d;
            linearGradient = (LinearGradient) tk5Var.m22176b(jM11310i);
            if (linearGradient == null) {
                PointF pointF = (PointF) bp3Var3.mo16692f();
                PointF pointF2 = (PointF) bp3Var2.mo16692f();
                ap3 ap3Var = (ap3) bp3Var.mo16692f();
                int[] iArrM11309e = m11309e(ap3Var.f7322b);
                float[] fArr2 = ap3Var.f7321a;
                if (iArrM11309e.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArrM11309e[0], iArrM11309e[0]};
                } else {
                    iArr2 = iArrM11309e;
                }
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                tk5Var.m22180f(linearGradient, jM11310i);
            }
        } else {
            long jM11310i2 = m11310i();
            tk5 tk5Var2 = this.f37663e;
            RadialGradient radialGradient = (RadialGradient) tk5Var2.m22176b(jM11310i2);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) bp3Var3.mo16692f();
                PointF pointF4 = (PointF) bp3Var2.mo16692f();
                ap3 ap3Var2 = (ap3) bp3Var.mo16692f();
                int[] iArrM11309e2 = m11309e(ap3Var2.f7322b);
                float[] fArr3 = ap3Var2.f7321a;
                if (iArrM11309e2.length < 2) {
                    iArr = new int[]{iArrM11309e2[0], iArrM11309e2[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArrM11309e2;
                }
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                tk5Var2.m22180f(radialGradient2, jM11310i2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        yk4 yk4Var = this.f37665g;
        yk4Var.setShader(linearGradient);
        wna wnaVar = this.f37673o;
        if (wnaVar != null) {
            yk4Var.setColorFilter((ColorFilter) wnaVar.mo16692f());
        }
        m90 m90Var = this.f37677s;
        if (m90Var != null) {
            float fFloatValue = ((Float) m90Var.mo16692f()).floatValue();
            if (fFloatValue == 0.0f) {
                yk4Var.setMaskFilter(null);
            } else if (fFloatValue != this.f37678t) {
                yk4Var.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f37678t = fFloatValue;
        }
        float fIntValue = ((Integer) this.f37670l.mo16692f()).intValue() / 100.0f;
        yk4Var.setAlpha(f06.m11422c((int) (i * fIntValue)));
        if (qm2Var != null) {
            qm2Var.m20023a((int) (fIntValue * 255.0f), yk4Var);
        }
        canvas.drawPath(path, yk4Var);
        AsyncUpdates asyncUpdates2 = wk4.f66962a;
    }

    /* JADX INFO: renamed from: i */
    public final int m11310i() {
        float f = this.f37671m.f50799d;
        float f2 = this.f37676r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.f37672n.f50799d * f2);
        int iRound3 = Math.round(this.f37669k.f50799d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
