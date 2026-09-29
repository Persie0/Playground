package p000;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class tf9 extends m90 {

    /* JADX INFO: renamed from: i */
    public final PointF f62229i;

    /* JADX INFO: renamed from: j */
    public final PointF f62230j;

    /* JADX INFO: renamed from: k */
    public final j73 f62231k;

    /* JADX INFO: renamed from: l */
    public final j73 f62232l;

    /* JADX INFO: renamed from: m */
    public p33 f62233m;

    /* JADX INFO: renamed from: n */
    public p33 f62234n;

    public tf9(j73 j73Var, j73 j73Var2) {
        super(Collections.EMPTY_LIST);
        this.f62229i = new PointF();
        this.f62230j = new PointF();
        this.f62231k = j73Var;
        this.f62232l = j73Var2;
        mo16694j(this.f50799d);
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: f */
    public final Object mo16692f() {
        return m22026m();
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ Object mo3293g(kj4 kj4Var, float f) {
        return m22026m();
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: j */
    public final void mo16694j(float f) {
        j73 j73Var = this.f62231k;
        j73Var.mo16694j(f);
        j73 j73Var2 = this.f62232l;
        j73Var2.mo16694j(f);
        this.f62229i.set(((Float) j73Var.mo16692f()).floatValue(), ((Float) j73Var2.mo16692f()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f50796a;
            if (i >= arrayList.size()) {
                return;
            }
            ((i90) arrayList.get(i)).mo9827a();
            i++;
        }
    }

    /* JADX INFO: renamed from: m */
    public final PointF m22026m() {
        Float f;
        j73 j73Var;
        kj4 kj4VarM16688b;
        j73 j73Var2;
        kj4 kj4VarM16688b2;
        Float f2 = null;
        if (this.f62233m == null || (kj4VarM16688b2 = (j73Var2 = this.f62231k).m16688b()) == null) {
            f = null;
        } else {
            Float f3 = kj4VarM16688b2.f47384h;
            p33 p33Var = this.f62233m;
            float f4 = kj4VarM16688b2.f47383g;
            f = (Float) p33Var.m18870N(f4, f3 == null ? f4 : f3.floatValue(), (Float) kj4VarM16688b2.f47378b, (Float) kj4VarM16688b2.f47379c, j73Var2.m16690d(), j73Var2.m16691e(), j73Var2.f50799d);
        }
        if (this.f62234n != null && (kj4VarM16688b = (j73Var = this.f62232l).m16688b()) != null) {
            Float f5 = kj4VarM16688b.f47384h;
            p33 p33Var2 = this.f62234n;
            float f6 = kj4VarM16688b.f47383g;
            f2 = (Float) p33Var2.m18870N(f6, f5 == null ? f6 : f5.floatValue(), (Float) kj4VarM16688b.f47378b, (Float) kj4VarM16688b.f47379c, j73Var.m16690d(), j73Var.m16691e(), j73Var.f50799d);
        }
        PointF pointF = this.f62229i;
        PointF pointF2 = this.f62230j;
        if (f == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f.floatValue(), 0.0f);
        }
        if (f2 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f2.floatValue());
        return pointF2;
    }
}
