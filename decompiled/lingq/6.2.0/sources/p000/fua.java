package p000;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fua extends im1 {

    /* JADX INFO: renamed from: a */
    public k80 f39720a;

    /* JADX INFO: renamed from: b */
    public int f39721b = 0;

    public fua() {
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: l */
    public boolean mo5994l(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo12202x(coordinatorLayout, view, i);
        if (this.f39720a == null) {
            k80 k80Var = new k80();
            k80Var.f46846d = view;
            this.f39720a = k80Var;
        }
        k80 k80Var2 = this.f39720a;
        View view2 = (View) k80Var2.f46846d;
        k80Var2.f46843a = view2.getTop();
        k80Var2.f46844b = view2.getLeft();
        this.f39720a.m14979b();
        int i2 = this.f39721b;
        if (i2 == 0) {
            return true;
        }
        k80 k80Var3 = this.f39720a;
        if (k80Var3.f46845c != i2) {
            k80Var3.f46845c = i2;
            k80Var3.m14979b();
        }
        this.f39721b = 0;
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final int m12201w() {
        k80 k80Var = this.f39720a;
        if (k80Var != null) {
            return k80Var.f46845c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public void mo12202x(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m1984q(view, i);
    }

    public fua(int i) {
    }
}
