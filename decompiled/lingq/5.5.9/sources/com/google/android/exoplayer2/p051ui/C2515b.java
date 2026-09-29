package com.google.android.exoplayer2.p051ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.RunnableC0191j;
import com.linguist.R;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p479xa.C10129a;
import p479xa.C10134c0;
import va.C9689c;
import va.C9691e;

/* JADX INFO: renamed from: com.google.android.exoplayer2.ui.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2515b extends View implements InterfaceC2518e {

    /* JADX INFO: renamed from: n0 */
    public static final /* synthetic */ int f13517n0 = 0;

    /* JADX INFO: renamed from: H */
    public final int f13518H;

    /* JADX INFO: renamed from: I */
    public final int f13519I;

    /* JADX INFO: renamed from: J */
    public final int f13520J;

    /* JADX INFO: renamed from: K */
    public final int f13521K;

    /* JADX INFO: renamed from: L */
    public final int f13522L;

    /* JADX INFO: renamed from: M */
    public final int f13523M;

    /* JADX INFO: renamed from: N */
    public final int f13524N;

    /* JADX INFO: renamed from: O */
    public final int f13525O;

    /* JADX INFO: renamed from: P */
    public final StringBuilder f13526P;

    /* JADX INFO: renamed from: Q */
    public final Formatter f13527Q;

    /* JADX INFO: renamed from: R */
    public final RunnableC0191j f13528R;

    /* JADX INFO: renamed from: S */
    public final CopyOnWriteArraySet<InterfaceC2518e.a> f13529S;

    /* JADX INFO: renamed from: T */
    public final Point f13530T;

    /* JADX INFO: renamed from: U */
    public final float f13531U;

    /* JADX INFO: renamed from: V */
    public int f13532V;

    /* JADX INFO: renamed from: W */
    public long f13533W;

    /* JADX INFO: renamed from: a */
    public final Rect f13534a;

    /* JADX INFO: renamed from: a0 */
    public int f13535a0;

    /* JADX INFO: renamed from: b */
    public final Rect f13536b;

    /* JADX INFO: renamed from: b0 */
    public Rect f13537b0;

    /* JADX INFO: renamed from: c */
    public final Rect f13538c;

    /* JADX INFO: renamed from: c0 */
    public final ValueAnimator f13539c0;

    /* JADX INFO: renamed from: d */
    public final Rect f13540d;

    /* JADX INFO: renamed from: d0 */
    public float f13541d0;

    /* JADX INFO: renamed from: e */
    public final Paint f13542e;

    /* JADX INFO: renamed from: e0 */
    public boolean f13543e0;

    /* JADX INFO: renamed from: f */
    public final Paint f13544f;

    /* JADX INFO: renamed from: f0 */
    public boolean f13545f0;

    /* JADX INFO: renamed from: g */
    public final Paint f13546g;

    /* JADX INFO: renamed from: g0 */
    public long f13547g0;

    /* JADX INFO: renamed from: h */
    public final Paint f13548h;

    /* JADX INFO: renamed from: h0 */
    public long f13549h0;

    /* JADX INFO: renamed from: i */
    public final Paint f13550i;

    /* JADX INFO: renamed from: i0 */
    public long f13551i0;

    /* JADX INFO: renamed from: j */
    public final Paint f13552j;

    /* JADX INFO: renamed from: j0 */
    public long f13553j0;

    /* JADX INFO: renamed from: k */
    public final Drawable f13554k;

    /* JADX INFO: renamed from: k0 */
    public int f13555k0;

    /* JADX INFO: renamed from: l */
    public final int f13556l;

    /* JADX INFO: renamed from: l0 */
    public long[] f13557l0;

    /* JADX INFO: renamed from: m0 */
    public boolean[] f13558m0;

    public C2515b(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.f13534a = new Rect();
        this.f13536b = new Rect();
        this.f13538c = new Rect();
        this.f13540d = new Rect();
        Paint paint = new Paint();
        this.f13542e = paint;
        Paint paint2 = new Paint();
        this.f13544f = paint2;
        Paint paint3 = new Paint();
        this.f13546g = paint3;
        Paint paint4 = new Paint();
        this.f13548h = paint4;
        Paint paint5 = new Paint();
        this.f13550i = paint5;
        Paint paint6 = new Paint();
        this.f13552j = paint6;
        paint6.setAntiAlias(true);
        this.f13529S = new CopyOnWriteArraySet<>();
        this.f13530T = new Point();
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f13531U = f3;
        this.f13525O = m7421c(-50, f3);
        int iM7421c = m7421c(4, f3);
        int iM7421c2 = m7421c(26, f3);
        int iM7421c3 = m7421c(4, f3);
        int iM7421c4 = m7421c(12, f3);
        int iM7421c5 = m7421c(0, f3);
        int iM7421c6 = m7421c(16, f3);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C9691e.f49615b, 0, R.style.ExoStyledControls_TimeBar);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.f13554k = drawable;
                if (drawable != null) {
                    int i10 = C10134c0.f51354a;
                    if (i10 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i10 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    iM7421c2 = Math.max(drawable.getMinimumHeight(), iM7421c2);
                }
                this.f13556l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iM7421c);
                this.f13518H = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iM7421c2);
                this.f13519I = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.f13520J = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iM7421c3);
                this.f13521K = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iM7421c4);
                this.f13522L = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iM7421c5);
                this.f13523M = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iM7421c6);
                int i11 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i12 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i13 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i14 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i15 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i16 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i11);
                paint6.setColor(i12);
                paint2.setColor(i13);
                paint3.setColor(i14);
                paint4.setColor(i15);
                paint5.setColor(i16);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f13556l = iM7421c;
            this.f13518H = iM7421c2;
            this.f13519I = 0;
            this.f13520J = iM7421c3;
            this.f13521K = iM7421c4;
            this.f13522L = iM7421c5;
            this.f13523M = iM7421c6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f13554k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f13526P = sb2;
        this.f13527Q = new Formatter(sb2, Locale.getDefault());
        this.f13528R = new RunnableC0191j(13, this);
        Drawable drawable2 = this.f13554k;
        if (drawable2 != null) {
            this.f13524N = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f13524N = (Math.max(this.f13522L, Math.max(this.f13521K, this.f13523M)) + 1) / 2;
        }
        this.f13541d0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f13539c0 = valueAnimator;
        valueAnimator.addUpdateListener(new C9689c(0, this));
        this.f13549h0 = -9223372036854775807L;
        this.f13533W = -9223372036854775807L;
        this.f13532V = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m7421c(int i10, float f3) {
        return (int) ((i10 * f3) + 0.5f);
    }

    private long getPositionIncrement() {
        long j10 = this.f13533W;
        if (j10 == -9223372036854775807L) {
            long j11 = this.f13549h0;
            if (j11 == -9223372036854775807L) {
                return 0L;
            }
            j10 = j11 / ((long) this.f13532V);
        }
        return j10;
    }

    private String getProgressText() {
        return C10134c0.m19058y(this.f13526P, this.f13527Q, this.f13551i0);
    }

    private long getScrubberPosition() {
        Rect rect = this.f13536b;
        if (rect.width() <= 0 || this.f13549h0 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f13540d.width()) * this.f13549h0) / ((long) rect.width());
    }

    @Override // com.google.android.exoplayer2.p051ui.InterfaceC2518e
    /* JADX INFO: renamed from: a */
    public final void mo7422a(C2517d.b bVar) {
        this.f13529S.add(bVar);
    }

    @Override // com.google.android.exoplayer2.p051ui.InterfaceC2518e
    /* JADX INFO: renamed from: b */
    public final void mo7423b(long[] jArr, boolean[] zArr, int i10) {
        C10129a.m18990b(i10 == 0 || !(jArr == null || zArr == null));
        this.f13555k0 = i10;
        this.f13557l0 = jArr;
        this.f13558m0 = zArr;
        m7427g();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7424d(long j10) {
        long j11 = this.f13549h0;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.f13545f0 ? this.f13547g0 : this.f13551i0;
        long jM19042i = C10134c0.m19042i(j12 + j10, 0L, j11);
        if (jM19042i == j12) {
            return false;
        }
        if (this.f13545f0) {
            m7428h(jM19042i);
        } else {
            m7425e(jM19042i);
        }
        m7427g();
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f13554k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7425e(long j10) {
        this.f13547g0 = j10;
        this.f13545f0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<InterfaceC2518e.a> it = this.f13529S.iterator();
        while (it.hasNext()) {
            it.next().mo7457y(j10);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7426f(boolean z10) {
        removeCallbacks(this.f13528R);
        this.f13545f0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<InterfaceC2518e.a> it = this.f13529S.iterator();
        while (it.hasNext()) {
            it.next().mo7454G(this.f13547g0, z10);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7427g() {
        Rect rect = this.f13538c;
        Rect rect2 = this.f13536b;
        rect.set(rect2);
        Rect rect3 = this.f13540d;
        rect3.set(rect2);
        long j10 = this.f13545f0 ? this.f13547g0 : this.f13551i0;
        if (this.f13549h0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f13553j0) / this.f13549h0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j10) / this.f13549h0)), rect2.right);
        } else {
            int i10 = rect2.left;
            rect.right = i10;
            rect3.right = i10;
        }
        invalidate(this.f13534a);
    }

    @Override // com.google.android.exoplayer2.p051ui.InterfaceC2518e
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f13536b.width() / this.f13531U);
        if (iWidth != 0) {
            long j10 = this.f13549h0;
            if (j10 != 0 && j10 != -9223372036854775807L) {
                return j10 / ((long) iWidth);
            }
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: h */
    public final void m7428h(long j10) {
        if (this.f13547g0 == j10) {
            return;
        }
        this.f13547g0 = j10;
        Iterator<InterfaceC2518e.a> it = this.f13529S.iterator();
        while (it.hasNext()) {
            it.next().mo7456x(j10);
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f13554k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        canvas.save();
        Rect rect = this.f13536b;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i11 = iHeight + iCenterY;
        long j10 = this.f13549h0;
        Paint paint = this.f13546g;
        Rect rect2 = this.f13540d;
        if (j10 <= 0) {
            canvas.drawRect(rect.left, iCenterY, rect.right, i11, paint);
        } else {
            Rect rect3 = this.f13538c;
            int i12 = rect3.left;
            int i13 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i13), rect2.right);
            int i14 = rect.right;
            if (iMax < i14) {
                canvas.drawRect(iMax, iCenterY, i14, i11, paint);
            }
            int iMax2 = Math.max(i12, rect2.right);
            if (i13 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i13, i11, this.f13544f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i11, this.f13542e);
            }
            if (this.f13555k0 != 0) {
                long[] jArr = this.f13557l0;
                jArr.getClass();
                boolean[] zArr = this.f13558m0;
                zArr.getClass();
                int i15 = this.f13520J;
                int i16 = i15 / 2;
                int i17 = 0;
                int i18 = 0;
                while (i18 < this.f13555k0) {
                    int iMin = Math.min(rect.width() - i15, Math.max(i17, ((int) ((((long) rect.width()) * C10134c0.m19042i(jArr[i18], 0L, this.f13549h0)) / this.f13549h0)) - i16)) + rect.left;
                    canvas.drawRect(iMin, iCenterY, iMin + i15, i11, zArr[i18] ? this.f13550i : this.f13548h);
                    i18++;
                    i17 = i17;
                    i15 = i15;
                }
            }
        }
        if (this.f13549h0 > 0) {
            int iM19041h = C10134c0.m19041h(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f13554k;
            if (drawable == null) {
                if (this.f13545f0 || isFocused()) {
                    i10 = this.f13523M;
                } else {
                    i10 = isEnabled() ? this.f13521K : this.f13522L;
                }
                canvas.drawCircle(iM19041h, iCenterY2, (int) ((i10 * this.f13541d0) / 2.0f), this.f13552j);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f13541d0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f13541d0)) / 2;
                drawable.setBounds(iM19041h - intrinsicWidth, iCenterY2 - intrinsicHeight, iM19041h + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f13545f0 && !z10) {
            m7426f(false);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f13549h0 <= 0) {
            return;
        }
        if (C10134c0.f51354a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i10 != 66) {
                switch (i10) {
                    case 21:
                        positionIncrement = -positionIncrement;
                    case 22:
                        if (m7424d(positionIncrement)) {
                            RunnableC0191j runnableC0191j = this.f13528R;
                            removeCallbacks(runnableC0191j);
                            postDelayed(runnableC0191j, 1000L);
                            return true;
                        }
                        break;
                }
            }
            if (this.f13545f0) {
                m7426f(false);
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        int i16 = this.f13543e0 ? 0 : this.f13524N;
        int i17 = this.f13519I;
        int i18 = this.f13556l;
        int i19 = this.f13518H;
        if (i17 == 1) {
            paddingBottom = (i15 - getPaddingBottom()) - i19;
            paddingBottom2 = ((i15 - getPaddingBottom()) - i18) - Math.max(i16 - (i18 / 2), 0);
        } else {
            paddingBottom = (i15 - i19) / 2;
            paddingBottom2 = (i15 - i18) / 2;
        }
        Rect rect2 = this.f13534a;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i19 + paddingBottom);
        this.f13536b.set(rect2.left + i16, paddingBottom2, rect2.right - i16, i18 + paddingBottom2);
        if (C10134c0.f51354a >= 29 && ((rect = this.f13537b0) == null || rect.width() != i14 || this.f13537b0.height() != i15)) {
            Rect rect3 = new Rect(0, 0, i14, i15);
            this.f13537b0 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        m7427g();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int i12 = this.f13518H;
        if (mode == 0) {
            size = i12;
        } else if (mode != 1073741824) {
            size = Math.min(i12, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        Drawable drawable = this.f13554k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f13554k;
        if (drawable != null) {
            if (C10134c0.f51354a >= 23 && drawable.setLayoutDirection(i10)) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0092  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (isEnabled()) {
            if (this.f13549h0 > 0) {
                Point point = this.f13530T;
                point.set((int) motionEvent.getX(), (int) motionEvent.getY());
                int i10 = point.x;
                int i11 = point.y;
                int action = motionEvent.getAction();
                Rect rect = this.f13540d;
                Rect rect2 = this.f13536b;
                if (action == 0) {
                    int i12 = i10;
                    if (this.f13534a.contains(i12, i11)) {
                        rect.right = C10134c0.m19041h(i12, rect2.left, rect2.right);
                        m7425e(getScrubberPosition());
                        m7427g();
                        invalidate();
                        return true;
                    }
                } else if (action == 1) {
                    if (this.f13545f0) {
                        if (motionEvent.getAction() == 3) {
                            z10 = true;
                        }
                        m7426f(z10);
                        return true;
                    }
                } else if (action != 2) {
                    if (action == 3) {
                        if (this.f13545f0) {
                            if (motionEvent.getAction() == 3) {
                                z10 = true;
                            }
                            m7426f(z10);
                            return true;
                        }
                    }
                } else if (this.f13545f0) {
                    if (i11 < this.f13525O) {
                        int i13 = this.f13535a0;
                        rect.right = C10134c0.m19041h(((i10 - i13) / 3) + i13, rect2.left, rect2.right);
                    } else {
                        this.f13535a0 = i10;
                        rect.right = C10134c0.m19041h(i10, rect2.left, rect2.right);
                    }
                    m7428h(getScrubberPosition());
                    m7427g();
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.f13549h0 <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (m7424d(-getPositionIncrement())) {
                m7426f(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (m7424d(getPositionIncrement())) {
                m7426f(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f13548h.setColor(i10);
        invalidate(this.f13534a);
    }

    public void setBufferedColor(int i10) {
        this.f13544f.setColor(i10);
        invalidate(this.f13534a);
    }

    @Override // com.google.android.exoplayer2.p051ui.InterfaceC2518e
    public void setBufferedPosition(long j10) {
        if (this.f13553j0 == j10) {
            return;
        }
        this.f13553j0 = j10;
        m7427g();
    }

    @Override // com.google.android.exoplayer2.p051ui.InterfaceC2518e
    public void setDuration(long j10) {
        if (this.f13549h0 == j10) {
            return;
        }
        this.f13549h0 = j10;
        if (this.f13545f0 && j10 == -9223372036854775807L) {
            m7426f(true);
        }
        m7427g();
    }

    @Override // android.view.View, com.google.android.exoplayer2.p051ui.InterfaceC2518e
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.f13545f0 && !z10) {
            m7426f(true);
        }
    }

    public void setKeyCountIncrement(int i10) {
        C10129a.m18990b(i10 > 0);
        this.f13532V = i10;
        this.f13533W = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        C10129a.m18990b(j10 > 0);
        this.f13532V = -1;
        this.f13533W = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f13550i.setColor(i10);
        invalidate(this.f13534a);
    }

    public void setPlayedColor(int i10) {
        this.f13542e.setColor(i10);
        invalidate(this.f13534a);
    }

    @Override // com.google.android.exoplayer2.p051ui.InterfaceC2518e
    public void setPosition(long j10) {
        if (this.f13551i0 == j10) {
            return;
        }
        this.f13551i0 = j10;
        setContentDescription(getProgressText());
        m7427g();
    }

    public void setScrubberColor(int i10) {
        this.f13552j.setColor(i10);
        invalidate(this.f13534a);
    }

    public void setUnplayedColor(int i10) {
        this.f13546g.setColor(i10);
        invalidate(this.f13534a);
    }
}
