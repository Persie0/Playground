package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.util.ArrayList;
import p000.AbstractC0853cn;
import p000.ba0;
import p000.d41;
import p000.r46;

/* JADX INFO: loaded from: classes2.dex */
public class ClockHandView extends View {

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ int f13341I = 0;

    /* JADX INFO: renamed from: H */
    public int f13342H;

    /* JADX INFO: renamed from: a */
    public final ValueAnimator f13343a;

    /* JADX INFO: renamed from: b */
    public boolean f13344b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f13345c;

    /* JADX INFO: renamed from: d */
    public final int f13346d;

    /* JADX INFO: renamed from: e */
    public final float f13347e;

    /* JADX INFO: renamed from: f */
    public final Paint f13348f;

    /* JADX INFO: renamed from: g */
    public final RectF f13349g;

    /* JADX INFO: renamed from: h */
    public final int f13350h;

    /* JADX INFO: renamed from: i */
    public float f13351i;

    /* JADX INFO: renamed from: j */
    public boolean f13352j;

    /* JADX INFO: renamed from: k */
    public double f13353k;

    /* JADX INFO: renamed from: l */
    public int f13354l;

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f13343a = valueAnimator;
        this.f13345c = new ArrayList();
        Paint paint = new Paint();
        this.f13348f = paint;
        this.f13349g = new RectF();
        this.f13342H = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClockHandView, i, R$style.Widget_MaterialComponents_TimePicker_Clock);
        r46.m20364G(context, R$attr.motionDurationLong2, 200);
        r46.m20365H(context, R$attr.motionEasingEmphasizedInterpolator, AbstractC0853cn.f10297b);
        this.f13354l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockHandView_materialCircleRadius, 0);
        this.f13346d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f13350h = resources.getDimensionPixelSize(R$dimen.material_clock_hand_stroke_width);
        this.f13347e = resources.getDimensionPixelSize(R$dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m6252a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ba0(this, 1));
        valueAnimator.addListener(new d41());
    }

    /* JADX INFO: renamed from: a */
    public final void m6252a(float f) {
        this.f13343a.cancel();
        m6253b(f);
    }

    /* JADX INFO: renamed from: b */
    public final void m6253b(float f) {
        float f2 = f % 360.0f;
        this.f13351i = f2;
        this.f13353k = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.f13342H;
        int iRound = this.f13354l;
        if (i == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f3 = width;
        float f4 = iRound;
        float fCos = (((float) Math.cos(this.f13353k)) * f4) + f3;
        float fSin = (f4 * ((float) Math.sin(this.f13353k))) + height;
        float f5 = this.f13346d;
        this.f13349g.set(fCos - f5, fSin - f5, fCos + f5, fSin + f5);
        for (ClockFaceView clockFaceView : this.f13345c) {
            if (Math.abs(clockFaceView.f13338e0 - f2) > 0.001f) {
                clockFaceView.f13338e0 = f2;
                clockFaceView.m6250o();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.f13342H;
        int iRound = this.f13354l;
        if (i == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f = width;
        float f2 = iRound;
        float fCos = (((float) Math.cos(this.f13353k)) * f2) + f;
        float f3 = height;
        float fSin = (f2 * ((float) Math.sin(this.f13353k))) + f3;
        Paint paint = this.f13348f;
        paint.setStrokeWidth(0.0f);
        int i2 = this.f13346d;
        canvas.drawCircle(fCos, fSin, i2, paint);
        double dSin = Math.sin(this.f13353k);
        double d = iRound - i2;
        paint.setStrokeWidth(this.f13350h);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.f13353k) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f3, this.f13347e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f13343a.isRunning()) {
            return;
        }
        m6252a(this.f13351i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.f13352j = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.f13352j;
            if (this.f13344b) {
                this.f13342H = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) Math.round(((float) this.f13354l) * 0.66f)) + TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.f13352j;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.f13351i != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            m6252a(f);
            z3 = true;
        }
        this.f13352j = z4 | z3;
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialClockStyle);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }
}
