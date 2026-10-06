package com.google.android.material.tabs;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C0193fr;
import p000.aed;
import p000.aee;
import p000.aef;
import p000.afb;
import p000.afc;
import p000.afe;
import p000.afh;
import p000.agt;
import p000.atw;
import p000.bkn;
import p000.kxk;
import p000.lij;
import p000.lkm;
import p000.mfs;
import p000.mgr;
import p000.mjb;
import p000.mkv;
import p000.mkx;
import p000.mlt;
import p000.mlu;
import p000.mlv;
import p000.mlw;
import p000.mlx;
import p000.mma;
import p000.mmb;
import p000.mmc;
import p000.mmd;
import p000.mmh;
import p000.mmp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@atw
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: C */
    private static final aed f8177C = new aef(16);

    /* JADX INFO: renamed from: A */
    public int f8178A;

    /* JADX INFO: renamed from: B */
    public mkv f8179B;

    /* JADX INFO: renamed from: D */
    private final ArrayList f8180D;

    /* JADX INFO: renamed from: E */
    private mmb f8181E;

    /* JADX INFO: renamed from: F */
    private int f8182F;

    /* JADX INFO: renamed from: G */
    private final int f8183G;

    /* JADX INFO: renamed from: H */
    private final int f8184H;

    /* JADX INFO: renamed from: I */
    private final int f8185I;

    /* JADX INFO: renamed from: J */
    private int f8186J;

    /* JADX INFO: renamed from: K */
    private final ArrayList f8187K;

    /* JADX INFO: renamed from: L */
    private mlx f8188L;

    /* JADX INFO: renamed from: M */
    private ValueAnimator f8189M;

    /* JADX INFO: renamed from: N */
    private mmc f8190N;

    /* JADX INFO: renamed from: O */
    private boolean f8191O;

    /* JADX INFO: renamed from: P */
    private final aed f8192P;

    /* JADX INFO: renamed from: Q */
    private lkm f8193Q;

    /* JADX INFO: renamed from: a */
    public int f8194a;

    /* JADX INFO: renamed from: b */
    final mma f8195b;

    /* JADX INFO: renamed from: c */
    public int f8196c;

    /* JADX INFO: renamed from: d */
    public int f8197d;

    /* JADX INFO: renamed from: e */
    public int f8198e;

    /* JADX INFO: renamed from: f */
    public int f8199f;

    /* JADX INFO: renamed from: g */
    public final int f8200g;

    /* JADX INFO: renamed from: h */
    public final int f8201h;

    /* JADX INFO: renamed from: i */
    public int f8202i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f8203j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f8204k;

    /* JADX INFO: renamed from: l */
    public Drawable f8205l;

    /* JADX INFO: renamed from: m */
    public float f8206m;

    /* JADX INFO: renamed from: n */
    public float f8207n;

    /* JADX INFO: renamed from: o */
    public final int f8208o;

    /* JADX INFO: renamed from: p */
    public int f8209p;

    /* JADX INFO: renamed from: q */
    public int f8210q;

    /* JADX INFO: renamed from: r */
    int f8211r;

    /* JADX INFO: renamed from: s */
    public int f8212s;

    /* JADX INFO: renamed from: t */
    public int f8213t;

    /* JADX INFO: renamed from: u */
    public boolean f8214u;

    /* JADX INFO: renamed from: v */
    public boolean f8215v;

    /* JADX INFO: renamed from: w */
    int f8216w;

    /* JADX INFO: renamed from: x */
    public boolean f8217x;

    /* JADX INFO: renamed from: y */
    public final TimeInterpolator f8218y;

    /* JADX INFO: renamed from: z */
    ViewPager f8219z;

    public TabLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: m */
    private final int m4847m(int i, float f) {
        View childAt;
        int i2 = this.f8213t;
        if ((i2 != 0 && i2 != 2) || (childAt = this.f8195b.getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < this.f8195b.getChildCount() ? this.f8195b.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return afc.m442c(this) == 0 ? left + i4 : left - i4;
    }

    /* JADX INFO: renamed from: n */
    private final int m4848n() {
        int i = this.f8183G;
        if (i != -1) {
            return i;
        }
        int i2 = this.f8213t;
        if (i2 == 0 || i2 == 2) {
            return this.f8185I;
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    private static ColorStateList m4849o(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* JADX INFO: renamed from: p */
    private final void m4850p(View view) {
        if (!(view instanceof mlw)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        mlw mlwVar = (mlw) view;
        mmb mmbVarM4859d = m4859d();
        CharSequence charSequence = mlwVar.f41001a;
        Drawable drawable = mlwVar.f41002b;
        int i = mlwVar.f41003c;
        if (!TextUtils.isEmpty(mlwVar.getContentDescription())) {
            mmbVarM4859d.f41012c = mlwVar.getContentDescription();
            mmbVarM4859d.m16617b();
        }
        m4861f(mmbVarM4859d, this.f8180D.isEmpty());
    }

    /* JADX INFO: renamed from: q */
    private final void m4851q(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && afe.m462f(this)) {
            mma mmaVar = this.f8195b;
            int childCount = mmaVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (mmaVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iM4847m = m4847m(i, 0.0f);
            if (scrollX != iM4847m) {
                if (this.f8189M == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.f8189M = valueAnimator;
                    valueAnimator.setInterpolator(this.f8218y);
                    this.f8189M.setDuration(this.f8211r);
                    this.f8189M.addUpdateListener(new mgr(this, 2));
                }
                this.f8189M.setIntValues(scrollX, iM4847m);
                this.f8189M.start();
            }
            mma mmaVar2 = this.f8195b;
            int i3 = this.f8211r;
            ValueAnimator valueAnimator2 = mmaVar2.f41008a;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && mmaVar2.f41009b.f8194a != i) {
                mmaVar2.f41008a.cancel();
            }
            mmaVar2.m16615d(true, i, i3);
            return;
        }
        m4867l(i);
    }

    /* JADX INFO: renamed from: r */
    private final void m4852r(int i) {
        int childCount = this.f8195b.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f8195b.getChildAt(i2);
                boolean z = i2 != i;
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    boolean z2 = !z;
                    childAt.setSelected(z2);
                    childAt.setActivated(z2);
                } else {
                    boolean z3 = !z;
                    childAt.setSelected(z3);
                    childAt.setActivated(z3);
                    if (childAt instanceof mmd) {
                        ((mmd) childAt).m16622c();
                    }
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private final boolean m4854t() {
        int i = this.f8213t;
        return i == 0 || i == 2;
    }

    /* JADX INFO: renamed from: u */
    private final void m4855u(ViewPager viewPager, boolean z) {
        List list;
        List list2;
        ViewPager viewPager2 = this.f8219z;
        if (viewPager2 != null) {
            mmc mmcVar = this.f8190N;
            if (mmcVar != null && (list2 = viewPager2.f1644d) != null) {
                list2.remove(mmcVar);
            }
            lkm lkmVar = this.f8193Q;
            if (lkmVar != null && (list = this.f8219z.f1645e) != null) {
                list.remove(lkmVar);
            }
        }
        mlx mlxVar = this.f8188L;
        if (mlxVar != null) {
            this.f8187K.remove(mlxVar);
            this.f8188L = null;
        }
        if (viewPager != null) {
            this.f8219z = viewPager;
            if (this.f8190N == null) {
                this.f8190N = new mmc(this);
            }
            mmc mmcVar2 = this.f8190N;
            mmcVar2.f41020b = 0;
            mmcVar2.f41019a = 0;
            if (viewPager.f1644d == null) {
                viewPager.f1644d = new ArrayList();
            }
            viewPager.f1644d.add(mmcVar2);
            mmh mmhVar = new mmh(viewPager, 1);
            this.f8188L = mmhVar;
            m4860e(mmhVar);
            if (this.f8193Q == null) {
                this.f8193Q = new lkm((char[]) null);
            }
            lkm lkmVar2 = this.f8193Q;
            if (viewPager.f1645e == null) {
                viewPager.f1645e = new ArrayList();
            }
            viewPager.f1645e.add(lkmVar2);
            m4867l(0);
        } else {
            this.f8219z = null;
            m4862g();
        }
        this.f8191O = z;
    }

    /* JADX INFO: renamed from: a */
    public final int m4856a() {
        mmb mmbVar = this.f8181E;
        if (mmbVar != null) {
            return mmbVar.f41013d;
        }
        return -1;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        m4850p(view);
    }

    /* JADX INFO: renamed from: b */
    public final int m4857b() {
        return this.f8180D.size();
    }

    /* JADX INFO: renamed from: c */
    public final mmb m4858c(int i) {
        if (i < 0 || i >= m4857b()) {
            return null;
        }
        return (mmb) this.f8180D.get(i);
    }

    /* JADX INFO: renamed from: d */
    public final mmb m4859d() {
        mmb mmbVar = (mmb) f8177C.mo320a();
        if (mmbVar == null) {
            mmbVar = new mmb();
        }
        mmbVar.f41016g = this;
        aed aedVar = this.f8192P;
        mmd mmdVar = aedVar != null ? (mmd) aedVar.mo320a() : null;
        if (mmdVar == null) {
            mmdVar = new mmd(this, getContext());
        }
        mmdVar.m16620a(mmbVar);
        mmdVar.setFocusable(true);
        mmdVar.setMinimumWidth(m4848n());
        if (TextUtils.isEmpty(mmbVar.f41012c)) {
            mmdVar.setContentDescription(mmbVar.f41011b);
        } else {
            mmdVar.setContentDescription(mmbVar.f41012c);
        }
        mmbVar.f41017h = mmdVar;
        if (mmbVar.f41018i != -1) {
            mmbVar.f41017h.setId(0);
        }
        return mmbVar;
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public final void m4860e(mlx mlxVar) {
        if (this.f8187K.contains(mlxVar)) {
            return;
        }
        this.f8187K.add(mlxVar);
    }

    /* JADX INFO: renamed from: f */
    public final void m4861f(mmb mmbVar, boolean z) {
        int size = this.f8180D.size();
        if (mmbVar.f41016g != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        mmbVar.f41013d = size;
        this.f8180D.add(size, mmbVar);
        int size2 = this.f8180D.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((mmb) this.f8180D.get(i2)).f41013d == this.f8194a) {
                i = i2;
            }
            ((mmb) this.f8180D.get(i2)).f41013d = i2;
        }
        this.f8194a = i;
        mmd mmdVar = mmbVar.f41017h;
        mmdVar.setSelected(false);
        mmdVar.setActivated(false);
        mma mmaVar = this.f8195b;
        int i3 = mmbVar.f41013d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m4853s(layoutParams);
        mmaVar.addView(mmdVar, i3, layoutParams);
        if (z) {
            mmbVar.m16616a();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4862g() {
        for (int childCount = this.f8195b.getChildCount() - 1; childCount >= 0; childCount--) {
            mmd mmdVar = (mmd) this.f8195b.getChildAt(childCount);
            this.f8195b.removeViewAt(childCount);
            if (mmdVar != null) {
                mmdVar.m16620a(null);
                mmdVar.setSelected(false);
                this.f8192P.mo321b(mmdVar);
            }
            requestLayout();
        }
        Iterator it = this.f8180D.iterator();
        while (it.hasNext()) {
            mmb mmbVar = (mmb) it.next();
            it.remove();
            mmbVar.f41016g = null;
            mmbVar.f41017h = null;
            mmbVar.f41010a = null;
            mmbVar.f41018i = -1;
            mmbVar.f41011b = null;
            mmbVar.f41012c = null;
            mmbVar.f41013d = -1;
            mmbVar.f41014e = null;
            f8177C.mo321b(mmbVar);
        }
        this.f8181E = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX INFO: renamed from: h */
    public final void m4863h(mmb mmbVar) {
        m4864i(mmbVar, true);
    }

    /* JADX INFO: renamed from: i */
    public final void m4864i(mmb mmbVar, boolean z) {
        mmb mmbVar2 = this.f8181E;
        if (mmbVar2 == mmbVar) {
            if (mmbVar2 != null) {
                for (int size = this.f8187K.size() - 1; size >= 0; size--) {
                    ((mlx) this.f8187K.get(size)).mo5866c();
                }
                m4851q(mmbVar.f41013d);
                return;
            }
            return;
        }
        int i = mmbVar != null ? mmbVar.f41013d : -1;
        if (z) {
            if ((mmbVar2 == null || mmbVar2.f41013d == -1) && i != -1) {
                m4867l(i);
            } else {
                m4851q(i);
            }
            if (i != -1) {
                m4852r(i);
            }
        }
        this.f8181E = mmbVar;
        if (mmbVar2 != null && mmbVar2.f41016g != null) {
            for (int size2 = this.f8187K.size() - 1; size2 >= 0; size2--) {
                ((mlx) this.f8187K.get(size2)).mo5865b(mmbVar2);
            }
        }
        if (mmbVar != null) {
            for (int size3 = this.f8187K.size() - 1; size3 >= 0; size3--) {
                ((mlx) this.f8187K.get(size3)).mo5864a(mmbVar);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4865j(int i, float f, boolean z, boolean z2) {
        float f2 = i + f;
        int iRound = Math.round(f2);
        if (iRound < 0 || iRound >= this.f8195b.getChildCount()) {
            return;
        }
        if (z2) {
            mma mmaVar = this.f8195b;
            mmaVar.f41009b.f8194a = Math.round(f2);
            ValueAnimator valueAnimator = mmaVar.f41008a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                mmaVar.f41008a.cancel();
            }
            mmaVar.m16614c(mmaVar.getChildAt(i), mmaVar.getChildAt(i + 1), f);
        }
        ValueAnimator valueAnimator2 = this.f8189M;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f8189M.cancel();
        }
        scrollTo(i < 0 ? 0 : m4847m(i, f), 0);
        if (z) {
            m4852r(iRound);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4866k(boolean z) {
        for (int i = 0; i < this.f8195b.getChildCount(); i++) {
            View childAt = this.f8195b.getChildAt(i);
            childAt.setMinimumWidth(m4848n());
            m4853s((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4867l(int i) {
        m4865j(i, 0.0f, true, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mkv.m16545j(this);
        if (this.f8219z == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m4855u((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f8191O) {
            m4855u(null, false);
            this.f8191O = false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        mmd mmdVar;
        Drawable drawable;
        for (int i = 0; i < this.f8195b.getChildCount(); i++) {
            View childAt = this.f8195b.getChildAt(i);
            if ((childAt instanceof mmd) && (drawable = (mmdVar = (mmd) childAt).f41024c) != null) {
                drawable.setBounds(mmdVar.getLeft(), mmdVar.getTop(), mmdVar.getRight(), mmdVar.getBottom());
                mmdVar.f41024c.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        agt.m622a(accessibilityNodeInfo).m633k(bkn.m2549A(1, m4857b(), 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return m4854t() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        Context context = getContext();
        int size = this.f8180D.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
        }
        int iRound = Math.round(lij.m15399G(context, 48));
        switch (View.MeasureSpec.getMode(i2)) {
            case Integer.MIN_VALUE:
                if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
                    getChildAt(0).setMinimumHeight(iRound);
                }
                break;
            case 0:
                i2 = View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), 1073741824);
                break;
        }
        int size2 = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iM15399G = this.f8184H;
            if (iM15399G <= 0) {
                iM15399G = (int) (size2 - lij.m15399G(getContext(), 56));
            }
            this.f8209p = iM15399G;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            switch (this.f8213t) {
                case 0:
                case 2:
                    if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                        z = true;
                    }
                    break;
                case 1:
                    if (childAt.getMeasuredWidth() != getMeasuredWidth()) {
                        z = true;
                    }
                    break;
                default:
                    return;
            }
            if (z) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || m4854t()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        mkv.m16544i(this, f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.f8195b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        m4850p(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0151  */
    /* JADX WARN: Code duplicated, block: B:25:0x0157  */
    /* JADX WARN: Code duplicated, block: B:30:0x0185  */
    /* JADX WARN: Code duplicated, block: B:33:0x018f  */
    /* JADX WARN: Code duplicated, block: B:36:0x01a1 A[Catch: all -> 0x01c0, TRY_LEAVE, TryCatch #0 {all -> 0x01c0, blocks: (B:34:0x0195, B:36:0x01a1), top: B:71:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:49:0x0268 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x026d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0282  */
    /* JADX WARN: Code duplicated, block: B:58:0x0286  */
    /* JADX WARN: Code duplicated, block: B:60:0x0290  */
    /* JADX WARN: Code duplicated, block: B:63:0x0296  */
    /* JADX WARN: Code duplicated, block: B:64:0x029b  */
    /* JADX WARN: Code duplicated, block: B:65:0x02a0  */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        mkv mltVar;
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes;
        int i2;
        int i3;
        int iMax;
        TypedArray typedArrayObtainStyledAttributes2;
        ColorStateList colorStateListM16540d;
        super(mmp.m16632a(context, attributeSet, i, C0100R.style.Widget_Design_TabLayout), attributeSet, i);
        this.f8194a = -1;
        this.f8180D = new ArrayList();
        this.f8202i = -1;
        this.f8182F = 0;
        this.f8209p = Integer.MAX_VALUE;
        this.f8216w = -1;
        this.f8187K = new ArrayList();
        this.f8192P = new aee(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        mma mmaVar = new mma(this, context2);
        this.f8195b = mmaVar;
        super.addView(mmaVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayM16438a = mjb.m16438a(context2, attributeSet, mlv.f41000a, i, C0100R.style.Widget_Design_TabLayout, 24);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            mkx mkxVar = new mkx();
            mkxVar.m16579i(ColorStateList.valueOf(colorDrawable.getColor()));
            mkxVar.m16577g(context2);
            mkxVar.m16578h(afh.m470a(this));
            afb.m432m(this, mkxVar);
        }
        Drawable drawableM16541e = mkv.m16541e(context2, typedArrayM16438a, 5);
        Drawable drawableMutate = (drawableM16541e == null ? new GradientDrawable() : drawableM16541e).mutate();
        this.f8205l = drawableMutate;
        kxk.m15022o(drawableMutate, this.f8182F);
        int i4 = this.f8216w;
        mmaVar.m16613b(i4 == -1 ? this.f8205l.getIntrinsicHeight() : i4);
        int color = typedArrayM16438a.getColor(8, 0);
        this.f8182F = color;
        kxk.m15022o(this.f8205l, color);
        m4866k(false);
        mmaVar.m16613b(typedArrayM16438a.getDimensionPixelSize(11, -1));
        int i5 = typedArrayM16438a.getInt(10, 0);
        if (this.f8212s != i5) {
            this.f8212s = i5;
            afb.m426g(mmaVar);
        }
        int i6 = typedArrayM16438a.getInt(7, 0);
        switch (i6) {
            case 0:
                this.f8179B = new mkv();
                this.f8215v = typedArrayM16438a.getBoolean(9, true);
                mmaVar.m16612a();
                afb.m426g(mmaVar);
                int dimensionPixelSize = typedArrayM16438a.getDimensionPixelSize(16, 0);
                this.f8199f = dimensionPixelSize;
                this.f8198e = dimensionPixelSize;
                this.f8197d = dimensionPixelSize;
                this.f8196c = dimensionPixelSize;
                this.f8196c = typedArrayM16438a.getDimensionPixelSize(19, dimensionPixelSize);
                this.f8197d = typedArrayM16438a.getDimensionPixelSize(20, this.f8197d);
                this.f8198e = typedArrayM16438a.getDimensionPixelSize(18, this.f8198e);
                this.f8199f = typedArrayM16438a.getDimensionPixelSize(17, this.f8199f);
                if (mjb.m16441d(context2)) {
                    this.f8200g = C0100R.attr.textAppearanceTitleSmall;
                } else {
                    this.f8200g = C0100R.attr.textAppearanceButton;
                }
                resourceId = typedArrayM16438a.getResourceId(24, C0100R.style.TextAppearance_Design_Tab);
                this.f8201h = resourceId;
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, C0193fr.f23279w);
                try {
                    this.f8206m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
                    this.f8203j = mkv.m16540d(context2, typedArrayObtainStyledAttributes, 3);
                    typedArrayObtainStyledAttributes.recycle();
                    if (typedArrayM16438a.hasValue(22)) {
                        this.f8202i = typedArrayM16438a.getResourceId(22, resourceId);
                    }
                    i2 = this.f8202i;
                    if (i2 != -1) {
                        typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i2, C0193fr.f23279w);
                        try {
                            typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) this.f8206m);
                            colorStateListM16540d = mkv.m16540d(context2, typedArrayObtainStyledAttributes2, 3);
                            if (colorStateListM16540d != null) {
                                this.f8203j = m4849o(this.f8203j.getDefaultColor(), colorStateListM16540d.getColorForState(new int[]{R.attr.state_selected}, colorStateListM16540d.getDefaultColor()));
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                        } catch (Throwable th) {
                            typedArrayObtainStyledAttributes2.recycle();
                            throw th;
                        }
                        break;
                    }
                    if (typedArrayM16438a.hasValue(25)) {
                        this.f8203j = mkv.m16540d(context2, typedArrayM16438a, 25);
                    }
                    if (typedArrayM16438a.hasValue(23)) {
                        this.f8203j = m4849o(this.f8203j.getDefaultColor(), typedArrayM16438a.getColor(23, 0));
                    }
                    mkv.m16540d(context2, typedArrayM16438a, 3);
                    typedArrayM16438a.getInt(4, -1);
                    this.f8204k = mkv.m16540d(context2, typedArrayM16438a, 21);
                    this.f8211r = typedArrayM16438a.getInt(6, 300);
                    this.f8218y = lij.m15398F(context2, C0100R.attr.motionEasingEmphasizedInterpolator, mfs.f40384b);
                    this.f8183G = typedArrayM16438a.getDimensionPixelSize(14, -1);
                    this.f8184H = typedArrayM16438a.getDimensionPixelSize(13, -1);
                    this.f8208o = typedArrayM16438a.getResourceId(0, 0);
                    this.f8186J = typedArrayM16438a.getDimensionPixelSize(1, 0);
                    this.f8213t = typedArrayM16438a.getInt(15, 1);
                    this.f8210q = typedArrayM16438a.getInt(2, 0);
                    this.f8214u = typedArrayM16438a.getBoolean(12, false);
                    this.f8217x = typedArrayM16438a.getBoolean(26, false);
                    typedArrayM16438a.recycle();
                    Resources resources = getResources();
                    this.f8207n = resources.getDimensionPixelSize(C0100R.dimen.design_tab_text_size_2line);
                    this.f8185I = resources.getDimensionPixelSize(C0100R.dimen.design_tab_scrollable_min_width);
                    i3 = this.f8213t;
                    if (i3 != 0 || i3 == 2) {
                        iMax = Math.max(0, this.f8186J - this.f8196c);
                    } else {
                        iMax = 0;
                    }
                    afc.m449j(mmaVar, iMax, 0, 0, 0);
                    switch (this.f8213t) {
                        case 0:
                            switch (this.f8210q) {
                                case 0:
                                    Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                                    mmaVar.setGravity(8388611);
                                    break;
                                case 1:
                                    mmaVar.setGravity(1);
                                    break;
                                case 2:
                                    mmaVar.setGravity(8388611);
                                    break;
                            }
                            break;
                        case 1:
                        case 2:
                            if (this.f8210q == 2) {
                                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                            }
                            mmaVar.setGravity(1);
                            break;
                    }
                    m4866k(true);
                    return;
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
            case 1:
                mltVar = new mlt();
                this.f8179B = mltVar;
                this.f8215v = typedArrayM16438a.getBoolean(9, true);
                mmaVar.m16612a();
                afb.m426g(mmaVar);
                int dimensionPixelSize2 = typedArrayM16438a.getDimensionPixelSize(16, 0);
                this.f8199f = dimensionPixelSize2;
                this.f8198e = dimensionPixelSize2;
                this.f8197d = dimensionPixelSize2;
                this.f8196c = dimensionPixelSize2;
                this.f8196c = typedArrayM16438a.getDimensionPixelSize(19, dimensionPixelSize2);
                this.f8197d = typedArrayM16438a.getDimensionPixelSize(20, this.f8197d);
                this.f8198e = typedArrayM16438a.getDimensionPixelSize(18, this.f8198e);
                this.f8199f = typedArrayM16438a.getDimensionPixelSize(17, this.f8199f);
                if (mjb.m16441d(context2)) {
                    this.f8200g = C0100R.attr.textAppearanceTitleSmall;
                } else {
                    this.f8200g = C0100R.attr.textAppearanceButton;
                }
                resourceId = typedArrayM16438a.getResourceId(24, C0100R.style.TextAppearance_Design_Tab);
                this.f8201h = resourceId;
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, C0193fr.f23279w);
                this.f8206m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
                this.f8203j = mkv.m16540d(context2, typedArrayObtainStyledAttributes, 3);
                typedArrayObtainStyledAttributes.recycle();
                if (typedArrayM16438a.hasValue(22)) {
                    this.f8202i = typedArrayM16438a.getResourceId(22, resourceId);
                }
                i2 = this.f8202i;
                if (i2 != -1) {
                    typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i2, C0193fr.f23279w);
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) this.f8206m);
                    colorStateListM16540d = mkv.m16540d(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListM16540d != null) {
                        this.f8203j = m4849o(this.f8203j.getDefaultColor(), colorStateListM16540d.getColorForState(new int[]{R.attr.state_selected}, colorStateListM16540d.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
                if (typedArrayM16438a.hasValue(25)) {
                    this.f8203j = mkv.m16540d(context2, typedArrayM16438a, 25);
                }
                if (typedArrayM16438a.hasValue(23)) {
                    this.f8203j = m4849o(this.f8203j.getDefaultColor(), typedArrayM16438a.getColor(23, 0));
                }
                mkv.m16540d(context2, typedArrayM16438a, 3);
                typedArrayM16438a.getInt(4, -1);
                this.f8204k = mkv.m16540d(context2, typedArrayM16438a, 21);
                this.f8211r = typedArrayM16438a.getInt(6, 300);
                this.f8218y = lij.m15398F(context2, C0100R.attr.motionEasingEmphasizedInterpolator, mfs.f40384b);
                this.f8183G = typedArrayM16438a.getDimensionPixelSize(14, -1);
                this.f8184H = typedArrayM16438a.getDimensionPixelSize(13, -1);
                this.f8208o = typedArrayM16438a.getResourceId(0, 0);
                this.f8186J = typedArrayM16438a.getDimensionPixelSize(1, 0);
                this.f8213t = typedArrayM16438a.getInt(15, 1);
                this.f8210q = typedArrayM16438a.getInt(2, 0);
                this.f8214u = typedArrayM16438a.getBoolean(12, false);
                this.f8217x = typedArrayM16438a.getBoolean(26, false);
                typedArrayM16438a.recycle();
                Resources resources2 = getResources();
                this.f8207n = resources2.getDimensionPixelSize(C0100R.dimen.design_tab_text_size_2line);
                this.f8185I = resources2.getDimensionPixelSize(C0100R.dimen.design_tab_scrollable_min_width);
                i3 = this.f8213t;
                if (i3 != 0) {
                    iMax = Math.max(0, this.f8186J - this.f8196c);
                } else {
                    iMax = Math.max(0, this.f8186J - this.f8196c);
                }
                afc.m449j(mmaVar, iMax, 0, 0, 0);
                switch (this.f8213t) {
                    case 0:
                        switch (this.f8210q) {
                            case 0:
                                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                                mmaVar.setGravity(8388611);
                                break;
                            case 1:
                                mmaVar.setGravity(1);
                                break;
                            case 2:
                                mmaVar.setGravity(8388611);
                                break;
                        }
                        break;
                    case 1:
                    case 2:
                        if (this.f8210q == 2) {
                            Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                        }
                        mmaVar.setGravity(1);
                        break;
                }
                m4866k(true);
                return;
            case 2:
                mltVar = new mlu();
                this.f8179B = mltVar;
                this.f8215v = typedArrayM16438a.getBoolean(9, true);
                mmaVar.m16612a();
                afb.m426g(mmaVar);
                int dimensionPixelSize3 = typedArrayM16438a.getDimensionPixelSize(16, 0);
                this.f8199f = dimensionPixelSize3;
                this.f8198e = dimensionPixelSize3;
                this.f8197d = dimensionPixelSize3;
                this.f8196c = dimensionPixelSize3;
                this.f8196c = typedArrayM16438a.getDimensionPixelSize(19, dimensionPixelSize3);
                this.f8197d = typedArrayM16438a.getDimensionPixelSize(20, this.f8197d);
                this.f8198e = typedArrayM16438a.getDimensionPixelSize(18, this.f8198e);
                this.f8199f = typedArrayM16438a.getDimensionPixelSize(17, this.f8199f);
                if (mjb.m16441d(context2)) {
                    this.f8200g = C0100R.attr.textAppearanceTitleSmall;
                } else {
                    this.f8200g = C0100R.attr.textAppearanceButton;
                }
                resourceId = typedArrayM16438a.getResourceId(24, C0100R.style.TextAppearance_Design_Tab);
                this.f8201h = resourceId;
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, C0193fr.f23279w);
                this.f8206m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
                this.f8203j = mkv.m16540d(context2, typedArrayObtainStyledAttributes, 3);
                typedArrayObtainStyledAttributes.recycle();
                if (typedArrayM16438a.hasValue(22)) {
                    this.f8202i = typedArrayM16438a.getResourceId(22, resourceId);
                }
                i2 = this.f8202i;
                if (i2 != -1) {
                    typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i2, C0193fr.f23279w);
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) this.f8206m);
                    colorStateListM16540d = mkv.m16540d(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListM16540d != null) {
                        this.f8203j = m4849o(this.f8203j.getDefaultColor(), colorStateListM16540d.getColorForState(new int[]{R.attr.state_selected}, colorStateListM16540d.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
                if (typedArrayM16438a.hasValue(25)) {
                    this.f8203j = mkv.m16540d(context2, typedArrayM16438a, 25);
                }
                if (typedArrayM16438a.hasValue(23)) {
                    this.f8203j = m4849o(this.f8203j.getDefaultColor(), typedArrayM16438a.getColor(23, 0));
                }
                mkv.m16540d(context2, typedArrayM16438a, 3);
                typedArrayM16438a.getInt(4, -1);
                this.f8204k = mkv.m16540d(context2, typedArrayM16438a, 21);
                this.f8211r = typedArrayM16438a.getInt(6, 300);
                this.f8218y = lij.m15398F(context2, C0100R.attr.motionEasingEmphasizedInterpolator, mfs.f40384b);
                this.f8183G = typedArrayM16438a.getDimensionPixelSize(14, -1);
                this.f8184H = typedArrayM16438a.getDimensionPixelSize(13, -1);
                this.f8208o = typedArrayM16438a.getResourceId(0, 0);
                this.f8186J = typedArrayM16438a.getDimensionPixelSize(1, 0);
                this.f8213t = typedArrayM16438a.getInt(15, 1);
                this.f8210q = typedArrayM16438a.getInt(2, 0);
                this.f8214u = typedArrayM16438a.getBoolean(12, false);
                this.f8217x = typedArrayM16438a.getBoolean(26, false);
                typedArrayM16438a.recycle();
                Resources resources3 = getResources();
                this.f8207n = resources3.getDimensionPixelSize(C0100R.dimen.design_tab_text_size_2line);
                this.f8185I = resources3.getDimensionPixelSize(C0100R.dimen.design_tab_scrollable_min_width);
                i3 = this.f8213t;
                if (i3 != 0) {
                    iMax = Math.max(0, this.f8186J - this.f8196c);
                } else {
                    iMax = Math.max(0, this.f8186J - this.f8196c);
                }
                afc.m449j(mmaVar, iMax, 0, 0, 0);
                switch (this.f8213t) {
                    case 0:
                        switch (this.f8210q) {
                            case 0:
                                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                                mmaVar.setGravity(8388611);
                                break;
                            case 1:
                                mmaVar.setGravity(1);
                                break;
                            case 2:
                                mmaVar.setGravity(8388611);
                                break;
                        }
                        break;
                    case 1:
                    case 2:
                        if (this.f8210q == 2) {
                            Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                        }
                        mmaVar.setGravity(1);
                        break;
                }
                m4866k(true);
                return;
            default:
                throw new IllegalArgumentException(i6 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m4853s(LinearLayout.LayoutParams layoutParams) {
        if (this.f8213t == 1 && this.f8210q == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m4850p(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m4850p(view);
    }
}
