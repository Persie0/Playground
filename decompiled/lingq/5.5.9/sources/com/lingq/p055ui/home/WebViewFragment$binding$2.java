package com.lingq.p055ui.home;

import ae.C0062b;
import android.view.View;
import android.webkit.WebView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8318l2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class WebViewFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8318l2> {

    /* JADX INFO: renamed from: j */
    public static final WebViewFragment$binding$2 f22833j = new WebViewFragment$binding$2();

    public WebViewFragment$binding$2() {
        super(1, C8318l2.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentWebViewBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8318l2 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) C0062b.m298P0(view2, R.id.appbar);
        if (appBarLayout != null) {
            i10 = R.id.lpiWebpageProgress;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C0062b.m298P0(view2, R.id.lpiWebpageProgress);
            if (linearProgressIndicator != null) {
                i10 = R.id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) C0062b.m298P0(view2, R.id.toolbar);
                if (materialToolbar != null) {
                    i10 = R.id.webView;
                    WebView webView = (WebView) C0062b.m298P0(view2, R.id.webView);
                    if (webView != null) {
                        return new C8318l2(appBarLayout, linearProgressIndicator, materialToolbar, webView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
