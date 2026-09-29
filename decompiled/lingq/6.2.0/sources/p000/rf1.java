package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.C0868b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rf1 extends o90 {

    /* JADX INFO: renamed from: C */
    public m90 f59181C;

    /* JADX INFO: renamed from: D */
    public final ArrayList f59182D;

    /* JADX INFO: renamed from: E */
    public final RectF f59183E;

    /* JADX INFO: renamed from: F */
    public final RectF f59184F;

    /* JADX INFO: renamed from: G */
    public final RectF f59185G;

    /* JADX INFO: renamed from: H */
    public final fq6 f59186H;

    /* JADX INFO: renamed from: I */
    public final ztb f59187I;

    /* JADX INFO: renamed from: J */
    public float f59188J;

    /* JADX INFO: renamed from: K */
    public boolean f59189K;

    /* JADX INFO: renamed from: L */
    public final tm2 f59190L;

    public rf1(C0868b c0868b, tp4 tp4Var, List list, gl5 gl5Var) {
        o90 o90Var;
        o90 d49Var;
        super(c0868b, tp4Var);
        this.f59182D = new ArrayList();
        this.f59183E = new RectF();
        this.f59184F = new RectF();
        this.f59185G = new RectF();
        this.f59186H = new fq6();
        this.f59187I = new ztb(7, (byte) 0);
        this.f59189K = true;
        C3763xl c3763xl = tp4Var.f62689s;
        if (c3763xl != null) {
            j73 j73VarMo550a = c3763xl.mo550a();
            this.f59181C = j73VarMo550a;
            m17863e(j73VarMo550a);
            this.f59181C.m16687a(this);
        } else {
            this.f59181C = null;
        }
        tk5 tk5Var = new tk5(gl5Var.f40966j.size());
        o90 o90Var2 = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            tp4 tp4Var2 = (tp4) list.get(size);
            switch (n90.f52500a[tp4Var2.f62675e.ordinal()]) {
                case 1:
                    d49Var = new d49(c0868b, tp4Var2, this, gl5Var);
                    break;
                case 2:
                    d49Var = new rf1(c0868b, tp4Var2, (List) gl5Var.f40959c.get(tp4Var2.f62677g), gl5Var);
                    break;
                case 3:
                    d49Var = new qd9(c0868b, tp4Var2);
                    break;
                case 4:
                    d49Var = new vz3(c0868b, tp4Var2);
                    break;
                case 5:
                    d49Var = new ro6(c0868b, tp4Var2);
                    break;
                case 6:
                    d49Var = new ow9(c0868b, tp4Var2);
                    break;
                default:
                    tj5.m22151c("Unknown layer type " + tp4Var2.f62675e);
                    d49Var = null;
                    break;
            }
            if (d49Var != null) {
                tk5Var.m22180f(d49Var, d49Var.f54060p.f62674d);
                if (o90Var2 != null) {
                    o90Var2.f54063s = d49Var;
                    o90Var2 = null;
                } else {
                    this.f59182D.add(0, d49Var);
                    int i = qf1.f57681a[tp4Var2.f62691u.ordinal()];
                    if (i == 1 || i == 2) {
                        o90Var2 = d49Var;
                    }
                }
            }
        }
        for (int i2 = 0; i2 < tk5Var.m22182h(); i2++) {
            o90 o90Var3 = (o90) tk5Var.m22176b(tk5Var.m22179e(i2));
            if (o90Var3 != null && (o90Var = (o90) tk5Var.m22176b(o90Var3.f54060p.f62676f)) != null) {
                o90Var3.f54064t = o90Var;
            }
        }
        ca1 ca1Var = this.f54060p.f62694x;
        if (ca1Var != null) {
            this.f59190L = new tm2(this, this, ca1Var);
        }
    }

    @Override // p000.o90, p000.am2
    /* JADX INFO: renamed from: d */
    public final void mo555d(RectF rectF, Matrix matrix, boolean z) {
        super.mo555d(rectF, matrix, z);
        ArrayList arrayList = this.f59182D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f59183E;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((o90) arrayList.get(size)).mo555d(rectF2, this.f54058n, true);
            rectF.union(rectF2);
        }
    }

    @Override // p000.o90, p000.ni4
    /* JADX INFO: renamed from: f */
    public final void mo9830f(p33 p33Var, Object obj) {
        super.mo9830f(p33Var, obj);
        if (obj == yl5.f69993C) {
            wna wnaVar = new wna(p33Var, null);
            this.f59181C = wnaVar;
            wnaVar.m16687a(this);
            m17863e(this.f59181C);
            return;
        }
        tm2 tm2Var = this.f59190L;
        if (obj == 5 && tm2Var != null) {
            tm2Var.f62519c.m16695k(p33Var);
            return;
        }
        if (obj == yl5.f69995E && tm2Var != null) {
            tm2Var.m22232c(p33Var);
            return;
        }
        if (obj == yl5.f69996F && tm2Var != null) {
            tm2Var.f62521e.m16695k(p33Var);
            return;
        }
        if (obj == yl5.f69997G && tm2Var != null) {
            tm2Var.f62522f.m16695k(p33Var);
        } else {
            if (obj != yl5.f69998H || tm2Var == null) {
                return;
            }
            tm2Var.f62523g.m16695k(p33Var);
        }
    }

    @Override // p000.o90
    /* JADX INFO: renamed from: j */
    public final void mo10091j(Canvas canvas, Matrix matrix, int i, qm2 qm2Var) {
        Canvas canvasM11998e;
        AsyncUpdates asyncUpdates = wk4.f66962a;
        boolean z = false;
        tm2 tm2Var = this.f59190L;
        boolean z2 = (qm2Var == null && tm2Var == null) ? false : true;
        C0868b c0868b = this.f54059o;
        boolean z3 = c0868b.f10608O;
        ArrayList<o90> arrayList = this.f59182D;
        if ((z3 && arrayList.size() > 1 && i != 255) || (z2 && c0868b.f10609P)) {
            z = true;
        }
        int i2 = z ? 255 : i;
        if (tm2Var != null) {
            qm2Var = tm2Var.m22231b(matrix, i2);
        }
        boolean z4 = this.f59189K;
        tp4 tp4Var = this.f54060p;
        RectF rectF = this.f59184F;
        if (z4 || !"__container".equals(tp4Var.f62673c)) {
            rectF.set(0.0f, 0.0f, tp4Var.f62685o, tp4Var.f62686p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            for (o90 o90Var : arrayList) {
                RectF rectF2 = this.f59185G;
                o90Var.mo555d(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        fq6 fq6Var = this.f59186H;
        if (z) {
            ztb ztbVar = this.f59187I;
            ztbVar.f72162c = null;
            ztbVar.f72161b = i;
            if (qm2Var != null) {
                if (Color.alpha(qm2Var.f57941d) > 0) {
                    ztbVar.f72162c = qm2Var;
                } else {
                    ztbVar.f72162c = null;
                }
                qm2Var = null;
            }
            canvasM11998e = fq6Var.m11998e(canvas, rectF, ztbVar);
        } else {
            canvasM11998e = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((o90) arrayList.get(size)).mo556h(canvasM11998e, matrix, i2, qm2Var);
            }
        }
        if (z) {
            fq6Var.m11997c();
        }
        canvas.restore();
        AsyncUpdates asyncUpdates2 = wk4.f66962a;
    }

    @Override // p000.o90
    /* JADX INFO: renamed from: o */
    public final void mo10093o(mi4 mi4Var, int i, ArrayList arrayList, mi4 mi4Var2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.f59182D;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((o90) arrayList2.get(i2)).mo9829c(mi4Var, i, arrayList, mi4Var2);
            i2++;
        }
    }

    @Override // p000.o90
    /* JADX INFO: renamed from: p */
    public final void mo17868p(boolean z) {
        super.mo17868p(z);
        Iterator it = this.f59182D.iterator();
        while (it.hasNext()) {
            ((o90) it.next()).mo17868p(z);
        }
    }

    @Override // p000.o90
    /* JADX INFO: renamed from: q */
    public final void mo17869q(float f) {
        AsyncUpdates asyncUpdates = wk4.f66962a;
        this.f59188J = f;
        super.mo17869q(f);
        m90 m90Var = this.f59181C;
        tp4 tp4Var = this.f54060p;
        if (m90Var != null) {
            gl5 gl5Var = this.f54059o.f10620a;
            f = ((((Float) m90Var.mo16692f()).floatValue() * tp4Var.f62672b.f40970n) - tp4Var.f62672b.f40968l) / ((gl5Var.f40969m - gl5Var.f40968l) + 0.01f);
        }
        if (this.f59181C == null) {
            float f2 = tp4Var.f62684n;
            gl5 gl5Var2 = tp4Var.f62672b;
            f -= f2 / (gl5Var2.f40969m - gl5Var2.f40968l);
        }
        if (tp4Var.f62683m != 0.0f && !"__container".equals(tp4Var.f62673c)) {
            f /= tp4Var.f62683m;
        }
        ArrayList arrayList = this.f59182D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((o90) arrayList.get(size)).mo17869q(f);
        }
        AsyncUpdates asyncUpdates2 = wk4.f66962a;
    }
}
