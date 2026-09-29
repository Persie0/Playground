package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class s36 {

    /* JADX INFO: renamed from: a */
    public final l79 f60237a = new l79(0);

    /* JADX INFO: renamed from: b */
    public final l79 f60238b = new l79(0);

    /* JADX INFO: renamed from: a */
    public static s36 m21047a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m21048b(context, resourceId);
    }

    /* JADX INFO: renamed from: b */
    public static s36 m21048b(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m21049c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m21049c(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static s36 m21049c(ArrayList arrayList) {
        s36 s36Var = new s36();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                v63.m23142t(animator, "Animator must be an ObjectAnimator: ");
                return null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            s36Var.m21053g(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            t36 t36Var = new t36();
            t36Var.f61798d = 0;
            t36Var.f61799e = 1;
            t36Var.f61795a = startDelay;
            t36Var.f61796b = duration;
            t36Var.f61797c = interpolator;
            t36Var.f61798d = objectAnimator.getRepeatCount();
            t36Var.f61799e = objectAnimator.getRepeatMode();
            s36Var.f60237a.put(propertyName, t36Var);
        }
        return s36Var;
    }

    /* JADX INFO: renamed from: d */
    public final ObjectAnimator m21050d(String str, Object obj, Property property) {
        t36 t36Var;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, m21051e(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        l79 l79Var = this.f60237a;
        if (l79Var.get(str) != null) {
            t36Var = (t36) l79Var.get(str);
        } else {
            ij6.m13959q();
            t36Var = null;
        }
        objectAnimatorOfPropertyValuesHolder.setStartDelay(t36Var.f61795a);
        objectAnimatorOfPropertyValuesHolder.setDuration(t36Var.f61796b);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(t36Var.m21833a());
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(t36Var.f61798d);
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(t36Var.f61799e);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: e */
    public final PropertyValuesHolder[] m21051e(String str) {
        if (!m21052f(str)) {
            ij6.m13959q();
            return null;
        }
        PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.f60238b.get(str);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s36) {
            return this.f60237a.equals(((s36) obj).f60237a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m21052f(String str) {
        return this.f60238b.get(str) != null;
    }

    /* JADX INFO: renamed from: g */
    public final void m21053g(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f60238b.put(str, propertyValuesHolderArr);
    }

    public final int hashCode() {
        return this.f60237a.hashCode();
    }

    public final String toString() {
        return "\n" + s36.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f60237a + "}\n";
    }
}
