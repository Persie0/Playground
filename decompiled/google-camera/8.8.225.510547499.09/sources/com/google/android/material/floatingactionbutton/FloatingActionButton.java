package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.lens.sdk.LensApi;
import java.util.List;
import p000.C0274ir;
import p000.C1117xf;
import p000.aah;
import p000.aai;
import p000.aal;
import p000.abf;
import p000.abu;
import p000.afe;
import p000.afq;
import p000.lij;
import p000.mfv;
import p000.mhv;
import p000.mhw;
import p000.mhy;
import p000.mie;
import p000.mif;
import p000.min;
import p000.mio;
import p000.mip;
import p000.miq;
import p000.miv;
import p000.mjb;
import p000.mjf;
import p000.mkq;
import p000.mkv;
import p000.mkx;
import p000.mlc;
import p000.mll;
import p000.mls;
import p000.mmp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends mjf implements mhv, mll, aah {

    /* JADX INFO: renamed from: a */
    public int f8148a;

    /* JADX INFO: renamed from: b */
    public boolean f8149b;

    /* JADX INFO: renamed from: c */
    public final Rect f8150c;

    /* JADX INFO: renamed from: e */
    private ColorStateList f8151e;

    /* JADX INFO: renamed from: f */
    private PorterDuff.Mode f8152f;

    /* JADX INFO: renamed from: g */
    private ColorStateList f8153g;

    /* JADX INFO: renamed from: h */
    private int f8154h;

    /* JADX INFO: renamed from: i */
    private int f8155i;

    /* JADX INFO: renamed from: j */
    private int f8156j;

    /* JADX INFO: renamed from: k */
    private int f8157k;

    /* JADX INFO: renamed from: l */
    private final Rect f8158l;

    /* JADX INFO: renamed from: m */
    private final C0274ir f8159m;

    /* JADX INFO: renamed from: n */
    private final mhw f8160n;

    /* JADX INFO: renamed from: o */
    private min f8161o;

    /* JADX INFO: compiled from: PG */
    public class BaseBehavior extends aai {

        /* JADX INFO: renamed from: a */
        private Rect f8162a;

        /* JADX INFO: renamed from: b */
        private final boolean f8163b;

        public BaseBehavior() {
            this.f8163b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, miq.f40637c);
            this.f8163b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: u */
        private static boolean m4841u(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof aal) {
                return ((aal) layoutParams).f14a instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* JADX INFO: renamed from: v */
        private final boolean m4842v(View view, FloatingActionButton floatingActionButton) {
            return this.f8163b && ((aal) floatingActionButton.getLayoutParams()).f19f == view.getId() && floatingActionButton.f40728d == 0;
        }

        /* JADX INFO: renamed from: w */
        private final boolean m4843w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m4842v(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f8162a == null) {
                this.f8162a = new Rect();
            }
            Rect rect = this.f8162a;
            miv.m16436a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.m4743d()) {
                floatingActionButton.m4839e();
                return true;
            }
            floatingActionButton.m4840f();
            return true;
        }

        /* JADX INFO: renamed from: x */
        private final boolean m4844x(View view, FloatingActionButton floatingActionButton) {
            if (!m4842v(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((aal) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.m4839e();
                return true;
            }
            floatingActionButton.m4840f();
            return true;
        }

        @Override // p000.aai
        /* JADX INFO: renamed from: a */
        public final void mo4a(aal aalVar) {
            if (aalVar.f21h == 0) {
                aalVar.f21h = 80;
            }
        }

        @Override // p000.aai
        /* JADX INFO: renamed from: e */
        public final /* bridge */ /* synthetic */ boolean mo8e(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List listM1422a = coordinatorLayout.m1422a(floatingActionButton);
            int size = listM1422a.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) listM1422a.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    if (m4841u(view2) && m4844x(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m4843w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m1426j(floatingActionButton, i);
            Rect rect = floatingActionButton.f8150c;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            aal aalVar = (aal) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - aalVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= aalVar.leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - aalVar.bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= aalVar.topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                int[] iArr = afq.f274a;
                floatingActionButton.offsetTopAndBottom(i2);
            }
            if (i4 == 0) {
                return true;
            }
            int[] iArr2 = afq.f274a;
            floatingActionButton.offsetLeftAndRight(i4);
            return true;
        }

        @Override // p000.aai
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ void mo12i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m4843w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else if (m4841u(view2)) {
                m4844x(view2, floatingActionButton);
            }
        }

        @Override // p000.aai
        /* JADX INFO: renamed from: r */
        public final /* bridge */ /* synthetic */ boolean mo21r(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f8150c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }
    }

    /* JADX INFO: compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: h */
    private final int m4836h(int i) {
        int i2 = this.f8156j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        switch (i) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m4836h(1) : m4836h(0);
            case 0:
            default:
                return resources.getDimensionPixelSize(C0100R.dimen.design_fab_size_normal);
            case 1:
                return resources.getDimensionPixelSize(C0100R.dimen.design_fab_size_mini);
        }
    }

    /* JADX INFO: renamed from: i */
    private final min m4837i() {
        if (this.f8161o == null) {
            this.f8161o = new mip(this, new AmbientMode.AmbientController(this), null, null);
        }
        return this.f8161o;
    }

    @Override // p000.aah
    /* JADX INFO: renamed from: a */
    public final aai mo1a() {
        return new Behavior();
    }

    /* JADX INFO: renamed from: b */
    public final int m4838b() {
        return m4836h(this.f8155i);
    }

    @Override // p000.mll
    /* JADX INFO: renamed from: c */
    public final void mo4827c(mlc mlcVar) {
        m4837i().m16409h(mlcVar);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        m4837i();
        getDrawableState();
    }

    /* JADX INFO: renamed from: e */
    final void m4839e() {
        min minVarM4837i = m4837i();
        if (minVarM4837i.f40611B.getVisibility() == 0) {
            if (minVarM4837i.f40610A == 1) {
                return;
            }
        } else if (minVarM4837i.f40610A != 2) {
            return;
        }
        Animator animator = minVarM4837i.f40629v;
        if (animator != null) {
            animator.cancel();
        }
        if (!minVarM4837i.m16414m()) {
            minVarM4837i.f40611B.m16443g(4, false);
            return;
        }
        mfv mfvVar = minVarM4837i.f40631x;
        AnimatorSet animatorSetM16403b = mfvVar != null ? minVarM4837i.m16403b(mfvVar, 0.0f, 0.0f, 0.0f) : minVarM4837i.m16404c(0.0f, 0.4f, 0.4f, min.f40602d, min.f40603e);
        animatorSetM16403b.addListener(new mie(minVarM4837i));
        animatorSetM16403b.start();
    }

    /* JADX INFO: renamed from: f */
    final void m4840f() {
        min minVarM4837i = m4837i();
        if (minVarM4837i.f40611B.getVisibility() != 0) {
            if (minVarM4837i.f40610A == 2) {
                return;
            }
        } else if (minVarM4837i.f40610A != 1) {
            return;
        }
        Animator animator = minVarM4837i.f40629v;
        if (animator != null) {
            animator.cancel();
        }
        mfv mfvVar = minVarM4837i.f40630w;
        if (!minVarM4837i.m16414m()) {
            minVarM4837i.f40611B.m16443g(0, false);
            minVarM4837i.f40611B.setAlpha(1.0f);
            minVarM4837i.f40611B.setScaleY(1.0f);
            minVarM4837i.f40611B.setScaleX(1.0f);
            minVarM4837i.m16408g(1.0f);
            return;
        }
        if (minVarM4837i.f40611B.getVisibility() != 0) {
            minVarM4837i.f40611B.setAlpha(0.0f);
            FloatingActionButton floatingActionButton = minVarM4837i.f40611B;
            float f = mfvVar == null ? 0.4f : 0.0f;
            floatingActionButton.setScaleY(f);
            minVarM4837i.f40611B.setScaleX(f);
            minVarM4837i.m16408g(f);
        }
        mfv mfvVar2 = minVarM4837i.f40630w;
        AnimatorSet animatorSetM16403b = mfvVar2 != null ? minVarM4837i.m16403b(mfvVar2, 1.0f, 1.0f, 1.0f) : minVarM4837i.m16404c(1.0f, 1.0f, 1.0f, min.f40600b, min.f40601c);
        animatorSetM16403b.addListener(new mif(minVarM4837i));
        animatorSetM16403b.start();
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.f8151e;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f8152f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        m4837i();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        min minVarM4837i = m4837i();
        mkx mkxVar = minVarM4837i.f40620m;
        if (mkxVar != null) {
            mkv.m16546k(minVarM4837i.f40611B, mkxVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        min minVarM4837i = m4837i();
        minVarM4837i.f40611B.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = minVarM4837i.f40612C;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iM4838b = m4838b();
        this.f8148a = (iM4838b - this.f8157k) / 2;
        m4837i().m16411j();
        int iMin = Math.min(View.resolveSize(iM4838b, i), View.resolveSize(iM4838b, i2));
        setMeasuredDimension(this.f8150c.left + iMin + this.f8150c.right, iMin + this.f8150c.top + this.f8150c.bottom);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof mls)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        mls mlsVar = (mls) parcelable;
        super.onRestoreInstanceState(mlsVar.f394d);
        mhw mhwVar = this.f8160n;
        Bundle bundle = (Bundle) mlsVar.f40999a.get("expandableWidgetHelper");
        abf.m90c(bundle);
        mhwVar.f40552b = bundle.getBoolean("expanded", false);
        mhwVar.f40553c = bundle.getInt(CswIK.SemXuBzlCScirx, 0);
        if (mhwVar.f40552b) {
            ViewParent parent = mhwVar.f40551a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).m1423b(mhwVar.f40551a);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        mls mlsVar = new mls(parcelableOnSaveInstanceState);
        C1117xf c1117xf = mlsVar.f40999a;
        mhw mhwVar = this.f8160n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", mhwVar.f40552b);
        bundle.putInt("expandedComponentIdHint", mhwVar.f40553c);
        c1117xf.put("expandableWidgetHelper", bundle);
        return mlsVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.f8158l;
            if (afe.m462f(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                rect.left += this.f8150c.left;
                rect.top += this.f8150c.top;
                rect.right -= this.f8150c.right;
                rect.bottom -= this.f8150c.bottom;
                if (!this.f8158l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f8151e != colorStateList) {
            this.f8151e = colorStateList;
            min minVarM4837i = m4837i();
            mkx mkxVar = minVarM4837i.f40620m;
            if (mkxVar != null) {
                mkxVar.setTintList(colorStateList);
            }
            mhy mhyVar = minVarM4837i.f40622o;
            if (mhyVar != null) {
                mhyVar.m16397b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f8152f != mode) {
            this.f8152f = mode;
            mkx mkxVar = m4837i().f40620m;
            if (mkxVar != null) {
                mkxVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        m4837i().m16412k(f);
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            m4837i().m16410i();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.f8159m.m11626e(i);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        m4837i();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        m4837i();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        m4837i();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        m4837i();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        m4837i();
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable layerDrawable;
        super(mmp.m16632a(context, attributeSet, i, C0100R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        this.f8150c = new Rect();
        this.f8158l = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM16438a = mjb.m16438a(context2, attributeSet, miq.f40636b, i, C0100R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f8151e = mkv.m16540d(context2, typedArrayM16438a, 1);
        this.f8152f = lij.m15400H(typedArrayM16438a.getInt(2, -1), null);
        this.f8153g = mkv.m16540d(context2, typedArrayM16438a, 12);
        this.f8155i = typedArrayM16438a.getInt(7, -1);
        this.f8156j = typedArrayM16438a.getDimensionPixelSize(6, 0);
        this.f8154h = typedArrayM16438a.getDimensionPixelSize(3, 0);
        float dimension = typedArrayM16438a.getDimension(4, 0.0f);
        float dimension2 = typedArrayM16438a.getDimension(9, 0.0f);
        float dimension3 = typedArrayM16438a.getDimension(11, 0.0f);
        this.f8149b = typedArrayM16438a.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.mtrl_fab_min_touch_target);
        int dimensionPixelSize2 = typedArrayM16438a.getDimensionPixelSize(10, 0);
        this.f8157k = dimensionPixelSize2;
        min minVarM4837i = m4837i();
        if (minVarM4837i.f40633z != dimensionPixelSize2) {
            minVarM4837i.f40633z = dimensionPixelSize2;
            minVarM4837i.m16410i();
        }
        mfv mfvVarM16343a = mfv.m16343a(context2, typedArrayM16438a, 15);
        mfv mfvVarM16343a2 = mfv.m16343a(context2, typedArrayM16438a, 8);
        mlc mlcVarM16589a = mlc.m16591b(context2, attributeSet, i, C0100R.style.Widget_Design_FloatingActionButton, mlc.f40944a).m16589a();
        boolean z = typedArrayM16438a.getBoolean(5, false);
        setEnabled(typedArrayM16438a.getBoolean(0, true));
        typedArrayM16438a.recycle();
        C0274ir c0274ir = new C0274ir(this);
        this.f8159m = c0274ir;
        c0274ir.m11624c(attributeSet, i);
        this.f8160n = new mhw(this);
        m4837i().m16409h(mlcVarM16589a);
        min minVarM4837i2 = m4837i();
        ColorStateList colorStateList = this.f8151e;
        PorterDuff.Mode mode = this.f8152f;
        ColorStateList colorStateList2 = this.f8153g;
        int i2 = this.f8154h;
        mip mipVar = (mip) minVarM4837i2;
        mlc mlcVar = mipVar.f40619l;
        abf.m90c(mlcVar);
        mipVar.f40620m = new mio(mlcVar);
        mipVar.f40620m.setTintList(colorStateList);
        if (mode != null) {
            mipVar.f40620m.setTintMode(mode);
        }
        mipVar.f40620m.m16577g(mipVar.f40611B.getContext());
        if (i2 > 0) {
            Context context3 = mipVar.f40611B.getContext();
            mlc mlcVar2 = mipVar.f40619l;
            abf.m90c(mlcVar2);
            mhy mhyVar = new mhy(mlcVar2);
            int iM159a = abu.m159a(context3, C0100R.color.design_fab_stroke_top_outer_color);
            int iM159a2 = abu.m159a(context3, C0100R.color.design_fab_stroke_top_inner_color);
            int iM159a3 = abu.m159a(context3, C0100R.color.design_fab_stroke_end_inner_color);
            int iM159a4 = abu.m159a(context3, C0100R.color.design_fab_stroke_end_outer_color);
            mhyVar.f40557c = iM159a;
            mhyVar.f40558d = iM159a2;
            mhyVar.f40559e = iM159a3;
            mhyVar.f40560f = iM159a4;
            float f = i2;
            if (mhyVar.f40556b != f) {
                mhyVar.f40556b = f;
                mhyVar.f40555a.setStrokeWidth(f * 1.3333f);
                mhyVar.f40561g = true;
                mhyVar.invalidateSelf();
            }
            mhyVar.m16397b(colorStateList);
            mipVar.f40622o = mhyVar;
            mhy mhyVar2 = mipVar.f40622o;
            abf.m90c(mhyVar2);
            mkx mkxVar = mipVar.f40620m;
            abf.m90c(mkxVar);
            layerDrawable = new LayerDrawable(new Drawable[]{mhyVar2, mkxVar});
            drawable = null;
        } else {
            drawable = null;
            mipVar.f40622o = null;
            layerDrawable = mipVar.f40620m;
        }
        mipVar.f40621n = new RippleDrawable(mkq.m16490b(colorStateList2), layerDrawable, drawable);
        mipVar.f40623p = mipVar.f40621n;
        m4837i().f40628u = dimensionPixelSize;
        min minVarM4837i3 = m4837i();
        if (minVarM4837i3.f40625r != dimension) {
            minVarM4837i3.f40625r = dimension;
            minVarM4837i3.mo16407f(dimension, minVarM4837i3.f40626s, minVarM4837i3.f40627t);
        }
        min minVarM4837i4 = m4837i();
        if (minVarM4837i4.f40626s != dimension2) {
            minVarM4837i4.f40626s = dimension2;
            minVarM4837i4.mo16407f(minVarM4837i4.f40625r, dimension2, minVarM4837i4.f40627t);
        }
        min minVarM4837i5 = m4837i();
        if (minVarM4837i5.f40627t != dimension3) {
            minVarM4837i5.f40627t = dimension3;
            minVarM4837i5.mo16407f(minVarM4837i5.f40625r, minVarM4837i5.f40626s, dimension3);
        }
        m4837i().f40630w = mfvVarM16343a;
        m4837i().f40631x = mfvVarM16343a2;
        m4837i().f40624q = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
