package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p000.AbstractC3122is;
import p000.AbstractC3550rv;
import p000.C3156jq;
import p000.C3309ls;
import p000.bna;
import p000.eda;
import p000.j13;
import p000.my2;
import p000.nx1;
import p000.ox1;
import p000.sy2;
import p000.to2;
import p000.u91;
import p000.w41;
import p000.x74;
import p000.zj5;

/* JADX INFO: renamed from: com.facebook.login.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0939m {

    /* JADX INFO: renamed from: f */
    public static final C0937k f11517f = new C0937k();

    /* JADX INFO: renamed from: g */
    public static final Set f11518g = AbstractC3550rv.m20855w0(new String[]{"ads_management", "create_event", "rsvp_event"});

    /* JADX INFO: renamed from: h */
    public static volatile C0939m f11519h;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f11522c;

    /* JADX INFO: renamed from: a */
    public final LoginBehavior f11520a = LoginBehavior.NATIVE_WITH_FALLBACK;

    /* JADX INFO: renamed from: b */
    public final DefaultAudience f11521b = DefaultAudience.FRIENDS;

    /* JADX INFO: renamed from: d */
    public final String f11523d = "rerequest";

    /* JADX INFO: renamed from: e */
    public final LoginTargetApp f11524e = LoginTargetApp.FACEBOOK;

    static {
        C0939m.class.toString().getClass();
    }

    public C0939m() {
        eda.m11074g();
        SharedPreferences sharedPreferences = sy2.m21766a().getSharedPreferences("com.facebook.loginManager", 0);
        sharedPreferences.getClass();
        this.f11522c = sharedPreferences;
        if (!sy2.f61598n || ox1.m18555a() == null) {
            return;
        }
        C3156jq.m14584i(sy2.m21766a(), "com.android.chrome", new nx1());
        C3156jq.m14586z(sy2.m21766a(), sy2.m21766a().getPackageName());
    }

    /* JADX INFO: renamed from: a */
    public static void m5257a(Context context, LoginClient.Result.Code code, Map map, FacebookException facebookException, boolean z, LoginClient.Request request) {
        C0936j c0936jM14256f = j13.f44891h.m14256f(context);
        if (c0936jM14256f == null) {
            return;
        }
        if (request == null) {
            C0936j.m5250d(c0936jM14256f);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("try_login_activity", z ? "1" : "0");
        c0936jM14256f.m5251a(request.m5227a(), map2, code, map, facebookException, request.m5231e() ? "foa_mobile_login_complete" : "fb_mobile_login_complete");
    }

    /* JADX INFO: renamed from: b */
    public final void m5258b() {
        Date date = AccessToken.f11306l;
        w41.f66361h.m22270m().m23714H(null, true);
        AbstractC3122is.m14083B(null);
        C3309ls.f50061k.m18973k().m16498R(null, true);
        SharedPreferences.Editor editorEdit = this.f11522c.edit();
        editorEdit.putBoolean("express_login_allowed", false);
        editorEdit.apply();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m5259c(int i, Intent intent, my2 my2Var) {
        LoginClient.Result.Code code;
        boolean z;
        FacebookException facebookException;
        AccessToken accessToken;
        Map map;
        LoginClient.Request request;
        AuthenticationToken authenticationToken;
        AuthenticationToken authenticationToken2;
        boolean z2;
        Object obj;
        LoginClient.Result.Code code2 = LoginClient.Result.Code.ERROR;
        zj5 zj5Var = null;
        if (intent != null) {
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                LoginClient.Request request2 = result.f11481f;
                code = result.f11476a;
                if (i != -1) {
                    if (i != 0) {
                        facebookException = null;
                        authenticationToken2 = null;
                        z2 = false;
                        obj = authenticationToken2;
                    } else {
                        z2 = true;
                        facebookException = null;
                        obj = null;
                        authenticationToken2 = null;
                    }
                } else if (code == LoginClient.Result.Code.SUCCESS) {
                    AccessToken accessToken2 = result.f11477b;
                    authenticationToken2 = result.f11478c;
                    z2 = false;
                    obj = accessToken2;
                    facebookException = null;
                } else {
                    facebookException = new FacebookAuthorizationException(result.f11479d);
                    authenticationToken2 = null;
                    z2 = false;
                    obj = authenticationToken2;
                }
                request = request2;
                z = z2;
                authenticationToken = authenticationToken2;
                map = result.f11482g;
                accessToken = obj;
            } else {
                code = code2;
                facebookException = null;
                accessToken = 0;
                map = null;
                request = null;
                authenticationToken = null;
                z = false;
            }
        } else if (i == 0) {
            code = LoginClient.Result.Code.CANCEL;
            z = true;
            facebookException = null;
            accessToken = 0;
            map = null;
            request = null;
            authenticationToken = null;
        } else {
            code = code2;
            facebookException = null;
            accessToken = 0;
            map = null;
            request = null;
            authenticationToken = null;
            z = false;
        }
        if (facebookException == null && accessToken == 0 && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        FacebookException facebookException2 = facebookException;
        m5257a(null, code, map, facebookException2, true, request);
        if (accessToken != 0) {
            Date date = AccessToken.f11306l;
            w41.f66361h.m22270m().m23714H(accessToken, true);
            AccessToken accessTokenM24363t = x74.m24363t();
            if (accessTokenM24363t != null) {
                if (x74.m24366w()) {
                    bna.m3933V(new to2(), accessTokenM24363t.f11311e);
                } else {
                    C3309ls.f50061k.m18973k().m16498R(null, true);
                }
            }
        }
        if (authenticationToken != null) {
            AbstractC3122is.m14083B(authenticationToken);
        }
        if (my2Var != null) {
            if (accessToken != 0 && request != null) {
                Set setM5229c = request.m5229c();
                Set setM22626r1 = u91.m22626r1(u91.m22587E0(accessToken.f11308b));
                if (request.m5232f()) {
                    setM22626r1.retainAll(setM5229c);
                }
                Set setM22626r2 = u91.m22626r1(u91.m22587E0(setM5229c));
                setM22626r2.removeAll(setM22626r1);
                zj5Var = new zj5(accessToken, authenticationToken, setM22626r1, setM22626r2);
            }
            if (z) {
                return;
            }
            if (zj5Var == null || !zj5Var.m25678a().isEmpty()) {
                if (facebookException2 != null) {
                    my2Var.mo9122r(facebookException2);
                    return;
                }
                if (accessToken == 0 || zj5Var == null) {
                    return;
                }
                SharedPreferences.Editor editorEdit = this.f11522c.edit();
                editorEdit.putBoolean("express_login_allowed", true);
                editorEdit.apply();
                my2Var.mo9121n(zj5Var);
            }
        }
    }
}
