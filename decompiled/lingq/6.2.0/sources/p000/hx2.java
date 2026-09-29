package p000;

import android.animation.Animator;
import com.google.android.material.R$animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: loaded from: classes2.dex */
public final class hx2 extends s90 {

    /* JADX INFO: renamed from: g */
    public boolean f43094g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ExtendedFloatingActionButton f43095h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx2(ExtendedFloatingActionButton extendedFloatingActionButton, vj6 vj6Var) {
        super(extendedFloatingActionButton, vj6Var);
        this.f43095h = extendedFloatingActionButton;
    }

    @Override // p000.s90
    /* JADX INFO: renamed from: c */
    public final int mo12952c() {
        return R$animator.mtrl_extended_fab_hide_motion_spec;
    }

    @Override // p000.s90
    /* JADX INFO: renamed from: d */
    public final void mo13547d() {
        super.mo13547d();
        this.f43094g = true;
    }

    @Override // p000.s90
    /* JADX INFO: renamed from: e */
    public final void mo12953e() {
        this.f60549d.f65506b = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f43095h;
        extendedFloatingActionButton.f12964q0 = 0;
        if (this.f43094g) {
            return;
        }
        extendedFloatingActionButton.setVisibility(8);
    }

    @Override // p000.s90
    /* JADX INFO: renamed from: f */
    public final void mo12954f(Animator animator) {
        vj6 vj6Var = this.f60549d;
        Animator animator2 = (Animator) vj6Var.f65506b;
        if (animator2 != null) {
            animator2.cancel();
        }
        vj6Var.f65506b = animator;
        this.f43094g = false;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f43095h;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.f12964q0 = 1;
    }

    @Override // p000.s90
    /* JADX INFO: renamed from: g */
    public final void mo12955g() {
        this.f43095h.setVisibility(8);
    }

    @Override // p000.s90
    /* JADX INFO: renamed from: h */
    public final boolean mo12956h() {
        int i = ExtendedFloatingActionButton.f12953G0;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f43095h;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i2 = extendedFloatingActionButton.f12964q0;
        if (visibility == 0) {
            if (i2 != 1) {
                return false;
            }
        } else if (i2 == 2) {
            return false;
        }
        return true;
    }
}
