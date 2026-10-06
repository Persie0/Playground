package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.List;
import p000.acw;
import p000.afb;
import p000.afc;
import p000.afe;
import p000.aff;
import p000.afh;
import p000.ago;
import p000.lij;
import p000.mfs;
import p000.mgf;
import p000.mgg;
import p000.mgk;
import p000.mgm;
import p000.mgr;
import p000.mhu;
import p000.miu;
import p000.miv;
import p000.mjb;
import p000.mkv;
import p000.mmp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* JADX INFO: renamed from: A */
    private int f8029A;

    /* JADX INFO: renamed from: B */
    private boolean f8030B;

    /* JADX INFO: renamed from: C */
    private int f8031C;

    /* JADX INFO: renamed from: D */
    private boolean f8032D;

    /* JADX INFO: renamed from: E */
    private AmbientMode.AmbientController f8033E;

    /* JADX INFO: renamed from: a */
    public final miu f8034a;

    /* JADX INFO: renamed from: b */
    final mhu f8035b;

    /* JADX INFO: renamed from: c */
    Drawable f8036c;

    /* JADX INFO: renamed from: d */
    int f8037d;

    /* JADX INFO: renamed from: e */
    public ago f8038e;

    /* JADX INFO: renamed from: f */
    private boolean f8039f;

    /* JADX INFO: renamed from: g */
    private int f8040g;

    /* JADX INFO: renamed from: h */
    private ViewGroup f8041h;

    /* JADX INFO: renamed from: i */
    private View f8042i;

    /* JADX INFO: renamed from: j */
    private View f8043j;

    /* JADX INFO: renamed from: k */
    private int f8044k;

    /* JADX INFO: renamed from: l */
    private int f8045l;

    /* JADX INFO: renamed from: m */
    private int f8046m;

    /* JADX INFO: renamed from: n */
    private int f8047n;

    /* JADX INFO: renamed from: o */
    private final Rect f8048o;

    /* JADX INFO: renamed from: p */
    private boolean f8049p;

    /* JADX INFO: renamed from: q */
    private boolean f8050q;

    /* JADX INFO: renamed from: r */
    private Drawable f8051r;

    /* JADX INFO: renamed from: s */
    private int f8052s;

    /* JADX INFO: renamed from: t */
    private boolean f8053t;

    /* JADX INFO: renamed from: u */
    private ValueAnimator f8054u;

    /* JADX INFO: renamed from: v */
    private long f8055v;

    /* JADX INFO: renamed from: w */
    private final TimeInterpolator f8056w;

    /* JADX INFO: renamed from: x */
    private final TimeInterpolator f8057x;

    /* JADX INFO: renamed from: y */
    private int f8058y;

    /* JADX INFO: renamed from: z */
    private int f8059z;

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    static mgm m4773c(View view) {
        mgm mgmVar = (mgm) view.getTag(C0100R.id.view_offset_helper);
        if (mgmVar != null) {
            return mgmVar;
        }
        mgm mgmVar2 = new mgm(view);
        view.setTag(C0100R.id.view_offset_helper, mgmVar2);
        return mgmVar2;
    }

    /* JADX INFO: renamed from: h */
    protected static final mgg m4774h() {
        return new mgg();
    }

    /* JADX INFO: renamed from: i */
    private static int m4775i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: j */
    private final void m4776j(AppBarLayout appBarLayout) {
        if (m4782p()) {
            appBarLayout.f8003e = false;
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m4777k() {
        View view;
        View view2;
        if (this.f8039f) {
            ViewGroup viewGroup = null;
            this.f8041h = null;
            this.f8042i = null;
            int i = this.f8040g;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.f8041h = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    while (true) {
                        if (parent == this) {
                            view2 = viewGroup2;
                            break;
                        } else {
                            if (parent == null) {
                                break;
                            }
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                            parent = parent.getParent();
                            view2 = view2;
                        }
                    }
                    this.f8042i = view2;
                }
            }
            if (this.f8041h == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f8041h = viewGroup;
            }
            if (!this.f8049p && (view = this.f8043j) != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(this.f8043j);
                }
            }
            if (this.f8049p && this.f8041h != null) {
                if (this.f8043j == null) {
                    this.f8043j = new View(getContext());
                }
                if (this.f8043j.getParent() == null) {
                    this.f8041h.addView(this.f8043j, -1, -1);
                }
            }
            this.f8039f = false;
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m4778l(Drawable drawable, int i, int i2) {
        m4779m(drawable, this.f8041h, i, i2);
    }

    /* JADX INFO: renamed from: m */
    private final void m4779m(Drawable drawable, View view, int i, int i2) {
        if (m4782p() && view != null && this.f8049p) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    /* JADX INFO: renamed from: n */
    private final void m4780n(int i, int i2, int i3, int i4, boolean z) {
        View view;
        boolean z2;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.f8049p || (view = this.f8043j) == null) {
            return;
        }
        int titleMarginStart = 0;
        boolean z3 = afe.m461e(view) && this.f8043j.getVisibility() == 0;
        this.f8050q = z3;
        if (z3) {
            z2 = z;
        } else if (!z) {
            return;
        } else {
            z2 = true;
        }
        int iM442c = afc.m442c(this);
        boolean z4 = iM442c == 1;
        View view2 = this.f8042i;
        if (view2 == null) {
            view2 = this.f8041h;
        }
        int iM4783a = m4783a(view2);
        miv.m16436a(this, this.f8043j, this.f8048o);
        ViewGroup viewGroup = this.f8041h;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.f1237n;
            titleMarginEnd = toolbar.f1238o;
            titleMarginTop = toolbar.f1239p;
            titleMarginBottom = toolbar.f1240q;
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        miu miuVar = this.f8034a;
        int i5 = this.f8048o.left + (iM442c == 1 ? titleMarginEnd : titleMarginStart);
        int i6 = this.f8048o.top + iM4783a;
        int i7 = this.f8048o.right;
        if (iM442c != 1) {
            titleMarginStart = titleMarginEnd;
        }
        int i8 = i7 - titleMarginStart;
        int i9 = i6 + titleMarginTop;
        int i10 = (this.f8048o.bottom + iM4783a) - titleMarginBottom;
        if (!miu.m16418j(miuVar.f40689h, i5, i9, i8, i10)) {
            miuVar.f40689h.set(i5, i9, i8, i10);
            miuVar.f40707z = true;
        }
        miu miuVar2 = this.f8034a;
        int i11 = z4 ? this.f8046m : this.f8044k;
        int i12 = this.f8048o.top + this.f8045l;
        int i13 = (i3 - i) - (z4 ? this.f8044k : this.f8046m);
        int i14 = (i4 - i2) - this.f8047n;
        if (!miu.m16418j(miuVar2.f40688g, i11, i12, i13, i14)) {
            miuVar2.f40688g.set(i11, i12, i13, i14);
            miuVar2.f40707z = true;
        }
        this.f8034a.m16433g(z2);
    }

    /* JADX INFO: renamed from: o */
    private final void m4781o() {
        CharSequence title;
        if (this.f8041h != null && this.f8049p && TextUtils.isEmpty(this.f8034a.f40703v)) {
            ViewGroup viewGroup = this.f8041h;
            if (viewGroup instanceof Toolbar) {
                title = ((Toolbar) viewGroup).f1242s;
            } else {
                title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
            }
            m4787f(title);
        }
    }

    /* JADX INFO: renamed from: p */
    private final boolean m4782p() {
        return this.f8059z == 1;
    }

    /* JADX INFO: renamed from: a */
    final int m4783a(View view) {
        return ((getHeight() - m4773c(view).f40444a) - view.getHeight()) - ((mgg) view.getLayoutParams()).bottomMargin;
    }

    /* JADX INFO: renamed from: b */
    public final int m4784b() {
        int i = this.f8058y;
        if (i >= 0) {
            return i + this.f8029A + this.f8031C;
        }
        ago agoVar = this.f8038e;
        int iM606d = agoVar != null ? agoVar.m606d() : 0;
        int iM421b = afb.m421b(this);
        return iM421b > 0 ? Math.min(iM421b + iM421b + iM606d, getHeight()) : getHeight() / 3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof mgg;
    }

    /* JADX INFO: renamed from: d */
    public final void m4785d(Drawable drawable) {
        Drawable drawable2 = this.f8051r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f8051r = drawableMutate;
            if (drawableMutate != null) {
                m4778l(drawableMutate, getWidth(), getHeight());
                this.f8051r.setCallback(this);
                this.f8051r.setAlpha(this.f8052s);
            }
            afb.m426g(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        m4777k();
        if (this.f8041h == null && (drawable = this.f8051r) != null && this.f8052s > 0) {
            drawable.mutate().setAlpha(this.f8052s);
            this.f8051r.draw(canvas);
        }
        if (this.f8049p && this.f8050q) {
            if (this.f8041h == null || this.f8051r == null || this.f8052s <= 0 || !m4782p()) {
                this.f8034a.m16430d(canvas);
            } else {
                miu miuVar = this.f8034a;
                if (miuVar.f40683b < miuVar.f40686e) {
                    int iSave = canvas.save();
                    canvas.clipRect(this.f8051r.getBounds(), Region.Op.DIFFERENCE);
                    this.f8034a.m16430d(canvas);
                    canvas.restoreToCount(iSave);
                } else {
                    this.f8034a.m16430d(canvas);
                }
            }
        }
        if (this.f8036c == null || this.f8052s <= 0) {
            return;
        }
        ago agoVar = this.f8038e;
        int iM606d = agoVar != null ? agoVar.m606d() : 0;
        if (iM606d > 0) {
            this.f8036c.setBounds(0, -this.f8037d, getWidth(), iM606d - this.f8037d);
            this.f8036c.mutate().setAlpha(this.f8052s);
            this.f8036c.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.f8051r;
        if (drawable == null || this.f8052s <= 0 || ((view2 = this.f8042i) == null || view2 == this ? view != this.f8041h : view != view2)) {
            z = false;
        } else {
            m4779m(drawable, view, getWidth(), getHeight());
            this.f8051r.mutate().setAlpha(this.f8052s);
            this.f8051r.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f8036c;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f8051r;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        miu miuVar = this.f8034a;
        if (miuVar != null) {
            miuVar.f40706y = drawableState;
            ColorStateList colorStateList2 = miuVar.f40694m;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = miuVar.f40693l) != null && colorStateList.isStateful())) {
                miuVar.m16432f();
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4786e(int i) {
        ViewGroup viewGroup;
        if (i != this.f8052s) {
            if (this.f8051r != null && (viewGroup = this.f8041h) != null) {
                afb.m426g(viewGroup);
            }
            this.f8052s = i;
            afb.m426g(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4787f(CharSequence charSequence) {
        miu miuVar = this.f8034a;
        if (charSequence == null || !TextUtils.equals(miuVar.f40703v, charSequence)) {
            miuVar.f40703v = charSequence;
            miuVar.f40704w = null;
            miuVar.m16432f();
        }
        setContentDescription(this.f8049p ? this.f8034a.f40703v : null);
    }

    /* JADX INFO: renamed from: g */
    final void m4788g() {
        if (this.f8051r == null && this.f8036c == null) {
            return;
        }
        int height = getHeight() + this.f8037d;
        int iM4784b = m4784b();
        boolean z = height < iM4784b;
        boolean z2 = afe.m462f(this) && !isInEditMode();
        if (this.f8053t != z) {
            if (z2) {
                int i = height < iM4784b ? 255 : 0;
                m4777k();
                ValueAnimator valueAnimator = this.f8054u;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f8054u = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.f8052s ? this.f8056w : this.f8057x);
                    this.f8054u.addUpdateListener(new mgr(this, 1));
                } else if (valueAnimator.isRunning()) {
                    this.f8054u.cancel();
                }
                this.f8054u.setDuration(this.f8055v);
                this.f8054u.setIntValues(this.f8052s, i);
                this.f8054u.start();
            } else {
                m4786e(height < iM4784b ? 255 : 0);
            }
            this.f8053t = z;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m4774h();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            m4776j(appBarLayout);
            setFitsSystemWindows(afb.m435p(appBarLayout));
            if (this.f8033E == null) {
                this.f8033E = new AmbientMode.AmbientController(this);
            }
            AmbientMode.AmbientController ambientController = this.f8033E;
            if (appBarLayout.f8002d == null) {
                appBarLayout.f8002d = new ArrayList();
            }
            if (ambientController != null && !appBarLayout.f8002d.contains(ambientController)) {
                appBarLayout.f8002d.add(ambientController);
            }
            aff.m467c(this);
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8034a.m16431e(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        List list;
        ViewParent parent = getParent();
        AmbientMode.AmbientController ambientController = this.f8033E;
        if (ambientController != null && (parent instanceof AppBarLayout) && (list = ((AppBarLayout) parent).f8002d) != null) {
            list.remove(ambientController);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ago agoVar = this.f8038e;
        if (agoVar != null) {
            int iM606d = agoVar.m606d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!afb.m435p(childAt) && childAt.getTop() < iM606d) {
                    childAt.offsetTopAndBottom(iM606d);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m4773c(getChildAt(i6)).m16358b();
        }
        m4780n(i, i2, i3, i4, false);
        m4781o();
        m4788g();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m4773c(getChildAt(i7)).m16357a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        m4777k();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        ago agoVar = this.f8038e;
        int iM606d = agoVar != null ? agoVar.m606d() : 0;
        if ((mode == 0 || this.f8030B) && iM606d > 0) {
            this.f8029A = iM606d;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iM606d, 1073741824));
        }
        if (this.f8032D && this.f8034a.f40646E > 1) {
            m4781o();
            m4780n(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            miu miuVar = this.f8034a;
            int i3 = miuVar.f40695n;
            if (i3 > 1) {
                TextPaint textPaint = miuVar.f40642A;
                textPaint.setTextSize(miuVar.f40692k);
                textPaint.setTypeface(miuVar.f40699r);
                textPaint.setLetterSpacing(miuVar.f40645D);
                this.f8031C = Math.round((-miuVar.f40642A.ascent()) + miuVar.f40642A.descent()) * (i3 - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f8031C, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f8041h;
        if (viewGroup != null) {
            View view = this.f8042i;
            if (view == null || view == this) {
                setMinimumHeight(m4775i(viewGroup));
            } else {
                setMinimumHeight(m4775i(view));
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f8051r;
        if (drawable != null) {
            m4778l(drawable, i, i2);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.f8036c;
        boolean z = i == 0;
        if (drawable != null && drawable.isVisible() != z) {
            this.f8036c.setVisible(z, false);
        }
        Drawable drawable2 = this.f8051r;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.f8051r.setVisible(z, false);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8051r || drawable == this.f8036c;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.collapsingToolbarLayoutStyle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return m4774h();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new mgg(getContext(), attributeSet);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        ColorStateList colorStateListM16540d;
        ColorStateList colorStateListM16540d2;
        TextUtils.TruncateAt truncateAt;
        super(mmp.m16632a(context, attributeSet, i, C0100R.style.Widget_Design_CollapsingToolbar), attributeSet, i);
        this.f8039f = true;
        this.f8048o = new Rect();
        this.f8058y = -1;
        this.f8029A = 0;
        this.f8031C = 0;
        Context context2 = getContext();
        miu miuVar = new miu(this);
        this.f8034a = miuVar;
        miuVar.f40644C = mfs.f40387e;
        miuVar.m16432f();
        miuVar.f40705x = false;
        mhu mhuVar = new mhu(context2);
        this.f8035b = mhuVar;
        TypedArray typedArrayM16438a = mjb.m16438a(context2, attributeSet, mgk.f40439c, i, C0100R.style.Widget_Design_CollapsingToolbar, new int[0]);
        int i3 = typedArrayM16438a.getInt(4, 8388691);
        if (miuVar.f40690i != i3) {
            miuVar.f40690i = i3;
            miuVar.m16432f();
        }
        int i4 = typedArrayM16438a.getInt(0, 8388627);
        if (miuVar.f40691j != i4) {
            miuVar.f40691j = i4;
            miuVar.m16432f();
        }
        int dimensionPixelSize = typedArrayM16438a.getDimensionPixelSize(5, 0);
        this.f8047n = dimensionPixelSize;
        this.f8046m = dimensionPixelSize;
        this.f8045l = dimensionPixelSize;
        this.f8044k = dimensionPixelSize;
        if (typedArrayM16438a.hasValue(8)) {
            this.f8044k = typedArrayM16438a.getDimensionPixelSize(8, 0);
        }
        if (typedArrayM16438a.hasValue(7)) {
            this.f8046m = typedArrayM16438a.getDimensionPixelSize(7, 0);
        }
        if (typedArrayM16438a.hasValue(9)) {
            this.f8045l = typedArrayM16438a.getDimensionPixelSize(9, 0);
        }
        if (typedArrayM16438a.hasValue(6)) {
            this.f8047n = typedArrayM16438a.getDimensionPixelSize(6, 0);
        }
        this.f8049p = typedArrayM16438a.getBoolean(20, true);
        m4787f(typedArrayM16438a.getText(18));
        miuVar.m16435i(C0100R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        miuVar.m16434h(C0100R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayM16438a.hasValue(10)) {
            miuVar.m16435i(typedArrayM16438a.getResourceId(10, 0));
        }
        if (typedArrayM16438a.hasValue(1)) {
            miuVar.m16434h(typedArrayM16438a.getResourceId(1, 0));
        }
        if (typedArrayM16438a.hasValue(22)) {
            switch (typedArrayM16438a.getInt(22, -1)) {
                case 0:
                    truncateAt = TextUtils.TruncateAt.START;
                    break;
                case 1:
                    truncateAt = TextUtils.TruncateAt.MIDDLE;
                    break;
                case 2:
                default:
                    truncateAt = TextUtils.TruncateAt.END;
                    break;
                case 3:
                    truncateAt = TextUtils.TruncateAt.MARQUEE;
                    break;
            }
            miuVar.f40702u = truncateAt;
            miuVar.m16432f();
        }
        if (typedArrayM16438a.hasValue(11) && miuVar.f40693l != (colorStateListM16540d2 = mkv.m16540d(context2, typedArrayM16438a, 11))) {
            miuVar.f40693l = colorStateListM16540d2;
            miuVar.m16432f();
        }
        if (typedArrayM16438a.hasValue(2) && miuVar.f40694m != (colorStateListM16540d = mkv.m16540d(context2, typedArrayM16438a, 2))) {
            miuVar.f40694m = colorStateListM16540d;
            miuVar.m16432f();
        }
        this.f8058y = typedArrayM16438a.getDimensionPixelSize(16, -1);
        if (typedArrayM16438a.hasValue(14) && (i2 = typedArrayM16438a.getInt(14, 1)) != miuVar.f40646E) {
            miuVar.f40646E = i2;
            miuVar.m16432f();
        }
        if (typedArrayM16438a.hasValue(21)) {
            miuVar.f40643B = AnimationUtils.loadInterpolator(context2, typedArrayM16438a.getResourceId(21, 0));
            miuVar.m16432f();
        }
        this.f8055v = typedArrayM16438a.getInt(15, 600);
        this.f8056w = lij.m15398F(context2, C0100R.attr.motionEasingStandardInterpolator, mfs.f40385c);
        this.f8057x = lij.m15398F(context2, C0100R.attr.motionEasingStandardInterpolator, mfs.f40386d);
        m4785d(typedArrayM16438a.getDrawable(3));
        Drawable drawable = typedArrayM16438a.getDrawable(17);
        Drawable drawable2 = this.f8036c;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f8036c = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f8036c.setState(getDrawableState());
                }
                acw.m245b(this.f8036c, afc.m442c(this));
                this.f8036c.setVisible(getVisibility() == 0, false);
                this.f8036c.setCallback(this);
                this.f8036c.setAlpha(this.f8052s);
            }
            afb.m426g(this);
        }
        this.f8059z = typedArrayM16438a.getInt(19, 0);
        boolean zM4782p = m4782p();
        miuVar.f40684c = zM4782p;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            m4776j((AppBarLayout) parent);
        }
        if (zM4782p && this.f8051r == null) {
            m4785d(new ColorDrawable(mhuVar.m16395b(mhuVar.f40547b, getResources().getDimension(C0100R.dimen.design_appbar_elevation))));
        }
        this.f8040g = typedArrayM16438a.getResourceId(23, -1);
        this.f8030B = typedArrayM16438a.getBoolean(13, false);
        this.f8032D = typedArrayM16438a.getBoolean(12, false);
        typedArrayM16438a.recycle();
        setWillNotDraw(false);
        afh.m483n(this, new mgf(this));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new mgg(layoutParams);
    }
}
