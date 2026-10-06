package p000;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgq extends ahz {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ SwipeDismissBehavior f40450a;

    /* JADX INFO: renamed from: b */
    private int f40451b;

    /* JADX INFO: renamed from: c */
    private int f40452c = -1;

    public mgq(SwipeDismissBehavior swipeDismissBehavior) {
        this.f40450a = swipeDismissBehavior;
    }

    @Override // p000.ahz
    /* JADX INFO: renamed from: a */
    public final int mo708a(View view) {
        return view.getWidth();
    }

    @Override // p000.ahz
    /* JADX INFO: renamed from: b */
    public final void mo709b(View view, int i) {
        this.f40452c = i;
        this.f40451b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            this.f40450a.f8069b = true;
            parent.requestDisallowInterceptTouchEvent(true);
            this.f40450a.f8069b = false;
        }
    }

    @Override // p000.ahz
    /* JADX INFO: renamed from: c */
    public final void mo710c(int i) {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    @Override // p000.ahz
    /* JADX INFO: renamed from: d */
    public final void mo711d(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        this.f40452c = -1;
        int width = view.getWidth();
        if (f != 0.0f) {
            int iM442c = afc.m442c(view);
            int i3 = this.f40450a.f8070c;
            if (i3 != 2 && (i3 != 0 ? iM442c != 1 ? f >= 0.0f : f <= 0.0f : iM442c != 1 ? f <= 0.0f : f >= 0.0f)) {
                i = this.f40451b;
            } else if (f >= 0.0f) {
                left = view.getLeft();
                i2 = this.f40451b;
                if (left < i2) {
                    i = this.f40451b - width;
                } else {
                    i = i2 + width;
                }
            } else {
                i = this.f40451b - width;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f40451b) < Math.round(view.getWidth() * 0.5f)) {
                i = this.f40451b;
            } else if (f >= 0.0f) {
                left = view.getLeft();
                i2 = this.f40451b;
                if (left < i2) {
                    i = this.f40451b - width;
                } else {
                    i = i2 + width;
                }
            } else {
                i = this.f40451b - width;
            }
        }
        if (this.f40450a.f8068a.m748i(i, view.getTop())) {
            afb.m428i(view, new fvx(this.f40450a, view, 3));
        }
    }

    @Override // p000.ahz
    /* JADX INFO: renamed from: e */
    public final boolean mo712e(View view, int i) {
        int i2 = this.f40452c;
        return (i2 == -1 || i2 == i) && this.f40450a.mo4792u(view);
    }

    @Override // p000.ahz
    /* JADX INFO: renamed from: f */
    public final int mo713f(View view, int i) {
        int width;
        int width2;
        int iM442c = afc.m442c(view);
        int i2 = this.f40450a.f8070c;
        if (i2 == 0) {
            if (iM442c == 1) {
                width = this.f40451b - view.getWidth();
                width2 = this.f40451b;
            } else {
                width = this.f40451b;
                width2 = view.getWidth() + width;
            }
        } else if (i2 != 1) {
            width = this.f40451b - view.getWidth();
            width2 = view.getWidth() + this.f40451b;
        } else if (iM442c == 1) {
            width = this.f40451b;
            width2 = view.getWidth() + width;
        } else {
            width = this.f40451b - view.getWidth();
            width2 = this.f40451b;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // p000.ahz
    /* JADX INFO: renamed from: g */
    public final int mo714g(View view, int i) {
        return view.getTop();
    }

    @Override // p000.ahz
    /* JADX INFO: renamed from: i */
    public final void mo716i(View view, int i, int i2) {
        float width = view.getWidth() * this.f40450a.f8071d;
        float width2 = view.getWidth() * this.f40450a.f8072e;
        float fAbs = Math.abs(i - this.f40451b);
        if (fAbs <= width) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.m4791v(1.0f - ((fAbs - width) / (width2 - width))));
        }
    }
}
