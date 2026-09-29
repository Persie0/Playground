package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C0868b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d49 extends o90 {

    /* JADX INFO: renamed from: C */
    public final uk1 f34995C;

    /* JADX INFO: renamed from: D */
    public final rf1 f34996D;

    /* JADX INFO: renamed from: E */
    public final tm2 f34997E;

    public d49(C0868b c0868b, tp4 tp4Var, rf1 rf1Var, gl5 gl5Var) {
        super(c0868b, tp4Var);
        this.f34996D = rf1Var;
        uk1 uk1Var = new uk1(c0868b, this, new z39("__container", tp4Var.f62671a, false), gl5Var);
        this.f34995C = uk1Var;
        List list = Collections.EMPTY_LIST;
        uk1Var.mo9828b(list, list);
        ca1 ca1Var = this.f54060p.f62694x;
        if (ca1Var != null) {
            this.f34997E = new tm2(this, this, ca1Var);
        }
    }

    @Override // p000.o90, p000.am2
    /* JADX INFO: renamed from: d */
    public final void mo555d(RectF rectF, Matrix matrix, boolean z) {
        super.mo555d(rectF, matrix, z);
        this.f34995C.mo555d(rectF, this.f54058n, z);
    }

    @Override // p000.o90, p000.ni4
    /* JADX INFO: renamed from: f */
    public final void mo9830f(p33 p33Var, Object obj) {
        super.mo9830f(p33Var, obj);
        PointF pointF = yl5.f70005a;
        tm2 tm2Var = this.f34997E;
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
        tm2 tm2Var = this.f34997E;
        if (tm2Var != null) {
            qm2Var = tm2Var.m22231b(matrix, i);
        }
        this.f34995C.mo556h(canvas, matrix, i, qm2Var);
    }

    @Override // p000.o90
    /* JADX INFO: renamed from: k */
    public final hi8 mo10092k() {
        hi8 hi8Var = this.f54060p.f62693w;
        return hi8Var != null ? hi8Var : this.f34996D.f54060p.f62693w;
    }

    @Override // p000.o90
    /* JADX INFO: renamed from: o */
    public final void mo10093o(mi4 mi4Var, int i, ArrayList arrayList, mi4 mi4Var2) {
        this.f34995C.mo9829c(mi4Var, i, arrayList, mi4Var2);
    }
}
