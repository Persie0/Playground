package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import java.util.ArrayList;
import java.util.List;
import p000.RunnableC3725wk;
import p000.ad3;
import p000.bna;
import p000.fa4;
import p000.sy2;
import p000.u91;
import p000.vz1;
import p000.xfa;
import p000.ymb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: c */
    public final AccessTokenSource f11488c;

    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        this.f11487b = loginClient;
        this.f11488c = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: h */
    public final boolean mo5199h(int i, int i2, Intent intent) {
        String str;
        String string;
        Object obj;
        LoginClient.Request request = m5240d().f11450g;
        if (intent == null) {
            m5243l(new LoginClient.Result(request, LoginClient.Result.Code.CANCEL, null, "Operation canceled", null));
            return true;
        }
        String string2 = null;
        if (i2 == 0) {
            Bundle extras = intent.getExtras();
            if (extras != null && (string = extras.getString("error")) != null) {
                str = string;
            } else if (extras != null) {
                String string3 = extras.getString("error_type");
                str = string3;
            } else {
                str = null;
            }
            String string4 = (extras == null || (obj = extras.get("error_code")) == null) ? null : obj.toString();
            if (!"CONNECTION_FAILURE".equals(string4)) {
                m5243l(new LoginClient.Result(request, LoginClient.Result.Code.CANCEL, null, str, null));
                return true;
            }
            if (extras != null && (string = extras.getString("error_message")) != null) {
                string2 = string;
            } else if (extras != null) {
                string2 = extras.getString("error_description");
            }
            ArrayList arrayList = new ArrayList();
            if (str != null) {
                arrayList.add(str);
            }
            if (string2 != null) {
                arrayList.add(string2);
            }
            m5243l(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), string4));
            return true;
        }
        if (i2 != -1) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("Unexpected resultCode from authorization.");
            m5243l(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList2), null));
            return true;
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 == null) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add("Unexpected null from returned authorization data.");
            m5243l(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList3), null));
            return true;
        }
        String string5 = extras2.getString("error");
        if (string5 == null) {
            string5 = extras2.getString("error_type");
        }
        Object obj2 = extras2.get("error_code");
        string2 = obj2 != null ? obj2.toString() : null;
        String string6 = extras2.getString("error_message");
        if (string6 == null) {
            string6 = extras2.getString("error_description");
        }
        String string7 = extras2.getString("e2e");
        if (!bna.m3945d0(string7)) {
            m5241g(string7);
        }
        if (string5 != null || string2 != null || string6 != null || request == null) {
            m5244n(request, string5, string6, string2);
            return true;
        }
        if (!extras2.containsKey("code") || bna.m3945d0(extras2.getString("code"))) {
            m5245o(extras2, request);
            return true;
        }
        sy2.m21768c().execute(new RunnableC3725wk(this, request, extras2, 15));
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m5243l(LoginClient.Result result) {
        if (result != null) {
            m5240d().m5220d(result);
        } else {
            m5240d().m5226j();
        }
    }

    /* JADX INFO: renamed from: m */
    public AccessTokenSource mo5216m() {
        return this.f11488c;
    }

    /* JADX INFO: renamed from: n */
    public final void m5244n(LoginClient.Request request, String str, String str2, String str3) {
        if (str != null && str.equals("logged_out")) {
            CustomTabLoginMethodHandler.f11414i = true;
            m5243l(null);
            return;
        }
        if (u91.m22633z0(vz1.m23605K("service_disabled", "AndroidAuthKillSwitchException"), str)) {
            m5243l(null);
            return;
        }
        if (u91.m22633z0(vz1.m23605K("access_denied", "OAuthAccessDeniedException"), str)) {
            m5243l(new LoginClient.Result(request, LoginClient.Result.Code.CANCEL, null, null, null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        m5243l(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), str3));
    }

    /* JADX INFO: renamed from: o */
    public final void m5245o(Bundle bundle, LoginClient.Request request) {
        try {
            m5243l(new LoginClient.Result(request, LoginClient.Result.Code.SUCCESS, ymb.m25200b(request.f11465b, bundle, mo5216m(), request.f11467d), ymb.m25201c(request.f11460L, bundle), null, null));
        } catch (FacebookException e) {
            String message = e.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            m5243l(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m5246p(Intent intent) {
        if (intent == null) {
            return false;
        }
        List<ResolveInfo> listQueryIntentActivities = sy2.m21766a().getPackageManager().queryIntentActivities(intent, 65536);
        listQueryIntentActivities.getClass();
        if (listQueryIntentActivities.isEmpty()) {
            return false;
        }
        C0935i c0935i = m5240d().f11446c;
        xfa xfaVar = null;
        if (c0935i == null) {
            c0935i = null;
        }
        if (c0935i != null) {
            ad3 ad3Var = c0935i.f11510z0;
            if (ad3Var == null) {
                fa4.m11636J("launcher");
                throw null;
            }
            ad3Var.mo276a(intent);
            xfaVar = xfa.f68157a;
        }
        return xfaVar != null;
    }

    public NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f11488c = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }
}
