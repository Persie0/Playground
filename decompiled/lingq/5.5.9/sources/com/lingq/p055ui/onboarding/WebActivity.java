package com.lingq.p055ui.onboarding;

import ae.C0062b;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.AbstractC0195n;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import p080e.AbstractC5269a;
import p225kk.C6716m;
import p254m2.C7472a;
import ph.C8255b;
import sj.AbstractActivityC9049h;
import sj.ViewOnClickListenerC9058q;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/onboarding/WebActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class WebActivity extends AbstractActivityC9049h {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ int f29425Y = 0;

    /* JADX INFO: renamed from: W */
    public final InterfaceC9070c f29426W = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<C8255b>() { // from class: com.lingq.ui.onboarding.WebActivity$special$$inlined$viewBinding$1
        {
            super(0);
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final C8255b mo807E() {
            LayoutInflater layoutInflater = this.getLayoutInflater();
            C5207g.m11110e(layoutInflater, "layoutInflater");
            View viewInflate = layoutInflater.inflate(R.layout.activity_web, (ViewGroup) null, false);
            int i10 = R.id.lpiWebpageProgress;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C0062b.m298P0(viewInflate, R.id.lpiWebpageProgress);
            if (linearProgressIndicator != null) {
                i10 = R.id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) C0062b.m298P0(viewInflate, R.id.toolbar);
                if (materialToolbar != null) {
                    i10 = R.id.web_view;
                    WebView webView = (WebView) C0062b.m298P0(viewInflate, R.id.web_view);
                    if (webView != null) {
                        return new C8255b((CoordinatorLayout) viewInflate, linearProgressIndicator, materialToolbar, webView);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
        }
    });

    /* JADX INFO: renamed from: X */
    public final C4507a f29427X = new C4507a();

    /* JADX INFO: renamed from: com.lingq.ui.onboarding.WebActivity$a */
    public static final class C4507a extends AbstractC0195n {
        public C4507a() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0195n
        /* JADX INFO: renamed from: a */
        public final void mo823a() {
            WebActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.onboarding.WebActivity$b */
    public static final class C4508b extends WebChromeClient {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8255b f29429a;

        public C4508b(C8255b c8255b) {
            this.f29429a = c8255b;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            C5207g.m11111f(webView, "view");
            C8255b c8255b = this.f29429a;
            c8255b.f44595b.setProgress(i10, true);
            LinearProgressIndicator linearProgressIndicator = c8255b.f44595b;
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

    @Override // androidx.fragment.app.ActivityC0979t, androidx.activity.ComponentActivity, p232l2.ActivityC7230i, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC9070c interfaceC9070c = this.f29426W;
        setContentView(((C8255b) interfaceC9070c.getValue()).f44594a);
        this.f444h.m804a(this, this.f29427X);
        C8255b c8255b = (C8255b) interfaceC9070c.getValue();
        m879M().mo11349y(c8255b.f44596c);
        Bundle extras = getIntent().getExtras();
        String string = null;
        String string2 = extras != null ? extras.getString("url") : null;
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            string = extras2.getString("title");
        }
        AbstractC5269a abstractC5269aMo11335i = m879M().mo11335i();
        if (abstractC5269aMo11335i != null) {
            if (string == null) {
                string = getString(R.string.lingq_lingq);
            }
            abstractC5269aMo11335i.mo11322n(string);
        }
        Object obj = C7472a.f41322a;
        Drawable drawableM14849b = C7472a.c.m14849b(this, R.drawable.ic_arrow_back);
        MaterialToolbar materialToolbar = c8255b.f44596c;
        materialToolbar.setNavigationIcon(drawableM14849b);
        List<Integer> list = C6716m.f37937a;
        materialToolbar.setNavigationIconTint(C6716m.m13333r(R.attr.primaryTextColor, this));
        materialToolbar.setNavigationOnClickListener(new ViewOnClickListenerC9058q(0, this));
        WebView webView = c8255b.f44597d;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new C4508b(c8255b));
        if (string2 != null) {
            webView.loadUrl(string2);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C5207g.m11111f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        finish();
        return true;
    }
}
