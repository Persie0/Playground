package com.google.android.material.progressindicator;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.R$attr;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.progressindicator.AbstractC1068a;
import java.util.ArrayList;
import java.util.Arrays;
import p000.C3153jn;
import p000.C3386nv;
import p000.dm2;
import p000.dy9;
import p000.mc2;
import p000.o34;
import p000.omd;
import p000.qs5;
import p000.u90;
import p000.un2;
import p000.v90;
import p000.w90;
import p000.x90;
import p000.yl2;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1068a extends ProgressBar {

    /* JADX INFO: renamed from: K */
    public static final int f13066K = R$style.Widget_MaterialComponents_ProgressIndicator;

    /* JADX INFO: renamed from: H */
    public final v90 f13067H;

    /* JADX INFO: renamed from: I */
    public final w90 f13068I;

    /* JADX INFO: renamed from: J */
    public final w90 f13069J;

    /* JADX INFO: renamed from: a */
    public final x90 f13070a;

    /* JADX INFO: renamed from: b */
    public int f13071b;

    /* JADX INFO: renamed from: c */
    public final boolean f13072c;

    /* JADX INFO: renamed from: d */
    public final int f13073d;

    /* JADX INFO: renamed from: e */
    public final int f13074e;

    /* JADX INFO: renamed from: f */
    public long f13075f;

    /* JADX INFO: renamed from: g */
    public C3153jn f13076g;

    /* JADX INFO: renamed from: h */
    public boolean f13077h;

    /* JADX INFO: renamed from: i */
    public int f13078i;

    /* JADX INFO: renamed from: j */
    public boolean f13079j;

    /* JADX INFO: renamed from: k */
    public final u90 f13080k;

    /* JADX INFO: renamed from: l */
    public final v90 f13081l;

    /* JADX WARN: Type inference failed for: r0v3, types: [u90] */
    public AbstractC1068a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(qs5.m20141b(context, attributeSet, i, f13066K), attributeSet, i);
        this.f13075f = -1L;
        this.f13077h = false;
        this.f13078i = 4;
        this.f13080k = new un2() { // from class: u90
            @Override // p000.un2
            /* JADX INFO: renamed from: a */
            public final void mo22582a(float f) {
                AbstractC1068a abstractC1068a = this.f63608a;
                if (abstractC1068a.getProgressDrawable() == null || abstractC1068a.getProgressDrawable().getLevel() != 10000) {
                    return;
                }
                abstractC1068a.m6161b();
            }
        };
        this.f13081l = new v90(this, 0);
        this.f13067H = new v90(this, 1);
        this.f13068I = new w90(this, 0);
        this.f13069J = new w90(this, 1);
        Context context2 = getContext();
        this.f13070a = mo6159a(context2, attributeSet);
        int[] iArr = R$styleable.BaseProgressIndicator;
        dy9.m10748a(context2, attributeSet, i, i2);
        dy9.m10749b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.f13073d = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseProgressIndicator_showDelay, -1);
        this.f13074e = Math.min(typedArrayObtainStyledAttributes.getInt(R$styleable.BaseProgressIndicator_minHideDelay, -1), DescriptorProtos.Edition.EDITION_2023_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        this.f13076g = new C3153jn();
        this.f13072c = true;
    }

    private dm2 getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f53766I;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f51058I;
    }

    /* JADX INFO: renamed from: a */
    public abstract x90 mo6159a(Context context, AttributeSet attributeSet);

    /* JADX INFO: renamed from: b */
    public final void m6161b() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f13081l);
            return;
        }
        v90 v90Var = this.f13067H;
        removeCallbacks(v90Var);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f13075f;
        long j = this.f13074e;
        if (jUptimeMillis >= j) {
            v90Var.run();
        } else {
            postDelayed(v90Var, j - jUptimeMillis);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6162c() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().f53767J.mo280i(this.f13068I);
    }

    /* JADX INFO: renamed from: d */
    public void mo6160d(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.f13071b = i;
            this.f13077h = true;
            if (getIndeterminateDrawable().isVisible()) {
                C3153jn c3153jn = this.f13076g;
                ContentResolver contentResolver = getContext().getContentResolver();
                c3153jn.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f53767J.mo281j();
                    return;
                }
            }
            this.f13068I.mo23406a(getIndeterminateDrawable());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6163e() {
        int i = this.f13073d;
        v90 v90Var = this.f13081l;
        if (i <= 0) {
            v90Var.run();
        } else {
            removeCallbacks(v90Var);
            postDelayed(v90Var, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6164f() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f13070a.f67951h;
    }

    @Override // android.widget.ProgressBar
    public o34 getIndeterminateDrawable() {
        return (o34) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.f13070a.f67948e;
    }

    public int getIndicatorTrackGapSize() {
        return this.f13070a.f67952i;
    }

    @Override // android.widget.ProgressBar
    public mc2 getProgressDrawable() {
        return (mc2) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.f13070a.f67950g;
    }

    public int getTrackColor() {
        return this.f13070a.f67949f;
    }

    public int getTrackCornerRadius() {
        return this.f13070a.f67945b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.f13070a.f67946c;
    }

    public int getTrackThickness() {
        return this.f13070a.f67944a;
    }

    public int getWaveAmplitude() {
        return this.f13070a.f67955l;
    }

    public int getWaveSpeed() {
        return this.f13070a.f67956m;
    }

    public int getWavelengthDeterminate() {
        return this.f13070a.f67953j;
    }

    public int getWavelengthIndeterminate() {
        return this.f13070a.f67954k;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m6162c();
        mc2 progressDrawable = getProgressDrawable();
        w90 w90Var = this.f13069J;
        if (progressDrawable != null) {
            mc2 progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f69979g == null) {
                progressDrawable2.f69979g = new ArrayList();
            }
            if (!progressDrawable2.f69979g.contains(w90Var)) {
                progressDrawable2.f69979g.add(w90Var);
            }
        }
        if (getIndeterminateDrawable() != null) {
            o34 indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f69979g == null) {
                indeterminateDrawable.f69979g = new ArrayList();
            }
            if (!indeterminateDrawable.f69979g.contains(w90Var)) {
                indeterminateDrawable.f69979g.add(w90Var);
            }
        }
        if (m6164f()) {
            if (this.f13074e > 0) {
                this.f13075f = SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f13067H);
        removeCallbacks(this.f13081l);
        ((yl2) getCurrentDrawable()).m25184d(false, false, false);
        o34 indeterminateDrawable = getIndeterminateDrawable();
        w90 w90Var = this.f13069J;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().m25185f(w90Var);
            getIndeterminateDrawable().f53767J.mo283l();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m25185f(w90Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().mo10471g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            dm2 currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.mo10470f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.mo10470f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.mo10469e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.mo10469e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.f13072c) {
            ((yl2) getCurrentDrawable()).m25184d(m6164f(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f13072c) {
            ((yl2) getCurrentDrawable()).m25184d(m6164f(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(C3153jn c3153jn) {
        this.f13076g = c3153jn;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f69975c = c3153jn;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f69975c = c3153jn;
        }
    }

    public void setHideAfterMaxProgress(boolean z) {
        if (getProgressDrawable() == null) {
            return;
        }
        u90 u90Var = this.f13080k;
        if (z) {
            ArrayList arrayList = getProgressDrawable().f51059J.f69793k;
            if (arrayList.contains(u90Var)) {
                return;
            }
            arrayList.add(u90Var);
            return;
        }
        ArrayList arrayList2 = getProgressDrawable().f51059J.f69793k;
        int iIndexOf = arrayList2.indexOf(u90Var);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f13070a.f67951h = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            yl2 yl2Var = (yl2) getCurrentDrawable();
            if (yl2Var != null) {
                yl2Var.m25184d(false, false, false);
            }
            super.setIndeterminate(z);
            yl2 yl2Var2 = (yl2) getCurrentDrawable();
            if (yl2Var2 != null) {
                yl2Var2.m25184d(m6164f(), false, false);
            }
            if ((yl2Var2 instanceof o34) && m6164f()) {
                ((o34) yl2Var2).f53767J.mo282k();
            }
            this.f13077h = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        x90 x90Var = this.f13070a;
        if (x90Var.f67957n != f) {
            x90Var.f67957n = f;
            getIndeterminateDrawable().f53767J.mo279c();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof o34) {
            ((yl2) drawable).m25184d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else if (this.f13079j) {
            C3386nv.m17626m("Cannot set framework drawable as indeterminate drawable.");
        } else {
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            Integer numM18120H = omd.m18120H(getContext(), R$attr.colorPrimary);
            iArr = new int[]{numM18120H != null ? numM18120H.intValue() : -1};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f13070a.f67948e = iArr;
        getIndeterminateDrawable().f53767J.mo279c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        x90 x90Var = this.f13070a;
        if (x90Var.f67952i != i) {
            x90Var.f67952i = i;
            x90Var.mo11063d();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        mo6160d(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable instanceof mc2) {
            mc2 mc2Var = (mc2) drawable;
            mc2Var.m25184d(false, false, false);
            super.setProgressDrawable(mc2Var);
            mc2Var.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
            return;
        }
        if (this.f13079j) {
            C3386nv.m17626m("Cannot set framework drawable as progress drawable.");
        } else {
            super.setProgressDrawable(drawable);
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f13070a.f67950g = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        x90 x90Var = this.f13070a;
        if (x90Var.f67949f != i) {
            x90Var.f67949f = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        x90 x90Var = this.f13070a;
        if (x90Var.f67945b != i) {
            x90Var.f67945b = Math.min(i, x90Var.f67944a / 2);
            x90Var.f67947d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        x90 x90Var = this.f13070a;
        if (x90Var.f67946c != f) {
            x90Var.f67946c = Math.min(f, 0.5f);
            x90Var.f67947d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        x90 x90Var = this.f13070a;
        if (x90Var.f67944a != i) {
            x90Var.f67944a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.f13078i = i;
        } else {
            C3386nv.m17626m("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }

    public void setWaveAmplitude(int i) {
        x90 x90Var = this.f13070a;
        if (x90Var.f67955l != i) {
            x90Var.f67955l = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveAmplitudeRampProgressMax(float f) {
        mc2 progressDrawable = getProgressDrawable();
        progressDrawable.f69974b.f67959p = f;
        progressDrawable.invalidateSelf();
        invalidate();
    }

    public void setWaveAmplitudeRampProgressMin(float f) {
        mc2 progressDrawable = getProgressDrawable();
        progressDrawable.f69974b.f67958o = f;
        progressDrawable.invalidateSelf();
        invalidate();
    }

    public void setWaveSpeed(int i) {
        x90 x90Var = this.f13070a;
        x90Var.f67956m = i;
        mc2 progressDrawable = getProgressDrawable();
        boolean z = x90Var.f67956m != 0;
        ValueAnimator valueAnimator = progressDrawable.f51063N;
        if (z && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else {
            if (z || !valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(int i) {
        x90 x90Var = this.f13070a;
        if (x90Var.f67953j != i) {
            x90Var.f67953j = Math.abs(i);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i) {
        x90 x90Var = this.f13070a;
        if (x90Var.f67954k != i) {
            x90Var.f67954k = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }
}
