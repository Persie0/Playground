package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.C0868b;

/* JADX INFO: loaded from: classes2.dex */
public final class fl9 extends ha0 {

    /* JADX INFO: renamed from: q */
    public final o90 f39263q;

    /* JADX INFO: renamed from: r */
    public final String f39264r;

    /* JADX INFO: renamed from: s */
    public final boolean f39265s;

    /* JADX INFO: renamed from: t */
    public final ha1 f39266t;

    /* JADX INFO: renamed from: u */
    public wna f39267u;

    public fl9(C0868b c0868b, o90 o90Var, p49 p49Var) {
        super(c0868b, o90Var, p49Var.f55574g.toPaintCap(), p49Var.f55575h.toPaintJoin(), p49Var.f55576i, p49Var.f55572e, p49Var.f55573f, p49Var.f55570c, p49Var.f55569b);
        this.f39263q = o90Var;
        this.f39264r = p49Var.f55568a;
        this.f39265s = p49Var.f55577j;
        m90 m90VarMo550a = p49Var.f55571d.mo550a();
        this.f39266t = (ha1) m90VarMo550a;
        m90VarMo550a.m16687a(this);
        o90Var.m17863e(m90VarMo550a);
    }

    @Override // p000.ha0, p000.ni4
    /* JADX INFO: renamed from: f */
    public final void mo9830f(p33 p33Var, Object obj) {
        super.mo9830f(p33Var, obj);
        PointF pointF = yl5.f70005a;
        ha1 ha1Var = this.f39266t;
        if (obj == 2) {
            ha1Var.m16695k(p33Var);
            return;
        }
        if (obj == yl5.f69999I) {
            wna wnaVar = this.f39267u;
            o90 o90Var = this.f39263q;
            if (wnaVar != null) {
                o90Var.m17867n(wnaVar);
            }
            wna wnaVar2 = new wna(p33Var, null);
            this.f39267u = wnaVar2;
            wnaVar2.m16687a(this);
            o90Var.m17863e(ha1Var);
        }
    }

    @Override // p000.qk1
    public final String getName() {
        return this.f39264r;
    }

    @Override // p000.ha0, p000.am2
    /* JADX INFO: renamed from: h */
    public final void mo556h(Canvas canvas, Matrix matrix, int i, qm2 qm2Var) {
        if (this.f39265s) {
            return;
        }
        ha1 ha1Var = this.f39266t;
        int iM13153m = ha1Var.m13153m(ha1Var.m16688b(), ha1Var.m16690d());
        yk4 yk4Var = this.f42073i;
        yk4Var.setColor(iM13153m);
        wna wnaVar = this.f39267u;
        if (wnaVar != null) {
            yk4Var.setColorFilter((ColorFilter) wnaVar.mo16692f());
        }
        super.mo556h(canvas, matrix, i, qm2Var);
    }
}
