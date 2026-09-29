package com.lingq.core.web;

import android.view.View;
import android.webkit.WebView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.lfa;
import p000.mg3;
import p000.vi3;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class WebViewFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final WebViewFragment$binding$2 f24319i = new WebViewFragment$binding$2(1, mg3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/core/web/databinding/FragmentWebViewBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.appbar;
        if (((AppBarLayout) lfa.m16159c(view, i)) != null) {
            i = R$id.lpiWebpageProgress;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) lfa.m16159c(view, i);
            if (linearProgressIndicator != null) {
                i = R$id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) lfa.m16159c(view, i);
                if (materialToolbar != null) {
                    i = R$id.webView;
                    WebView webView = (WebView) lfa.m16159c(view, i);
                    if (webView != null) {
                        return new mg3(linearProgressIndicator, materialToolbar, webView);
                    }
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
