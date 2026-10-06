package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfv {

    /* JADX INFO: renamed from: a */
    private final C1117xf f40392a = new C1117xf();

    /* JADX INFO: renamed from: b */
    private final C1117xf f40393b = new C1117xf();

    /* JADX INFO: renamed from: a */
    public static mfv m16343a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        mfv mfvVarM16344c = null;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                mfvVarM16344c = m16344c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            } else if (animatorLoadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(animatorLoadAnimator);
                mfvVarM16344c = m16344c(arrayList);
            }
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x".concat(String.valueOf(Integer.toHexString(resourceId))), e);
        }
        return mfvVarM16344c;
    }

    /* JADX INFO: renamed from: c */
    private static mfv m16344c(List list) {
        mfv mfvVar = new mfv();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(String.valueOf(animator))));
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            mfvVar.f40393b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = mfs.f40384b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = mfs.f40385c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = mfs.f40386d;
            }
            mfw mfwVar = new mfw(startDelay, duration, interpolator);
            mfwVar.f40394a = objectAnimator.getRepeatCount();
            mfwVar.f40395b = objectAnimator.getRepeatMode();
            mfvVar.f40392a.put(propertyName, mfwVar);
        }
        return mfvVar;
    }

    /* JADX INFO: renamed from: b */
    public final mfw m16345b(String str) {
        if (this.f40392a.get(str) != null) {
            return (mfw) this.f40392a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mfv) {
            return this.f40392a.equals(((mfv) obj).f40392a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40392a.hashCode();
    }

    public final String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f40392a + IuyLAqNmW.QVEfrmH;
    }
}
