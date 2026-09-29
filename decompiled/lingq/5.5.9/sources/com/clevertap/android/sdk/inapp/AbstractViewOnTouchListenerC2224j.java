package com.clevertap.android.sdk.inapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.clevertap.android.sdk.C2181a;
import java.net.URLDecoder;
import p003a2.C0009a;
import p066d7.C5054f;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC2224j extends AbstractC2221h implements View.OnTouchListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: D0 */
    public final GestureDetector f11204D0 = new GestureDetector(new a());

    /* JADX INFO: renamed from: E0 */
    public C2214d0 f11205E0;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.j$a */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m6533a(boolean z10) {
            AnimationSet animationSet = new AnimationSet(true);
            AbstractViewOnTouchListenerC2224j abstractViewOnTouchListenerC2224j = AbstractViewOnTouchListenerC2224j.this;
            animationSet.addAnimation(z10 ? new TranslateAnimation(0.0f, abstractViewOnTouchListenerC2224j.m6517r0(50), 0.0f, 0.0f) : new TranslateAnimation(0.0f, -abstractViewOnTouchListenerC2224j.m6517r0(50), 0.0f, 0.0f));
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.setDuration(300L);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setAnimationListener(new AnimationAnimationListenerC2223i(this));
            abstractViewOnTouchListenerC2224j.f11205E0.startAnimation(animationSet);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f10) {
            if (motionEvent.getX() - motionEvent2.getX() > 120.0f && Math.abs(f3) > 200.0f) {
                m6533a(false);
                return true;
            }
            if (motionEvent2.getX() - motionEvent.getX() <= 120.0f || Math.abs(f3) <= 200.0f) {
                return false;
            }
            m6533a(true);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.j$b */
    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String string;
            AbstractViewOnTouchListenerC2224j abstractViewOnTouchListenerC2224j = AbstractViewOnTouchListenerC2224j.this;
            try {
                Bundle bundleM10733a = C5054f.m10733a(str, false);
                if (bundleM10733a.containsKey("wzrk_c2a") && (string = bundleM10733a.getString("wzrk_c2a")) != null) {
                    String[] strArrSplit = string.split("__dl__");
                    if (strArrSplit.length == 2) {
                        bundleM10733a.putString("wzrk_c2a", URLDecoder.decode(strArrSplit[0], "UTF-8"));
                        str = strArrSplit[1];
                    }
                }
                InterfaceC2222h0 interfaceC2222h0M6516q0 = abstractViewOnTouchListenerC2224j.m6516q0();
                if (interfaceC2222h0M6516q0 != null) {
                    interfaceC2222h0M6516q0.mo6436D(abstractViewOnTouchListenerC2224j.f11186z0, bundleM10733a, null);
                }
                C2181a.m6449a("Executing call to action for in-app: " + str);
                abstractViewOnTouchListenerC2224j.m6514o0(bundleM10733a, str);
            } catch (Throwable th2) {
                C2181a.m6457j("Error parsing the in-app notification action!", th2);
            }
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewMo6531t0;
        try {
            viewMo6531t0 = mo6531t0(layoutInflater, viewGroup);
            ViewGroup viewGroupMo6530s0 = mo6530s0(viewMo6531t0);
            Context context = this.f11184x0;
            CTInAppNotification cTInAppNotification = this.f11186z0;
            this.f11205E0 = new C2214d0(context, cTInAppNotification.f11110g0, cTInAppNotification.f11078H, cTInAppNotification.f11112h0, cTInAppNotification.f11079I);
            this.f11205E0.setWebViewClient(new b());
            this.f11205E0.setOnTouchListener(this);
            this.f11205E0.setOnLongClickListener(this);
            if (viewGroupMo6530s0 != null) {
                viewGroupMo6530s0.addView(this.f11205E0);
            }
        } catch (Throwable th2) {
            C2181a c2181aM6433b = this.f11183w0.m6433b();
            String str = this.f11183w0.f10995a;
            c2181aM6433b.getClass();
            C2181a.m6461n(str, "Fragment view not created", th2);
            viewMo6531t0 = null;
        }
        return viewMo6531t0;
    }

    @Override // com.clevertap.android.sdk.inapp.AbstractC2211c, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        super.mo3572U(view, bundle);
        m6532u0();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f6090a0 = true;
        m6532u0();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f11204D0.onTouchEvent(motionEvent) && motionEvent.getAction() != 2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: s0 */
    public abstract ViewGroup mo6530s0(View view);

    /* JADX INFO: renamed from: t0 */
    public abstract View mo6531t0(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* JADX INFO: renamed from: u0 */
    public final void m6532u0() {
        this.f11205E0.m6526a();
        Point point = this.f11205E0.f11190a;
        int i10 = point.y;
        int i11 = point.x;
        float f3 = m3599s().getDisplayMetrics().density;
        String strReplaceFirst = this.f11186z0.f11081K.replaceFirst("<head>", "<head>" + C0009a.m20h("<style>body{width:", (int) (i11 / f3), "px; height: ", (int) (i10 / f3), "px; margin: 0; padding:0;}</style>"));
        C2181a.m6455h("Density appears to be " + f3);
        this.f11205E0.setInitialScale((int) (f3 * 100.0f));
        this.f11205E0.loadDataWithBaseURL(null, strReplaceFirst, "text/html", "utf-8", null);
    }
}
