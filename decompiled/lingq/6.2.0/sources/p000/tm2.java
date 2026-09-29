package p000;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public final class tm2 implements i90 {

    /* JADX INFO: renamed from: a */
    public final o90 f62517a;

    /* JADX INFO: renamed from: b */
    public final o90 f62518b;

    /* JADX INFO: renamed from: c */
    public final ha1 f62519c;

    /* JADX INFO: renamed from: d */
    public final j73 f62520d;

    /* JADX INFO: renamed from: e */
    public final j73 f62521e;

    /* JADX INFO: renamed from: f */
    public final j73 f62522f;

    /* JADX INFO: renamed from: g */
    public final j73 f62523g;

    /* JADX INFO: renamed from: h */
    public Matrix f62524h;

    public tm2(o90 o90Var, o90 o90Var2, ca1 ca1Var) {
        this.f62518b = o90Var;
        this.f62517a = o90Var2;
        m90 m90VarMo550a = ((C3726wl) ca1Var.f9781a).mo550a();
        this.f62519c = (ha1) m90VarMo550a;
        m90VarMo550a.m16687a(this);
        o90Var2.m17863e(m90VarMo550a);
        j73 j73VarMo550a = ((C3763xl) ca1Var.f9782b).mo550a();
        this.f62520d = j73VarMo550a;
        j73VarMo550a.m16687a(this);
        o90Var2.m17863e(j73VarMo550a);
        j73 j73VarMo550a2 = ((C3763xl) ca1Var.f9783c).mo550a();
        this.f62521e = j73VarMo550a2;
        j73VarMo550a2.m16687a(this);
        o90Var2.m17863e(j73VarMo550a2);
        j73 j73VarMo550a3 = ((C3763xl) ca1Var.f9784d).mo550a();
        this.f62522f = j73VarMo550a3;
        j73VarMo550a3.m16687a(this);
        o90Var2.m17863e(j73VarMo550a3);
        j73 j73VarMo550a4 = ((C3763xl) ca1Var.f9785e).mo550a();
        this.f62523g = j73VarMo550a4;
        j73VarMo550a4.m16687a(this);
        o90Var2.m17863e(j73VarMo550a4);
    }

    @Override // p000.i90
    /* JADX INFO: renamed from: a */
    public final void mo9827a() {
        this.f62518b.mo9827a();
    }

    /* JADX INFO: renamed from: b */
    public final qm2 m22231b(Matrix matrix, int i) {
        float fM14316m = this.f62521e.m14316m() * 0.017453292f;
        float fFloatValue = ((Float) this.f62522f.mo16692f()).floatValue();
        double d = fM14316m;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.f62523g.mo16692f()).floatValue();
        int iIntValue = ((Integer) this.f62519c.mo16692f()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.f62520d.mo16692f()).floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        qm2 qm2Var = new qm2();
        qm2Var.f57938a = fFloatValue2 * 0.33f;
        qm2Var.f57939b = fSin;
        qm2Var.f57940c = fCos;
        qm2Var.f57941d = iArgb;
        qm2Var.f57942e = null;
        qm2Var.m20025c(matrix);
        if (this.f62524h == null) {
            this.f62524h = new Matrix();
        }
        this.f62517a.f54067w.m14358e().invert(this.f62524h);
        qm2Var.m20025c(this.f62524h);
        return qm2Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m22232c(p33 p33Var) {
        this.f62520d.m16695k(new sm2(p33Var));
    }
}
