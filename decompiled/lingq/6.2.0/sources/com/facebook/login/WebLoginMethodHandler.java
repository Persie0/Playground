package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p000.bna;
import p000.ema;
import p000.id3;
import p000.sy2;
import p000.x74;
import p000.ymb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: c */
    public String f11491c;

    /* JADX INFO: renamed from: l */
    public void mo5202l(Bundle bundle, LoginClient.Request request) {
        request.getClass();
        LoginTargetApp loginTargetApp = request.f11457I;
        String strMo5198f = request.f11468e;
        if (strMo5198f == null || strMo5198f.length() == 0) {
            strMo5198f = mo5198f();
        }
        bundle.putString("redirect_uri", strMo5198f);
        boolean z = loginTargetApp == LoginTargetApp.INSTAGRAM;
        String str = request.f11467d;
        if (z) {
            bundle.putString("app_id", str);
        } else {
            bundle.putString("client_id", str);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
            sy2 sy2Var = sy2.f61585a;
        }
        String string = jSONObject.toString();
        string.getClass();
        bundle.putString("e2e", string);
        if (loginTargetApp == LoginTargetApp.INSTAGRAM) {
            bundle.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.f11465b.contains("openid")) {
                bundle.putString("nonce", request.f11460L);
            }
            bundle.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        bundle.putString("code_challenge", request.f11462N);
        CodeChallengeMethod codeChallengeMethod = request.f11463O;
        bundle.putString("code_challenge_method", codeChallengeMethod != null ? codeChallengeMethod.name() : null);
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", request.f11473j);
        bundle.putString("login_behavior", request.f11464a.name());
        sy2 sy2Var2 = sy2.f61585a;
        bundle.putString("sdk", "android-18.2.3");
        if (mo5203n() != null) {
            bundle.putString("sso", mo5203n());
        }
        bundle.putString("cct_prefetching", sy2.f61598n ? "1" : "0");
        if (request.f11458J) {
            bundle.putString("fx_app", loginTargetApp.toString());
        }
        if (request.f11459K) {
            bundle.putString("skip_dedupe", "true");
        }
        String str2 = request.f11475l;
        if (str2 != null) {
            bundle.putString("messenger_page_id", str2);
            bundle.putString("reset_messenger_state", request.f11456H ? "1" : "0");
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX INFO: renamed from: m */
    public final Bundle m5247m(LoginClient.Request request) {
        id3 id3VarM5221e;
        request.getClass();
        Bundle bundle = new Bundle();
        Set set = request.f11465b;
        if (set != null && !set.isEmpty()) {
            String strJoin = TextUtils.join(",", request.f11465b);
            bundle.putString("scope", strJoin);
            m5238a("scope", strJoin);
        }
        DefaultAudience defaultAudience = request.f11466c;
        if (defaultAudience == null) {
            defaultAudience = DefaultAudience.NONE;
        }
        bundle.putString("default_audience", defaultAudience.getNativeProtocolAudience());
        bundle.putString("state", m5239c(request.f11470g));
        Date date = AccessToken.f11306l;
        AccessToken accessTokenM24363t = x74.m24363t();
        String str = accessTokenM24363t != null ? accessTokenM24363t.f11311e : null;
        if (str == null) {
            id3VarM5221e = m5240d().m5221e();
            if (id3VarM5221e != null) {
                bna.m3911B(id3VarM5221e);
            }
            m5238a("access_token", "0");
        } else {
            Context contextM5221e = m5240d().m5221e();
            if (contextM5221e == null) {
                contextM5221e = sy2.m21766a();
            }
            if (str.equals(contextM5221e.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
                bundle.putString("access_token", str);
                m5238a("access_token", "1");
            } else {
                id3VarM5221e = m5240d().m5221e();
                if (id3VarM5221e != null) {
                    bna.m3911B(id3VarM5221e);
                }
                m5238a("access_token", "0");
            }
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        sy2 sy2Var = sy2.f61585a;
        bundle.putString("ies", ema.m11256c() ? "1" : "0");
        return bundle;
    }

    /* JADX INFO: renamed from: n */
    public String mo5203n() {
        return null;
    }

    /* JADX INFO: renamed from: o */
    public abstract AccessTokenSource mo5204o();

    /* JADX INFO: renamed from: p */
    public final void m5248p(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        LoginClient.Result result;
        request.getClass();
        LoginClient loginClientM5240d = m5240d();
        String strValueOf = null;
        this.f11491c = null;
        String str = request.f11468e;
        if (str != null && str.length() != 0 && !str.equals(mo5198f())) {
            if (facebookException instanceof FacebookOperationCanceledException) {
                loginClientM5240d.m5220d(new LoginClient.Result(loginClientM5240d.f11450g, LoginClient.Result.Code.CANCEL, null, "User canceled log in.", null));
                return;
            }
            if (facebookException != null) {
                this.f11491c = null;
                String message = facebookException.getMessage();
                if (facebookException instanceof FacebookServiceException) {
                    FacebookRequestError facebookRequestError = ((FacebookServiceException) facebookException).f11366b;
                    strValueOf = String.valueOf(facebookRequestError.f11358b);
                    message = facebookRequestError.toString();
                }
                String str2 = strValueOf;
                LoginClient.Request request2 = loginClientM5240d.f11450g;
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                loginClientM5240d.m5220d(new LoginClient.Result(request2, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), str2));
                return;
            }
            return;
        }
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f11491c = bundle.getString("e2e");
            }
            try {
                AccessToken accessTokenM25200b = ymb.m25200b(request.f11465b, bundle, mo5204o(), request.f11467d);
                result = new LoginClient.Result(loginClientM5240d.f11450g, LoginClient.Result.Code.SUCCESS, accessTokenM25200b, ymb.m25201c(request.f11460L, bundle), null, null);
                if (loginClientM5240d.m5221e() != null) {
                    try {
                        CookieSyncManager.createInstance(loginClientM5240d.m5221e()).sync();
                    } catch (Exception unused) {
                    }
                    if (accessTokenM25200b != null) {
                        String str3 = accessTokenM25200b.f11311e;
                        Context contextM5221e = m5240d().m5221e();
                        if (contextM5221e == null) {
                            contextM5221e = sy2.m21766a();
                        }
                        contextM5221e.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str3).apply();
                    }
                }
            } catch (FacebookException e) {
                LoginClient.Request request3 = loginClientM5240d.f11450g;
                String message2 = e.getMessage();
                ArrayList arrayList2 = new ArrayList();
                if (message2 != null) {
                    arrayList2.add(message2);
                }
                result = new LoginClient.Result(request3, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList2), null);
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            result = new LoginClient.Result(loginClientM5240d.f11450g, LoginClient.Result.Code.CANCEL, null, "User canceled log in.", null);
        } else {
            this.f11491c = null;
            String message3 = facebookException != null ? facebookException.getMessage() : null;
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError facebookRequestError2 = ((FacebookServiceException) facebookException).f11366b;
                strValueOf = String.valueOf(facebookRequestError2.f11358b);
                message3 = facebookRequestError2.toString();
            }
            String str4 = strValueOf;
            LoginClient.Request request4 = loginClientM5240d.f11450g;
            ArrayList arrayList3 = new ArrayList();
            if (message3 != null) {
                arrayList3.add(message3);
            }
            result = new LoginClient.Result(request4, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList3), str4);
        }
        if (!bna.m3945d0(this.f11491c)) {
            m5241g(this.f11491c);
        }
        loginClientM5240d.m5220d(result);
    }
}
