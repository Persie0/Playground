package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mhb extends mgv {

    /* JADX INFO: renamed from: a */
    private final Boolean f40473a;

    /* JADX INFO: renamed from: b */
    private final ago f40474b;

    /* JADX INFO: renamed from: c */
    private Window f40475c;

    /* JADX INFO: renamed from: d */
    private boolean f40476d;

    public mhb(View view, ago agoVar) {
        this.f40474b = agoVar;
        mkx mkxVar = BottomSheetBehavior.m4805w(view).f8108d;
        ColorStateList colorStateListM16575e = mkxVar != null ? mkxVar.m16575e() : afh.m473d(view);
        if (colorStateListM16575e != null) {
            this.f40473a = Boolean.valueOf(kxk.m15028u(colorStateListM16575e.getDefaultColor()));
        } else {
            this.f40473a = view.getBackground() instanceof ColorDrawable ? Boolean.valueOf(kxk.m15028u(((ColorDrawable) view.getBackground()).getColor())) : null;
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m16365e(View view) {
        if (view.getTop() < this.f40474b.m606d()) {
            Window window = this.f40475c;
            if (window != null) {
                Boolean bool = this.f40473a;
                kxk.m15020m(window, bool == null ? this.f40476d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), this.f40474b.m606d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f40475c;
            if (window2 != null) {
                kxk.m15020m(window2, this.f40476d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // p000.mgv
    /* JADX INFO: renamed from: a */
    public final void mo16361a(View view) {
        m16365e(view);
    }

    @Override // p000.mgv
    /* JADX INFO: renamed from: b */
    public final void mo16362b(View view, int i) {
        m16365e(view);
    }

    @Override // p000.mgv
    /* JADX INFO: renamed from: c */
    public final void mo16363c(View view) {
        m16365e(view);
    }

    /* JADX INFO: renamed from: d */
    public final void m16366d(Window window) {
        if (this.f40475c == window) {
            return;
        }
        this.f40475c = window;
        if (window != null) {
            window.getDecorView();
            WindowInsetsController insetsController = window.getInsetsController();
            new C1117xf();
            this.f40476d = (insetsController.getSystemBarsAppearance() & 8) != 0;
        }
    }
}
