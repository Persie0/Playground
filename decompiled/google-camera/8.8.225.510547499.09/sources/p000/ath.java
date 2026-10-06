package p000;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ath {
    /* JADX INFO: renamed from: a */
    static void m1981a(Object obj) {
        ((AnimatedVectorDrawable) obj).clearAnimationCallbacks();
    }

    /* JADX INFO: renamed from: b */
    public static void m1982b(Object obj, Object obj2) {
        ((AnimatedVectorDrawable) obj).registerAnimationCallback((Animatable2.AnimationCallback) obj2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1983c(Object obj, Object obj2) {
        return ((AnimatedVectorDrawable) obj).unregisterAnimationCallback((Animatable2.AnimationCallback) obj2);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo1984d(int i) {
        throw null;
    }
}
