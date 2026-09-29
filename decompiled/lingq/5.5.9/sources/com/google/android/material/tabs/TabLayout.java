package com.google.android.material.tabs;

import ae.C0062b;
import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0309e1;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.C2947a;
import gd.C5768g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import md.C7542a;
import p024b3.C1304k;
import p058d.C4999a;
import p072dd.C5149b;
import p072dd.C5150c;
import p081e0.C5339u;
import p093ed.C5397a;
import p104f.C5452a;
import p153hc.C6031a;
import p177ic.C6308a;
import p222kd.C6660a;
import p222kd.C6661b;
import p222kd.C6662c;
import p254m2.C7472a;
import p329q2.C8488a;
import p446w2.C9807e;
import p471x2.C10029b0;
import p471x2.C10040h;
import p471x2.C10049l0;
import p471x2.C10068v;
import p497y2.C10284f;
import p499y4.AbstractC10290a;
import p507yc.C10344k;
import p507yc.C10347n;
import p531zc.C10477a;

/* JADX INFO: loaded from: classes.dex */
@ViewPager.InterfaceC1204d
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: u0 */
    public static final C9807e f15609u0 = new C9807e(16);

    /* JADX INFO: renamed from: H */
    public ColorStateList f15610H;

    /* JADX INFO: renamed from: I */
    public ColorStateList f15611I;

    /* JADX INFO: renamed from: J */
    public Drawable f15612J;

    /* JADX INFO: renamed from: K */
    public int f15613K;

    /* JADX INFO: renamed from: L */
    public final PorterDuff.Mode f15614L;

    /* JADX INFO: renamed from: M */
    public final float f15615M;

    /* JADX INFO: renamed from: N */
    public final float f15616N;

    /* JADX INFO: renamed from: O */
    public final int f15617O;

    /* JADX INFO: renamed from: P */
    public int f15618P;

    /* JADX INFO: renamed from: Q */
    public final int f15619Q;

    /* JADX INFO: renamed from: R */
    public final int f15620R;

    /* JADX INFO: renamed from: S */
    public final int f15621S;

    /* JADX INFO: renamed from: T */
    public final int f15622T;

    /* JADX INFO: renamed from: U */
    public int f15623U;

    /* JADX INFO: renamed from: V */
    public final int f15624V;

    /* JADX INFO: renamed from: W */
    public int f15625W;

    /* JADX INFO: renamed from: a */
    public int f15626a;

    /* JADX INFO: renamed from: a0 */
    public int f15627a0;

    /* JADX INFO: renamed from: b */
    public final ArrayList<C3076g> f15628b;

    /* JADX INFO: renamed from: b0 */
    public boolean f15629b0;

    /* JADX INFO: renamed from: c */
    public C3076g f15630c;

    /* JADX INFO: renamed from: c0 */
    public boolean f15631c0;

    /* JADX INFO: renamed from: d */
    public final C3075f f15632d;

    /* JADX INFO: renamed from: d0 */
    public int f15633d0;

    /* JADX INFO: renamed from: e */
    public final int f15634e;

    /* JADX INFO: renamed from: e0 */
    public int f15635e0;

    /* JADX INFO: renamed from: f */
    public final int f15636f;

    /* JADX INFO: renamed from: f0 */
    public boolean f15637f0;

    /* JADX INFO: renamed from: g */
    public final int f15638g;

    /* JADX INFO: renamed from: g0 */
    public C3080a f15639g0;

    /* JADX INFO: renamed from: h */
    public final int f15640h;

    /* JADX INFO: renamed from: h0 */
    public final TimeInterpolator f15641h0;

    /* JADX INFO: renamed from: i */
    public final int f15642i;

    /* JADX INFO: renamed from: i0 */
    public InterfaceC3072c f15643i0;

    /* JADX INFO: renamed from: j */
    public final int f15644j;

    /* JADX INFO: renamed from: j0 */
    public final ArrayList<InterfaceC3072c> f15645j0;

    /* JADX INFO: renamed from: k */
    public final int f15646k;

    /* JADX INFO: renamed from: k0 */
    public C3079j f15647k0;

    /* JADX INFO: renamed from: l */
    public ColorStateList f15648l;

    /* JADX INFO: renamed from: l0 */
    public ValueAnimator f15649l0;

    /* JADX INFO: renamed from: m0 */
    public ViewPager f15650m0;

    /* JADX INFO: renamed from: n0 */
    public AbstractC10290a f15651n0;

    /* JADX INFO: renamed from: o0 */
    public C3074e f15652o0;

    /* JADX INFO: renamed from: p0 */
    public C3077h f15653p0;

    /* JADX INFO: renamed from: q0 */
    public C3071b f15654q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f15655r0;

    /* JADX INFO: renamed from: s0 */
    public int f15656s0;

    /* JADX INFO: renamed from: t0 */
    public final C5339u f15657t0;

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$a */
    public class C3070a implements ValueAnimator.AnimatorUpdateListener {
        public C3070a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$b */
    public class C3071b implements ViewPager.InterfaceC1208h {

        /* JADX INFO: renamed from: a */
        public boolean f15659a;

        public C3071b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1208h
        /* JADX INFO: renamed from: a */
        public final void mo4662a(ViewPager viewPager, AbstractC10290a abstractC10290a) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f15650m0 == viewPager) {
                tabLayout.m8864n(abstractC10290a, this.f15659a);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$c */
    @Deprecated
    public interface InterfaceC3072c<T extends C3076g> {
        /* JADX INFO: renamed from: a */
        void mo6541a();

        /* JADX INFO: renamed from: b */
        void mo6542b(T t10);

        /* JADX INFO: renamed from: c */
        void mo6543c(T t10);
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$d */
    public interface InterfaceC3073d extends InterfaceC3072c<C3076g> {
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$e */
    public class C3074e extends DataSetObserver {
        public C3074e() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.m8861k();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.m8861k();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$f */
    public class C3075f extends LinearLayout {

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int f15662c = 0;

        /* JADX INFO: renamed from: a */
        public ValueAnimator f15663a;

        public C3075f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        /* JADX INFO: renamed from: a */
        public final void m8868a(int i10) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f15656s0 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i10);
                C3080a c3080a = tabLayout.f15639g0;
                Drawable drawable = tabLayout.f15612J;
                c3080a.getClass();
                RectF rectFM8879a = C3080a.m8879a(tabLayout, childAt);
                drawable.setBounds((int) rectFM8879a.left, drawable.getBounds().top, (int) rectFM8879a.right, drawable.getBounds().bottom);
                tabLayout.f15626a = i10;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m8869b(int i10) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.f15612J.getBounds();
            tabLayout.f15612J.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        /* JADX INFO: renamed from: c */
        public final void m8870c(View view, View view2, float f3) {
            if (view != null && view.getWidth() > 0) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.f15639g0.mo8880b(tabLayout, view, view2, f3, tabLayout.f15612J);
            } else {
                TabLayout tabLayout2 = TabLayout.this;
                Drawable drawable = tabLayout2.f15612J;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout2.f15612J.getBounds().bottom);
            }
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18674k(this);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: d */
        public final void m8871d(int i10, int i11, boolean z10) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f15626a == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                m8868a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.f15626a = i10;
            C3081b c3081b = new C3081b(this, childAt, childAt2);
            if (!z10) {
                this.f15663a.removeAllUpdateListeners();
                this.f15663a.addUpdateListener(c3081b);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f15663a = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.f15641h0);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(c3081b);
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int iHeight = tabLayout.f15612J.getBounds().height();
            if (iHeight < 0) {
                iHeight = tabLayout.f15612J.getIntrinsicHeight();
            }
            int i10 = tabLayout.f15625W;
            if (i10 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i10 != 1) {
                height = 0;
                if (i10 != 2) {
                    iHeight = i10 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (tabLayout.f15612J.getBounds().width() > 0) {
                Rect bounds = tabLayout.f15612J.getBounds();
                tabLayout.f15612J.setBounds(bounds.left, height, bounds.right, iHeight);
                tabLayout.f15612J.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f15663a;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                m8871d(tabLayout.getSelectedTabPosition(), -1, false);
                return;
            }
            if (tabLayout.f15626a == -1) {
                tabLayout.f15626a = tabLayout.getSelectedTabPosition();
            }
            m8868a(tabLayout.f15626a);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.f15623U != 1 && tabLayout.f15627a0 != 2) {
                return;
            }
            int childCount = getChildCount();
            int iMax = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) C10347n.m19362b(16, getContext())) * 2)) {
                boolean z11 = false;
                for (int i13 = 0; i13 < childCount; i13++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z11 = true;
                    }
                }
                z10 = z11;
            } else {
                tabLayout.f15623U = 0;
                tabLayout.m8867q(false);
            }
            if (z10) {
                super.onMeasure(i10, i11);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C3076g {

        /* JADX INFO: renamed from: a */
        public Drawable f15665a;

        /* JADX INFO: renamed from: b */
        public CharSequence f15666b;

        /* JADX INFO: renamed from: c */
        public CharSequence f15667c;

        /* JADX INFO: renamed from: e */
        public View f15669e;

        /* JADX INFO: renamed from: g */
        public TabLayout f15671g;

        /* JADX INFO: renamed from: h */
        public C3078i f15672h;

        /* JADX INFO: renamed from: d */
        public int f15668d = -1;

        /* JADX INFO: renamed from: f */
        public final int f15670f = 1;

        /* JADX INFO: renamed from: i */
        public int f15673i = -1;
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$h */
    public static class C3077h implements ViewPager.InterfaceC1209i {

        /* JADX INFO: renamed from: a */
        public final WeakReference<TabLayout> f15674a;

        /* JADX INFO: renamed from: b */
        public int f15675b;

        /* JADX INFO: renamed from: c */
        public int f15676c;

        public C3077h(TabLayout tabLayout) {
            this.f15674a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1209i
        /* JADX INFO: renamed from: a */
        public final void mo4663a(float f3, int i10) {
            TabLayout tabLayout = this.f15674a.get();
            if (tabLayout != null) {
                int i11 = this.f15676c;
                tabLayout.m8865o(i10, f3, i11 != 2 || this.f15675b == 1, (i11 == 2 && this.f15675b == 0) ? false : true, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1209i
        /* JADX INFO: renamed from: b */
        public final void mo4664b(int i10) {
            this.f15675b = this.f15676c;
            this.f15676c = i10;
            TabLayout tabLayout = this.f15674a.get();
            if (tabLayout != null) {
                tabLayout.f15656s0 = this.f15676c;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1209i
        /* JADX INFO: renamed from: c */
        public final void mo4665c(int i10) {
            TabLayout tabLayout = this.f15674a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f15676c;
            tabLayout.m8863m(tabLayout.m8859i(i10), i11 == 0 || (i11 == 2 && this.f15675b == 0));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$i */
    public final class C3078i extends LinearLayout {

        /* JADX INFO: renamed from: l */
        public static final /* synthetic */ int f15677l = 0;

        /* JADX INFO: renamed from: a */
        public C3076g f15678a;

        /* JADX INFO: renamed from: b */
        public TextView f15679b;

        /* JADX INFO: renamed from: c */
        public ImageView f15680c;

        /* JADX INFO: renamed from: d */
        public View f15681d;

        /* JADX INFO: renamed from: e */
        public C2947a f15682e;

        /* JADX INFO: renamed from: f */
        public View f15683f;

        /* JADX INFO: renamed from: g */
        public TextView f15684g;

        /* JADX INFO: renamed from: h */
        public ImageView f15685h;

        /* JADX INFO: renamed from: i */
        public Drawable f15686i;

        /* JADX INFO: renamed from: j */
        public int f15687j;

        public C3078i(Context context) {
            super(context);
            this.f15687j = 2;
            m8876e(context);
            int i10 = TabLayout.this.f15634e;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.e.m18693k(this, i10, TabLayout.this.f15636f, TabLayout.this.f15638g, TabLayout.this.f15640h);
            setGravity(17);
            setOrientation(!TabLayout.this.f15629b0 ? 1 : 0);
            setClickable(true);
            C10029b0.k.m18740d(this, C10068v.m18914b(getContext(), 1002));
        }

        private C2947a getBadge() {
            return this.f15682e;
        }

        private C2947a getOrCreateBadge() {
            if (this.f15682e == null) {
                this.f15682e = new C2947a(getContext(), null);
            }
            m8873b();
            C2947a c2947a = this.f15682e;
            if (c2947a != null) {
                return c2947a;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* JADX INFO: renamed from: a */
        public final void m8872a() {
            if (this.f15682e != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f15681d;
                if (view != null) {
                    C2947a c2947a = this.f15682e;
                    if (c2947a != null) {
                        if (c2947a.m8575d() != null) {
                            c2947a.m8575d().setForeground(null);
                        } else {
                            view.getOverlay().remove(c2947a);
                        }
                    }
                    this.f15681d = null;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m8873b() {
            C3076g c3076g;
            C3076g c3076g2;
            if (this.f15682e != null) {
                if (this.f15683f != null) {
                    m8872a();
                    return;
                }
                ImageView imageView = this.f15680c;
                if (imageView == null || (c3076g2 = this.f15678a) == null || c3076g2.f15665a == null) {
                    TextView textView = this.f15679b;
                    if (textView == null || (c3076g = this.f15678a) == null || c3076g.f15670f != 1) {
                        m8872a();
                    } else {
                        if (this.f15681d == textView) {
                            m8874c(textView);
                            return;
                        }
                        m8872a();
                        TextView textView2 = this.f15679b;
                        if (!(this.f15682e != null)) {
                            return;
                        }
                        if (textView2 != null) {
                            setClipChildren(false);
                            setClipToPadding(false);
                            ViewGroup viewGroup = (ViewGroup) getParent();
                            if (viewGroup != null) {
                                viewGroup.setClipChildren(false);
                                viewGroup.setClipToPadding(false);
                            }
                            C2947a c2947a = this.f15682e;
                            Rect rect = new Rect();
                            textView2.getDrawingRect(rect);
                            c2947a.setBounds(rect);
                            c2947a.m8579h(textView2, null);
                            if (c2947a.m8575d() != null) {
                                c2947a.m8575d().setForeground(c2947a);
                            } else {
                                textView2.getOverlay().add(c2947a);
                            }
                            this.f15681d = textView2;
                        }
                    }
                } else {
                    if (this.f15681d == imageView) {
                        m8874c(imageView);
                        return;
                    }
                    m8872a();
                    ImageView imageView2 = this.f15680c;
                    if (!(this.f15682e != null)) {
                        return;
                    }
                    if (imageView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup2 = (ViewGroup) getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.setClipChildren(false);
                            viewGroup2.setClipToPadding(false);
                        }
                        C2947a c2947a2 = this.f15682e;
                        Rect rect2 = new Rect();
                        imageView2.getDrawingRect(rect2);
                        c2947a2.setBounds(rect2);
                        c2947a2.m8579h(imageView2, null);
                        if (c2947a2.m8575d() != null) {
                            c2947a2.m8575d().setForeground(c2947a2);
                        } else {
                            imageView2.getOverlay().add(c2947a2);
                        }
                        this.f15681d = imageView2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m8874c(View view) {
            C2947a c2947a = this.f15682e;
            if ((c2947a != null) && view == this.f15681d) {
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                c2947a.setBounds(rect);
                c2947a.m8579h(view, null);
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0033  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: d */
        public final void m8875d() {
            m8877f();
            C3076g c3076g = this.f15678a;
            boolean z10 = false;
            if (c3076g != null) {
                TabLayout tabLayout = c3076g.f15671g;
                if (tabLayout == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == c3076g.f15668d) {
                    z10 = true;
                }
            }
            setSelected(z10);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f15686i;
            boolean state = false;
            if (drawable != null && drawable.isStateful()) {
                state = false | this.f15686i.setState(drawableState);
            }
            if (state) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m8876e(Context context) {
            GradientDrawable gradientDrawable;
            TabLayout tabLayout = TabLayout.this;
            int i10 = tabLayout.f15617O;
            GradientDrawable gradientDrawable2 = null;
            if (i10 != 0) {
                Drawable drawableM11672a = C5452a.m11672a(context, i10);
                this.f15686i = drawableM11672a;
                if (drawableM11672a != null && drawableM11672a.isStateful()) {
                    this.f15686i.setState(getDrawableState());
                }
            } else {
                this.f15686i = null;
            }
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setColor(0);
            Drawable rippleDrawable = gradientDrawable3;
            if (tabLayout.f15611I != null) {
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setCornerRadius(1.0E-5f);
                gradientDrawable4.setColor(-1);
                ColorStateList colorStateListM11559a = C5397a.m11559a(tabLayout.f15611I);
                boolean z10 = tabLayout.f15637f0;
                if (z10) {
                    gradientDrawable = gradientDrawable3;
                    gradientDrawable = null;
                }
                if (!z10) {
                    gradientDrawable2 = gradientDrawable4;
                }
                rippleDrawable = new RippleDrawable(colorStateListM11559a, gradientDrawable, gradientDrawable2);
            }
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18680q(this, rippleDrawable);
            tabLayout.invalidate();
        }

        /* JADX INFO: renamed from: f */
        public final void m8877f() {
            int i10;
            ViewParent parent;
            C3076g c3076g = this.f15678a;
            View view = c3076g != null ? c3076g.f15669e : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f15683f;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f15683f);
                    }
                    addView(view);
                }
                this.f15683f = view;
                TextView textView = this.f15679b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f15680c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f15680c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.f15684g = textView2;
                if (textView2 != null) {
                    this.f15687j = C1304k.a.m4834b(textView2);
                }
                this.f15685h = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view3 = this.f15683f;
                if (view3 != null) {
                    removeView(view3);
                    this.f15683f = null;
                }
                this.f15684g = null;
                this.f15685h = null;
            }
            if (this.f15683f == null) {
                if (this.f15680c == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.linguist.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f15680c = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f15679b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.linguist.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f15679b = textView3;
                    addView(textView3);
                    this.f15687j = C1304k.a.m4834b(this.f15679b);
                }
                TextView textView4 = this.f15679b;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.f15642i);
                if (!isSelected() || (i10 = tabLayout.f15646k) == -1) {
                    this.f15679b.setTextAppearance(tabLayout.f15644j);
                } else {
                    this.f15679b.setTextAppearance(i10);
                }
                ColorStateList colorStateList = tabLayout.f15648l;
                if (colorStateList != null) {
                    this.f15679b.setTextColor(colorStateList);
                }
                m8878g(this.f15679b, this.f15680c, true);
                m8873b();
                ImageView imageView3 = this.f15680c;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3082c(this, imageView3));
                }
                TextView textView5 = this.f15679b;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3082c(this, textView5));
                }
            } else {
                TextView textView6 = this.f15684g;
                if (textView6 != null || this.f15685h != null) {
                    m8878g(textView6, this.f15685h, false);
                }
            }
            if (c3076g == null || TextUtils.isEmpty(c3076g.f15667c)) {
                return;
            }
            setContentDescription(c3076g.f15667c);
        }

        /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:67:0x00de  */
        /* JADX WARN: Code duplicated, block: B:68:0x00e0  */
        /* JADX INFO: renamed from: g */
        public final void m8878g(TextView textView, ImageView imageView, boolean z10) {
            boolean z11;
            CharSequence charSequence;
            Drawable drawable;
            C3076g c3076g = this.f15678a;
            Drawable drawableMutate = (c3076g == null || (drawable = c3076g.f15665a) == null) ? null : drawable.mutate();
            TabLayout tabLayout = TabLayout.this;
            if (drawableMutate != null) {
                C8488a.b.m16570h(drawableMutate, tabLayout.f15610H);
                PorterDuff.Mode mode = tabLayout.f15614L;
                if (mode != null) {
                    C8488a.b.m16571i(drawableMutate, mode);
                }
            }
            C3076g c3076g2 = this.f15678a;
            CharSequence charSequence2 = c3076g2 != null ? c3076g2.f15666b : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z12 = !TextUtils.isEmpty(charSequence2);
            if (textView != null) {
                z11 = z12 && this.f15678a.f15670f == 1;
                textView.setText(z12 ? charSequence2 : null);
                textView.setVisibility(z11 ? 0 : 8);
                if (z12) {
                    setVisibility(0);
                }
                if (!z10 && imageView != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                    int iM19362b = (z11 && imageView.getVisibility() == 0) ? (int) C10347n.m19362b(8, getContext()) : 0;
                    if (tabLayout.f15629b0) {
                        if (iM19362b != C10040h.m18808b(marginLayoutParams)) {
                            C10040h.m18813g(marginLayoutParams, iM19362b);
                            marginLayoutParams.bottomMargin = 0;
                            imageView.setLayoutParams(marginLayoutParams);
                            imageView.requestLayout();
                        }
                    } else if (iM19362b != marginLayoutParams.bottomMargin) {
                        marginLayoutParams.bottomMargin = iM19362b;
                        C10040h.m18813g(marginLayoutParams, 0);
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                }
                C3076g c3076g3 = this.f15678a;
                charSequence = c3076g3 != null ? c3076g3.f15667c : null;
                if (z12) {
                    charSequence2 = charSequence;
                }
                C0309e1.m1185a(this, charSequence2);
            }
            z11 = false;
            if (!z10) {
            }
            C3076g c3076g4 = this.f15678a;
            if (c3076g4 != null) {
            }
            if (z12) {
                charSequence2 = charSequence;
            }
            C0309e1.m1185a(this, charSequence2);
        }

        public int getContentHeight() {
            View[] viewArr = {this.f15679b, this.f15680c, this.f15683f};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z10 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f15679b, this.f15680c, this.f15683f};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z10 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        public C3076g getTab() {
            return this.f15678a;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            C2947a c2947a = this.f15682e;
            if (c2947a != null && c2947a.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f15682e.m8574c()));
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C10284f.c.m19275a(0, 1, this.f15678a.f15668d, 1, isSelected()).f51760a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C10284f.a.f51742e.f51755a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.linguist.R.string.item_view_role_description));
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00af  */
        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i10, int i11) {
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(tabLayout.f15618P, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f15679b != null) {
                float f3 = tabLayout.f15615M;
                int i12 = this.f15687j;
                ImageView imageView = this.f15680c;
                boolean z10 = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f15679b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f3 = tabLayout.f15616N;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f15679b.getTextSize();
                int lineCount = this.f15679b.getLineCount();
                int iM4834b = C1304k.a.m4834b(this.f15679b);
                if (f3 != textSize || (iM4834b >= 0 && i12 != iM4834b)) {
                    if (tabLayout.f15627a0 == 1 && f3 > textSize && lineCount == 1) {
                        Layout layout = this.f15679b.getLayout();
                        if (layout != null) {
                            if ((f3 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        this.f15679b.setTextSize(0, f3);
                        this.f15679b.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f15678a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            C3076g c3076g = this.f15678a;
            TabLayout tabLayout = c3076g.f15671g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.m8863m(c3076g, true);
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            if (isSelected() != z10) {
            }
            super.setSelected(z10);
            TextView textView = this.f15679b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f15680c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f15683f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(C3076g c3076g) {
            if (c3076g != this.f15678a) {
                this.f15678a = c3076g;
                m8875d();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$j */
    public static class C3079j implements InterfaceC3073d {

        /* JADX INFO: renamed from: a */
        public final ViewPager f15689a;

        public C3079j(ViewPager viewPager) {
            this.f15689a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC3072c
        /* JADX INFO: renamed from: a */
        public final void mo6541a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC3072c
        /* JADX INFO: renamed from: b */
        public final void mo6542b(C3076g c3076g) {
            this.f15689a.setCurrentItem(c3076g.f15668d);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC3072c
        /* JADX INFO: renamed from: c */
        public final void mo6543c(C3076g c3076g) {
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public TabLayout(Context context, AttributeSet attributeSet) {
        super(C7542a.m15048a(context, attributeSet, com.linguist.R.attr.tabStyle, com.linguist.R.style.Widget_Design_TabLayout), attributeSet, com.linguist.R.attr.tabStyle);
        this.f15626a = -1;
        this.f15628b = new ArrayList<>();
        this.f15646k = -1;
        this.f15613K = 0;
        this.f15618P = Integer.MAX_VALUE;
        this.f15633d0 = -1;
        this.f15645j0 = new ArrayList<>();
        this.f15657t0 = new C5339u(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C3075f c3075f = new C3075f(context2);
        this.f15632d = c3075f;
        super.addView(c3075f, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayM19357d = C10344k.m19357d(context2, attributeSet, C6031a.f35645N, com.linguist.R.attr.tabStyle, com.linguist.R.style.Widget_Design_TabLayout, 24);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C5768g c5768g = new C5768g();
            c5768g.m12141m(ColorStateList.valueOf(colorDrawable.getColor()));
            c5768g.m12138j(context2);
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            c5768g.m12140l(C10029b0.i.m18715i(this));
            C10029b0.d.m18680q(this, c5768g);
        }
        setSelectedTabIndicator(C5150c.m10928d(context2, typedArrayM19357d, 5));
        setSelectedTabIndicatorColor(typedArrayM19357d.getColor(8, 0));
        c3075f.m8869b(typedArrayM19357d.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayM19357d.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayM19357d.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayM19357d.getBoolean(9, true));
        int dimensionPixelSize = typedArrayM19357d.getDimensionPixelSize(16, 0);
        this.f15640h = dimensionPixelSize;
        this.f15638g = dimensionPixelSize;
        this.f15636f = dimensionPixelSize;
        this.f15634e = dimensionPixelSize;
        this.f15634e = typedArrayM19357d.getDimensionPixelSize(19, dimensionPixelSize);
        this.f15636f = typedArrayM19357d.getDimensionPixelSize(20, dimensionPixelSize);
        this.f15638g = typedArrayM19357d.getDimensionPixelSize(18, dimensionPixelSize);
        this.f15640h = typedArrayM19357d.getDimensionPixelSize(17, dimensionPixelSize);
        if (C5149b.m10923b(context2, com.linguist.R.attr.isMaterial3Theme, false)) {
            this.f15642i = com.linguist.R.attr.textAppearanceTitleSmall;
        } else {
            this.f15642i = com.linguist.R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayM19357d.getResourceId(24, com.linguist.R.style.TextAppearance_Design_Tab);
        this.f15644j = resourceId;
        int[] iArr = C4999a.f32610x;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f15615M = dimensionPixelSize2;
            this.f15648l = C5150c.m10925a(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayM19357d.hasValue(22)) {
                this.f15646k = typedArrayM19357d.getResourceId(22, resourceId);
            }
            int i10 = this.f15646k;
            if (i10 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i10, iArr);
                try {
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListM10925a = C5150c.m10925a(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListM10925a != null) {
                        this.f15648l = m8851g(this.f15648l.getDefaultColor(), colorStateListM10925a.getColorForState(new int[]{R.attr.state_selected}, colorStateListM10925a.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th2;
                }
            }
            if (typedArrayM19357d.hasValue(25)) {
                this.f15648l = C5150c.m10925a(context2, typedArrayM19357d, 25);
            }
            if (typedArrayM19357d.hasValue(23)) {
                this.f15648l = m8851g(this.f15648l.getDefaultColor(), typedArrayM19357d.getColor(23, 0));
            }
            this.f15610H = C5150c.m10925a(context2, typedArrayM19357d, 3);
            this.f15614L = C10347n.m19366f(typedArrayM19357d.getInt(4, -1), null);
            this.f15611I = C5150c.m10925a(context2, typedArrayM19357d, 21);
            this.f15624V = typedArrayM19357d.getInt(6, 300);
            this.f15641h0 = C10477a.m19429d(context2, com.linguist.R.attr.motionEasingEmphasizedInterpolator, C6308a.f36524b);
            this.f15619Q = typedArrayM19357d.getDimensionPixelSize(14, -1);
            this.f15620R = typedArrayM19357d.getDimensionPixelSize(13, -1);
            this.f15617O = typedArrayM19357d.getResourceId(0, 0);
            this.f15622T = typedArrayM19357d.getDimensionPixelSize(1, 0);
            this.f15627a0 = typedArrayM19357d.getInt(15, 1);
            this.f15623U = typedArrayM19357d.getInt(2, 0);
            this.f15629b0 = typedArrayM19357d.getBoolean(12, false);
            this.f15637f0 = typedArrayM19357d.getBoolean(26, false);
            typedArrayM19357d.recycle();
            Resources resources = getResources();
            this.f15616N = resources.getDimensionPixelSize(com.linguist.R.dimen.design_tab_text_size_2line);
            this.f15621S = resources.getDimensionPixelSize(com.linguist.R.dimen.design_tab_scrollable_min_width);
            m8856e();
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: g */
    public static ColorStateList m8851g(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private int getDefaultHeight() {
        ArrayList<C3076g> arrayList = this.f15628b;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C3076g c3076g = arrayList.get(i10);
            if (c3076g != null && c3076g.f15665a != null && !TextUtils.isEmpty(c3076g.f15666b)) {
                z10 = true;
                break;
            }
        }
        return (!z10 || this.f15629b0) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i10 = this.f15619Q;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f15627a0;
        if (i11 != 0 && i11 != 2) {
            return 0;
        }
        return this.f15621S;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f15632d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    /* JADX WARN: Code duplicated, block: B:26:0x003f  */
    /* JADX WARN: Code duplicated, block: B:41:0x005a A[SYNTHETIC] */
    private void setSelectedTabView(int i10) {
        boolean z10;
        C3075f c3075f = this.f15632d;
        int childCount = c3075f.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = c3075f.getChildAt(i11);
                boolean z11 = true;
                if (i11 == i10 && !childAt.isSelected()) {
                    if (i11 == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    childAt.setSelected(z10);
                    if (i11 == i10) {
                        z11 = false;
                    }
                    childAt.setActivated(z11);
                    if (childAt instanceof C3078i) {
                        ((C3078i) childAt).m8877f();
                    }
                } else if (i11 == i10 || !childAt.isSelected()) {
                    childAt.setSelected(i11 == i10);
                    if (i11 != i10) {
                        z11 = false;
                    }
                    childAt.setActivated(z11);
                } else {
                    if (i11 == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    childAt.setSelected(z10);
                    if (i11 == i10) {
                        z11 = false;
                    }
                    childAt.setActivated(z11);
                    if (childAt instanceof C3078i) {
                        ((C3078i) childAt).m8877f();
                    }
                }
                i11++;
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public final void m8852a(InterfaceC3072c interfaceC3072c) {
        ArrayList<InterfaceC3072c> arrayList = this.f15645j0;
        if (!arrayList.contains(interfaceC3072c)) {
            arrayList.add(interfaceC3072c);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        m8854c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10) {
        m8854c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        m8854c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m8854c(view);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b */
    public final void m8853b(C3076g c3076g, boolean z10) {
        ArrayList<C3076g> arrayList = this.f15628b;
        int size = arrayList.size();
        if (c3076g.f15671g != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        c3076g.f15668d = size;
        arrayList.add(size, c3076g);
        int size2 = arrayList.size();
        int i10 = -1;
        for (int i11 = size + 1; i11 < size2; i11++) {
            if (arrayList.get(i11).f15668d == this.f15626a) {
                i10 = i11;
            }
            arrayList.get(i11).f15668d = i11;
        }
        this.f15626a = i10;
        C3078i c3078i = c3076g.f15672h;
        c3078i.setSelected(false);
        c3078i.setActivated(false);
        int i12 = c3076g.f15668d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f15627a0 == 1 && this.f15623U == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f15632d.addView(c3078i, i12, layoutParams);
        if (z10) {
            TabLayout tabLayout = c3076g.f15671g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.m8863m(c3076g, true);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m8854c(View view) {
        if (!(view instanceof C6662c)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        C6662c c6662c = (C6662c) view;
        C3076g c3076gM8860j = m8860j();
        c6662c.getClass();
        if (!TextUtils.isEmpty(c6662c.getContentDescription())) {
            c3076gM8860j.f15667c = c6662c.getContentDescription();
            C3078i c3078i = c3076gM8860j.f15672h;
            if (c3078i != null) {
                c3078i.m8875d();
            }
        }
        m8853b(c3076gM8860j, this.f15628b.isEmpty());
    }

    /* JADX INFO: renamed from: d */
    public final void m8855d(int i10) {
        boolean z10;
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.g.m18699c(this)) {
                C3075f c3075f = this.f15632d;
                int childCount = c3075f.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        z10 = false;
                        break;
                    } else {
                        if (c3075f.getChildAt(i11).getWidth() <= 0) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    }
                }
                if (!z10) {
                    int scrollX = getScrollX();
                    int iM8857f = m8857f(i10, 0.0f);
                    if (scrollX != iM8857f) {
                        m8858h();
                        this.f15649l0.setIntValues(scrollX, iM8857f);
                        this.f15649l0.start();
                    }
                    ValueAnimator valueAnimator = c3075f.f15663a;
                    if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f15626a != i10) {
                        c3075f.f15663a.cancel();
                    }
                    c3075f.m8871d(i10, this.f15624V, true);
                    return;
                }
            }
        }
        m8865o(i10, 0.0f, true, true, true);
    }

    /* JADX INFO: renamed from: e */
    public final void m8856e() {
        int i10 = this.f15627a0;
        int iMax = (i10 == 0 || i10 == 2) ? Math.max(0, this.f15622T - this.f15634e) : 0;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C3075f c3075f = this.f15632d;
        C10029b0.e.m18693k(c3075f, iMax, 0, 0, 0);
        int i11 = this.f15627a0;
        if (i11 == 0) {
            int i12 = this.f15623U;
            if (i12 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i12 == 1) {
                c3075f.setGravity(1);
            } else if (i12 != 2) {
            }
            c3075f.setGravity(8388611);
        } else if (i11 == 1 || i11 == 2) {
            if (this.f15623U == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            c3075f.setGravity(1);
        }
        m8867q(true);
    }

    /* JADX INFO: renamed from: f */
    public final int m8857f(int i10, float f3) {
        int i11 = this.f15627a0;
        int width = 0;
        if (i11 != 0 && i11 != 2) {
            return 0;
        }
        C3075f c3075f = this.f15632d;
        View childAt = c3075f.getChildAt(i10);
        if (childAt == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < c3075f.getChildCount() ? c3075f.getChildAt(i12) : null;
        int width2 = childAt.getWidth();
        if (childAt2 != null) {
            width = childAt2.getWidth();
        }
        int left = ((width2 / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i13 = (int) ((width2 + width) * 0.5f * f3);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        return C10029b0.e.m18686d(this) == 0 ? left + i13 : left - i13;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C3076g c3076g = this.f15630c;
        if (c3076g != null) {
            return c3076g.f15668d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f15628b.size();
    }

    public int getTabGravity() {
        return this.f15623U;
    }

    public ColorStateList getTabIconTint() {
        return this.f15610H;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f15635e0;
    }

    public int getTabIndicatorGravity() {
        return this.f15625W;
    }

    public int getTabMaxWidth() {
        return this.f15618P;
    }

    public int getTabMode() {
        return this.f15627a0;
    }

    public ColorStateList getTabRippleColor() {
        return this.f15611I;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f15612J;
    }

    public ColorStateList getTabTextColors() {
        return this.f15648l;
    }

    /* JADX INFO: renamed from: h */
    public final void m8858h() {
        if (this.f15649l0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f15649l0 = valueAnimator;
            valueAnimator.setInterpolator(this.f15641h0);
            this.f15649l0.setDuration(this.f15624V);
            this.f15649l0.addUpdateListener(new C3070a());
        }
    }

    /* JADX INFO: renamed from: i */
    public final C3076g m8859i(int i10) {
        if (i10 >= 0 && i10 < getTabCount()) {
            return this.f15628b.get(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final C3076g m8860j() {
        C3076g c3076g = (C3076g) f15609u0.mo11465b();
        if (c3076g == null) {
            c3076g = new C3076g();
        }
        c3076g.f15671g = this;
        C5339u c5339u = this.f15657t0;
        C3078i c3078i = c5339u != null ? (C3078i) c5339u.mo11465b() : null;
        if (c3078i == null) {
            c3078i = new C3078i(getContext());
        }
        c3078i.setTab(c3076g);
        c3078i.setFocusable(true);
        c3078i.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c3076g.f15667c)) {
            c3078i.setContentDescription(c3076g.f15666b);
        } else {
            c3078i.setContentDescription(c3076g.f15667c);
        }
        c3076g.f15672h = c3078i;
        int i10 = c3076g.f15673i;
        if (i10 != -1) {
            c3078i.setId(i10);
        }
        return c3076g;
    }

    /* JADX INFO: renamed from: k */
    public final void m8861k() {
        int currentItem;
        m8862l();
        AbstractC10290a abstractC10290a = this.f15651n0;
        if (abstractC10290a != null) {
            int iMo17877c = abstractC10290a.mo17877c();
            for (int i10 = 0; i10 < iMo17877c; i10++) {
                C3076g c3076gM8860j = m8860j();
                CharSequence charSequenceMo17890d = this.f15651n0.mo17890d(i10);
                if (TextUtils.isEmpty(c3076gM8860j.f15667c) && !TextUtils.isEmpty(charSequenceMo17890d)) {
                    c3076gM8860j.f15672h.setContentDescription(charSequenceMo17890d);
                }
                c3076gM8860j.f15666b = charSequenceMo17890d;
                C3078i c3078i = c3076gM8860j.f15672h;
                if (c3078i != null) {
                    c3078i.m8875d();
                }
                m8853b(c3076gM8860j, false);
            }
            ViewPager viewPager = this.f15650m0;
            if (viewPager == null || iMo17877c <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m8863m(m8859i(currentItem), true);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8862l() {
        C3075f c3075f = this.f15632d;
        for (int childCount = c3075f.getChildCount() - 1; childCount >= 0; childCount--) {
            C3078i c3078i = (C3078i) c3075f.getChildAt(childCount);
            c3075f.removeViewAt(childCount);
            if (c3078i != null) {
                c3078i.setTab(null);
                c3078i.setSelected(false);
                this.f15657t0.mo11464a(c3078i);
            }
            requestLayout();
        }
        Iterator<C3076g> it = this.f15628b.iterator();
        while (it.hasNext()) {
            C3076g next = it.next();
            it.remove();
            next.f15671g = null;
            next.f15672h = null;
            next.f15665a = null;
            next.f15673i = -1;
            next.f15666b = null;
            next.f15667c = null;
            next.f15668d = -1;
            next.f15669e = null;
            f15609u0.mo11464a(next);
        }
        this.f15630c = null;
    }

    /* JADX INFO: renamed from: m */
    public final void m8863m(C3076g c3076g, boolean z10) {
        C3076g c3076g2 = this.f15630c;
        ArrayList<InterfaceC3072c> arrayList = this.f15645j0;
        if (c3076g2 == c3076g) {
            if (c3076g2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).mo6541a();
                }
                m8855d(c3076g.f15668d);
                return;
            }
            return;
        }
        int i10 = c3076g != null ? c3076g.f15668d : -1;
        if (z10) {
            if ((c3076g2 == null || c3076g2.f15668d == -1) && i10 != -1) {
                m8865o(i10, 0.0f, true, true, true);
            } else {
                m8855d(i10);
            }
            if (i10 != -1) {
                setSelectedTabView(i10);
            }
        }
        this.f15630c = c3076g;
        if (c3076g2 != null && c3076g2.f15671g != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).mo6543c(c3076g2);
            }
        }
        if (c3076g != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).mo6542b(c3076g);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8864n(AbstractC10290a abstractC10290a, boolean z10) {
        C3074e c3074e;
        AbstractC10290a abstractC10290a2 = this.f15651n0;
        if (abstractC10290a2 != null && (c3074e = this.f15652o0) != null) {
            abstractC10290a2.f51777a.unregisterObserver(c3074e);
        }
        this.f15651n0 = abstractC10290a;
        if (z10 && abstractC10290a != null) {
            if (this.f15652o0 == null) {
                this.f15652o0 = new C3074e();
            }
            abstractC10290a.f51777a.registerObserver(this.f15652o0);
        }
        m8861k();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX INFO: renamed from: o */
    public final void m8865o(int i10, float f3, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float f10 = i10 + f3;
        int iRound = Math.round(f10);
        if (iRound >= 0) {
            C3075f c3075f = this.f15632d;
            if (iRound >= c3075f.getChildCount()) {
                return;
            }
            if (z11) {
                c3075f.getClass();
                TabLayout.this.f15626a = Math.round(f10);
                ValueAnimator valueAnimator = c3075f.f15663a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c3075f.f15663a.cancel();
                }
                c3075f.m8870c(c3075f.getChildAt(i10), c3075f.getChildAt(i10 + 1), f3);
            }
            ValueAnimator valueAnimator2 = this.f15649l0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f15649l0.cancel();
            }
            int iM8857f = m8857f(i10, f3);
            int scrollX = getScrollX();
            if ((i10 < getSelectedTabPosition() && iM8857f >= scrollX) || (i10 > getSelectedTabPosition() && iM8857f <= scrollX)) {
                z13 = true;
            } else if (i10 == getSelectedTabPosition()) {
                z13 = true;
            } else {
                z13 = false;
            }
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.e.m18686d(this) == 1) {
                if (i10 < getSelectedTabPosition() && iM8857f <= scrollX) {
                    z13 = true;
                } else if ((i10 <= getSelectedTabPosition() || iM8857f < scrollX) && i10 != getSelectedTabPosition()) {
                    z13 = false;
                } else {
                    z13 = true;
                }
            }
            if (z13 || this.f15656s0 == 1 || z12) {
                if (i10 < 0) {
                    iM8857f = 0;
                }
                scrollTo(iM8857f, 0);
            }
            if (z10) {
                setSelectedTabView(iRound);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0062b.m335b2(this);
        if (this.f15650m0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m8866p((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f15655r0) {
            setupWithViewPager(null);
            this.f15655r0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C3078i c3078i;
        Drawable drawable;
        int i10 = 0;
        while (true) {
            C3075f c3075f = this.f15632d;
            if (i10 >= c3075f.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = c3075f.getChildAt(i10);
            if ((childAt instanceof C3078i) && (drawable = (c3078i = (C3078i) childAt).f15686i) != null) {
                drawable.setBounds(c3078i.getLeft(), c3078i.getTop(), c3078i.getRight(), c3078i.getBottom());
                c3078i.f15686i.draw(canvas);
            }
            i10++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C10284f.b.m19274a(1, getTabCount(), 1).f51759a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if ((getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent)) {
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iRound = Math.round(C10347n.m19362b(getDefaultHeight(), getContext()));
        int mode = View.MeasureSpec.getMode(i11);
        boolean z10 = false;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i11) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int iM19362b = this.f15620R;
            if (iM19362b <= 0) {
                iM19362b = (int) (size - C10347n.m19362b(56, getContext()));
            }
            this.f15618P = iM19362b;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i12 = this.f15627a0;
            if (i12 == 0) {
                if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                    z10 = true;
                }
            } else if (i12 != 1) {
                if (i12 == 2) {
                    if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                        z10 = true;
                    }
                }
            } else if (childAt.getMeasuredWidth() != getMeasuredWidth()) {
                z10 = true;
            }
            if (z10) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8) {
            if (!(getTabMode() == 0 || getTabMode() == 2)) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m8866p(ViewPager viewPager, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.f15650m0;
        if (viewPager2 != null) {
            C3077h c3077h = this.f15653p0;
            if (c3077h != null && (arrayList2 = viewPager2.f7679o0) != null) {
                arrayList2.remove(c3077h);
            }
            C3071b c3071b = this.f15654q0;
            if (c3071b != null && (arrayList = this.f15650m0.f7681q0) != null) {
                arrayList.remove(c3071b);
            }
        }
        C3079j c3079j = this.f15647k0;
        if (c3079j != null) {
            this.f15645j0.remove(c3079j);
            this.f15647k0 = null;
        }
        if (viewPager != null) {
            this.f15650m0 = viewPager;
            if (this.f15653p0 == null) {
                this.f15653p0 = new C3077h(this);
            }
            C3077h c3077h2 = this.f15653p0;
            c3077h2.f15676c = 0;
            c3077h2.f15675b = 0;
            viewPager.m4642b(c3077h2);
            C3079j c3079j2 = new C3079j(viewPager);
            this.f15647k0 = c3079j2;
            m8852a(c3079j2);
            AbstractC10290a adapter = viewPager.getAdapter();
            if (adapter != null) {
                m8864n(adapter, true);
            }
            if (this.f15654q0 == null) {
                this.f15654q0 = new C3071b();
            }
            C3071b c3071b2 = this.f15654q0;
            c3071b2.f15659a = true;
            if (viewPager.f7681q0 == null) {
                viewPager.f7681q0 = new ArrayList();
            }
            viewPager.f7681q0.add(c3071b2);
            m8865o(viewPager.getCurrentItem(), 0.0f, true, true, true);
        } else {
            this.f15650m0 = null;
            m8864n(null, false);
        }
        this.f15655r0 = z10;
    }

    /* JADX INFO: renamed from: q */
    public final void m8867q(boolean z10) {
        int i10 = 0;
        while (true) {
            C3075f c3075f = this.f15632d;
            if (i10 >= c3075f.getChildCount()) {
                return;
            }
            View childAt = c3075f.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f15627a0 == 1 && this.f15623U == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z10) {
                childAt.requestLayout();
            }
            i10++;
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        C0062b.m332a2(this, f3);
    }

    public void setInlineLabel(boolean z10) {
        if (this.f15629b0 != z10) {
            this.f15629b0 = z10;
            int i10 = 0;
            while (true) {
                C3075f c3075f = this.f15632d;
                if (i10 >= c3075f.getChildCount()) {
                    break;
                }
                View childAt = c3075f.getChildAt(i10);
                if (childAt instanceof C3078i) {
                    C3078i c3078i = (C3078i) childAt;
                    c3078i.setOrientation(!TabLayout.this.f15629b0 ? 1 : 0);
                    TextView textView = c3078i.f15684g;
                    if (textView == null && c3078i.f15685h == null) {
                        c3078i.m8878g(c3078i.f15679b, c3078i.f15680c, true);
                    } else {
                        c3078i.m8878g(textView, c3078i.f15685h, false);
                    }
                }
                i10++;
            }
            m8856e();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC3072c interfaceC3072c) {
        InterfaceC3072c interfaceC3072c2 = this.f15643i0;
        if (interfaceC3072c2 != null) {
            this.f15645j0.remove(interfaceC3072c2);
        }
        this.f15643i0 = interfaceC3072c;
        if (interfaceC3072c != null) {
            m8852a(interfaceC3072c);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC3073d interfaceC3073d) {
        setOnTabSelectedListener((InterfaceC3072c) interfaceC3073d);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m8858h();
        this.f15649l0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(C5452a.m11672a(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.f15612J = drawableMutate;
        int i10 = this.f15613K;
        if (i10 != 0) {
            C8488a.b.m16569g(drawableMutate, i10);
        } else {
            C8488a.b.m16570h(drawableMutate, null);
        }
        int intrinsicHeight = this.f15633d0;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f15612J.getIntrinsicHeight();
        }
        this.f15632d.m8869b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f15613K = i10;
        Drawable drawable = this.f15612J;
        if (i10 != 0) {
            C8488a.b.m16569g(drawable, i10);
        } else {
            C8488a.b.m16570h(drawable, null);
        }
        m8867q(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f15625W != i10) {
            this.f15625W = i10;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18674k(this.f15632d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f15633d0 = i10;
        this.f15632d.m8869b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f15623U != i10) {
            this.f15623U = i10;
            m8856e();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f15610H != colorStateList) {
            this.f15610H = colorStateList;
            ArrayList<C3076g> arrayList = this.f15628b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                C3078i c3078i = arrayList.get(i10).f15672h;
                if (c3078i != null) {
                    c3078i.m8875d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(C7472a.m14842b(i10, getContext()));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setTabIndicatorAnimationMode(int i10) {
        this.f15635e0 = i10;
        if (i10 == 0) {
            this.f15639g0 = new C3080a();
            return;
        }
        if (i10 == 1) {
            this.f15639g0 = new C6660a();
        } else {
            if (i10 == 2) {
                this.f15639g0 = new C6661b();
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f15631c0 = z10;
        int i10 = C3075f.f15662c;
        C3075f c3075f = this.f15632d;
        c3075f.m8868a(TabLayout.this.getSelectedTabPosition());
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18674k(c3075f);
    }

    public void setTabMode(int i10) {
        if (i10 != this.f15627a0) {
            this.f15627a0 = i10;
            m8856e();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f15611I == colorStateList) {
            return;
        }
        this.f15611I = colorStateList;
        int i10 = 0;
        while (true) {
            C3075f c3075f = this.f15632d;
            if (i10 >= c3075f.getChildCount()) {
                return;
            }
            View childAt = c3075f.getChildAt(i10);
            if (childAt instanceof C3078i) {
                Context context = getContext();
                int i11 = C3078i.f15677l;
                ((C3078i) childAt).m8876e(context);
            }
            i10++;
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(C7472a.m14842b(i10, getContext()));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f15648l != colorStateList) {
            this.f15648l = colorStateList;
            ArrayList<C3076g> arrayList = this.f15628b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                C3078i c3078i = arrayList.get(i10).f15672h;
                if (c3078i != null) {
                    c3078i.m8875d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC10290a abstractC10290a) {
        m8864n(abstractC10290a, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f15637f0 != z10) {
            this.f15637f0 = z10;
            int i10 = 0;
            while (true) {
                C3075f c3075f = this.f15632d;
                if (i10 >= c3075f.getChildCount()) {
                    break;
                }
                View childAt = c3075f.getChildAt(i10);
                if (childAt instanceof C3078i) {
                    Context context = getContext();
                    int i11 = C3078i.f15677l;
                    ((C3078i) childAt).m8876e(context);
                }
                i10++;
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m8866p(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
