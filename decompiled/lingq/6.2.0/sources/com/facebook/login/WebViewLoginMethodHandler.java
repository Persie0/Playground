package com.facebook.login;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC3695vr;
import p000.ak5;
import p000.bna;
import p000.eda;
import p000.g3b;
import p000.id3;
import p000.n3b;
import p000.o3b;
import p000.oy2;
import p000.sy2;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new y3a(2);

    /* JADX INFO: renamed from: d */
    public g3b f11492d;

    /* JADX INFO: renamed from: e */
    public String f11493e;

    /* JADX INFO: renamed from: f */
    public final String f11494f;

    /* JADX INFO: renamed from: g */
    public final AccessTokenSource f11495g;

    public WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f11494f = "web_view";
        this.f11495g = AccessTokenSource.WEB_VIEW;
        this.f11493e = parcel.readString();
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: b */
    public final void mo5214b() {
        g3b g3bVar = this.f11492d;
        if (g3bVar != null) {
            if (g3bVar != null) {
                g3bVar.cancel();
            }
            this.f11492d = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: e */
    public final String mo5197e() {
        return this.f11494f;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: k */
    public final int mo5201k(LoginClient.Request request) {
        id3 id3Var;
        g3b g3bVar;
        Uri uriM3956j;
        request.getClass();
        String str = request.f11468e;
        Bundle bundleM5247m = m5247m(request);
        mo5202l(bundleM5247m, request);
        C0940n c0940n = new C0940n(this, request);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
            sy2 sy2Var = sy2.f61585a;
        }
        String string = jSONObject.toString();
        string.getClass();
        this.f11493e = string;
        m5238a("e2e", string);
        id3 id3VarM5221e = m5240d().m5221e();
        if (id3VarM5221e == null) {
            return 0;
        }
        boolean zHasSystemFeature = id3VarM5221e.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        String str2 = request.f11467d;
        str2.getClass();
        eda.m11073f(str2, "applicationId");
        LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
        ak5 ak5Var = LoginTargetApp.Companion;
        String str3 = this.f11493e;
        str3.getClass();
        String str4 = zHasSystemFeature ? "fbconnect://chrome_os_success" : "fbconnect://success";
        String str5 = request.f11473j;
        str5.getClass();
        LoginBehavior loginBehavior2 = request.f11464a;
        loginBehavior2.getClass();
        LoginTargetApp loginTargetApp = request.f11457I;
        loginTargetApp.getClass();
        boolean z = request.f11458J;
        boolean z2 = request.f11459K;
        boolean z3 = str == null || str.length() == 0;
        if (!bundleM5247m.containsKey("redirect_uri")) {
            bundleM5247m.putString("redirect_uri", str4);
        }
        bundleM5247m.putString("client_id", str2);
        bundleM5247m.putString("e2e", str3);
        bundleM5247m.putString("response_type", loginTargetApp == LoginTargetApp.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
        bundleM5247m.putString("return_scopes", "true");
        bundleM5247m.putString("auth_type", str5);
        bundleM5247m.putString("login_behavior", loginBehavior2.name());
        if (z) {
            bundleM5247m.putString("fx_app", loginTargetApp.toString());
        }
        if (z2) {
            bundleM5247m.putString("skip_dedupe", "true");
        }
        if (z3) {
            int i = g3b.f40137H;
            g3b.m12344b(id3VarM5221e);
            id3Var = id3VarM5221e;
            g3bVar = new g3b(id3Var, "oauth", bundleM5247m, loginTargetApp, c0940n);
        } else {
            int i2 = o3b.f53809K;
            str.getClass();
            Bundle bundle = new Bundle(bundleM5247m);
            bundle.putString("display", "touch");
            bundle.putString("client_id", sy2.m21767b());
            bundle.putString("sdk", "android-18.2.3");
            if (n3b.f52300a[loginTargetApp.ordinal()] == 1) {
                uriM3956j = bna.m3956j(AbstractC3695vr.m23504o(), "oauth/authorize", bundle);
            } else {
                uriM3956j = bna.m3956j(AbstractC3695vr.m23503n(), sy2.m21769d() + "/dialog/oauth", bundle);
            }
            g3b.m12344b(id3VarM5221e);
            String string2 = uriM3956j.toString();
            string2.getClass();
            o3b o3bVar = new o3b(id3VarM5221e, string2, str);
            o3bVar.f40141c = c0940n;
            id3Var = id3VarM5221e;
            g3bVar = o3bVar;
        }
        this.f11492d = g3bVar;
        oy2 oy2Var = new oy2();
        oy2Var.m2097Y();
        oy2Var.f55281M0 = this.f11492d;
        oy2Var.m3665k0(id3Var.m13792j(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* JADX INFO: renamed from: o */
    public final AccessTokenSource mo5204o() {
        return this.f11495g;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f11493e);
    }

    public WebViewLoginMethodHandler(LoginClient loginClient) {
        this.f11487b = loginClient;
        this.f11494f = "web_view";
        this.f11495g = AccessTokenSource.WEB_VIEW;
    }
}
