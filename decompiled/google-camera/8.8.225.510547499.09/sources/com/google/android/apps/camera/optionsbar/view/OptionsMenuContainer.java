package com.google.android.apps.camera.optionsbar.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.DisplayCutout;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Set;
import p000.C1112xa;
import p000.akf;
import p000.gfg;
import p000.hzj;
import p000.ilg;
import p000.ilk;
import p000.ilt;
import p000.jpd;
import p000.jvh;
import p000.mrm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class OptionsMenuContainer extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public int f6823a;

    /* JADX INFO: renamed from: b */
    public ilk f6824b;

    /* JADX INFO: renamed from: c */
    public hzj f6825c;

    /* JADX INFO: renamed from: d */
    public final ilt f6826d;

    /* JADX INFO: renamed from: e */
    public Animator f6827e;

    /* JADX INFO: renamed from: f */
    public final ImageButton f6828f;

    /* JADX INFO: renamed from: g */
    public final Context f6829g;

    /* JADX INFO: renamed from: h */
    public final Set f6830h;

    /* JADX INFO: renamed from: i */
    public boolean f6831i;

    /* JADX INFO: renamed from: j */
    public GestureDetector f6832j;

    /* JADX INFO: renamed from: k */
    public int f6833k;

    /* JADX INFO: renamed from: l */
    private int f6834l;

    /* JADX INFO: renamed from: m */
    private int f6835m;

    /* JADX INFO: renamed from: n */
    private int f6836n;

    /* JADX INFO: renamed from: o */
    private int f6837o;

    /* JADX INFO: renamed from: p */
    private int f6838p;

    /* JADX INFO: renamed from: q */
    private int f6839q;

    public OptionsMenuContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6823a = 0;
        this.f6824b = ilk.PORTRAIT;
        this.f6825c = hzj.PHONE_LAYOUT;
        this.f6830h = new C1112xa();
        this.f6831i = false;
        this.f6826d = new ilt(this);
        this.f6828f = new ImageButton(context, null, 0, C0100R.style.options_bar_rightside_option);
        this.f6829g = context;
    }

    /* JADX INFO: renamed from: n */
    private final View m4232n() {
        return findViewById(C0100R.id.options_menu_top_bar);
    }

    /* JADX INFO: renamed from: o */
    private final View m4233o() {
        return findViewById(C0100R.id.options_menu_view_frame);
    }

    /* JADX INFO: renamed from: a */
    public final View m4234a() {
        return findViewById(C0100R.id.minibar);
    }

    /* JADX INFO: renamed from: b */
    public final View m4235b() {
        return findViewById(C0100R.id.options_menu_view);
    }

    /* JADX INFO: renamed from: c */
    public final View m4236c() {
        return findViewById(C0100R.id.options_menu_standalone_settings);
    }

    /* JADX INFO: renamed from: d */
    public final RelativeLayout m4237d() {
        return (RelativeLayout) findViewById(C0100R.id.options_menu_middle_bar);
    }

    /* JADX INFO: renamed from: e */
    public final OptionsMenuView m4238e() {
        return (OptionsMenuView) findViewById(C0100R.id.options_menu_view_internal);
    }

    /* JADX INFO: renamed from: f */
    public final void m4239f(gfg gfgVar) {
        this.f6830h.add(gfgVar);
    }

    /* JADX INFO: renamed from: g */
    public final void m4240g() {
        Trace.beginSection("optionsMenuContainer:applyOrientation");
        View viewM4232n = m4232n();
        ViewGroup.LayoutParams layoutParams = viewM4232n.getLayoutParams();
        int i = layoutParams.height;
        int i2 = this.f6823a;
        if (i2 > 0) {
            layoutParams.height = i2;
        } else {
            layoutParams.height = getResources().getDimensionPixelSize(C0100R.dimen.options_menu_top_bar_size);
        }
        if (layoutParams.height != i) {
            viewM4232n.setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = m4232n().getLayoutParams();
        int i3 = this.f6823a;
        int iMax = i3 > 0 ? Math.max(i3, this.f6835m) : this.f6833k;
        if (layoutParams2.height != iMax) {
            layoutParams2.height = iMax;
            m4232n().setLayoutParams(layoutParams2);
        }
        m4238e().f6845e = this.f6824b;
        View viewM4236c = m4236c();
        viewM4236c.getClass();
        View viewM4235b = m4235b();
        viewM4235b.getClass();
        View viewM4233o = m4233o();
        viewM4233o.getClass();
        ViewGroup.LayoutParams layoutParams3 = viewM4236c.getLayoutParams();
        layoutParams3.getClass();
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        ViewGroup.LayoutParams layoutParams5 = viewM4235b.getLayoutParams();
        layoutParams5.getClass();
        ViewGroup.LayoutParams layoutParams6 = viewM4233o.getLayoutParams();
        layoutParams6.getClass();
        RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) layoutParams6;
        if (jpd.m13431l(this.f6825c)) {
            if (hzj.TABLET_LAYOUT.equals(this.f6825c)) {
                layoutParams4.gravity = 8388611;
                layoutParams7.topMargin = 0;
            } else if (hzj.f30014d.equals(this.f6825c)) {
                layoutParams7.topMargin = getResources().getDimensionPixelSize(C0100R.dimen.jarvis_options_menu_frame_top_margin);
            }
            layoutParams4.topMargin = getResources().getDimensionPixelSize(C0100R.dimen.standalone_settings_top_margin_tab);
            layoutParams5.width = getResources().getDimensionPixelSize(C0100R.dimen.options_menu_view_width);
        } else {
            layoutParams4.gravity = 8388613;
            layoutParams4.topMargin = getResources().getDimensionPixelSize(C0100R.dimen.standalone_settings_top_margin);
            layoutParams5.width = -1;
            layoutParams7.topMargin = 0;
        }
        m4236c().setLayoutParams(layoutParams4);
        m4235b().setLayoutParams(layoutParams5);
        m4233o().setLayoutParams(layoutParams7);
        if (m4244k()) {
            m4243j(hzj.f30014d.equals(this.f6825c));
        }
        jvh.m13577y(this, this.f6824b);
        View viewM4235b2 = m4235b();
        mrm mrmVarM13574v = jvh.m13574v(viewM4235b2, this.f6824b);
        if (mrmVarM13574v.mo16813g()) {
            ((ValueAnimator) mrmVarM13574v.mo16809c()).addListener(new ilg(viewM4235b2));
            ((ValueAnimator) mrmVarM13574v.mo16809c()).start();
        }
        Trace.endSection();
    }

    /* JADX INFO: renamed from: h */
    public final void m4241h() {
        setEnabled(false);
        this.f6828f.setEnabled(false);
    }

    /* JADX INFO: renamed from: i */
    public final void m4242i() {
        setEnabled(true);
        this.f6828f.setEnabled(true);
    }

    /* JADX INFO: renamed from: j */
    public final void m4243j(boolean z) {
        int color = this.f6829g.getColor(C0100R.color.options_menu_frame_background_default);
        if (hzj.f30014d != this.f6825c) {
            setBackgroundColor(color);
            return;
        }
        int color2 = this.f6829g.getColor(C0100R.color.options_menu_frame_background_opened_jarvis);
        if (true != z) {
            color = color2;
        }
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(this, "backgroundColor", color, color2 - color);
        objectAnimatorOfArgb.setDuration(250L);
        objectAnimatorOfArgb.setInterpolator(new akf());
        objectAnimatorOfArgb.start();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4244k() {
        return m4235b().getVisibility() == 0;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m4245l() {
        return this.f6831i || hzj.f30014d.equals(this.f6825c);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("optionsMenuContainer:inflate");
        super.onFinishInflate();
        this.f6834l = getResources().getDimensionPixelSize(C0100R.dimen.standalone_settings_height);
        this.f6833k = getResources().getDimensionPixelSize(C0100R.dimen.options_menu_top_bar_size);
        this.f6835m = getResources().getDimensionPixelSize(C0100R.dimen.options_menu_min_top_bar_size);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0100R.dimen.options_menu_internal_vertical_padding);
        this.f6836n = dimensionPixelOffset + dimensionPixelOffset;
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C0100R.dimen.options_side_padding);
        this.f6837o = dimensionPixelOffset2 + dimensionPixelOffset2;
        this.f6838p = getResources().getDimensionPixelOffset(C0100R.dimen.standalone_settings_top_margin);
        this.f6839q = getResources().getDimensionPixelSize(C0100R.dimen.options_row_height);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.options_menu_container, this);
        Trace.endSection();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4240g();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        View childAt;
        int iCenterX = 0;
        if (View.MeasureSpec.getMode(i2) == 0) {
            m4238e().f6844d = 0;
        } else {
            int size = (((ilk.m11427e(this.f6824b) ? View.MeasureSpec.getSize(i2) - m4232n().getLayoutParams().height : View.MeasureSpec.getSize(i2)) - this.f6838p) - this.f6834l) - this.f6837o;
            if (m4238e().m4247a() > 0 && (childAt = ((ViewGroup) m4238e().getChildAt(0)).getChildAt(0)) != null && childAt.getMeasuredHeight() > 0) {
                this.f6839q = childAt.getMeasuredHeight();
                if (m4238e().m4247a() > 1) {
                    View childAt2 = ((ViewGroup) m4238e().getChildAt(0)).getChildAt(1);
                    if (childAt2.getMeasuredHeight() > 0 && childAt2.getMeasuredHeight() < this.f6839q) {
                        this.f6839q = childAt2.getMeasuredHeight();
                    }
                }
            }
            int iM4247a = m4238e().m4247a() * this.f6839q;
            if (this.f6825c == hzj.f30014d) {
                size -= getResources().getDimensionPixelSize(C0100R.dimen.jarvis_options_menu_frame_top_margin);
            }
            int i4 = this.f6836n;
            if (size < iM4247a + i4) {
                float f = this.f6839q;
                i3 = ((int) ((((int) (((size - i4) / f) - 0.5f)) + 0.5f) * f)) + i4;
            } else {
                i3 = 0;
            }
            m4238e().f6844d = i3;
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        ilk ilkVar = this.f6824b;
        View viewFindViewById = findViewById(C0100R.id.minibar_container);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewById.getLayoutParams();
        int i5 = layoutParams.gravity;
        WindowInsets rootWindowInsets = getRootWindowInsets();
        DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
        int iAbs = -1;
        if (rootWindowInsets != null && displayCutout != null) {
            ilk ilkVar2 = ilk.PORTRAIT;
            switch (ilkVar) {
                case PORTRAIT:
                    iCenterX = displayCutout.getBoundingRectTop().centerX();
                    break;
                case LANDSCAPE:
                    iCenterX = displayCutout.getBoundingRectLeft().centerY();
                    break;
                case REVERSE_LANDSCAPE:
                    iCenterX = displayCutout.getBoundingRectRight().centerY();
                    break;
                case REVERSE_PORTRAIT:
                    iCenterX = displayCutout.getBoundingRectBottom().centerX();
                    break;
            }
            iAbs = Math.abs(iCenterX - (measuredWidth / 2));
        }
        if (jpd.m13431l(this.f6825c) || (iAbs >= 0 && iAbs < viewFindViewById.getWidth())) {
            layoutParams.gravity = 19;
        } else {
            layoutParams.gravity = 17;
        }
        if (i5 != layoutParams.gravity) {
            viewFindViewById.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m4246m() {
        ilt iltVar = this.f6826d;
        int i = iltVar.f31462c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return iltVar.f31460a.getVisibility() == 0;
            default:
                throw new IllegalStateException("Should never be here");
        }
    }
}
