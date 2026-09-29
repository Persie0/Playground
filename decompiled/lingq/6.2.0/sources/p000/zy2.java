package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.R$id;

/* JADX INFO: loaded from: classes.dex */
public final class zy2 extends hwa {
    public zy2(int i) {
        m13545b0(i);
    }

    /* JADX INFO: renamed from: d0 */
    public static float m25853d0(waa waaVar, float f) {
        Float f2;
        return (waaVar == null || (f2 = (Float) waaVar.f66570a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: B */
    public final boolean mo3530B() {
        return true;
    }

    @Override // p000.hwa
    /* JADX INFO: renamed from: Y */
    public final Animator mo3531Y(ViewGroup viewGroup, View view, waa waaVar, waa waaVar2) {
        r90 r90Var = awa.f7627a;
        return m25854c0(view, m25853d0(waaVar, 0.0f), 1.0f);
    }

    @Override // p000.hwa
    /* JADX INFO: renamed from: a0 */
    public final Animator mo3532a0(ViewGroup viewGroup, View view, waa waaVar, waa waaVar2) {
        r90 r90Var = awa.f7627a;
        ObjectAnimator objectAnimatorM25854c0 = m25854c0(view, m25853d0(waaVar, 1.0f), 0.0f);
        if (objectAnimatorM25854c0 == null) {
            awa.m3102c(view, m25853d0(waaVar2, 1.0f));
        }
        return objectAnimatorM25854c0;
    }

    /* JADX INFO: renamed from: c0 */
    public final ObjectAnimator m25854c0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        awa.m3102c(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, awa.f7627a, f2);
        yy2 yy2Var = new yy2(view);
        objectAnimatorOfFloat.addListener(yy2Var);
        m10218w().m10202a(yy2Var);
        return objectAnimatorOfFloat;
    }

    @Override // p000.hwa, p000.daa
    /* JADX INFO: renamed from: j */
    public final void mo3043j(waa waaVar) {
        hwa.m13543W(waaVar);
        View view = waaVar.f66571b;
        Float fValueOf = (Float) view.getTag(R$id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(awa.m3100a(view)) : Float.valueOf(0.0f);
        }
        waaVar.f66570a.put("android:fade:transitionAlpha", fValueOf);
    }
}
