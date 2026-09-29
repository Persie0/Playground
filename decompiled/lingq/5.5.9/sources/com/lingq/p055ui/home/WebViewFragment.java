package com.lingq.p055ui.home;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.List;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.Metadata;
import p040c4.C1681f;
import p225kk.C6716m;
import p254m2.C7472a;
import p368ri.AbstractC8810b;
import p368ri.C8814f;
import p402u0.C9371n;
import p471x2.C10029b0;
import p471x2.C10049l0;
import ph.C8318l2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/WebViewFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class WebViewFragment extends AbstractC8810b {

    /* JADX INFO: renamed from: S0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f22829S0 = {C0204c.m857q(WebViewFragment.class, "getBinding()Lcom/lingq/databinding/FragmentWebViewBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f22830Q0 = C4924a.m10477o0(this, WebViewFragment$binding$2.f22833j);

    /* JADX INFO: renamed from: R0 */
    public final C1681f f22831R0 = new C1681f(C5209i.m11118a(C8814f.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.home.WebViewFragment$special$$inlined$navArgs$1
        {
            super(0);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final Bundle mo807E() {
            Fragment fragment = this;
            Bundle bundle = fragment.f6101g;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(C0166e.m764j("Fragment ", fragment, " has null arguments"));
        }
    });

    /* JADX INFO: renamed from: com.lingq.ui.home.WebViewFragment$a */
    public static final class C3480a extends WebChromeClient {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8318l2 f22832a;

        public C3480a(C8318l2 c8318l2) {
            this.f22832a = c8318l2;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            C5207g.m11111f(webView, "view");
            C8318l2 c8318l2 = this.f22832a;
            c8318l2.f45007b.setProgress(i10, true);
            LinearProgressIndicator linearProgressIndicator = c8318l2.f45007b;
            if (i10 >= 99) {
                C5207g.m11110e(linearProgressIndicator, "lpiWebpageProgress");
                if (linearProgressIndicator.getVisibility() == 0) {
                    linearProgressIndicator.setProgress(0);
                    C5207g.m11110e(linearProgressIndicator, "lpiWebpageProgress");
                    C4924a.m10442U(linearProgressIndicator);
                    return;
                }
            }
            if (i10 < 99) {
                C5207g.m11110e(linearProgressIndicator, "lpiWebpageProgress");
                if (!(linearProgressIndicator.getVisibility() == 0)) {
                    linearProgressIndicator.m4935d();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_web_view, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C9371n c9371n = new C9371n(14, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c9371n);
        Dialog dialog = this.f6328G0;
        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.design_bottom_sheet) : null;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM8602w = BottomSheetBehavior.m8602w(viewFindViewById);
            C5207g.m11110e(bottomSheetBehaviorM8602w, "from(it)");
            bottomSheetBehaviorM8602w.m8606D(3);
            bottomSheetBehaviorM8602w.m8605C(m3599s().getDisplayMetrics().heightPixels);
            bottomSheetBehaviorM8602w.m8603A(true);
            bottomSheetBehaviorM8602w.f14828K = false;
        }
        C8318l2 c8318l2 = (C8318l2) this.f22830Q0.m10489a(this, f22829S0[0]);
        MaterialToolbar materialToolbar = c8318l2.f45008c;
        C1681f c1681f = this.f22831R0;
        String strM3600t = ((C8814f) c1681f.getValue()).f46702b;
        if (strM3600t == null) {
            strM3600t = m3600t(R.string.lingq_lingq);
        }
        materialToolbar.setTitle(strM3600t);
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        Drawable drawableM14849b = C7472a.c.m14849b(contextM3578a0, R.drawable.ic_arrow_back);
        MaterialToolbar materialToolbar2 = c8318l2.f45008c;
        materialToolbar2.setNavigationIcon(drawableM14849b);
        List<Integer> list = C6716m.f37937a;
        materialToolbar2.setNavigationIconTint(C6716m.m13333r(R.attr.primaryTextColor, m3578a0()));
        materialToolbar2.setNavigationOnClickListener(new ViewOnClickListenerC2239y(10, this));
        WebView webView = c8318l2.f45009d;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new C3480a(c8318l2));
        webView.loadUrl(((C8814f) c1681f.getValue()).f46701a);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }
}
