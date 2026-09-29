package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.R$attr;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class ym2 extends js2 {

    /* JADX INFO: renamed from: e */
    public final int f70050e;

    /* JADX INFO: renamed from: f */
    public final int f70051f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f70052g;

    /* JADX INFO: renamed from: h */
    public AutoCompleteTextView f70053h;

    /* JADX INFO: renamed from: i */
    public final h31 f70054i;

    /* JADX INFO: renamed from: j */
    public final i31 f70055j;

    /* JADX INFO: renamed from: k */
    public final xm2 f70056k;

    /* JADX INFO: renamed from: l */
    public boolean f70057l;

    /* JADX INFO: renamed from: m */
    public boolean f70058m;

    /* JADX INFO: renamed from: n */
    public boolean f70059n;

    /* JADX INFO: renamed from: o */
    public long f70060o;

    /* JADX INFO: renamed from: p */
    public AccessibilityManager f70061p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f70062q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f70063r;

    /* JADX WARN: Type inference failed for: r0v2, types: [xm2] */
    public ym2(is2 is2Var) {
        super(is2Var);
        this.f70054i = new h31(this, 3);
        this.f70055j = new i31(this, 1);
        this.f70056k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: xm2
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                ym2 ym2Var = this.f68342a;
                AutoCompleteTextView autoCompleteTextView = ym2Var.f70053h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                ym2Var.f46064d.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.f70060o = Long.MAX_VALUE;
        this.f70051f = r46.m20364G(is2Var.getContext(), R$attr.motionDurationShort3, 67);
        this.f70050e = r46.m20364G(is2Var.getContext(), R$attr.motionDurationShort3, 50);
        this.f70052g = r46.m20365H(is2Var.getContext(), R$attr.motionEasingLinearInterpolator, AbstractC0853cn.f10296a);
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: a */
    public final void mo14630a() {
        if (this.f70061p.isTouchExplorationEnabled() && wbd.m23842c(this.f70053h) && !this.f46064d.hasFocus()) {
            this.f70053h.dismissDropDown();
        }
        this.f70053h.post(new RunnableC3781y2(this, 17));
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: c */
    public final int mo3302c() {
        return R$string.exposed_dropdown_menu_content_description;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: d */
    public final int mo3303d() {
        return R$drawable.mtrl_dropdown_arrow;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo14631e() {
        return this.f70055j;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo3304f() {
        return this.f70054i;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: h */
    public final AccessibilityManager.TouchExplorationStateChangeListener mo14633h() {
        return this.f70056k;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: i */
    public final boolean mo14634i(int i) {
        return i != 0;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: k */
    public final boolean mo3306k() {
        return this.f70059n;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: l */
    public final void mo3307l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            ho2.m13385e("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f70053h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new qx7(this, 3));
        this.f70053h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: wm2
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                ym2 ym2Var = this.f67050a;
                ym2Var.f70058m = true;
                ym2Var.f70060o = SystemClock.uptimeMillis();
                ym2Var.m25197s(false);
            }
        });
        this.f70053h.setThreshold(0);
        TextInputLayout textInputLayout = this.f46061a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f70061p.isTouchExplorationEnabled()) {
            this.f46064d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: m */
    public final void mo14635m(C0797b4 c0797b4) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0797b4.f7900a;
        if (!wbd.m23842c(this.f70053h)) {
            c0797b4.m3279j(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: n */
    public final void mo14636n(AccessibilityEvent accessibilityEvent) {
        if (!this.f70061p.isEnabled() || wbd.m23842c(this.f70053h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f70059n && !this.f70053h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            m25198t();
            this.f70058m = true;
            this.f70060o = SystemClock.uptimeMillis();
        }
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: q */
    public final void mo3308q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f70052g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f70051f);
        int i = 3;
        valueAnimatorOfFloat.addUpdateListener(new ba0(this, i));
        this.f70063r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f70050e);
        valueAnimatorOfFloat2.addUpdateListener(new ba0(this, i));
        this.f70062q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C3340mm(this, i));
        this.f70061p = (AccessibilityManager) this.f46063c.getSystemService("accessibility");
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: r */
    public final void mo3309r() {
        AutoCompleteTextView autoCompleteTextView = this.f70053h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f70053h.setOnDismissListener(null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m25197s(boolean z) {
        if (this.f70059n != z) {
            this.f70059n = z;
            this.f70063r.cancel();
            this.f70062q.start();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m25198t() {
        if (this.f70053h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f70060o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f70058m = false;
        }
        if (this.f70058m) {
            this.f70058m = false;
            return;
        }
        m25197s(!this.f70059n);
        boolean z = this.f70059n;
        AutoCompleteTextView autoCompleteTextView = this.f70053h;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.f70053h.showDropDown();
        }
    }
}
