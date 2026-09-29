package com.google.android.exoplayer2.p051ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import va.C9691e;

/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f13477d = 0;

    /* JADX INFO: renamed from: a */
    public final RunnableC2507b f13478a;

    /* JADX INFO: renamed from: b */
    public float f13479b;

    /* JADX INFO: renamed from: c */
    public int f13480c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$a */
    public interface InterfaceC2506a {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b */
    public final class RunnableC2507b implements Runnable {

        /* JADX INFO: renamed from: a */
        public boolean f13481a;

        public RunnableC2507b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f13481a = false;
            int i10 = AspectRatioFrameLayout.f13477d;
            AspectRatioFrameLayout.this.getClass();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13480c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C9691e.f49614a, 0, 0);
            try {
                this.f13480c = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f13478a = new RunnableC2507b();
    }

    public int getResizeMode() {
        return this.f13480c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f3;
        float f10;
        super.onMeasure(i10, i11);
        if (this.f13479b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f11 = measuredWidth;
        float f12 = measuredHeight;
        float f13 = (this.f13479b / (f11 / f12)) - 1.0f;
        float fAbs = Math.abs(f13);
        RunnableC2507b runnableC2507b = this.f13478a;
        if (fAbs <= 0.01f) {
            if (!runnableC2507b.f13481a) {
                runnableC2507b.f13481a = true;
                AspectRatioFrameLayout.this.post(runnableC2507b);
            }
            return;
        }
        int i12 = this.f13480c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f3 = this.f13479b;
                } else if (i12 == 4) {
                    if (f13 > 0.0f) {
                        f3 = this.f13479b;
                    } else {
                        f10 = this.f13479b;
                    }
                }
                measuredWidth = (int) (f12 * f3);
            } else {
                f10 = this.f13479b;
            }
            measuredHeight = (int) (f11 / f10);
        } else if (f13 > 0.0f) {
            f10 = this.f13479b;
            measuredHeight = (int) (f11 / f10);
        } else {
            f3 = this.f13479b;
            measuredWidth = (int) (f12 * f3);
        }
        if (!runnableC2507b.f13481a) {
            runnableC2507b.f13481a = true;
            AspectRatioFrameLayout.this.post(runnableC2507b);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f3) {
        if (this.f13479b != f3) {
            this.f13479b = f3;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC2506a interfaceC2506a) {
    }

    public void setResizeMode(int i10) {
        if (this.f13480c != i10) {
            this.f13480c = i10;
            requestLayout();
        }
    }
}
