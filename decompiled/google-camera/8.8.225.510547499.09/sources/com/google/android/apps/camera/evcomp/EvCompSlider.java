package com.google.android.apps.camera.evcomp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.dou;
import p000.dov;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class EvCompSlider extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final AccessibilityManager f6636a;

    /* JADX INFO: renamed from: b */
    private final Paint f6637b;

    /* JADX INFO: renamed from: c */
    private final Paint f6638c;

    /* JADX INFO: renamed from: d */
    private final int f6639d;

    /* JADX INFO: renamed from: e */
    private final int f6640e;

    /* JADX INFO: renamed from: f */
    private int f6641f;

    public EvCompSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        this.f6639d = getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_width);
        this.f6640e = getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_touch_area_width);
        Paint paint = new Paint();
        this.f6637b = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f6638c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_stroke_width));
        paint2.setAntiAlias(true);
        this.f6636a = (AccessibilityManager) context.getSystemService("accessibility");
    }

    /* JADX INFO: renamed from: a */
    public final void m4099a(int i, int i2, int i3, int i4) {
        this.f6641f = i;
        this.f6637b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i, i2, i3, Shader.TileMode.MIRROR));
        this.f6638c.setColor(i4);
        setOnHoverListener(new dou(this, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f6636a.isTouchExplorationEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof dov) {
                return childAt.dispatchTouchEvent(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect(getMeasuredWidth() - (this.f6640e / 2), 0.0f, (getMeasuredWidth() - (this.f6640e / 2)) + this.f6639d, this.f6641f, getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_radius), getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_radius), this.f6637b);
        canvas.drawRoundRect(getMeasuredWidth() - (this.f6640e / 2), 0.0f, (getMeasuredWidth() - (this.f6640e / 2)) + this.f6639d, this.f6641f, getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_radius), getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_radius), this.f6638c);
    }
}
