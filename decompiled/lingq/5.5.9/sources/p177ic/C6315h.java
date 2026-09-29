package p177ic;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: ic.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6315h {

    /* JADX INFO: renamed from: a */
    public final long f36537a;

    /* JADX INFO: renamed from: b */
    public final long f36538b;

    /* JADX INFO: renamed from: c */
    public final TimeInterpolator f36539c;

    /* JADX INFO: renamed from: d */
    public int f36540d;

    /* JADX INFO: renamed from: e */
    public int f36541e;

    public C6315h(long j10) {
        this.f36537a = 0L;
        this.f36538b = 300L;
        this.f36539c = null;
        this.f36540d = 0;
        this.f36541e = 1;
        this.f36537a = j10;
        this.f36538b = 150L;
    }

    public C6315h(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f36537a = 0L;
        this.f36538b = 300L;
        this.f36539c = null;
        this.f36540d = 0;
        this.f36541e = 1;
        this.f36537a = j10;
        this.f36538b = j11;
        this.f36539c = timeInterpolator;
    }

    /* JADX INFO: renamed from: a */
    public final void m12942a(Animator animator) {
        animator.setStartDelay(this.f36537a);
        animator.setDuration(this.f36538b);
        animator.setInterpolator(m12943b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f36540d);
            valueAnimator.setRepeatMode(this.f36541e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final TimeInterpolator m12943b() {
        TimeInterpolator timeInterpolator = this.f36539c;
        return timeInterpolator != null ? timeInterpolator : C6308a.f36524b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6315h)) {
            return false;
        }
        C6315h c6315h = (C6315h) obj;
        if (this.f36537a == c6315h.f36537a && this.f36538b == c6315h.f36538b && this.f36540d == c6315h.f36540d && this.f36541e == c6315h.f36541e) {
            return m12943b().getClass().equals(c6315h.m12943b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f36537a;
        long j11 = this.f36538b;
        return ((((m12943b().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31)) * 31) + this.f36540d) * 31) + this.f36541e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(C6315h.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f36537a);
        sb2.append(" duration: ");
        sb2.append(this.f36538b);
        sb2.append(" interpolator: ");
        sb2.append(m12943b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f36540d);
        sb2.append(" repeatMode: ");
        return C0166e.m768o(sb2, this.f36541e, "}\n");
    }
}
