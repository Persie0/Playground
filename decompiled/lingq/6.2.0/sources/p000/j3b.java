package p000;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.lingq.core.web.C1943a;
import com.lingq.core.web.WebViewFragment;

/* JADX INFO: loaded from: classes2.dex */
public final class j3b extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45025a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f45026b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f45027c;

    public /* synthetic */ j3b(int i, Object obj, Object obj2) {
        this.f45025a = i;
        this.f45026b = obj;
        this.f45027c = obj2;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        int i2 = this.f45025a;
        Object obj = this.f45026b;
        switch (i2) {
            case 0:
                webView.getClass();
                LinearProgressIndicator linearProgressIndicator = ((mg3) obj).f51279a;
                linearProgressIndicator.setProgress(i, true);
                if (i >= 99 && linearProgressIndicator.getVisibility() == 0) {
                    linearProgressIndicator.setProgress(0);
                    jfa.m14425h(linearProgressIndicator);
                    break;
                } else if (i < 99 && linearProgressIndicator.getVisibility() != 0) {
                    linearProgressIndicator.m6163e();
                    break;
                }
                break;
            default:
                super.onProgressChanged(webView, i);
                t66 t66Var = (t66) obj;
                if (i != 100) {
                    t66Var.setValue(Boolean.TRUE);
                    ((sc9) this.f45027c).m21223i(i);
                } else {
                    t66Var.setValue(Boolean.FALSE);
                }
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        String url;
        String string;
        switch (this.f45025a) {
            case 0:
                super.onReceivedTitle(webView, str);
                if (str != null) {
                    WebViewFragment webViewFragment = (WebViewFragment) this.f45027c;
                    if (webView != null && (url = webView.getUrl()) != null && vk9.m23380c0(url, "grammar-resource", false)) {
                        bh4[] bh4VarArr = WebViewFragment.f24315V0;
                        C1943a c1943a = (C1943a) webViewFragment.f24318U0.getValue();
                        String str2 = (String) u91.m22598P0(vk9.m23365A0(str, new String[]{"-"}, 0, 6));
                        if (str2 == null || (string = vk9.m23376L0(str2).toString()) == null) {
                            string = "";
                        }
                        c1943a.getClass();
                        c1943a.f24342f.add(string);
                        break;
                    }
                }
                break;
            default:
                super.onReceivedTitle(webView, str);
                break;
        }
    }
}
