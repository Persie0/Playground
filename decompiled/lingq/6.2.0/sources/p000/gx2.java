package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.material.R$animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: loaded from: classes2.dex */
public final class gx2 extends s90 {

    /* JADX INFO: renamed from: g */
    public final jx2 f41462g;

    /* JADX INFO: renamed from: h */
    public final boolean f41463h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ExtendedFloatingActionButton f41464i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx2(ExtendedFloatingActionButton extendedFloatingActionButton, vj6 vj6Var, jx2 jx2Var, boolean z) {
        super(extendedFloatingActionButton, vj6Var);
        this.f41464i = extendedFloatingActionButton;
        this.f41462g = jx2Var;
        this.f41463h = z;
    }

    @Override // p000.s90
    /* JADX INFO: renamed from: a */
    public final AnimatorSet mo12951a() {
        s36 s36Var = this.f60551f;
        if (s36Var == null) {
            if (this.f60550e == null) {
                this.f60550e = s36.m21048b(this.f60546a, mo12952c());
            }
            s36Var = this.f60550e;
            s36Var.getClass();
        }
        boolean zM21052f = s36Var.m21052f("width");
        jx2 jx2Var = this.f41462g;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f41464i;
        if (zM21052f) {
            PropertyValuesHolder[] propertyValuesHolderArrM21051e = s36Var.m21051e("width");
            propertyValuesHolderArrM21051e[0].setFloatValues(extendedFloatingActionButton.getWidth(), jx2Var.mo12900d());
            s36Var.m21053g("width", propertyValuesHolderArrM21051e);
        }
        if (s36Var.m21052f("height")) {
            PropertyValuesHolder[] propertyValuesHolderArrM21051e2 = s36Var.m21051e("height");
            propertyValuesHolderArrM21051e2[0].setFloatValues(extendedFloatingActionButton.getHeight(), jx2Var.mo12897a());
            s36Var.m21053g("height", propertyValuesHolderArrM21051e2);
        }
        if (s36Var.m21052f("paddingStart")) {
            PropertyValuesHolder[] propertyValuesHolderArrM21051e3 = s36Var.m21051e("paddingStart");
            propertyValuesHolderArrM21051e3[0].setFloatValues(extendedFloatingActionButton.getPaddingStart(), jx2Var.mo12909q());
            s36Var.m21053g("paddingStart", propertyValuesHolderArrM21051e3);
        }
        if (s36Var.m21052f("paddingEnd")) {
            PropertyValuesHolder[] propertyValuesHolderArrM21051e4 = s36Var.m21051e("paddingEnd");
            propertyValuesHolderArrM21051e4[0].setFloatValues(extendedFloatingActionButton.getPaddingEnd(), jx2Var.mo12902f());
            s36Var.m21053g("paddingEnd", propertyValuesHolderArrM21051e4);
        }
        if (s36Var.m21052f("labelOpacity")) {
            PropertyValuesHolder[] propertyValuesHolderArrM21051e5 = s36Var.m21051e("labelOpacity");
            int iAlpha = Color.alpha(extendedFloatingActionButton.getCurrentOriginalTextColor());
            propertyValuesHolderArrM21051e5[0].setFloatValues(iAlpha != 0 ? Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / iAlpha : 0.0f, this.f41463h ? 1.0f : 0.0f);
            s36Var.m21053g("labelOpacity", propertyValuesHolderArrM21051e5);
        }
        return m21162b(s36Var);
    }

    @Override // p000.s90
    /* JADX INFO: renamed from: c */
    public final int mo12952c() {
        return this.f41463h ? R$animator.mtrl_extended_fab_change_size_expand_motion_spec : R$animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // p000.s90
    /* JADX INFO: renamed from: e */
    public final void mo12953e() {
        this.f60549d.f65506b = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f41464i;
        extendedFloatingActionButton.f12959B0 = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        jx2 jx2Var = this.f41462g;
        layoutParams.width = jx2Var.mo12903j().width;
        layoutParams.height = jx2Var.mo12903j().height;
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
        boolean z = this.f41463h;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f41464i;
        extendedFloatingActionButton.f12958A0 = z;
        extendedFloatingActionButton.f12959B0 = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
        extendedFloatingActionButton.m6140A();
    }

    @Override // p000.s90
    /* JADX INFO: renamed from: g */
    public final void mo12955g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f41464i;
        boolean z = this.f41463h;
        extendedFloatingActionButton.f12958A0 = z;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!z) {
            extendedFloatingActionButton.f12962E0 = layoutParams.width;
            extendedFloatingActionButton.f12963F0 = layoutParams.height;
        }
        jx2 jx2Var = this.f41462g;
        layoutParams.width = jx2Var.mo12903j().width;
        layoutParams.height = jx2Var.mo12903j().height;
        if (z) {
            extendedFloatingActionButton.m6141z(extendedFloatingActionButton.f12961D0);
        } else if (extendedFloatingActionButton.getText() != null && extendedFloatingActionButton.getText() != "") {
            extendedFloatingActionButton.m6141z(ColorStateList.valueOf(0));
        }
        extendedFloatingActionButton.setPaddingRelative(jx2Var.mo12909q(), extendedFloatingActionButton.getPaddingTop(), jx2Var.mo12902f(), extendedFloatingActionButton.getPaddingBottom());
        extendedFloatingActionButton.requestLayout();
        extendedFloatingActionButton.m6140A();
    }

    @Override // p000.s90
    /* JADX INFO: renamed from: h */
    public final boolean mo12956h() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f41464i;
        return this.f41463h == extendedFloatingActionButton.f12958A0 || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }
}
