package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.C0868b;
import com.airbnb.lottie.model.content.GradientType;

/* JADX INFO: loaded from: classes2.dex */
public final class hp3 extends ha0 {

    /* JADX INFO: renamed from: A */
    public wna f42723A;

    /* JADX INFO: renamed from: q */
    public final String f42724q;

    /* JADX INFO: renamed from: r */
    public final boolean f42725r;

    /* JADX INFO: renamed from: s */
    public final tk5 f42726s;

    /* JADX INFO: renamed from: t */
    public final tk5 f42727t;

    /* JADX INFO: renamed from: u */
    public final RectF f42728u;

    /* JADX INFO: renamed from: v */
    public final GradientType f42729v;

    /* JADX INFO: renamed from: w */
    public final int f42730w;

    /* JADX INFO: renamed from: x */
    public final bp3 f42731x;

    /* JADX INFO: renamed from: y */
    public final bp3 f42732y;

    /* JADX INFO: renamed from: z */
    public final bp3 f42733z;

    public hp3(C0868b c0868b, o90 o90Var, gp3 gp3Var) {
        super(c0868b, o90Var, gp3Var.f41133h.toPaintCap(), gp3Var.f41134i.toPaintJoin(), gp3Var.f41135j, gp3Var.f41129d, gp3Var.f41132g, gp3Var.f41136k, gp3Var.f41137l);
        this.f42726s = new tk5((Object) null);
        this.f42727t = new tk5((Object) null);
        this.f42728u = new RectF();
        this.f42724q = gp3Var.f41126a;
        this.f42729v = gp3Var.f41127b;
        this.f42725r = gp3Var.f41138m;
        this.f42730w = (int) (c0868b.f10620a.m12729c() / 32.0f);
        m90 m90VarMo550a = gp3Var.f41128c.mo550a();
        this.f42731x = (bp3) m90VarMo550a;
        m90VarMo550a.m16687a(this);
        o90Var.m17863e(m90VarMo550a);
        m90 m90VarMo550a2 = gp3Var.f41130e.mo550a();
        this.f42732y = (bp3) m90VarMo550a2;
        m90VarMo550a2.m16687a(this);
        o90Var.m17863e(m90VarMo550a2);
        m90 m90VarMo550a3 = gp3Var.f41131f.mo550a();
        this.f42733z = (bp3) m90VarMo550a3;
        m90VarMo550a3.m16687a(this);
        o90Var.m17863e(m90VarMo550a3);
    }

    /* JADX INFO: renamed from: e */
    public final int[] m13419e(int[] iArr) {
        wna wnaVar = this.f42723A;
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

    @Override // p000.ha0, p000.ni4
    /* JADX INFO: renamed from: f */
    public final void mo9830f(p33 p33Var, Object obj) {
        super.mo9830f(p33Var, obj);
        if (obj == yl5.f70000J) {
            wna wnaVar = this.f42723A;
            o90 o90Var = this.f42070f;
            if (wnaVar != null) {
                o90Var.m17867n(wnaVar);
            }
            wna wnaVar2 = new wna(p33Var, null);
            this.f42723A = wnaVar2;
            wnaVar2.m16687a(this);
            o90Var.m17863e(this.f42723A);
        }
    }

    @Override // p000.qk1
    public final String getName() {
        return this.f42724q;
    }

    @Override // p000.ha0, p000.am2
    /* JADX INFO: renamed from: h */
    public final void mo556h(Canvas canvas, Matrix matrix, int i, qm2 qm2Var) {
        Shader shader;
        Shader radialGradient;
        if (this.f42725r) {
            return;
        }
        mo555d(this.f42728u, matrix, false);
        GradientType gradientType = this.f42729v;
        GradientType gradientType2 = GradientType.LINEAR;
        bp3 bp3Var = this.f42731x;
        bp3 bp3Var2 = this.f42733z;
        bp3 bp3Var3 = this.f42732y;
        if (gradientType == gradientType2) {
            long jM13420i = m13420i();
            tk5 tk5Var = this.f42726s;
            shader = (LinearGradient) tk5Var.m22176b(jM13420i);
            if (shader == null) {
                PointF pointF = (PointF) bp3Var3.mo16692f();
                PointF pointF2 = (PointF) bp3Var2.mo16692f();
                ap3 ap3Var = (ap3) bp3Var.mo16692f();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m13419e(ap3Var.f7322b), ap3Var.f7321a, Shader.TileMode.CLAMP);
                tk5Var.m22180f(radialGradient, jM13420i);
                shader = radialGradient;
            }
        } else {
            long jM13420i2 = m13420i();
            tk5 tk5Var2 = this.f42727t;
            shader = (RadialGradient) tk5Var2.m22176b(jM13420i2);
            if (shader == null) {
                PointF pointF3 = (PointF) bp3Var3.mo16692f();
                PointF pointF4 = (PointF) bp3Var2.mo16692f();
                ap3 ap3Var2 = (ap3) bp3Var.mo16692f();
                int[] iArrM13419e = m13419e(ap3Var2.f7322b);
                float[] fArr = ap3Var2.f7321a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointF4.x - f, pointF4.y - f2), iArrM13419e, fArr, Shader.TileMode.CLAMP);
                tk5Var2.m22180f(radialGradient, jM13420i2);
                shader = radialGradient;
            }
        }
        this.f42073i.setShader(shader);
        super.mo556h(canvas, matrix, i, qm2Var);
    }

    /* JADX INFO: renamed from: i */
    public final int m13420i() {
        float f = this.f42732y.f50799d;
        float f2 = this.f42730w;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.f42733z.f50799d * f2);
        int iRound3 = Math.round(this.f42731x.f50799d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
