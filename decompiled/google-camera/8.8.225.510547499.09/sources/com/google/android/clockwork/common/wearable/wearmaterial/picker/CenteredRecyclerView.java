package com.google.android.clockwork.common.wearable.wearmaterial.picker;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.util.ArraySet;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.clockwork.common.wearable.wearmaterial.util.BlendContentDrawable;
import java.util.Set;
import p000.AbstractC0806ls;
import p000.AbstractC0812ly;
import p000.C0078bx;
import p000.ith;
import p000.iwk;
import p000.ixr;
import p000.ixs;
import p000.ixw;
import p000.ixx;
import p000.iyb;
import p000.iyc;
import p000.iyd;
import p000.jfs;
import p000.kbd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CenteredRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: W */
    public final Set f7484W;

    /* JADX INFO: renamed from: aa */
    public final Set f7485aa;

    /* JADX INFO: renamed from: ab */
    public final iyb f7486ab;

    /* JADX INFO: renamed from: ac */
    public ViewTreeObserver.OnPreDrawListener f7487ac;

    /* JADX INFO: renamed from: ad */
    public boolean f7488ad;

    /* JADX INFO: renamed from: ae */
    public int f7489ae;

    /* JADX INFO: renamed from: af */
    public ixs f7490af;

    /* JADX INFO: renamed from: ag */
    public float f7491ag;

    /* JADX INFO: renamed from: ah */
    public float f7492ah;

    /* JADX INFO: renamed from: ai */
    public Animator f7493ai;

    /* JADX INFO: renamed from: aj */
    private final Handler f7494aj;

    /* JADX INFO: renamed from: ak */
    private final Runnable f7495ak;

    /* JADX INFO: renamed from: al */
    private final Animator f7496al;

    /* JADX INFO: renamed from: am */
    private final Animator f7497am;

    /* JADX INFO: renamed from: an */
    private int f7498an;

    /* JADX INFO: renamed from: ao */
    private boolean f7499ao;

    /* JADX INFO: renamed from: ap */
    private BlendContentDrawable f7500ap;

    /* JADX INFO: renamed from: aq */
    private final jfs f7501aq;

    public CenteredRecyclerView(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: renamed from: aE */
    private static PickerVignetteDrawable m4606aE(BlendContentDrawable blendContentDrawable) {
        Drawable drawable = blendContentDrawable.getDrawable();
        if (drawable instanceof PickerVignetteDrawable) {
            return (PickerVignetteDrawable) drawable;
        }
        return null;
    }

    @Override // android.support.v7.widget.RecyclerView
    /* JADX INFO: renamed from: Y */
    public final void mo1226Y(AbstractC0806ls abstractC0806ls) {
        ixx ixxVar = (ixx) this.f1123m;
        if (abstractC0806ls == ixxVar) {
            return;
        }
        this.f7498an = -1;
        this.f7488ad = false;
        this.f7489ae = 0;
        if (ixxVar != null) {
            throw null;
        }
        ViewTreeObserver viewTreeObserver = getRootView().getViewTreeObserver();
        viewTreeObserver.removeOnPreDrawListener(this.f7487ac);
        viewTreeObserver.addOnPreDrawListener(this.f7487ac);
        super.mo1226Y(abstractC0806ls);
    }

    /* JADX INFO: renamed from: a */
    public final int m4607a(View view) {
        if (view == null) {
            return 0;
        }
        int iM13923l = kbd.m13923l(this.f7486ab, this, true);
        int iMo11890b = this.f7486ab.mo11890b(view);
        float fMo11889a = this.f7486ab.mo11889a(view);
        return (iMo11890b + ((int) (Math.round(Math.abs(fMo11889a)) * Math.signum(fMo11889a)))) - iM13923l;
    }

    /* JADX INFO: renamed from: aA */
    public final void m4608aA() {
        if (((ixx) this.f1123m) != null) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: aB */
    public final /* synthetic */ void m4609aB(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: aC */
    public final void m4610aC(int i) {
        ixx ixxVar = (ixx) this.f1123m;
        if (ixxVar != null && i >= 0 && ixxVar.mo1762a() > 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: aD */
    public final void m4611aD() {
        if (((ixx) this.f1123m) != null) {
            throw null;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    /* JADX INFO: renamed from: ak */
    public final boolean mo1237ak(int i, int i2) {
        if (this.f7499ao) {
            return super.mo1237ak(i, i2);
        }
        if (!this.f7501aq.m13099e()) {
            return false;
        }
        int i3 = this.f1071I;
        if (Math.abs(i) < i3 && Math.abs(i2) < i3) {
            return false;
        }
        int i4 = (i < 0 || i2 < 0) ? -1 : 1;
        m4611aD();
        m4610aC(i4 - 1);
        return true;
    }

    /* JADX INFO: renamed from: az */
    public final PickerVignetteDrawable m4612az() {
        BlendContentDrawable blendContentDrawable = this.f7500ap;
        if (blendContentDrawable == null) {
            return null;
        }
        return m4606aE(blendContentDrawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        BlendContentDrawable blendContentDrawable = this.f7500ap;
        if (blendContentDrawable == null) {
            super.dispatchDraw(canvas);
        } else {
            blendContentDrawable.draw(canvas);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4608aA();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getRootView().getViewTreeObserver().removeOnPreDrawListener(this.f7487ac);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        BlendContentDrawable blendContentDrawable;
        super.onLayout(z, i, i2, i3, i4);
        if (z || this.f7498an == -1) {
            if (this.f7498an == -1) {
                this.f7498an = 0;
            }
            int iMo11892d = this.f7486ab.mo11892d(this);
            if (this.f7498an != iMo11892d && getChildCount() > 0) {
                this.f7498an = iMo11892d;
                boolean z2 = getChildCount() > 0 && this.f7486ab.mo11896h(this);
                this.f7488ad = z2;
                this.f7489ae = kbd.m13923l(this.f7486ab, this, z2);
                this.f7494aj.removeCallbacks(this.f7495ak);
                this.f7494aj.postAtFrontOfQueue(this.f7495ak);
            }
            if (getChildCount() >= 2 && (blendContentDrawable = this.f7500ap) != null) {
                blendContentDrawable.setBounds(0, 0, getWidth(), getHeight());
                PickerVignetteDrawable pickerVignetteDrawableM4606aE = m4606aE(blendContentDrawable);
                if (pickerVignetteDrawableM4606aE != null) {
                    int iMo11892d2 = this.f7486ab.mo11892d(this);
                    int iMo11892d3 = this.f7486ab.mo11892d(getChildAt(0));
                    pickerVignetteDrawableM4606aE.setClearArea((iMo11892d2 - iMo11892d3) / 2, (iMo11892d2 + iMo11892d3) / 2);
                }
            }
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f7500ap || super.verifyDrawable(drawable);
    }

    public CenteredRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CenteredRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7484W = new ArraySet();
        this.f7485aa = new ArraySet();
        this.f7495ak = new ith(this, 4);
        this.f7487ac = new iwk(this, 3);
        this.f7498an = -1;
        this.f7490af = null;
        this.f7491ag = 1.0f;
        this.f7492ah = 1.0f;
        this.f7499ao = true;
        this.f7501aq = new jfs(context);
        this.f7494aj = new Handler();
        setClipToPadding(false);
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), C0100R.animator.wear_vignette_expansion);
        this.f7496al = animatorLoadAnimator;
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(getContext(), C0100R.animator.wear_vignette_collapse);
        this.f7497am = animatorLoadAnimator2;
        m1227Z(null);
        int i2 = AbstractC0812ly.m16130at(context, attributeSet, i, 0).f39493a;
        getContext();
        m1228aa(new ixr(i2));
        this.f7486ab = i2 == 0 ? new iyd(1) : new iyd(0);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, iyc.f32633a, i, 0);
        try {
            this.f7491ag = typedArrayObtainStyledAttributes.getFloat(2, this.f7491ag);
            this.f7492ah = typedArrayObtainStyledAttributes.getFloat(1, this.f7492ah);
            this.f7499ao = typedArrayObtainStyledAttributes.getBoolean(0, this.f7499ao);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(3);
            if (drawable instanceof BlendContentDrawable) {
                BlendContentDrawable blendContentDrawable = (BlendContentDrawable) drawable;
                this.f7500ap = blendContentDrawable;
                blendContentDrawable.setContentProvider(new C0078bx(this, 9));
                this.f7500ap.setCallback(this);
                PickerVignetteDrawable pickerVignetteDrawableM4606aE = m4606aE(this.f7500ap);
                animatorLoadAnimator.setTarget(pickerVignetteDrawableM4606aE);
                animatorLoadAnimator2.setTarget(pickerVignetteDrawableM4606aE);
            }
            typedArrayObtainStyledAttributes.recycle();
            setOverScrollMode(2);
            m1225X(new ixw(this));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
