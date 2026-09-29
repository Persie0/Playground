package com.iterable.iterableapi;

import android.R;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.AbstractC0638f;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p000.ac4;
import p000.be2;
import p000.bl2;
import p000.dta;
import p000.eh0;
import p000.fb4;
import p000.fg2;
import p000.lb4;
import p000.p33;
import p000.rc4;
import p000.sc4;
import p000.tc4;
import p000.wsa;
import p000.xd2;
import p000.ya1;
import p000.yb4;
import p000.zb4;

/* JADX INFO: renamed from: com.iterable.iterableapi.e */
/* JADX INFO: loaded from: classes2.dex */
public class C1209e extends be2 {

    /* JADX INFO: renamed from: Z0 */
    public static C1209e f13998Z0;

    /* JADX INFO: renamed from: a1 */
    public static p33 f13999a1;

    /* JADX INFO: renamed from: b1 */
    public static IterableInAppLocation f14000b1;

    /* JADX INFO: renamed from: M0 */
    public sc4 f14001M0;

    /* JADX INFO: renamed from: O0 */
    public zb4 f14003O0;

    /* JADX INFO: renamed from: Q0 */
    public String f14005Q0;

    /* JADX INFO: renamed from: S0 */
    public Handler f14007S0;

    /* JADX INFO: renamed from: T0 */
    public ac4 f14008T0;

    /* JADX INFO: renamed from: W0 */
    public boolean f14011W0;

    /* JADX INFO: renamed from: X0 */
    public double f14012X0;

    /* JADX INFO: renamed from: Y0 */
    public String f14013Y0;

    /* JADX INFO: renamed from: P0 */
    public boolean f14004P0 = false;

    /* JADX INFO: renamed from: U0 */
    public float f14009U0 = -1.0f;

    /* JADX INFO: renamed from: N0 */
    public boolean f14002N0 = false;

    /* JADX INFO: renamed from: R0 */
    public String f14006R0 = "";

    /* JADX INFO: renamed from: V0 */
    public Rect f14010V0 = new Rect();

    public C1209e() {
        int i = androidx.appcompat.R$style.Theme_AppCompat_NoActionBar;
        if (AbstractC0638f.m2128L(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to 2, " + i);
        }
        this.f8410A0 = 2;
        this.f8411B0 = R.style.Theme.Panel;
        if (i != 0) {
            this.f8411B0 = i;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static InAppLayout m6903o0(Rect rect) {
        int i = rect.top;
        if (i == 0 && rect.bottom == 0) {
            return InAppLayout.FULLSCREEN;
        }
        if (i != 0 || rect.bottom >= 0) {
            return (i >= 0 || rect.bottom != 0) ? InAppLayout.CENTER : InAppLayout.BOTTOM;
        }
        return InAppLayout.TOP;
    }

    /* JADX INFO: renamed from: p0 */
    public static int m6904p0(Rect rect) {
        int i = rect.top;
        if (i != 0 || rect.bottom >= 0) {
            return (i >= 0 || rect.bottom != 0) ? 16 : 80;
        }
        return 48;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sc4 sc4Var;
        int i = 0;
        this.f8417H0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        InAppLayout inAppLayoutM6903o0 = m6903o0(this.f14010V0);
        InAppLayout inAppLayout = InAppLayout.FULLSCREEN;
        if (inAppLayoutM6903o0 == inAppLayout) {
            this.f8417H0.getWindow().setFlags(1024, 1024);
        }
        if (m6903o0(this.f14010V0) != inAppLayout) {
            m6906m0(this.f8417H0.getWindow(), "onCreateView");
        }
        try {
            sc4Var = new sc4(mo2107i(), 0);
        } catch (Resources.NotFoundException e) {
            eh0.m11136q("IterableInAppFragmentHTMLNotification", "Failed to create WebView - system WebView resource issue", e);
            sc4Var = null;
        } catch (RuntimeException e2) {
            eh0.m11136q("IterableInAppFragmentHTMLNotification", "Failed to create WebView - unexpected error", e2);
            sc4Var = null;
        }
        this.f14001M0 = sc4Var;
        if (sc4Var == null) {
            m3658d0();
            return null;
        }
        sc4Var.setId(R$id.webView);
        sc4 sc4Var2 = this.f14001M0;
        String str = this.f14005Q0;
        sc4Var2.getClass();
        tc4 tc4Var = new tc4();
        tc4Var.f62147b = this;
        rc4 rc4Var = new rc4();
        rc4Var.f59066b = this;
        sc4Var2.setWebViewClient(tc4Var);
        sc4Var2.setWebChromeClient(rc4Var);
        sc4Var2.setOverScrollMode(2);
        sc4Var2.setBackgroundColor(0);
        sc4Var2.getSettings().setLoadWithOverviewMode(true);
        sc4Var2.getSettings().setAllowFileAccess(false);
        sc4Var2.getSettings().setAllowFileAccessFromFileURLs(false);
        sc4Var2.getSettings().setAllowUniversalAccessFromFileURLs(false);
        sc4Var2.getSettings().setAllowContentAccess(false);
        sc4Var2.getSettings().setJavaScriptEnabled(false);
        try {
            lb4 lb4Var = fb4.f38769t.f38771b;
        } catch (Exception e3) {
            eh0.m11122S("IterableUtilImpl", "Failed to get configured WebView baseURL, using empty default", e3);
        }
        sc4Var2.loadDataWithBaseURL("", str, "text/html", "UTF-8", "");
        if (this.f14003O0 == null) {
            this.f14003O0 = new zb4(this, mo2107i());
        }
        this.f14003O0.enable();
        FrameLayout frameLayout = new FrameLayout(mo2107i());
        if (m6903o0(this.f14010V0) == InAppLayout.FULLSCREEN) {
            frameLayout.addView(this.f14001M0, new FrameLayout.LayoutParams(-1, -1));
        } else {
            RelativeLayout relativeLayout = new RelativeLayout(mo2107i());
            int iM6904p0 = m6904p0(this.f14010V0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            if (iM6904p0 == 16) {
                layoutParams.gravity = 17;
            } else if (iM6904p0 == 48) {
                layoutParams.gravity = 49;
            } else if (iM6904p0 == 80) {
                layoutParams.gravity = 81;
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(13);
            relativeLayout.addView(this.f14001M0, layoutParams2);
            frameLayout.addView(relativeLayout, layoutParams);
        }
        if (bundle == null || !bundle.getBoolean("InAppOpenTracked", false)) {
            fb4 fb4Var = fb4.f38769t;
            String str2 = this.f14006R0;
            IterableInAppLocation iterableInAppLocation = f14000b1;
            fb4Var.getClass();
            eh0.m11114K();
            C1212h c1212hM6912d = fb4Var.m11695f().m6912d(str2);
            if (c1212hM6912d == null) {
                eh0.m11121R("IterableApi", "trackInAppOpen: could not find an in-app message with ID: " + str2);
            } else if (fb4Var.m11690a()) {
                bl2 bl2Var = fb4Var.f38780k;
                JSONObject jSONObject = new JSONObject();
                try {
                    bl2Var.m3855l(jSONObject);
                    jSONObject.put("messageId", c1212hM6912d.f14027a);
                    jSONObject.put("messageContext", bl2.m3816I(c1212hM6912d, iterableInAppLocation));
                    jSONObject.put("deviceInfo", bl2Var.m3828H());
                    IterableInAppLocation iterableInAppLocation2 = IterableInAppLocation.IN_APP;
                    bl2Var.m3835P("events/trackInAppOpen", jSONObject);
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
            }
        }
        try {
            this.f14001M0.setAlpha(0.0f);
            this.f14001M0.postDelayed(new ac4(this, i), 500L);
        } catch (NullPointerException unused) {
            eh0.m11135p("IterableInAppFragmentHTMLNotification", "View not present. Failed to hide before resizing inapp");
        }
        return frameLayout;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: B */
    public final void mo2075B() {
        ac4 ac4Var;
        this.f5688b0 = true;
        Handler handler = this.f14007S0;
        if (handler != null && (ac4Var = this.f14008T0) != null) {
            handler.removeCallbacks(ac4Var);
        }
        this.f14008T0 = null;
        this.f14007S0 = null;
        if (m2105g() == null || !m2105g().isChangingConfigurations()) {
            f13998Z0 = null;
            f13999a1 = null;
            f14000b1 = null;
        }
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: I */
    public final void mo2082I(Bundle bundle) {
        super.mo2082I(bundle);
        bundle.putBoolean("InAppOpenTracked", true);
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: J */
    public final void mo2083J() {
        super.mo2083J();
        Dialog dialog = this.f8417H0;
        if (dialog == null || m6903o0(this.f14010V0) == InAppLayout.FULLSCREEN) {
            return;
        }
        m6906m0(dialog.getWindow(), "onStart");
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: L */
    public final void mo2084L() {
        zb4 zb4Var = this.f14003O0;
        if (zb4Var != null) {
            zb4Var.disable();
        }
        super.mo2084L();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        if (m6903o0(this.f14010V0) != InAppLayout.FULLSCREEN) {
            fg2 fg2Var = new fg2(6);
            WeakHashMap weakHashMap = dta.f36217a;
            wsa.m24145c(view, fg2Var);
        }
    }

    @Override // p000.be2
    /* JADX INFO: renamed from: h0 */
    public final Dialog mo3662h0(Bundle bundle) {
        yb4 yb4Var = new yb4(this, m2105g(), this.f8411B0);
        yb4Var.setOnCancelListener(new xd2(this, 1));
        yb4Var.requestWindowFeature(1);
        InAppLayout inAppLayoutM6903o0 = m6903o0(this.f14010V0);
        InAppLayout inAppLayout = InAppLayout.FULLSCREEN;
        if (inAppLayoutM6903o0 != inAppLayout) {
            m6906m0(yb4Var.getWindow(), "onCreateDialog");
        }
        if (m6903o0(this.f14010V0) == inAppLayout) {
            yb4Var.getWindow().setFlags(1024, 1024);
            return yb4Var;
        }
        if (m6903o0(this.f14010V0) != InAppLayout.TOP) {
            yb4Var.getWindow().setFlags(67108864, 67108864);
        }
        return yb4Var;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m6905l0(ColorDrawable colorDrawable, ColorDrawable colorDrawable2) {
        if (colorDrawable == null || colorDrawable2 == null) {
            return;
        }
        Dialog dialog = this.f8417H0;
        if (dialog == null || dialog.getWindow() == null) {
            eh0.m11135p("IterableInAppFragmentHTMLNotification", "Dialog or Window not present. Skipping background animation");
            return;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{colorDrawable, colorDrawable2});
        transitionDrawable.setCrossFadeEnabled(true);
        this.f8417H0.getWindow().setBackgroundDrawable(transitionDrawable);
        transitionDrawable.startTransition(300);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m6906m0(Window window, String str) {
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        int iM6904p0 = m6904p0(this.f14010V0);
        if (iM6904p0 == 16) {
            attributes.gravity = 17;
        } else if (iM6904p0 == 48) {
            attributes.gravity = 49;
        } else if (iM6904p0 == 80) {
            attributes.gravity = 81;
        }
        window.setAttributes(attributes);
        eh0.m11133m("IterableInAppFragmentHTMLNotification", "Set window gravity in " + str + ": " + attributes.gravity);
    }

    /* JADX INFO: renamed from: n0 */
    public final ColorDrawable m6907n0() {
        String str = this.f14013Y0;
        if (str == null) {
            eh0.m11133m("IterableInAppFragmentHTMLNotification", "Background Color does not exist. In App background animation will not be performed");
            return null;
        }
        try {
            return new ColorDrawable(ya1.m25016i(Color.parseColor(str), (int) (this.f14012X0 * 255.0d)));
        } catch (IllegalArgumentException unused) {
            eh0.m11135p("IterableInAppFragmentHTMLNotification", "Background color could not be identified for input string \"" + this.f14013Y0 + "\". Failed to load in-app background.");
            return null;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m6908q0() {
        int i;
        int i2 = 1;
        if (this.f14011W0) {
            int i3 = AbstractC1208d.f13997a[m6903o0(this.f14010V0).ordinal()];
            if (i3 != 1) {
                i = (i3 == 2 || i3 == 3 || i3 != 4) ? R$anim.fade_out_custom : R$anim.bottom_exit;
            } else {
                i = R$anim.top_exit;
            }
            try {
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(mo2107i(), i);
                animationLoadAnimation.setDuration(500L);
                this.f14001M0.startAnimation(animationLoadAnimation);
            } catch (Exception unused) {
                eh0.m11135p("IterableInAppFragmentHTMLNotification", "Failed to hide inapp with animation");
            }
        }
        m6905l0(m6907n0(), new ColorDrawable(0));
        this.f14001M0.postOnAnimationDelayed(new ac4(this, i2), 400L);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m6909r0() {
        C1212h c1212hM6912d = fb4.f38769t.m11695f().m6912d(this.f14006R0);
        if (c1212hM6912d == null) {
            eh0.m11135p("IterableInAppFragmentHTMLNotification", "Message with id " + this.f14006R0 + " does not exist");
            return;
        }
        if (!c1212hM6912d.f14041o || c1212hM6912d.f14038l) {
            return;
        }
        C1210f c1210fM11695f = fb4.f38769t.m11695f();
        synchronized (c1210fM11695f) {
            c1210fM11695f.m6915g(c1212hM6912d, null, null);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m6910s0() {
        if (this.f14007S0 == null) {
            this.f14007S0 = new Handler(Looper.getMainLooper());
        }
        ac4 ac4Var = this.f14008T0;
        if (ac4Var != null) {
            this.f14007S0.removeCallbacks(ac4Var);
        }
        ac4 ac4Var2 = new ac4(this, 2);
        this.f14008T0 = ac4Var2;
        this.f14007S0.postDelayed(ac4Var2, 200L);
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: z */
    public final void mo2124z(Bundle bundle) {
        super.mo2124z(bundle);
        Bundle bundle2 = this.f5695f;
        if (bundle2 != null) {
            this.f14005Q0 = bundle2.getString("HTML", null);
            this.f14004P0 = bundle2.getBoolean("CallbackOnCancel", false);
            this.f14006R0 = bundle2.getString("MessageId");
            bundle2.getDouble("BackgroundAlpha");
            this.f14010V0 = (Rect) bundle2.getParcelable("InsetPadding");
            this.f14012X0 = bundle2.getDouble("InAppBgAlpha");
            this.f14013Y0 = bundle2.getString("InAppBgColor", null);
            this.f14011W0 = bundle2.getBoolean("ShouldAnimate");
        }
        f13998Z0 = this;
    }
}
