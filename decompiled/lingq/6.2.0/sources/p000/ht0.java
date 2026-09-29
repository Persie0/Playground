package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import androidx.transition.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class ht0 extends AnimatorListenerAdapter implements caa {

    /* JADX INFO: renamed from: a */
    public final View f42898a;

    /* JADX INFO: renamed from: b */
    public final Rect f42899b;

    /* JADX INFO: renamed from: c */
    public final boolean f42900c;

    /* JADX INFO: renamed from: d */
    public final Rect f42901d;

    /* JADX INFO: renamed from: e */
    public final boolean f42902e;

    /* JADX INFO: renamed from: f */
    public final int f42903f;

    /* JADX INFO: renamed from: g */
    public final int f42904g;

    /* JADX INFO: renamed from: h */
    public final int f42905h;

    /* JADX INFO: renamed from: i */
    public final int f42906i;

    /* JADX INFO: renamed from: j */
    public final int f42907j;

    /* JADX INFO: renamed from: k */
    public final int f42908k;

    /* JADX INFO: renamed from: l */
    public final int f42909l;

    /* JADX INFO: renamed from: m */
    public final int f42910m;

    /* JADX INFO: renamed from: n */
    public boolean f42911n;

    public ht0(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f42898a = view;
        this.f42899b = rect;
        this.f42900c = z;
        this.f42901d = rect2;
        this.f42902e = z2;
        this.f42903f = i;
        this.f42904g = i2;
        this.f42905h = i3;
        this.f42906i = i4;
        this.f42907j = i5;
        this.f42908k = i6;
        this.f42909l = i7;
        this.f42910m = i8;
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: a */
    public final void mo4474a(daa daaVar) {
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: b */
    public final void mo4475b() {
        View view = this.f42898a;
        view.setTag(R$id.transition_clip, view.getClipBounds());
        view.setClipBounds(this.f42902e ? null : this.f42901d);
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: c */
    public final void mo4476c(daa daaVar) {
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: f */
    public final void mo4479f() {
        int i = R$id.transition_clip;
        View view = this.f42898a;
        Rect rect = (Rect) view.getTag(i);
        view.setTag(R$id.transition_clip, null);
        view.setClipBounds(rect);
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: g */
    public final void mo4480g(daa daaVar) {
        this.f42911n = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.f42911n) {
            return;
        }
        Rect rect = null;
        if (z) {
            if (!this.f42900c) {
                rect = this.f42899b;
            }
        } else if (!this.f42902e) {
            rect = this.f42901d;
        }
        View view = this.f42898a;
        view.setClipBounds(rect);
        if (z) {
            r90 r90Var = awa.f7627a;
            view.setLeftTopRightBottom(this.f42903f, this.f42904g, this.f42905h, this.f42906i);
        } else {
            r90 r90Var2 = awa.f7627a;
            view.setLeftTopRightBottom(this.f42907j, this.f42908k, this.f42909l, this.f42910m);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        int i = this.f42905h;
        int i2 = this.f42903f;
        int i3 = this.f42909l;
        int i4 = this.f42907j;
        int iMax = Math.max(i - i2, i3 - i4);
        int i5 = this.f42906i;
        int i6 = this.f42904g;
        int i7 = this.f42910m;
        int i8 = this.f42908k;
        int iMax2 = Math.max(i5 - i6, i7 - i8);
        if (z) {
            i2 = i4;
        }
        if (z) {
            i6 = i8;
        }
        r90 r90Var = awa.f7627a;
        View view = this.f42898a;
        view.setLeftTopRightBottom(i2, i6, iMax + i2, iMax2 + i6);
        view.setClipBounds(z ? this.f42901d : this.f42899b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        onAnimationStart(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }
}
