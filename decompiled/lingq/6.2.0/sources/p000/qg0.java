package p000;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class qg0 extends jg0 {

    /* JADX INFO: renamed from: a */
    public final Boolean f57737a;

    /* JADX INFO: renamed from: b */
    public final f6b f57738b;

    /* JADX INFO: renamed from: c */
    public Window f57739c;

    /* JADX INFO: renamed from: d */
    public boolean f57740d;

    public qg0(View view, f6b f6bVar) {
        this.f57738b = f6bVar;
        fs5 fs5Var = BottomSheetBehavior.m6021C(view).f12728j;
        ColorStateList backgroundTintList = fs5Var != null ? fs5Var.f39578b.f36162c : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.f57737a = Boolean.valueOf(omd.m18124N(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListM14107u = AbstractC3122is.m14107u(view.getBackground());
        Integer numValueOf = colorStateListM14107u != null ? Integer.valueOf(colorStateListM14107u.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.f57737a = Boolean.valueOf(omd.m18124N(numValueOf.intValue()));
        } else {
            this.f57737a = null;
        }
    }

    @Override // p000.jg0
    /* JADX INFO: renamed from: a */
    public final void mo14438a(View view) {
        m19937d(view);
    }

    @Override // p000.jg0
    /* JADX INFO: renamed from: b */
    public final void mo14439b(View view) {
        m19937d(view);
    }

    @Override // p000.jg0
    /* JADX INFO: renamed from: c */
    public final void mo14440c(View view, int i) {
        m19937d(view);
    }

    /* JADX INFO: renamed from: d */
    public final void m19937d(View view) {
        bca h6bVar;
        bca h6bVar2;
        int top = view.getTop();
        f6b f6bVar = this.f57738b;
        if (top < f6bVar.m11574d()) {
            Window window = this.f57739c;
            if (window != null) {
                Boolean bool = this.f57737a;
                boolean zBooleanValue = bool == null ? this.f57740d : bool.booleanValue();
                cc4 cc4Var = new cc4(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                if (i >= 35) {
                    h6bVar2 = new j6b(window, cc4Var);
                } else {
                    h6bVar2 = i >= 30 ? new h6b(window, cc4Var) : new g6b(window, cc4Var);
                }
                h6bVar2.mo3618i(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), f6bVar.m11574d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f57739c;
            if (window2 != null) {
                boolean z = this.f57740d;
                cc4 cc4Var2 = new cc4(window2.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    h6bVar = new j6b(window2, cc4Var2);
                } else {
                    h6bVar = i2 >= 30 ? new h6b(window2, cc4Var2) : new g6b(window2, cc4Var2);
                }
                h6bVar.mo3618i(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m19938e(Window window) {
        bca h6bVar;
        if (this.f57739c == window) {
            return;
        }
        this.f57739c = window;
        if (window != null) {
            cc4 cc4Var = new cc4(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                h6bVar = new j6b(window, cc4Var);
            } else {
                h6bVar = i >= 30 ? new h6b(window, cc4Var) : new g6b(window, cc4Var);
            }
            this.f57740d = h6bVar.mo3616g();
        }
    }
}
