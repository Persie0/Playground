package p000;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class po9 extends tad {

    /* JADX INFO: renamed from: a */
    public int f56596a;

    /* JADX INFO: renamed from: b */
    public int f56597b = -1;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SwipeDismissBehavior f56598c;

    public po9(SwipeDismissBehavior swipeDismissBehavior) {
        this.f56598c = swipeDismissBehavior;
    }

    @Override // p000.tad
    /* JADX INFO: renamed from: a */
    public final int mo13885a(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.f56598c.f12679d;
        if (i2 == 0) {
            width = this.f56596a;
            if (z) {
                width -= view.getWidth();
                width2 = this.f56596a;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.f56596a;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.f56596a + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.f56596a;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // p000.tad
    /* JADX INFO: renamed from: b */
    public final int mo13886b(View view, int i) {
        return view.getTop();
    }

    @Override // p000.tad
    /* JADX INFO: renamed from: c */
    public final int mo13887c(View view) {
        return view.getWidth();
    }

    @Override // p000.tad
    /* JADX INFO: renamed from: e */
    public final void mo19433e(View view, int i) {
        this.f56597b = i;
        this.f56596a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f56598c;
            swipeDismissBehavior.f12678c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f12678c = false;
        }
    }

    @Override // p000.tad
    /* JADX INFO: renamed from: f */
    public final void mo13889f(int i) {
    }

    @Override // p000.tad
    /* JADX INFO: renamed from: g */
    public final void mo13890g(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f56598c;
        float f = width * swipeDismissBehavior.f12680e;
        float width2 = view.getWidth() * swipeDismissBehavior.f12681f;
        float fAbs = Math.abs(i - this.f56596a);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    @Override // p000.tad
    /* JADX INFO: renamed from: h */
    public final void mo13891h(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        this.f56597b = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f56598c;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = swipeDismissBehavior.f12679d;
            if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.f56596a;
            } else {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.f56596a;
                    if (left < i2) {
                        i = this.f56596a - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.f56596a - width;
                }
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f56596a) >= Math.round(view.getWidth() * 0.5f)) {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.f56596a;
                    if (left < i2) {
                        i = this.f56596a - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.f56596a - width;
                }
                z = true;
            } else {
                i = this.f56596a;
            }
        }
        if (swipeDismissBehavior.f12676a.m14141n(i, view.getTop())) {
            view.postOnAnimation(new gvb(swipeDismissBehavior, view, z));
        }
    }

    @Override // p000.tad
    /* JADX INFO: renamed from: i */
    public final boolean mo13892i(View view, int i) {
        int i2 = this.f56597b;
        return (i2 == -1 || i2 == i) && this.f56598c.mo6019w(view);
    }
}
