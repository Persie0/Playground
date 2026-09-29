package p481xc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.C3035d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: renamed from: xc.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10168c extends C3035d {

    /* JADX INFO: renamed from: I */
    public StateListAnimator f51471I;

    public C10168c(FloatingActionButton floatingActionButton, FloatingActionButton.C3030b c3030b) {
        super(floatingActionButton, c3030b);
    }

    @Override // com.google.android.material.floatingactionbutton.C3035d
    /* JADX INFO: renamed from: e */
    public final float mo8781e() {
        return this.f15285q.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.C3035d
    /* JADX INFO: renamed from: f */
    public final void mo8782f(Rect rect) {
        if (FloatingActionButton.this.f15244j) {
            super.mo8782f(rect);
            return;
        }
        boolean z10 = this.f15270b;
        FloatingActionButton floatingActionButton = this.f15285q;
        if (!z10 || floatingActionButton.getSizeDimension() >= 0) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (0 - floatingActionButton.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C3035d
    /* JADX INFO: renamed from: g */
    public final void mo8783g() {
    }

    @Override // com.google.android.material.floatingactionbutton.C3035d
    /* JADX INFO: renamed from: h */
    public final void mo8784h() {
        m8790n();
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.C3035d
    /* JADX INFO: renamed from: i */
    public final void mo8785i(int[] iArr) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.material.floatingactionbutton.C3035d
    /* JADX INFO: renamed from: j */
    public final void mo8786j(float f3, float f10, float f11) {
        FloatingActionButton floatingActionButton = this.f15285q;
        if (floatingActionButton.getStateListAnimator() == this.f51471I) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C3035d.f15260C, m19186o(f3, f11));
            stateListAnimator.addState(C3035d.f15261D, m19186o(f3, f10));
            stateListAnimator.addState(C3035d.f15262E, m19186o(f3, f10));
            stateListAnimator.addState(C3035d.f15263F, m19186o(f3, f10));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f3).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C3035d.f15266x);
            stateListAnimator.addState(C3035d.f15264G, animatorSet);
            stateListAnimator.addState(C3035d.f15265H, m19186o(0.0f, 0.0f));
            this.f51471I = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (m19187p()) {
            m8790n();
            throw null;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C3035d
    /* JADX INFO: renamed from: l */
    public final void mo8788l() {
    }

    @Override // com.google.android.material.floatingactionbutton.C3035d
    /* JADX INFO: renamed from: m */
    public final void mo8789m() {
    }

    /* JADX INFO: renamed from: o */
    public final AnimatorSet m19186o(float f3, float f10) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.f15285q;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f3).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f10).setDuration(100L));
        animatorSet.setInterpolator(C3035d.f15266x);
        return animatorSet;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m19187p() {
        boolean z10 = true;
        if (!FloatingActionButton.this.f15244j) {
            z10 = !this.f15270b || this.f15285q.getSizeDimension() >= 0 ? false : true;
        }
        return z10;
    }
}
