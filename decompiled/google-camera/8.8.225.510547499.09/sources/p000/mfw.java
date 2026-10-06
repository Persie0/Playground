package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfw {

    /* JADX INFO: renamed from: a */
    public int f40394a = 0;

    /* JADX INFO: renamed from: b */
    public int f40395b = 1;

    /* JADX INFO: renamed from: c */
    private final long f40396c;

    /* JADX INFO: renamed from: d */
    private final long f40397d;

    /* JADX INFO: renamed from: e */
    private final TimeInterpolator f40398e;

    public mfw(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f40396c = j;
        this.f40397d = j2;
        this.f40398e = timeInterpolator;
    }

    /* JADX INFO: renamed from: a */
    public final TimeInterpolator m16346a() {
        TimeInterpolator timeInterpolator = this.f40398e;
        return timeInterpolator != null ? timeInterpolator : mfs.f40384b;
    }

    /* JADX INFO: renamed from: b */
    public final void m16347b(Animator animator) {
        animator.setStartDelay(this.f40396c);
        animator.setDuration(this.f40397d);
        animator.setInterpolator(m16346a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f40394a);
            valueAnimator.setRepeatMode(this.f40395b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfw)) {
            return false;
        }
        mfw mfwVar = (mfw) obj;
        if (this.f40396c == mfwVar.f40396c && this.f40397d == mfwVar.f40397d && this.f40394a == mfwVar.f40394a && this.f40395b == mfwVar.f40395b) {
            return m16346a().getClass().equals(mfwVar.m16346a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f40396c;
        long j2 = this.f40397d;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + m16346a().getClass().hashCode()) * 31) + this.f40394a) * 31) + this.f40395b;
    }

    public final String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f40396c + " duration: " + this.f40397d + " interpolator: " + m16346a().getClass() + " repeatCount: " + this.f40394a + " repeatMode: " + this.f40395b + "}\n";
    }
}
