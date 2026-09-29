package p000;

import android.animation.Animator;
import com.google.android.material.R$animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: loaded from: classes2.dex */
public final class ix2 extends s90 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ExtendedFloatingActionButton f44727g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix2(ExtendedFloatingActionButton extendedFloatingActionButton, vj6 vj6Var) {
        super(extendedFloatingActionButton, vj6Var);
        this.f44727g = extendedFloatingActionButton;
    }

    @Override // p000.s90
    /* JADX INFO: renamed from: c */
    public final int mo12952c() {
        return R$animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // p000.s90
    /* JADX INFO: renamed from: e */
    public final void mo12953e() {
        this.f60549d.f65506b = null;
        this.f44727g.f12964q0 = 0;
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
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f44727g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.f12964q0 = 2;
    }

    @Override // p000.s90
    /* JADX INFO: renamed from: g */
    public final void mo12955g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f44727g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // p000.s90
    /* JADX INFO: renamed from: h */
    public final boolean mo12956h() {
        int i = ExtendedFloatingActionButton.f12953G0;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f44727g;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i2 = extendedFloatingActionButton.f12964q0;
        if (visibility != 0) {
            if (i2 != 2) {
                return false;
            }
        } else if (i2 == 1) {
            return false;
        }
        return true;
    }
}
