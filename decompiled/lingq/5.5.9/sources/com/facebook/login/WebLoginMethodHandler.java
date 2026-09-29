package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.ActivityC0979t;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import kotlin.Metadata;
import p067d8.C5086z;
import p291o7.C7993c0;
import p291o7.C8004n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/facebook/login/WebLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: c */
    public String f11644c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C5207g.m11111f(parcel, "source");
    }

    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX INFO: renamed from: r */
    public final Bundle m6727r(LoginClient.Request request) {
        ActivityC0979t activityC0979tM6706e;
        Bundle bundle = new Bundle();
        C5086z c5086z = C5086z.f33015a;
        Set<String> set = request.f11620b;
        if (!(set == null || set.isEmpty())) {
            String strJoin = TextUtils.join(",", request.f11620b);
            bundle.putString("scope", strJoin);
            m6715a(strJoin, "scope");
        }
        DefaultAudience defaultAudience = request.f11621c;
        if (defaultAudience == null) {
            defaultAudience = DefaultAudience.NONE;
        }
        bundle.putString("default_audience", defaultAudience.getNativeProtocolAudience());
        bundle.putString("state", m6716c(request.f11623e));
        Date date = AccessToken.f11370l;
        AccessToken accessTokenM6595b = AccessToken.C2262b.m6595b();
        String str = accessTokenM6595b == null ? null : accessTokenM6595b.f11375e;
        String str2 = "0";
        if (str == null) {
            activityC0979tM6706e = m6717d().m6706e();
            if (activityC0979tM6706e == null) {
                C5086z.m10819d(activityC0979tM6706e);
            }
            m6715a(str2, "access_token");
        } else {
            Context contextM6706e = m6717d().m6706e();
            if (contextM6706e == null) {
                contextM6706e = C8004n.m15871a();
            }
            if (C5207g.m11106a(str, contextM6706e.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
                bundle.putString("access_token", str);
                m6715a("1", "access_token");
            } else {
                activityC0979tM6706e = m6717d().m6706e();
                if (activityC0979tM6706e == null) {
                    C5086z.m10819d(activityC0979tM6706e);
                }
                m6715a(str2, "access_token");
            }
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        C8004n c8004n = C8004n.f43550a;
        bundle.putString("ies", C7993c0.m15849b() ? "1" : "0");
        return bundle;
    }

    /* JADX INFO: renamed from: w */
    public abstract AccessTokenSource getF11648g();

    /* JADX INFO: renamed from: x */
    public final void m6728x(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        LoginClient.Result result;
        LoginClient loginClientM6717d = m6717d();
        String strValueOf = null;
        this.f11644c = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f11644c = bundle.getString("e2e");
            }
            try {
                AccessToken accessTokenM6721b = LoginMethodHandler.C2325a.m6721b(request.f11620b, bundle, getF11648g(), request.f11622d);
                result = new LoginClient.Result(loginClientM6717d.f11607g, LoginClient.Result.Code.SUCCESS, accessTokenM6721b, LoginMethodHandler.C2325a.m6722c(bundle, request.f11615J), null, null);
                if (loginClientM6717d.m6706e() != null) {
                    try {
                        CookieSyncManager.createInstance(loginClientM6717d.m6706e()).sync();
                    } catch (Exception unused) {
                    }
                    if (accessTokenM6721b != null) {
                        String str = accessTokenM6721b.f11375e;
                        Context contextM6706e = m6717d().m6706e();
                        if (contextM6706e == null) {
                            contextM6706e = C8004n.m15871a();
                        }
                        contextM6706e.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
                    }
                }
            } catch (FacebookException e10) {
                LoginClient.Request request2 = loginClientM6717d.f11607g;
                String message = e10.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                result = new LoginClient.Result(request2, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null);
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            result = new LoginClient.Result(loginClientM6717d.f11607g, LoginClient.Result.Code.CANCEL, null, "User canceled log in.", null);
        } else {
            this.f11644c = null;
            String message2 = facebookException == null ? null : facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError facebookRequestError = ((FacebookServiceException) facebookException).f11447b;
                strValueOf = String.valueOf(facebookRequestError.f11439b);
                message2 = facebookRequestError.toString();
            }
            String str2 = strValueOf;
            LoginClient.Request request3 = loginClientM6717d.f11607g;
            ArrayList arrayList2 = new ArrayList();
            if (message2 != null) {
                arrayList2.add(message2);
            }
            result = new LoginClient.Result(request3, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList2), str2);
        }
        C5086z c5086z = C5086z.f33015a;
        if (!C5086z.m10802A(this.f11644c)) {
            m6718j(this.f11644c);
        }
        loginClientM6717d.m6705d(result);
    }
}
