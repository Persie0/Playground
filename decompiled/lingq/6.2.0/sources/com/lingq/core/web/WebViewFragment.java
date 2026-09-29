package com.lingq.core.web;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.designsystem.R$style;
import com.lingq.core.p012ui.R$drawable;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.AbstractC3184kh;
import p000.C3309ls;
import p000.bh4;
import p000.br8;
import p000.cs4;
import p000.dta;
import p000.dua;
import p000.dw6;
import p000.gr3;
import p000.h31;
import p000.j3b;
import p000.jfa;
import p000.l3b;
import p000.mg3;
import p000.or1;
import p000.pb5;
import p000.qt3;
import p000.sq5;
import p000.tc4;
import p000.u91;
import p000.ui3;
import p000.uq0;
import p000.w41;
import p000.wfb;
import p000.wsa;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes2.dex */
public final class WebViewFragment extends qt3 {

    /* JADX INFO: renamed from: V0 */
    public static final /* synthetic */ bh4[] f24315V0 = {new PropertyReference1Impl(WebViewFragment.class, "binding", "getBinding()Lcom/lingq/core/web/databinding/FragmentWebViewBinding;")};

    /* JADX INFO: renamed from: S0 */
    public final C3309ls f24316S0;

    /* JADX INFO: renamed from: T0 */
    public final sq5 f24317T0;

    /* JADX INFO: renamed from: U0 */
    public final w41 f24318U0;

    public WebViewFragment() {
        super(8);
        this.f24316S0 = jfa.m14432o(this, WebViewFragment$binding$2.f24319i);
        this.f24317T0 = new sq5(3, y38.m24933a(l3b.class), new uq0(this, 20));
        final WebViewFragment$special$$inlined$viewModels$default$1 webViewFragment$special$$inlined$viewModels$default$1 = new WebViewFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.core.web.WebViewFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) webViewFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f24318U0 = new w41(y38.m24933a(C1943a.class), new ui3() { // from class: com.lingq.core.web.WebViewFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.core.web.WebViewFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                zta ztaVarMo2102d;
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f24333b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.core.web.WebViewFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return gr3Var != null ? gr3Var.mo2103e() : or1.f54780b;
            }
        });
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R$layout.fragment_web_view, viewGroup, false);
    }

    /* JADX INFO: renamed from: A0 */
    public final mg3 m8805A0() {
        return (mg3) this.f24316S0.getValue(this, f24315V0[0]);
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: L */
    public final void mo2084L() {
        super.mo2084L();
        C1943a c1943a = (C1943a) this.f24318U0.getValue();
        LinkedHashSet linkedHashSet = c1943a.f24342f;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("grammar guide language", AbstractC3184kh.m15223q(c1943a.f24338b.mo4589b2()));
        bundle.putString("grammar guide opened path", c1943a.f24341e.f48997b);
        bundle.putString("grammar guide topic", u91.m22596N0(linkedHashSet, null, null, null, null, 63));
        ((C1240a) c1943a.f24340d).m7025f("grammar guide viewed", bundle);
        linkedHashSet.clear();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        dw6 dw6Var = new dw6(this, 22);
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(view, dw6Var);
        Dialog dialog = this.f8417H0;
        View viewFindViewById = dialog != null ? dialog.findViewById(com.google.android.material.R$id.design_bottom_sheet) : null;
        int i = 0;
        int i2 = 3;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM6021C = BottomSheetBehavior.m6021C(viewFindViewById);
            bottomSheetBehaviorM6021C.m6032M(3);
            bottomSheetBehaviorM6021C.m6031L(m2110l().getDisplayMetrics().heightPixels);
            bottomSheetBehaviorM6021C.m6029J(true);
            bottomSheetBehaviorM6021C.f12695L = false;
        }
        final br8 br8Var = new br8(this, 18);
        this.f5709m0.mo21323g(new pb5(i2, this, new DialogInterface.OnKeyListener() { // from class: dfa
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) throws PendingIntent.CanceledException {
                if (i3 != 4) {
                    return false;
                }
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    return false;
                }
                br8Var.mo0a();
                return Boolean.TRUE.booleanValue();
            }
        }));
        mg3 mg3VarM8805A0 = m8805A0();
        MaterialToolbar materialToolbar = mg3VarM8805A0.f51280b;
        WebView webView = mg3VarM8805A0.f51281c;
        sq5 sq5Var = this.f24317T0;
        String strM2111m = ((l3b) sq5Var.getValue()).f48998c;
        if (strM2111m == null) {
            strM2111m = m2111m(R$string.lingq_lingq);
            strM2111m.getClass();
        }
        materialToolbar.setTitle(strM2111m);
        materialToolbar.setNavigationIcon(m2090R().getDrawable(R$drawable.ic_arrow_back));
        materialToolbar.setNavigationOnClickListener(new h31(this, 14));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new j3b(i, mg3VarM8805A0, this));
        webView.setWebViewClient(new tc4(this, 2));
        webView.loadUrl(((l3b) sq5Var.getValue()).f48996a);
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C1940x279f206c(this, Lifecycle$State.STARTED, null, this), 3);
    }

    @Override // p000.be2
    /* JADX INFO: renamed from: g0 */
    public final int mo3661g0() {
        return R$style.AppTheme_BottomSheetDialog;
    }
}
