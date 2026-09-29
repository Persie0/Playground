package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC0979t;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import dm.C5207g;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5068h;
import p067d8.C5086z;
import p067d8.DialogC5064e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/facebook/login/WebViewLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "a", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new C2328b();

    /* JADX INFO: renamed from: d */
    public DialogC5064e0 f11645d;

    /* JADX INFO: renamed from: e */
    public String f11646e;

    /* JADX INFO: renamed from: f */
    public final String f11647f;

    /* JADX INFO: renamed from: g */
    public final AccessTokenSource f11648g;

    /* JADX INFO: renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    public final class C2327a extends DialogC5064e0.a {

        /* JADX INFO: renamed from: e */
        public String f11649e;

        /* JADX INFO: renamed from: f */
        public LoginBehavior f11650f;

        /* JADX INFO: renamed from: g */
        public LoginTargetApp f11651g;

        /* JADX INFO: renamed from: h */
        public boolean f11652h;

        /* JADX INFO: renamed from: i */
        public boolean f11653i;

        /* JADX INFO: renamed from: j */
        public String f11654j;

        /* JADX INFO: renamed from: k */
        public String f11655k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2327a(WebViewLoginMethodHandler webViewLoginMethodHandler, ActivityC0979t activityC0979t, String str, Bundle bundle) {
            super(activityC0979t, str, bundle);
            C5207g.m11111f(webViewLoginMethodHandler, "this$0");
            C5207g.m11111f(str, "applicationId");
            this.f11649e = "fbconnect://success";
            this.f11650f = LoginBehavior.NATIVE_WITH_FALLBACK;
            this.f11651g = LoginTargetApp.FACEBOOK;
        }

        /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
        /* JADX INFO: renamed from: a */
        public final DialogC5064e0 m6729a() {
            Bundle bundle = this.f32935d;
            if (bundle == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
            }
            bundle.putString("redirect_uri", this.f11649e);
            bundle.putString("client_id", this.f32933b);
            String str = this.f11654j;
            if (str == null) {
                C5207g.m11117l("e2e");
                throw null;
            }
            bundle.putString("e2e", str);
            bundle.putString("response_type", this.f11651g == LoginTargetApp.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
            bundle.putString("return_scopes", "true");
            String str2 = this.f11655k;
            if (str2 == null) {
                C5207g.m11117l("authType");
                throw null;
            }
            bundle.putString("auth_type", str2);
            bundle.putString("login_behavior", this.f11650f.name());
            if (this.f11652h) {
                bundle.putString("fx_app", this.f11651g.toString());
            }
            if (this.f11653i) {
                bundle.putString("skip_dedupe", "true");
            }
            int i10 = DialogC5064e0.f32919H;
            Context context = this.f32932a;
            if (context == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            LoginTargetApp loginTargetApp = this.f11651g;
            DialogC5064e0.c cVar = this.f32934c;
            C5207g.m11111f(loginTargetApp, "targetApp");
            DialogC5064e0.m10755a(context);
            return new DialogC5064e0(context, "oauth", bundle, loginTargetApp, cVar);
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.WebViewLoginMethodHandler$b */
    public static final class C2328b implements Parcelable.Creator<WebViewLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        public final WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "source");
            return new WebViewLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebViewLoginMethodHandler[] newArray(int i10) {
            return new WebViewLoginMethodHandler[i10];
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.WebViewLoginMethodHandler$c */
    public static final class C2329c implements DialogC5064e0.c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LoginClient.Request f11657b;

        public C2329c(LoginClient.Request request) {
            this.f11657b = request;
        }

        @Override // p067d8.DialogC5064e0.c
        /* JADX INFO: renamed from: a */
        public final void mo6730a(Bundle bundle, FacebookException facebookException) {
            WebViewLoginMethodHandler webViewLoginMethodHandler = WebViewLoginMethodHandler.this;
            webViewLoginMethodHandler.getClass();
            LoginClient.Request request = this.f11657b;
            C5207g.m11111f(request, "request");
            webViewLoginMethodHandler.m6728x(request, bundle, facebookException);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C5207g.m11111f(parcel, "source");
        this.f11647f = "web_view";
        this.f11648g = AccessTokenSource.WEB_VIEW;
        this.f11646e = parcel.readString();
    }

    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f11647f = "web_view";
        this.f11648g = AccessTokenSource.WEB_VIEW;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: b */
    public final void mo6699b() {
        DialogC5064e0 dialogC5064e0 = this.f11645d;
        if (dialogC5064e0 != null) {
            if (dialogC5064e0 != null) {
                dialogC5064e0.cancel();
            }
            this.f11645d = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF11598d() {
        return this.f11647f;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: q */
    public final int mo6685q(LoginClient.Request request) {
        Bundle bundleM6727r = m6727r(request);
        C2329c c2329c = new C2329c(request);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        C5207g.m11110e(string, "e2e.toString()");
        this.f11646e = string;
        m6715a(string, "e2e");
        ActivityC0979t activityC0979tM6706e = m6717d().m6706e();
        if (activityC0979tM6706e == null) {
            return 0;
        }
        boolean zM10839x = C5086z.m10839x(activityC0979tM6706e);
        C2327a c2327a = new C2327a(this, activityC0979tM6706e, request.f11622d, bundleM6727r);
        String str = this.f11646e;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        c2327a.f11654j = str;
        c2327a.f11649e = zM10839x ? "fbconnect://chrome_os_success" : "fbconnect://success";
        String str2 = request.f11626h;
        C5207g.m11111f(str2, "authType");
        c2327a.f11655k = str2;
        LoginBehavior loginBehavior = request.f11619a;
        C5207g.m11111f(loginBehavior, "loginBehavior");
        c2327a.f11650f = loginBehavior;
        LoginTargetApp loginTargetApp = request.f11630l;
        C5207g.m11111f(loginTargetApp, "targetApp");
        c2327a.f11651g = loginTargetApp;
        c2327a.f11652h = request.f11613H;
        c2327a.f11653i = request.f11614I;
        c2327a.f32934c = c2329c;
        this.f11645d = c2327a.m6729a();
        C5068h c5068h = new C5068h();
        c5068h.m3590i0();
        c5068h.f32949L0 = this.f11645d;
        c5068h.mo3772s0(activityC0979tM6706e.m3805K(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* JADX INFO: renamed from: w, reason: from getter */
    public final AccessTokenSource getF11648g() {
        return this.f11648g;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "dest");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f11646e);
    }
}
