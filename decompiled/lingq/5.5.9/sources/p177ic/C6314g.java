package p177ic;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import p326q.C8452h;

/* JADX INFO: renamed from: ic.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6314g {

    /* JADX INFO: renamed from: a */
    public final C8452h<String, C6315h> f36535a = new C8452h<>();

    /* JADX INFO: renamed from: b */
    public final C8452h<String, PropertyValuesHolder[]> f36536b = new C8452h<>();

    /* JADX INFO: renamed from: a */
    public static C6314g m12939a(int i10, Context context) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m12940b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m12940b(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static C6314g m12940b(ArrayList arrayList) {
        C6314g c6314g = new C6314g();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c6314g.f36536b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = C6308a.f36524b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = C6308a.f36525c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = C6308a.f36526d;
            }
            C6315h c6315h = new C6315h(startDelay, duration, interpolator);
            c6315h.f36540d = objectAnimator.getRepeatCount();
            c6315h.f36541e = objectAnimator.getRepeatMode();
            c6314g.f36535a.put(propertyName, c6315h);
        }
        return c6314g;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final C6315h m12941c(String str) {
        C8452h<String, C6315h> c8452h = this.f36535a;
        if (c8452h.getOrDefault(str, null) != null) {
            return c8452h.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6314g) {
            return this.f36535a.equals(((C6314g) obj).f36535a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36535a.hashCode();
    }

    public final String toString() {
        return "\n" + C6314g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f36535a + "}\n";
    }
}
