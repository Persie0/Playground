package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w9a {
    /* JADX INFO: renamed from: a */
    public static long m23818a(Animator animator) {
        return animator.getTotalDuration();
    }

    /* JADX INFO: renamed from: b */
    public static void m23819b(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }
}
