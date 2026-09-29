package p240ld;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.activity.RunnableC0191j;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.google.android.material.textfield.C3093a;
import com.google.android.material.textfield.TextInputLayout;
import com.linguist.R;
import java.util.WeakHashMap;
import p118fe.C5509a;
import p177ic.C6308a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p497y2.C10284f;
import p497y2.InterfaceC10282d;
import p531zc.C10477a;

/* JADX INFO: renamed from: ld.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7312l extends AbstractC7313m {

    /* JADX INFO: renamed from: e */
    public final int f40937e;

    /* JADX INFO: renamed from: f */
    public final int f40938f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f40939g;

    /* JADX INFO: renamed from: h */
    public AutoCompleteTextView f40940h;

    /* JADX INFO: renamed from: i */
    public final ViewOnClickListenerC2239y f40941i;

    /* JADX INFO: renamed from: j */
    public final ViewOnFocusChangeListenerC7307g f40942j;

    /* JADX INFO: renamed from: k */
    public final C5509a f40943k;

    /* JADX INFO: renamed from: l */
    public boolean f40944l;

    /* JADX INFO: renamed from: m */
    public boolean f40945m;

    /* JADX INFO: renamed from: n */
    public boolean f40946n;

    /* JADX INFO: renamed from: o */
    public long f40947o;

    /* JADX INFO: renamed from: p */
    public AccessibilityManager f40948p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f40949q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f40950r;

    /* JADX WARN: Type inference failed for: r0v1, types: [ld.g] */
    public C7312l(C3093a c3093a) {
        super(c3093a);
        this.f40941i = new ViewOnClickListenerC2239y(5, this);
        this.f40942j = new View.OnFocusChangeListener() { // from class: ld.g
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C7312l c7312l = this.f40930a;
                c7312l.f40944l = z10;
                c7312l.m14716q();
                if (!z10) {
                    c7312l.m14712t(false);
                    c7312l.f40945m = false;
                }
            }
        };
        this.f40943k = new C5509a(8, this);
        this.f40947o = Long.MAX_VALUE;
        this.f40938f = C10477a.m19428c(R.attr.motionDurationShort3, c3093a.getContext(), 67);
        this.f40937e = C10477a.m19428c(R.attr.motionDurationShort3, c3093a.getContext(), 50);
        this.f40939g = C10477a.m19429d(c3093a.getContext(), R.attr.motionEasingLinearInterpolator, C6308a.f36523a);
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: a */
    public final void mo14693a() {
        if (this.f40948p.isTouchExplorationEnabled()) {
            if ((this.f40940h.getInputType() != 0) && !this.f40954d.hasFocus()) {
                this.f40940h.dismissDropDown();
            }
        }
        this.f40940h.post(new RunnableC0191j(15, this));
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: c */
    public final int mo14694c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: d */
    public final int mo14695d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo14696e() {
        return this.f40942j;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo14697f() {
        return this.f40941i;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: h */
    public final InterfaceC10282d mo14706h() {
        return this.f40943k;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: i */
    public final boolean mo14707i(int i10) {
        return i10 != 0;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: j */
    public final boolean mo14708j() {
        return this.f40944l;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: l */
    public final boolean mo14709l() {
        return this.f40946n;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: m */
    public final void mo14699m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f40940h = autoCompleteTextView;
        boolean z10 = false;
        autoCompleteTextView.setOnTouchListener(new ViewOnTouchListenerC7309i(0, this));
        this.f40940h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: ld.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C7312l c7312l = this.f40935a;
                c7312l.f40945m = true;
                c7312l.f40947o = System.currentTimeMillis();
                c7312l.m14712t(false);
            }
        });
        this.f40940h.setThreshold(0);
        TextInputLayout textInputLayout = this.f40951a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() != 0) {
            z10 = true;
        }
        if (!z10 && this.f40948p.isTouchExplorationEnabled()) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18682s(this.f40954d, 2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: n */
    public final void mo14710n(C10284f c10284f) {
        if (!(this.f40940h.getInputType() != 0)) {
            c10284f.m19264i(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = c10284f.f51739a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // p240ld.AbstractC7313m
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: o */
    public final void mo14711o(AccessibilityEvent accessibilityEvent) {
        if (this.f40948p.isEnabled()) {
            boolean z10 = false;
            if (this.f40940h.getInputType() != 0) {
                return;
            }
            if (accessibilityEvent.getEventType() == 32768 && this.f40946n && !this.f40940h.isPopupShowing()) {
                z10 = true;
            }
            if (accessibilityEvent.getEventType() != 1 && !z10) {
                return;
            }
            m14713u();
            this.f40945m = true;
            this.f40947o = System.currentTimeMillis();
        }
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: r */
    public final void mo14701r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f40939g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f40938f);
        int i10 = 0;
        valueAnimatorOfFloat.addUpdateListener(new C7308h(i10, this));
        this.f40950r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f40937e);
        valueAnimatorOfFloat2.addUpdateListener(new C7308h(i10, this));
        this.f40949q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C7311k(this));
        this.f40948p = (AccessibilityManager) this.f40953c.getSystemService("accessibility");
    }

    @Override // p240ld.AbstractC7313m
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: s */
    public final void mo14702s() {
        AutoCompleteTextView autoCompleteTextView = this.f40940h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f40940h.setOnDismissListener(null);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m14712t(boolean z10) {
        if (this.f40946n != z10) {
            this.f40946n = z10;
            this.f40950r.cancel();
            this.f40949q.start();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m14713u() {
        if (this.f40940h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f40947o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f40945m = false;
        }
        if (this.f40945m) {
            this.f40945m = false;
            return;
        }
        m14712t(!this.f40946n);
        if (!this.f40946n) {
            this.f40940h.dismissDropDown();
        } else {
            this.f40940h.requestFocus();
            this.f40940h.showDropDown();
        }
    }
}
