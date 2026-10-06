package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Path;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ari {
    /* JADX INFO: renamed from: a */
    static void m1889a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* JADX INFO: renamed from: b */
    static void m1890b(Animator animator) {
        animator.pause();
    }

    /* JADX INFO: renamed from: c */
    static void m1891c(Animator animator) {
        animator.resume();
    }

    /* JADX INFO: renamed from: d */
    public static Path m1892d(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }
}
