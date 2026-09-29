package p000;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.iterable.iterableapi.C1209e;
import com.iterable.iterableapi.C1212h;
import com.iterable.iterableapi.IterableInAppCloseAction;
import com.iterable.iterableapi.IterableInAppLocation;
import com.lingq.core.web.C1943a;
import com.lingq.core.web.WebViewFragment;
import java.util.regex.Pattern;
import kotlinx.coroutines.flow.C3244l;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class tc4 extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62146a;

    /* JADX INFO: renamed from: b */
    public View.OnCreateContextMenuListener f62147b;

    public /* synthetic */ tc4(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.f62146a = i;
        this.f62147b = onCreateContextMenuListener;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        ProgressDialog progressDialog;
        switch (this.f62146a) {
            case 0:
                C1209e c1209e = (C1209e) this.f62147b;
                c1209e.f14002N0 = true;
                webView.postDelayed(new RunnableC3781y2(c1209e, 23), 100L);
                break;
            case 1:
                webView.getClass();
                str.getClass();
                super.onPageFinished(webView, str);
                g3b g3bVar = (g3b) this.f62147b;
                if (!g3bVar.f40148j && (progressDialog = g3bVar.f40143e) != null) {
                    progressDialog.dismiss();
                }
                FrameLayout frameLayout = g3bVar.f40145g;
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(0);
                }
                sc4 sc4Var = g3bVar.f40142d;
                if (sc4Var != null) {
                    sc4Var.setVisibility(0);
                }
                ImageView imageView = g3bVar.f40144f;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                g3bVar.f40149k = true;
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ProgressDialog progressDialog;
        switch (this.f62146a) {
            case 1:
                webView.getClass();
                str.getClass();
                sy2 sy2Var = sy2.f61585a;
                super.onPageStarted(webView, str, bitmap);
                g3b g3bVar = (g3b) this.f62147b;
                if (!g3bVar.f40148j && (progressDialog = g3bVar.f40143e) != null) {
                    progressDialog.show();
                    break;
                }
                break;
            case 2:
                super.onPageStarted(webView, str, bitmap);
                if (str != null) {
                    WebViewFragment webViewFragment = (WebViewFragment) this.f62147b;
                    bh4[] bh4VarArr = WebViewFragment.f24315V0;
                    C1943a c1943a = (C1943a) webViewFragment.f24318U0.getValue();
                    c1943a.getClass();
                    C3244l c3244l = c1943a.f24345i;
                    if (!str.equals(c3244l.getValue())) {
                        c3244l.m15572j(null, str);
                    }
                }
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.f62146a) {
            case 1:
                webView.getClass();
                str.getClass();
                str2.getClass();
                super.onReceivedError(webView, i, str, str2);
                ((g3b) this.f62147b).m12347e(new FacebookDialogException(str, i, str2));
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.f62146a) {
            case 1:
                webView.getClass();
                sslErrorHandler.getClass();
                sslError.getClass();
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                sslErrorHandler.cancel();
                ((g3b) this.f62147b).m12347e(new FacebookDialogException(null, -11, null));
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.f62146a) {
            case 2:
                r43.m20289a().m20290b(new Exception("Webview Fragment crash " + renderProcessGoneDetail));
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
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i;
        switch (this.f62146a) {
            case 0:
                C1209e c1209e = (C1209e) this.f62147b;
                c1209e.getClass();
                fb4 fb4Var = fb4.f38769t;
                String str2 = c1209e.f14006R0;
                IterableInAppLocation iterableInAppLocation = C1209e.f14000b1;
                fb4Var.getClass();
                eh0.m11114K();
                C1212h c1212hM6912d = fb4Var.m11695f().m6912d(str2);
                if (c1212hM6912d != null) {
                    if (fb4Var.m11690a()) {
                        bl2 bl2Var = fb4Var.f38780k;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            bl2Var.m3855l(jSONObject);
                            jSONObject.put("messageId", c1212hM6912d.f14027a);
                            jSONObject.put("clickedUrl", str);
                            jSONObject.put("messageContext", bl2.m3816I(c1212hM6912d, iterableInAppLocation));
                            jSONObject.put("deviceInfo", bl2Var.m3828H());
                            IterableInAppLocation iterableInAppLocation2 = IterableInAppLocation.IN_APP;
                            bl2Var.m3835P("events/trackInAppClick", jSONObject);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                } else {
                    fb4Var.m11701n(str2, str);
                }
                fb4.f38769t.m11702o(c1209e.f14006R0, str, IterableInAppCloseAction.LINK, C1209e.f14000b1);
                p33 p33Var = C1209e.f13999a1;
                if (p33Var != null) {
                    p33Var.m18869K(Uri.parse(str));
                }
                c1209e.m6909r0();
                c1209e.m6908q0();
                return true;
            case 1:
                g3b g3bVar = (g3b) this.f62147b;
                webView.getClass();
                str.getClass();
                sy2 sy2Var = sy2.f61585a;
                Uri uri = Uri.parse(str);
                boolean z = uri.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", uri.getPath());
                if (!cl9.m4842Y(str, g3bVar.f40140b, false)) {
                    if (cl9.m4842Y(str, "fbconnect://cancel", false)) {
                        g3bVar.cancel();
                        return true;
                    }
                    if (!z && !vk9.m23380c0(str, "touch", false)) {
                        try {
                            g3bVar.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            return true;
                        } catch (ActivityNotFoundException unused) {
                        }
                    }
                    return false;
                }
                Bundle bundleMo12345c = g3bVar.mo12345c(str);
                String string = bundleMo12345c.getString("error");
                if (string == null) {
                    string = bundleMo12345c.getString("error_type");
                }
                String string2 = bundleMo12345c.getString("error_msg");
                if (string2 == null) {
                    string2 = bundleMo12345c.getString("error_message");
                }
                if (string2 == null) {
                    string2 = bundleMo12345c.getString("error_description");
                }
                String string3 = bundleMo12345c.getString("error_code");
                if (string3 != null && !bna.m3945d0(string3)) {
                    try {
                        i = Integer.parseInt(string3);
                    } catch (NumberFormatException unused2) {
                        i = -1;
                    }
                    break;
                } else {
                    i = -1;
                }
                if (bna.m3945d0(string) && bna.m3945d0(string2) && i == -1) {
                    c3b c3bVar = g3bVar.f40141c;
                    if (c3bVar == null || g3bVar.f40147i) {
                        return true;
                    }
                    g3bVar.f40147i = true;
                    c3bVar.mo4304a(bundleMo12345c, null);
                    g3bVar.dismiss();
                    return true;
                }
                if (string != null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) {
                    g3bVar.cancel();
                    return true;
                }
                if (i == 4201) {
                    g3bVar.cancel();
                    return true;
                }
                g3bVar.m12347e(new FacebookServiceException(new FacebookRequestError(string, i, string2), string2));
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public /* synthetic */ tc4() {
        this.f62146a = 0;
    }
}
