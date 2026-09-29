package com.clevertap.android.sdk.inapp;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.linguist.R;
import java.net.URLDecoder;
import p003a2.C0009a;
import p066d7.C5054f;
import p290o6.C7970n;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2217f extends AbstractC2213d {

    /* JADX INFO: renamed from: D0 */
    public C2214d0 f11198D0;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.f$a */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String string;
            AbstractC2217f abstractC2217f = AbstractC2217f.this;
            try {
                Bundle bundleM10733a = C5054f.m10733a(str, false);
                if (bundleM10733a.containsKey("wzrk_c2a") && (string = bundleM10733a.getString("wzrk_c2a")) != null) {
                    String[] strArrSplit = string.split("__dl__");
                    if (strArrSplit.length == 2) {
                        bundleM10733a.putString("wzrk_c2a", URLDecoder.decode(strArrSplit[0], "UTF-8"));
                        str = strArrSplit[1];
                    }
                }
                InterfaceC2222h0 interfaceC2222h0M6516q0 = abstractC2217f.m6516q0();
                if (interfaceC2222h0M6516q0 != null) {
                    interfaceC2222h0M6516q0.mo6436D(abstractC2217f.f11186z0, bundleM10733a, null);
                }
                C2181a.m6449a("Executing call to action for in-app: " + str);
                abstractC2217f.m6514o0(bundleM10733a, str);
            } catch (Throwable th2) {
                C2181a.m6457j("Error parsing the in-app notification action!", th2);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: A0 */
    public RelativeLayout.LayoutParams mo6527A0() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(2, this.f11198D0.getId());
        layoutParams.addRule(1, this.f11198D0.getId());
        int i10 = -(m6517r0(40) / 2);
        layoutParams.setMargins(i10, 0, 0, i10);
        return layoutParams;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m6528B0() {
        this.f11198D0.m6526a();
        if (!this.f11186z0.f11113i.isEmpty()) {
            String str = this.f11186z0.f11113i;
            this.f11198D0.setWebViewClient(new WebViewClient());
            this.f11198D0.loadUrl(str);
            return;
        }
        Point point = this.f11198D0.f11190a;
        int i10 = point.y;
        int i11 = point.x;
        float f3 = m3599s().getDisplayMetrics().density;
        String strReplaceFirst = this.f11186z0.f11081K.replaceFirst("<head>", "<head>" + C0009a.m20h("<style>body{width:", (int) (i11 / f3), "px; height: ", (int) (i10 / f3), "px; margin: 0; padding:0;}</style>"));
        C2181a.m6455h("Density appears to be " + f3);
        this.f11198D0.setInitialScale((int) (f3 * 100.0f));
        this.f11198D0.loadDataWithBaseURL(null, strReplaceFirst, "text/html", "utf-8", null);
    }

    @Override // com.clevertap.android.sdk.inapp.AbstractC2211c, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: F */
    public final void mo467F(Context context) {
        super.mo467F(context);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: H */
    public final void mo3560H(Bundle bundle) {
        super.mo3560H(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            View viewInflate = layoutInflater.inflate(R.layout.inapp_html_full, viewGroup, false);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.inapp_html_full_relative_layout);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            char c10 = this.f11186z0.f11094X;
            if (c10 == 'b') {
                layoutParams.addRule(12);
            } else if (c10 == 'c') {
                layoutParams.addRule(13);
            } else if (c10 == 'l') {
                layoutParams.addRule(9);
            } else if (c10 == 'r') {
                layoutParams.addRule(11);
            } else if (c10 == 't') {
                layoutParams.addRule(10);
            }
            layoutParams.setMargins(0, 0, 0, 0);
            Context context = this.f11184x0;
            CTInAppNotification cTInAppNotification = this.f11186z0;
            this.f11198D0 = new C2214d0(context, cTInAppNotification.f11110g0, cTInAppNotification.f11078H, cTInAppNotification.f11112h0, cTInAppNotification.f11079I);
            this.f11198D0.setWebViewClient(new a());
            if (this.f11186z0.f11087Q) {
                this.f11198D0.getSettings().setJavaScriptEnabled(true);
                this.f11198D0.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
                this.f11198D0.getSettings().setAllowContentAccess(false);
                this.f11198D0.getSettings().setAllowFileAccess(false);
                this.f11198D0.getSettings().setAllowFileAccessFromFileURLs(false);
                this.f11198D0.addJavascriptInterface(new C7970n(CleverTapAPI.m6423j(m3582e(), this.f11183w0, null), this), "CleverTap");
            }
            if (this.f11186z0.f11115j) {
                relativeLayout.setBackground(new ColorDrawable(-1157627904));
            } else {
                relativeLayout.setBackground(new ColorDrawable(0));
            }
            relativeLayout.addView(this.f11198D0, layoutParams);
            if (this.f11186z0.f11095Y) {
                this.f11182v0 = new CloseImageView(this.f11184x0);
                RelativeLayout.LayoutParams layoutParamsMo6527A0 = mo6527A0();
                this.f11182v0.setOnClickListener(new ViewOnClickListenerC2215e(this));
                relativeLayout.addView(this.f11182v0, layoutParamsMo6527A0);
            }
            return viewInflate;
        } catch (Throwable th2) {
            C2181a c2181aM6433b = this.f11183w0.m6433b();
            String str = this.f11183w0.f10995a;
            c2181aM6433b.getClass();
            C2181a.m6461n(str, "Fragment view not created", th2);
            return null;
        }
    }

    @Override // com.clevertap.android.sdk.inapp.AbstractC2211c, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        super.mo3572U(view, bundle);
        m6528B0();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f6090a0 = true;
        m6528B0();
    }
}
