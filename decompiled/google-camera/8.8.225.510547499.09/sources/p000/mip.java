package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.wear.ambient.AmbientMode;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mip extends min {

    /* JADX INFO: renamed from: E */
    private StateListAnimator f40634E;

    public mip(FloatingActionButton floatingActionButton, AmbientMode.AmbientController ambientController, byte[] bArr, byte[] bArr2) {
        super(floatingActionButton, ambientController, null, null);
    }

    /* JADX INFO: renamed from: o */
    private final Animator m16416o(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f40611B, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f40611B, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(f40599a);
        return animatorSet;
    }

    @Override // p000.min
    /* JADX INFO: renamed from: a */
    public final float mo16402a() {
        return this.f40611B.getElevation();
    }

    @Override // p000.min
    /* JADX INFO: renamed from: e */
    public final void mo16406e(Rect rect) {
        if (this.f40613D.m1645r()) {
            super.mo16406e(rect);
        } else if (m16415n()) {
            rect.set(0, 0, 0, 0);
        } else {
            int iM4838b = (this.f40628u - this.f40611B.m4838b()) / 2;
            rect.set(iM4838b, iM4838b, iM4838b, iM4838b);
        }
    }

    @Override // p000.min
    /* JADX INFO: renamed from: f */
    public final void mo16407f(float f, float f2, float f3) {
        if (this.f40611B.getStateListAnimator() == this.f40634E) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f40604f, m16416o(f, f3));
            stateListAnimator.addState(f40605g, m16416o(f, f2));
            stateListAnimator.addState(f40606h, m16416o(f, f2));
            stateListAnimator.addState(f40607i, m16416o(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f40611B, "elevation", f).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(this.f40611B, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f40599a);
            stateListAnimator.addState(f40608j, animatorSet);
            stateListAnimator.addState(f40609k, m16416o(0.0f, 0.0f));
            this.f40634E = stateListAnimator;
            this.f40611B.setStateListAnimator(this.f40634E);
        }
        if (mo16413l()) {
            m16411j();
        }
    }

    @Override // p000.min
    /* JADX INFO: renamed from: l */
    public final boolean mo16413l() {
        return this.f40613D.m1645r() || !m16415n();
    }
}
