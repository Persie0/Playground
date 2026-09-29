package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.linguist.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p153hc.C6031a;
import p177ic.C6308a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p507yc.C10347n;
import p531zc.C10477a;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: H */
    public int f15836H;

    /* JADX INFO: renamed from: a */
    public final ValueAnimator f15837a;

    /* JADX INFO: renamed from: b */
    public boolean f15838b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f15839c;

    /* JADX INFO: renamed from: d */
    public final int f15840d;

    /* JADX INFO: renamed from: e */
    public final float f15841e;

    /* JADX INFO: renamed from: f */
    public final Paint f15842f;

    /* JADX INFO: renamed from: g */
    public final RectF f15843g;

    /* JADX INFO: renamed from: h */
    public final int f15844h;

    /* JADX INFO: renamed from: i */
    public float f15845i;

    /* JADX INFO: renamed from: j */
    public boolean f15846j;

    /* JADX INFO: renamed from: k */
    public double f15847k;

    /* JADX INFO: renamed from: l */
    public int f15848l;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockHandView$a */
    public interface InterfaceC3095a {
        /* JADX INFO: renamed from: b */
        void mo8927b(float f3);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f15837a = new ValueAnimator();
        this.f15839c = new ArrayList();
        Paint paint = new Paint();
        this.f15842f = paint;
        this.f15843g = new RectF();
        this.f15836H = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6031a.f35661k, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        C10477a.m19428c(R.attr.motionDurationLong2, context, 200);
        C10477a.m19429d(context, R.attr.motionEasingEmphasizedInterpolator, C6308a.f36524b);
        this.f15848l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f15840d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f15844h = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f15841e = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m8931b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18682s(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final int m8930a(int i10) {
        return i10 == 2 ? Math.round(this.f15848l * 0.66f) : this.f15848l;
    }

    /* JADX INFO: renamed from: b */
    public final void m8931b(float f3) {
        ValueAnimator valueAnimator = this.f15837a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        m8932c(f3, false);
    }

    /* JADX INFO: renamed from: c */
    public final void m8932c(float f3, boolean z10) {
        float f10 = f3 % 360.0f;
        this.f15845i = f10;
        this.f15847k = Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM8930a = m8930a(this.f15836H);
        float fCos = (((float) Math.cos(this.f15847k)) * fM8930a) + width;
        float fSin = (fM8930a * ((float) Math.sin(this.f15847k))) + height;
        float f11 = this.f15840d;
        this.f15843g.set(fCos - f11, fSin - f11, fCos + f11, fSin + f11);
        Iterator it = this.f15839c.iterator();
        while (it.hasNext()) {
            ((InterfaceC3095a) it.next()).mo8927b(f10);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iM8930a = m8930a(this.f15836H);
        float f3 = width;
        float f10 = iM8930a;
        float fCos = (((float) Math.cos(this.f15847k)) * f10) + f3;
        float f11 = height;
        float fSin = (f10 * ((float) Math.sin(this.f15847k))) + f11;
        Paint paint = this.f15842f;
        paint.setStrokeWidth(0.0f);
        int i10 = this.f15840d;
        canvas.drawCircle(fCos, fSin, i10, paint);
        double dSin = Math.sin(this.f15847k);
        double d10 = iM8930a - i10;
        paint.setStrokeWidth(this.f15844h);
        canvas.drawLine(f3, f11, width + ((int) (Math.cos(this.f15847k) * d10)), height + ((int) (d10 * dSin)), paint);
        canvas.drawCircle(f3, f11, this.f15841e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f15837a.isRunning()) {
            m8931b(this.f15845i);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked == 0) {
            this.f15846j = false;
            z10 = true;
            z11 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z11 = this.f15846j;
            if (this.f15838b) {
                this.f15836H = ((float) Math.hypot((double) (x10 - ((float) (getWidth() / 2))), (double) (y10 - ((float) (getHeight() / 2))))) <= ((float) m8930a(2)) + C10347n.m19362b(12, getContext()) ? 2 : 1;
            }
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
        }
        boolean z13 = this.f15846j;
        int degrees = ((int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x10 - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f3 = degrees;
        boolean z14 = this.f15845i != f3;
        if (z10 && z14) {
            z12 = true;
        } else {
            if (!z14) {
                if (z11) {
                }
            }
            m8931b(f3);
            z12 = true;
        }
        this.f15846j = z13 | z12;
        return true;
    }
}
