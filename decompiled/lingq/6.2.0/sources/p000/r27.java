package p000;

import android.graphics.PointF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class r27 extends b38 {

    /* JADX INFO: renamed from: a */
    public RecyclerView f58533a;

    /* JADX INFO: renamed from: b */
    public final gc9 f58534b = new gc9(this);

    /* JADX INFO: renamed from: c */
    public wz6 f58535c;

    /* JADX INFO: renamed from: d */
    public vz6 f58536d;

    /* JADX INFO: renamed from: d */
    public static int m20253d(View view, lq2 lq2Var) {
        return ((lq2Var.mo16447e(view) / 2) + lq2Var.mo16449g(view)) - ((lq2Var.mo16456n() / 2) + lq2Var.mo16455m());
    }

    /* JADX INFO: renamed from: e */
    public static View m20254e(y28 y28Var, lq2 lq2Var) {
        int iM24906v = y28Var.m24906v();
        View view = null;
        if (iM24906v == 0) {
            return null;
        }
        int iMo16456n = (lq2Var.mo16456n() / 2) + lq2Var.mo16455m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iM24906v; i2++) {
            View viewM24904u = y28Var.m24904u(i2);
            int iAbs = Math.abs(((lq2Var.mo16447e(viewM24904u) / 2) + lq2Var.mo16449g(viewM24904u)) - iMo16456n);
            if (iAbs < i) {
                view = viewM24904u;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.b38
    /* JADX INFO: renamed from: a */
    public final boolean mo3269a(int i, int i2) {
        int minFlingVelocity;
        boolean z;
        int iM24878K;
        PointF pointFMo2674a;
        y28 layoutManager = this.f58533a.getLayoutManager();
        if (layoutManager != 0 && this.f58533a.getAdapter() != null && ((Math.abs(i2) > (minFlingVelocity = this.f58533a.getMinFlingVelocity()) || Math.abs(i) > minFlingVelocity) && ((z = layoutManager instanceof j38)))) {
            View view = null;
            q27 q27Var = !z ? null : new q27(this, this.f58533a.getContext());
            if (q27Var != null) {
                int iM24888F = layoutManager.m24888F();
                if (iM24888F != 0) {
                    lq2 lq2VarM20259h = layoutManager.mo2680e() ? m20259h(layoutManager) : layoutManager.mo2679d() ? m20258g(layoutManager) : null;
                    if (lq2VarM20259h == null) {
                        iM24878K = -1;
                    } else {
                        int iM24906v = layoutManager.m24906v();
                        int i3 = Integer.MAX_VALUE;
                        int i4 = Integer.MIN_VALUE;
                        View view2 = null;
                        for (int i5 = 0; i5 < iM24906v; i5++) {
                            View viewM24904u = layoutManager.m24904u(i5);
                            if (viewM24904u != null) {
                                int iM20253d = m20253d(viewM24904u, lq2VarM20259h);
                                if (iM20253d <= 0 && iM20253d > i4) {
                                    view2 = viewM24904u;
                                    i4 = iM20253d;
                                }
                                if (iM20253d >= 0 && iM20253d < i3) {
                                    view = viewM24904u;
                                    i3 = iM20253d;
                                }
                            }
                        }
                        boolean z2 = !layoutManager.mo2679d() ? i2 <= 0 : i <= 0;
                        if (z2 && view != null) {
                            iM24878K = y28.m24878K(view);
                        } else if (z2 || view2 == null) {
                            if (z2) {
                                view = view2;
                            }
                            if (view == null) {
                                iM24878K = -1;
                            } else {
                                iM24878K = ((z && (pointFMo2674a = ((j38) layoutManager).mo2674a(layoutManager.m24888F() - 1)) != null && ((pointFMo2674a.x > 0.0f ? 1 : (pointFMo2674a.x == 0.0f ? 0 : -1)) < 0 || (pointFMo2674a.y > 0.0f ? 1 : (pointFMo2674a.y == 0.0f ? 0 : -1)) < 0)) == z2 ? -1 : 1) + y28.m24878K(view);
                                if (iM24878K < 0 || iM24878K >= iM24888F) {
                                    iM24878K = -1;
                                }
                            }
                        } else {
                            iM24878K = y28.m24878K(view2);
                        }
                    }
                } else {
                    iM24878K = -1;
                }
                if (iM24878K != -1) {
                    q27Var.f38889a = iM24878K;
                    layoutManager.m24892H0(q27Var);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m20255b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f58533a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        gc9 gc9Var = this.f58534b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f6608E0;
            if (arrayList != null) {
                arrayList.remove(gc9Var);
            }
            this.f58533a.setOnFlingListener(null);
        }
        this.f58533a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                C3386nv.m17633t("An instance of OnFlingListener already set.");
                return;
            }
            this.f58533a.m2743j(gc9Var);
            this.f58533a.setOnFlingListener(this);
            new Scroller(this.f58533a.getContext(), new DecelerateInterpolator());
            m20260i();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int[] m20256c(y28 y28Var, View view) {
        int[] iArr = new int[2];
        if (y28Var.mo2679d()) {
            iArr[0] = m20253d(view, m20258g(y28Var));
        } else {
            iArr[0] = 0;
        }
        if (y28Var.mo2680e()) {
            iArr[1] = m20253d(view, m20259h(y28Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX INFO: renamed from: f */
    public View mo20257f(y28 y28Var) {
        if (y28Var.mo2680e()) {
            return m20254e(y28Var, m20259h(y28Var));
        }
        if (y28Var.mo2679d()) {
            return m20254e(y28Var, m20258g(y28Var));
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final lq2 m20258g(y28 y28Var) {
        vz6 vz6Var = this.f58536d;
        if (vz6Var == null || ((y28) vz6Var.f49998b) != y28Var) {
            this.f58536d = new vz6(y28Var);
        }
        return this.f58536d;
    }

    /* JADX INFO: renamed from: h */
    public final lq2 m20259h(y28 y28Var) {
        wz6 wz6Var = this.f58535c;
        if (wz6Var == null || ((y28) wz6Var.f49998b) != y28Var) {
            this.f58535c = new wz6(y28Var);
        }
        return this.f58535c;
    }

    /* JADX INFO: renamed from: i */
    public final void m20260i() {
        y28 layoutManager;
        View viewMo20257f;
        RecyclerView recyclerView = this.f58533a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo20257f = mo20257f(layoutManager)) == null) {
            return;
        }
        int[] iArrM20256c = m20256c(layoutManager, viewMo20257f);
        int i = iArrM20256c[0];
        if (i == 0 && iArrM20256c[1] == 0) {
            return;
        }
        this.f58533a.m2746k0(i, iArrM20256c[1], false);
    }
}
