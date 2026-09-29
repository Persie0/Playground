package com.lingq.feature.dictionary;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p000.lda;
import p000.r43;
import p000.wfb;

/* JADX INFO: renamed from: com.lingq.feature.dictionary.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C2068l extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2069m f25846a;

    public C2068l(C2069m c2069m) {
        this.f25846a = c2069m;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C2069m c2069m = this.f25846a;
        wfb.m23926u(lda.m16103C(c2069m), null, null, new DictionaryContentViewModel$updateDictionaryWebViewLoading$1(c2069m, false, null), 3);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        C2069m c2069m = this.f25846a;
        wfb.m23926u(lda.m16103C(c2069m), null, null, new DictionaryContentViewModel$updateDictionaryWebViewLoading$1(c2069m, true, null), 3);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        r43.m20289a().m20290b(new Exception("Webview Dict Content crash " + renderProcessGoneDetail));
        ViewParent parent = webView != null ? webView.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        if (webView == null) {
            return true;
        }
        webView.destroy();
        return true;
    }
}
